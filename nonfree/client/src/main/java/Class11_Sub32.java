import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class11_Sub32 extends Class11 {

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	public int anInt4830;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "[Lclient!vj;")
	public Class11_Sub15_Sub1[] aClass11_Sub15_Sub1Array1;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "[Lclient!lc;")
	public Class122[] aClass122Array1;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "[B")
	public byte[] aByteArray86;

	static {
		new Class117("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	private Class11_Sub32() {
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([B)V")
	public Class11_Sub32(@OriginalArg(0) byte[] arg0) {
		this.aClass122Array1 = new Class122[128];
		this.aShortArray93 = new short[128];
		this.aClass11_Sub15_Sub1Array1 = new Class11_Sub15_Sub1[128];
		this.aByteArray84 = new byte[128];
		this.anIntArray381 = new int[128];
		this.aByteArray85 = new byte[128];
		this.aByteArray86 = new byte[128];
		@Pc(36) Class11_Sub25 local36 = new Class11_Sub25(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray93[local36.anInt6076 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method5175();
		}
		local38++;
		local36.anInt6076++;
		@Pc(83) int local83 = local36.anInt6076;
		local36.anInt6076 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray93[local91 + local36.anInt6076] != 0; local91++) {
		}
		@Pc(105) byte[] local105 = new byte[local91];
		for (@Pc(107) int local107 = 0; local107 < local91; local107++) {
			local105[local107] = local36.method5175();
		}
		local91++;
		local36.anInt6076++;
		@Pc(133) int local133 = local36.anInt6076;
		local36.anInt6076 += local91;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray93[local36.anInt6076 + local141] != 0; local141++) {
		}
		@Pc(155) byte[] local155 = new byte[local141];
		for (@Pc(157) int local157 = 0; local157 < local141; local157++) {
			local155[local157] = local36.method5175();
		}
		local36.anInt6076++;
		local141++;
		@Pc(179) byte[] local179 = new byte[local141];
		@Pc(192) int local192;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local141 > 1) {
			local179[1] = 1;
			@Pc(190) int local190 = 1;
			local192 = 2;
			for (local194 = 2; local194 < local141; local194++) {
				local200 = local36.method5185();
				if (local200 == 0) {
					local190 = local192++;
				} else {
					if (local200 <= local190) {
						local200--;
					}
					local190 = local200;
				}
				local179[local194] = (byte) local190;
			}
		} else {
			local192 = local141;
		}
		@Pc(233) Class122[] local233 = new Class122[local192];
		for (local194 = 0; local194 < local233.length; local194++) {
			@Pc(245) Class122 local245 = local233[local194] = new Class122();
			@Pc(249) int local249 = local36.method5185();
			if (local249 > 0) {
				local245.aByteArray48 = new byte[local249 * 2];
			}
			local249 = local36.method5185();
			if (local249 > 0) {
				local245.aByteArray47 = new byte[local249 * 2 + 2];
				local245.aByteArray47[1] = 64;
			}
		}
		local200 = local36.method5185();
		@Pc(303) byte[] local303 = local200 <= 0 ? null : new byte[local200 * 2];
		local200 = local36.method5185();
		@Pc(316) byte[] local316 = local200 > 0 ? new byte[local200 * 2] : null;
		@Pc(318) int local318;
		for (local318 = 0; local36.aByteArray93[local318 + local36.anInt6076] != 0; local318++) {
		}
		@Pc(332) byte[] local332 = new byte[local318];
		for (@Pc(334) int local334 = 0; local334 < local318; local334++) {
			local332[local334] = local36.method5175();
		}
		local36.anInt6076++;
		local318++;
		@Pc(359) int local359 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local359 += local36.method5185();
			this.aShortArray93[local361] = (short) local359;
		}
		local359 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local359 += local36.method5185();
			this.aShortArray93[local383] = (short) (this.aShortArray93[local383] + (local359 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local412 >= local332.length) {
					local410 = -1;
				} else {
					local410 = local332[local412++];
				}
				local414 = local36.method5206();
			}
			this.aShortArray93[local416] = (short) (this.aShortArray93[local416] + ((local414 - 1 & 0x2) << 14));
			this.anIntArray381[local416] = local414;
			local410--;
		}
		local410 = 0;
		local412 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray381[local477] != 0) {
				if (local410 == 0) {
					local475 = local36.aByteArray93[local83++] - 1;
					if (local412 >= local55.length) {
						local410 = -1;
					} else {
						local410 = local55[local412++];
					}
				}
				local410--;
				this.aByteArray86[local477] = (byte) local475;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray381[local531] != 0) {
				if (local410 == 0) {
					if (local412 < local105.length) {
						local410 = local105[local412++];
					} else {
						local410 = -1;
					}
					local529 = local36.aByteArray93[local133++] + 16 << 2;
				}
				this.aByteArray85[local531] = (byte) local529;
				local410--;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(586) Class122 local586 = null;
		for (@Pc(588) int local588 = 0; local588 < 128; local588++) {
			if (this.anIntArray381[local588] != 0) {
				if (local410 == 0) {
					local586 = local233[local179[local412]];
					if (local412 < local155.length) {
						local410 = local155[local412++];
					} else {
						local410 = -1;
					}
				}
				this.aClass122Array1[local588] = local586;
				local410--;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local410 == 0) {
				if (local412 >= local332.length) {
					local410 = -1;
				} else {
					local410 = local332[local412++];
				}
				if (this.anIntArray381[local643] > 0) {
					local641 = local36.method5185() + 1;
				}
			}
			this.aByteArray84[local643] = (byte) local641;
			local410--;
		}
		this.anInt4830 = local36.method5185() + 1;
		@Pc(702) int local702;
		for (@Pc(691) int local691 = 0; local691 < local192; local691++) {
			@Pc(697) Class122 local697 = local233[local691];
			if (local697.aByteArray48 != null) {
				for (local702 = 1; local702 < local697.aByteArray48.length; local702 += 2) {
					local697.aByteArray48[local702] = local36.method5175();
				}
			}
			if (local697.aByteArray47 != null) {
				for (local702 = 3; local702 < local697.aByteArray47.length - 2; local702 += 2) {
					local697.aByteArray47[local702] = local36.method5175();
				}
			}
		}
		@Pc(759) int local759;
		if (local303 != null) {
			for (local759 = 1; local759 < local303.length; local759 += 2) {
				local303[local759] = local36.method5175();
			}
		}
		if (local316 != null) {
			for (local759 = 1; local759 < local316.length; local759 += 2) {
				local316[local759] = local36.method5175();
			}
		}
		@Pc(808) int local808;
		for (local759 = 0; local759 < local192; local759++) {
			@Pc(801) Class122 local801 = local233[local759];
			if (local801.aByteArray47 != null) {
				local359 = 0;
				for (local808 = 2; local808 < local801.aByteArray47.length; local808 += 2) {
					local359 = local36.method5185() + local359 + 1;
					local801.aByteArray47[local808] = (byte) local359;
				}
			}
		}
		@Pc(849) int local849;
		for (local702 = 0; local702 < local192; local702++) {
			@Pc(842) Class122 local842 = local233[local702];
			if (local842.aByteArray48 != null) {
				local359 = 0;
				for (local849 = 2; local849 < local842.aByteArray48.length; local849 += 2) {
					local359 = local359 + local36.method5185() + 1;
					local842.aByteArray48[local849] = (byte) local359;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(984) int local984;
		@Pc(986) int local986;
		@Pc(996) int local996;
		@Pc(925) byte local925;
		@Pc(1039) int local1039;
		if (local303 != null) {
			local359 = local36.method5185();
			local303[0] = (byte) local359;
			for (local808 = 2; local808 < local303.length; local808 += 2) {
				local359 += local36.method5185() + 1;
				local303[local808] = (byte) local359;
			}
			local925 = local303[0];
			@Pc(929) byte local929 = local303[1];
			for (local931 = 0; local931 < local925; local931++) {
				this.aByteArray84[local931] = (byte) (this.aByteArray84[local931] * local929 + 32 >> 6);
			}
			local958 = 2;
			while (local958 < local303.length) {
				local964 = local303[local958];
				@Pc(970) byte local970 = local303[local958 + 1];
				local984 = (local964 - local925) / 2 + local929 * (local964 - local925);
				for (local986 = local925; local986 < local964; local986++) {
					local996 = Static325.method1024(local964 - local925, local984);
					local984 += local970 - local929;
					this.aByteArray84[local986] = (byte) (this.aByteArray84[local986] * local996 + 32 >> 6);
				}
				local929 = local970;
				local958 += 2;
				local925 = local964;
			}
			for (local1039 = local925; local1039 < 128; local1039++) {
				this.aByteArray84[local1039] = (byte) (this.aByteArray84[local1039] * local929 + 32 >> 6);
			}
		}
		@Pc(1104) int local1104;
		if (local316 != null) {
			local359 = local36.method5185();
			local316[0] = (byte) local359;
			for (local808 = 2; local808 < local316.length; local808 += 2) {
				local359 = local359 + local36.method5185() + 1;
				local316[local808] = (byte) local359;
			}
			local925 = local316[0];
			local1104 = local316[1] << 1;
			for (local931 = 0; local931 < local925; local931++) {
				local958 = (this.aByteArray85[local931] & 0xFF) + local1104;
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray85[local931] = (byte) local958;
			}
			@Pc(1155) int local1155;
			for (local958 = 2; local958 < local316.length; local958 += 2) {
				local964 = local316[local958];
				local1155 = local316[local958 + 1] << 1;
				local984 = (local964 - local925) / 2 + (local964 - local925) * local1104;
				for (local986 = local925; local986 < local964; local986++) {
					local996 = Static325.method1024(local964 - local925, local984);
					@Pc(1190) int local1190 = (this.aByteArray85[local986] & 0xFF) + local996;
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					local984 += local1155 - local1104;
					this.aByteArray85[local986] = (byte) local1190;
				}
				local1104 = local1155;
				local925 = local964;
			}
			for (local1039 = local925; local1039 < 128; local1039++) {
				local1155 = local1104 + (this.aByteArray85[local1039] & 0xFF);
				if (local1155 < 0) {
					local1155 = 0;
				}
				if (local1155 > 128) {
					local1155 = 128;
				}
				this.aByteArray85[local1039] = (byte) local1155;
			}
		}
		for (local808 = 0; local808 < local192; local808++) {
			local233[local808].anInt3443 = local36.method5185();
		}
		for (local849 = 0; local849 < local192; local849++) {
			@Pc(1289) Class122 local1289 = local233[local849];
			if (local1289.aByteArray48 != null) {
				local1289.anInt3447 = local36.method5185();
			}
			if (local1289.aByteArray47 != null) {
				local1289.anInt3445 = local36.method5185();
			}
			if (local1289.anInt3443 > 0) {
				local1289.anInt3441 = local36.method5185();
			}
		}
		for (local1104 = 0; local1104 < local192; local1104++) {
			local233[local1104].anInt3444 = local36.method5185();
		}
		for (local931 = 0; local931 < local192; local931++) {
			@Pc(1351) Class122 local1351 = local233[local931];
			if (local1351.anInt3444 > 0) {
				local1351.anInt3446 = local36.method5185();
			}
		}
		for (local958 = 0; local958 < local192; local958++) {
			@Pc(1374) Class122 local1374 = local233[local958];
			if (local1374.anInt3446 > 0) {
				local1374.anInt3449 = local36.method5185();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([BILclient!ni;[I)Z")
	public boolean method4245(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class139 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class11_Sub15_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray381[local18];
				if (local30 != 0) {
					if (local30 != local14) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg1.method3747(local30 >> 2, arg2);
						} else {
							local16 = arg1.method3750(arg2, local30 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass11_Sub15_Sub1Array1[local18] = local16;
						this.anIntArray381[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
	public void method4246() {
		this.anIntArray381 = null;
	}
}
