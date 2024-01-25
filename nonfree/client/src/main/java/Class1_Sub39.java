import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!os", name = "l", descriptor = "I")
	public int anInt6690;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "[Lclient!mm;")
	public Class1_Sub17_Sub1[] aClass1_Sub17_Sub1Array1;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "[Lclient!cv;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	private Class1_Sub39() {
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "([B)V")
	public Class1_Sub39(@OriginalArg(0) byte[] arg0) {
		this.anIntArray526 = new int[128];
		this.aByteArray81 = new byte[128];
		this.aClass62Array1 = new Class62[128];
		this.aShortArray110 = new short[128];
		this.aClass1_Sub17_Sub1Array1 = new Class1_Sub17_Sub1[128];
		this.aByteArray79 = new byte[128];
		this.aByteArray80 = new byte[128];
		@Pc(36) Class1_Sub35 local36 = new Class1_Sub35(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray85[local38 + local36.anInt7214] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method5751();
		}
		local38++;
		local36.anInt7214++;
		@Pc(83) int local83 = local36.anInt7214;
		local36.anInt7214 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray85[local91 + local36.anInt7214] != 0; local91++) {
		}
		@Pc(105) byte[] local105 = new byte[local91];
		for (@Pc(107) int local107 = 0; local107 < local91; local107++) {
			local105[local107] = local36.method5751();
		}
		local91++;
		local36.anInt7214++;
		@Pc(129) int local129 = local36.anInt7214;
		local36.anInt7214 += local91;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray85[local36.anInt7214 + local137] != 0; local137++) {
		}
		@Pc(155) byte[] local155 = new byte[local137];
		for (@Pc(157) int local157 = 0; local157 < local137; local157++) {
			local155[local157] = local36.method5751();
		}
		local137++;
		local36.anInt7214++;
		@Pc(183) byte[] local183 = new byte[local137];
		@Pc(190) int local190;
		@Pc(202) int local202;
		@Pc(208) int local208;
		if (local137 <= 1) {
			local190 = local137;
		} else {
			local183[1] = 1;
			@Pc(198) int local198 = 1;
			local190 = 2;
			for (local202 = 2; local202 < local137; local202++) {
				local208 = local36.method5750();
				if (local208 == 0) {
					local198 = local190++;
				} else {
					if (local208 <= local198) {
						local208--;
					}
					local198 = local208;
				}
				local183[local202] = (byte) local198;
			}
		}
		@Pc(236) Class62[] local236 = new Class62[local190];
		for (local202 = 0; local202 < local236.length; local202++) {
			@Pc(248) Class62 local248 = local236[local202] = new Class62();
			@Pc(252) int local252 = local36.method5750();
			if (local252 > 0) {
				local248.aByteArray11 = new byte[local252 * 2];
			}
			local252 = local36.method5750();
			if (local252 > 0) {
				local248.aByteArray10 = new byte[local252 * 2 + 2];
				local248.aByteArray10[1] = 64;
			}
		}
		local208 = local36.method5750();
		@Pc(297) byte[] local297 = local208 <= 0 ? null : new byte[local208 * 2];
		local208 = local36.method5750();
		@Pc(310) byte[] local310 = local208 > 0 ? new byte[local208 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray85[local36.anInt7214 + local312] != 0; local312++) {
		}
		@Pc(327) byte[] local327 = new byte[local312];
		for (@Pc(329) int local329 = 0; local329 < local312; local329++) {
			local327[local329] = local36.method5751();
		}
		local36.anInt7214++;
		local312++;
		@Pc(354) int local354 = 0;
		for (@Pc(356) int local356 = 0; local356 < 128; local356++) {
			local354 += local36.method5750();
			this.aShortArray110[local356] = (short) local354;
		}
		local354 = 0;
		for (@Pc(378) int local378 = 0; local378 < 128; local378++) {
			local354 += local36.method5750();
			this.aShortArray110[local378] = (short) (this.aShortArray110[local378] + (local354 << 8));
		}
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		for (@Pc(411) int local411 = 0; local411 < 128; local411++) {
			if (local405 == 0) {
				if (local327.length > local407) {
					local405 = local327[local407++];
				} else {
					local405 = -1;
				}
				local409 = local36.method5744();
			}
			this.aShortArray110[local411] = (short) (this.aShortArray110[local411] + ((local409 - 1 & 0x2) << 14));
			local405--;
			this.anIntArray526[local411] = local409;
		}
		local405 = 0;
		local407 = 0;
		@Pc(469) int local469 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray526[local471] != 0) {
				if (local405 == 0) {
					if (local407 < local55.length) {
						local405 = local55[local407++];
					} else {
						local405 = -1;
					}
					local469 = local36.aByteArray85[local83++] - 1;
				}
				local405--;
				this.aByteArray80[local471] = (byte) local469;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(528) int local528 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray526[local530] != 0) {
				if (local405 == 0) {
					if (local407 < local105.length) {
						local405 = local105[local407++];
					} else {
						local405 = -1;
					}
					local528 = local36.aByteArray85[local129++] + 16 << 2;
				}
				local405--;
				this.aByteArray79[local530] = (byte) local528;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(584) Class62 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray526[local586] != 0) {
				if (local405 == 0) {
					local584 = local236[local183[local407]];
					if (local155.length <= local407) {
						local405 = -1;
					} else {
						local405 = local155[local407++];
					}
				}
				local405--;
				this.aClass62Array1[local586] = local584;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(629) int local629 = 0;
		for (@Pc(631) int local631 = 0; local631 < 128; local631++) {
			if (local405 == 0) {
				if (local327.length <= local407) {
					local405 = -1;
				} else {
					local405 = local327[local407++];
				}
				if (this.anIntArray526[local631] > 0) {
					local629 = local36.method5750() + 1;
				}
			}
			local405--;
			this.aByteArray81[local631] = (byte) local629;
		}
		this.anInt6690 = local36.method5750() + 1;
		@Pc(700) int local700;
		for (@Pc(689) int local689 = 0; local689 < local190; local689++) {
			@Pc(695) Class62 local695 = local236[local689];
			if (local695.aByteArray11 != null) {
				for (local700 = 1; local700 < local695.aByteArray11.length; local700 += 2) {
					local695.aByteArray11[local700] = local36.method5751();
				}
			}
			if (local695.aByteArray10 != null) {
				for (local700 = 3; local700 < local695.aByteArray10.length - 2; local700 += 2) {
					local695.aByteArray10[local700] = local36.method5751();
				}
			}
		}
		@Pc(753) int local753;
		if (local297 != null) {
			for (local753 = 1; local753 < local297.length; local753 += 2) {
				local297[local753] = local36.method5751();
			}
		}
		if (local310 != null) {
			for (local753 = 1; local753 < local310.length; local753 += 2) {
				local310[local753] = local36.method5751();
			}
		}
		@Pc(802) int local802;
		for (local753 = 0; local753 < local190; local753++) {
			@Pc(795) Class62 local795 = local236[local753];
			if (local795.aByteArray10 != null) {
				local354 = 0;
				for (local802 = 2; local802 < local795.aByteArray10.length; local802 += 2) {
					local354 += local36.method5750() + 1;
					local795.aByteArray10[local802] = (byte) local354;
				}
			}
		}
		@Pc(843) int local843;
		for (local700 = 0; local700 < local190; local700++) {
			@Pc(836) Class62 local836 = local236[local700];
			if (local836.aByteArray11 != null) {
				local354 = 0;
				for (local843 = 2; local843 < local836.aByteArray11.length; local843 += 2) {
					local354 = local36.method5750() + local354 + 1;
					local836.aByteArray11[local843] = (byte) local354;
				}
			}
		}
		@Pc(921) int local921;
		@Pc(948) int local948;
		@Pc(954) byte local954;
		@Pc(974) int local974;
		@Pc(976) int local976;
		@Pc(986) int local986;
		@Pc(915) byte local915;
		@Pc(1027) int local1027;
		if (local297 != null) {
			local354 = local36.method5750();
			local297[0] = (byte) local354;
			for (local802 = 2; local802 < local297.length; local802 += 2) {
				local354 = local354 + local36.method5750() + 1;
				local297[local802] = (byte) local354;
			}
			local915 = local297[0];
			@Pc(919) byte local919 = local297[1];
			for (local921 = 0; local921 < local915; local921++) {
				this.aByteArray81[local921] = (byte) (local919 * this.aByteArray81[local921] + 32 >> 6);
			}
			for (local948 = 2; local948 < local297.length; local948 += 2) {
				local954 = local297[local948];
				@Pc(960) byte local960 = local297[local948 + 1];
				local974 = (local954 - local915) / 2 + (local954 - local915) * local919;
				for (local976 = local915; local976 < local954; local976++) {
					local986 = Static437.method6087(local974, local954 - local915);
					local974 += local960 - local919;
					this.aByteArray81[local976] = (byte) (this.aByteArray81[local976] * local986 + 32 >> 6);
				}
				local919 = local960;
				local915 = local954;
			}
			for (local1027 = local915; local1027 < 128; local1027++) {
				this.aByteArray81[local1027] = (byte) (this.aByteArray81[local1027] * local919 + 32 >> 6);
			}
		}
		@Pc(1097) int local1097;
		if (local310 != null) {
			local354 = local36.method5750();
			local310[0] = (byte) local354;
			for (local802 = 2; local802 < local310.length; local802 += 2) {
				local354 = local36.method5750() + local354 + 1;
				local310[local802] = (byte) local354;
			}
			local915 = local310[0];
			local1097 = local310[1] << 1;
			for (local921 = 0; local921 < local915; local921++) {
				local948 = local1097 + (this.aByteArray79[local921] & 0xFF);
				if (local948 < 0) {
					local948 = 0;
				}
				if (local948 > 128) {
					local948 = 128;
				}
				this.aByteArray79[local921] = (byte) local948;
			}
			@Pc(1150) int local1150;
			for (local948 = 2; local948 < local310.length; local948 += 2) {
				local954 = local310[local948];
				local1150 = local310[local948 + 1] << 1;
				local974 = (local954 - local915) / 2 + local1097 * (local954 - local915);
				for (local976 = local915; local976 < local954; local976++) {
					local986 = Static437.method6087(local974, local954 - local915);
					@Pc(1186) int local1186 = (this.aByteArray79[local976] & 0xFF) + local986;
					if (local1186 < 0) {
						local1186 = 0;
					}
					if (local1186 > 128) {
						local1186 = 128;
					}
					this.aByteArray79[local976] = (byte) local1186;
					local974 += local1150 - local1097;
				}
				local1097 = local1150;
				local915 = local954;
			}
			for (local1027 = local915; local1027 < 128; local1027++) {
				local1150 = local1097 + (this.aByteArray79[local1027] & 0xFF);
				if (local1150 < 0) {
					local1150 = 0;
				}
				if (local1150 > 128) {
					local1150 = 128;
				}
				this.aByteArray79[local1027] = (byte) local1150;
			}
		}
		for (local802 = 0; local802 < local190; local802++) {
			local236[local802].anInt1418 = local36.method5750();
		}
		for (local843 = 0; local843 < local190; local843++) {
			@Pc(1283) Class62 local1283 = local236[local843];
			if (local1283.aByteArray11 != null) {
				local1283.anInt1423 = local36.method5750();
			}
			if (local1283.aByteArray10 != null) {
				local1283.anInt1420 = local36.method5750();
			}
			if (local1283.anInt1418 > 0) {
				local1283.anInt1427 = local36.method5750();
			}
		}
		for (local1097 = 0; local1097 < local190; local1097++) {
			local236[local1097].anInt1426 = local36.method5750();
		}
		for (local921 = 0; local921 < local190; local921++) {
			@Pc(1342) Class62 local1342 = local236[local921];
			if (local1342.anInt1426 > 0) {
				local1342.anInt1419 = local36.method5750();
			}
		}
		for (local948 = 0; local948 < local190; local948++) {
			@Pc(1369) Class62 local1369 = local236[local948];
			if (local1369.anInt1419 > 0) {
				local1369.anInt1421 = local36.method5750();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!ee;[I[B)Z")
	public boolean method5353(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class1_Sub17_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray526[local18];
				if (local30 != 0) {
					if (local30 != local14) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg0.method1746(arg1, local30 >> 2);
						} else {
							local16 = arg0.method1741(local30 >> 2, arg1);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub17_Sub1Array1[local18] = local16;
						this.anIntArray526[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public void method5354() {
		this.anIntArray526 = null;
	}
}
