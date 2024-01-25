import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "[Lclient!qh;")
	public Class194[] aClass194Array1;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "[Lclient!uq;")
	public Class4_Sub35_Sub1[] aClass4_Sub35_Sub1Array1;

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	private Class4_Sub24() {
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "([B)V")
	public Class4_Sub24(@OriginalArg(0) byte[] arg0) {
		this.aByteArray38 = new byte[128];
		this.aByteArray40 = new byte[128];
		this.anIntArray310 = new int[128];
		this.aClass4_Sub35_Sub1Array1 = new Class4_Sub35_Sub1[128];
		this.aShortArray60 = new short[128];
		this.aClass194Array1 = new Class194[128];
		this.aByteArray39 = new byte[128];
		@Pc(36) Class4_Sub30 local36 = new Class4_Sub30(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray79[local36.anInt6244 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4865();
		}
		local38++;
		local36.anInt6244++;
		@Pc(80) int local80 = local36.anInt6244;
		local36.anInt6244 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray79[local88 + local36.anInt6244] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method4865();
		}
		local36.anInt6244++;
		local88++;
		@Pc(133) int local133 = local36.anInt6244;
		local36.anInt6244 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray79[local36.anInt6244 + local141] != 0; local141++) {
		}
		@Pc(156) byte[] local156 = new byte[local141];
		for (@Pc(158) int local158 = 0; local158 < local141; local158++) {
			local156[local158] = local36.method4865();
		}
		local141++;
		local36.anInt6244++;
		@Pc(184) byte[] local184 = new byte[local141];
		@Pc(197) int local197;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local141 > 1) {
			local184[1] = 1;
			@Pc(195) int local195 = 1;
			local197 = 2;
			for (local199 = 2; local199 < local141; local199++) {
				local205 = local36.method4864();
				if (local205 == 0) {
					local195 = local197++;
				} else {
					if (local205 <= local195) {
						local205--;
					}
					local195 = local205;
				}
				local184[local199] = (byte) local195;
			}
		} else {
			local197 = local141;
		}
		@Pc(234) Class194[] local234 = new Class194[local197];
		for (local199 = 0; local199 < local234.length; local199++) {
			@Pc(246) Class194 local246 = local234[local199] = new Class194();
			@Pc(250) int local250 = local36.method4864();
			if (local250 > 0) {
				local246.aByteArray68 = new byte[local250 * 2];
			}
			local250 = local36.method4864();
			if (local250 > 0) {
				local246.aByteArray67 = new byte[local250 * 2 + 2];
				local246.aByteArray67[1] = 64;
			}
		}
		local205 = local36.method4864();
		@Pc(302) byte[] local302 = local205 > 0 ? new byte[local205 * 2] : null;
		local205 = local36.method4864();
		@Pc(318) byte[] local318 = local205 <= 0 ? null : new byte[local205 * 2];
		@Pc(320) int local320;
		for (local320 = 0; local36.aByteArray79[local320 + local36.anInt6244] != 0; local320++) {
		}
		@Pc(334) byte[] local334 = new byte[local320];
		for (@Pc(336) int local336 = 0; local336 < local320; local336++) {
			local334[local336] = local36.method4865();
		}
		local36.anInt6244++;
		local320++;
		@Pc(361) int local361 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local361 += local36.method4864();
			this.aShortArray60[local363] = (short) local361;
		}
		local361 = 0;
		for (@Pc(387) int local387 = 0; local387 < 128; local387++) {
			local361 += local36.method4864();
			this.aShortArray60[local387] = (short) (this.aShortArray60[local387] + (local361 << 8));
		}
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		for (@Pc(420) int local420 = 0; local420 < 128; local420++) {
			if (local414 == 0) {
				if (local416 < local334.length) {
					local414 = local334[local416++];
				} else {
					local414 = -1;
				}
				local418 = local36.method4833();
			}
			this.aShortArray60[local420] = (short) (this.aShortArray60[local420] + ((local418 - 1 & 0x2) << 14));
			local414--;
			this.anIntArray310[local420] = local418;
		}
		local414 = 0;
		local416 = 0;
		@Pc(479) int local479 = 0;
		for (@Pc(481) int local481 = 0; local481 < 128; local481++) {
			if (this.anIntArray310[local481] != 0) {
				if (local414 == 0) {
					local479 = local36.aByteArray79[local80++] - 1;
					if (local52.length > local416) {
						local414 = local52[local416++];
					} else {
						local414 = -1;
					}
				}
				local414--;
				this.aByteArray38[local481] = (byte) local479;
			}
		}
		local416 = 0;
		local414 = 0;
		@Pc(533) int local533 = 0;
		for (@Pc(535) int local535 = 0; local535 < 128; local535++) {
			if (this.anIntArray310[local535] != 0) {
				if (local414 == 0) {
					if (local416 < local105.length) {
						local414 = local105[local416++];
					} else {
						local414 = -1;
					}
					local533 = local36.aByteArray79[local133++] + 16 << 2;
				}
				this.aByteArray40[local535] = (byte) local533;
				local414--;
			}
		}
		local416 = 0;
		local414 = 0;
		@Pc(584) Class194 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray310[local586] != 0) {
				if (local414 == 0) {
					local584 = local234[local184[local416]];
					if (local156.length <= local416) {
						local414 = -1;
					} else {
						local414 = local156[local416++];
					}
				}
				this.aClass194Array1[local586] = local584;
				local414--;
			}
		}
		local416 = 0;
		local414 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local414 == 0) {
				if (local416 < local334.length) {
					local414 = local334[local416++];
				} else {
					local414 = -1;
				}
				if (this.anIntArray310[local643] > 0) {
					local641 = local36.method4864() + 1;
				}
			}
			this.aByteArray39[local643] = (byte) local641;
			local414--;
		}
		this.anInt3779 = local36.method4864() + 1;
		@Pc(705) int local705;
		for (@Pc(694) int local694 = 0; local694 < local197; local694++) {
			@Pc(700) Class194 local700 = local234[local694];
			if (local700.aByteArray68 != null) {
				for (local705 = 1; local705 < local700.aByteArray68.length; local705 += 2) {
					local700.aByteArray68[local705] = local36.method4865();
				}
			}
			if (local700.aByteArray67 != null) {
				for (local705 = 3; local705 < local700.aByteArray67.length - 2; local705 += 2) {
					local700.aByteArray67[local705] = local36.method4865();
				}
			}
		}
		@Pc(758) int local758;
		if (local302 != null) {
			for (local758 = 1; local758 < local302.length; local758 += 2) {
				local302[local758] = local36.method4865();
			}
		}
		if (local318 != null) {
			for (local758 = 1; local758 < local318.length; local758 += 2) {
				local318[local758] = local36.method4865();
			}
		}
		@Pc(807) int local807;
		for (local758 = 0; local758 < local197; local758++) {
			@Pc(800) Class194 local800 = local234[local758];
			if (local800.aByteArray67 != null) {
				local361 = 0;
				for (local807 = 2; local807 < local800.aByteArray67.length; local807 += 2) {
					local361 -= -local36.method4864() - 1;
					local800.aByteArray67[local807] = (byte) local361;
				}
			}
		}
		@Pc(853) int local853;
		for (local705 = 0; local705 < local197; local705++) {
			@Pc(846) Class194 local846 = local234[local705];
			if (local846.aByteArray68 != null) {
				local361 = 0;
				for (local853 = 2; local853 < local846.aByteArray68.length; local853 += 2) {
					local361 += local36.method4864() + 1;
					local846.aByteArray68[local853] = (byte) local361;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(954) int local954;
		@Pc(960) byte local960;
		@Pc(980) int local980;
		@Pc(982) int local982;
		@Pc(991) int local991;
		@Pc(925) byte local925;
		@Pc(1036) int local1036;
		if (local302 != null) {
			local361 = local36.method4864();
			local302[0] = (byte) local361;
			for (local807 = 2; local807 < local302.length; local807 += 2) {
				local361 -= -local36.method4864() - 1;
				local302[local807] = (byte) local361;
			}
			local925 = local302[0];
			@Pc(929) byte local929 = local302[1];
			for (local931 = 0; local931 < local925; local931++) {
				this.aByteArray39[local931] = (byte) (this.aByteArray39[local931] * local929 + 32 >> 6);
			}
			local954 = 2;
			while (local302.length > local954) {
				local960 = local302[local954];
				@Pc(966) byte local966 = local302[local954 + 1];
				local980 = local929 * (local960 - local925) + (local960 - local925) / 2;
				for (local982 = local925; local982 < local960; local982++) {
					local991 = Static120.method1862(local960 - local925, local980);
					local980 += local966 - local929;
					this.aByteArray39[local982] = (byte) (local991 * this.aByteArray39[local982] + 32 >> 6);
				}
				local929 = local966;
				local954 += 2;
				local925 = local960;
			}
			for (local1036 = local925; local1036 < 128; local1036++) {
				this.aByteArray39[local1036] = (byte) (this.aByteArray39[local1036] * local929 + 32 >> 6);
			}
		}
		@Pc(1104) int local1104;
		if (local318 != null) {
			local361 = local36.method4864();
			local318[0] = (byte) local361;
			for (local807 = 2; local807 < local318.length; local807 += 2) {
				local361 = local36.method4864() + local361 + 1;
				local318[local807] = (byte) local361;
			}
			local925 = local318[0];
			local1104 = local318[1] << 1;
			for (local931 = 0; local931 < local925; local931++) {
				local954 = local1104 + (this.aByteArray40[local931] & 0xFF);
				if (local954 < 0) {
					local954 = 0;
				}
				if (local954 > 128) {
					local954 = 128;
				}
				this.aByteArray40[local931] = (byte) local954;
			}
			local954 = 2;
			@Pc(1155) int local1155;
			while (local318.length > local954) {
				local960 = local318[local954];
				local1155 = local318[local954 + 1] << 1;
				local980 = (local960 - local925) / 2 + (local960 - local925) * local1104;
				for (local982 = local925; local982 < local960; local982++) {
					local991 = Static120.method1862(local960 - local925, local980);
					@Pc(1190) int local1190 = local991 + (this.aByteArray40[local982] & 0xFF);
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					local980 += local1155 - local1104;
					this.aByteArray40[local982] = (byte) local1190;
				}
				local954 += 2;
				local1104 = local1155;
				local925 = local960;
			}
			for (local1036 = local925; local1036 < 128; local1036++) {
				local1155 = (this.aByteArray40[local1036] & 0xFF) + local1104;
				if (local1155 < 0) {
					local1155 = 0;
				}
				if (local1155 > 128) {
					local1155 = 128;
				}
				this.aByteArray40[local1036] = (byte) local1155;
			}
		}
		for (local807 = 0; local807 < local197; local807++) {
			local234[local807].anInt5757 = local36.method4864();
		}
		for (local853 = 0; local853 < local197; local853++) {
			@Pc(1295) Class194 local1295 = local234[local853];
			if (local1295.aByteArray68 != null) {
				local1295.anInt5759 = local36.method4864();
			}
			if (local1295.aByteArray67 != null) {
				local1295.anInt5758 = local36.method4864();
			}
			if (local1295.anInt5757 > 0) {
				local1295.anInt5762 = local36.method4864();
			}
		}
		for (local1104 = 0; local1104 < local197; local1104++) {
			local234[local1104].anInt5754 = local36.method4864();
		}
		for (local931 = 0; local931 < local197; local931++) {
			@Pc(1350) Class194 local1350 = local234[local931];
			if (local1350.anInt5754 > 0) {
				local1350.anInt5756 = local36.method4864();
			}
		}
		for (local954 = 0; local954 < local197; local954++) {
			@Pc(1370) Class194 local1370 = local234[local954];
			if (local1370.anInt5756 > 0) {
				local1370.anInt5760 = local36.method4864();
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "([B[ILclient!en;B)Z")
	public boolean method2840(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class4_Sub35_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray310[local18];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg2.method1573(arg1, local30 >> 2);
						} else {
							local16 = arg2.method1571(arg1, local30 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass4_Sub35_Sub1Array1[local18] = local16;
						this.anIntArray310[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	public void method2842() {
		this.anIntArray310 = null;
	}
}
