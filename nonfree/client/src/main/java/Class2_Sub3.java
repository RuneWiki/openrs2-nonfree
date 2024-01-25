import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
	public int[] anIntArray28 = new int[] { -1 };

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
	public int[] anIntArray29 = new int[1];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ[I[II)J")
	private long method70(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		@Pc(15) long[] local15 = Class105_Sub2_Sub2.aLongArray20;
		@Pc(17) long local17 = -1L;
		@Pc(33) long local33 = local15[(int) (((long) (arg0 >> 8) ^ local17) & 0xFFL)] ^ local17 >>> 8;
		local17 = local33 >>> 8 ^ local15[(int) (((long) arg0 ^ local33) & 0xFFL)];
		for (@Pc(49) int local49 = 0; local49 < arg3.length; local49++) {
			local17 = local15[(int) (((long) (arg3[local49] >> 24) ^ local17) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) (((long) (arg3[local49] >> 16) ^ local17) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) ((local17 ^ (long) (arg3[local49] >> 8)) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) (((long) arg3[local49] ^ local17) & 0xFFL)] ^ local17 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
				local17 = local17 >>> 8 ^ local15[(int) (((long) arg2[local138] ^ local17) & 0xFFL)];
			}
		}
		return local17 >>> 8 ^ local15[(int) (((long) (arg1 ? 1 : 0) ^ local17) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ha;Lclient!ffa;IILclient!cb;ZI)Lclient!ka;")
	public Class45 method73(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class53 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(7) Class45 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class49 local11 = null;
		if (arg2 != -1) {
			local11 = Static378.aClass314_2.method7452(arg2);
		}
		@Pc(24) int[] local24 = this.anIntArray28;
		if (local11 != null && local11.anIntArray95 != null) {
			local24 = new int[local11.anIntArray95.length];
			for (@Pc(38) int local38 = 0; local38 < local11.anIntArray95.length; local38++) {
				@Pc(45) int local45 = local11.anIntArray95[local38];
				if (local45 >= 0 && local45 < this.anIntArray28.length) {
					local24[local38] = this.anIntArray28[local45];
				} else {
					local24[local38] = -1;
				}
			}
		}
		if (arg3 != null) {
			local9 = arg3.method4082() | 0x800;
		}
		@Pc(107) long local107 = this.method70(arg2, arg4, arg1 == null ? null : arg1.anIntArray221, local24);
		if (Static332.aClass85_38 != null) {
			local7 = (Class45) Static332.aClass85_38.method1737(local107);
		}
		if (local7 == null || arg0.method9686(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg0.method9695(local9, local7.ua());
			}
			@Pc(140) int local140 = local9;
			@Pc(142) boolean local142 = false;
			for (@Pc(144) int local144 = 0; local144 < local24.length; local144++) {
				if (local24[local144] != -1 && !Static543.aClass37_2.method605(local24[local144]).method4418(arg4, (Class262) null)) {
					local142 = true;
				}
			}
			if (local142) {
				return null;
			}
			@Pc(187) Class229[] local187 = new Class229[local24.length];
			for (@Pc(189) int local189 = 0; local189 < local24.length; local189++) {
				if (local24[local189] != -1) {
					local187[local189] = Static543.aClass37_2.method605(local24[local189]).method4407((Class262) null, arg4);
				}
			}
			@Pc(261) int local261;
			@Pc(268) int local268;
			if (local11 != null && local11.anIntArrayArray6 != null) {
				for (@Pc(235) int local235 = 0; local235 < local11.anIntArrayArray6.length; local235++) {
					if (local11.anIntArrayArray6[local235] != null && local187[local235] != null) {
						local261 = local11.anIntArrayArray6[local235][0];
						local268 = local11.anIntArrayArray6[local235][1];
						@Pc(275) int local275 = local11.anIntArrayArray6[local235][2];
						@Pc(282) int local282 = local11.anIntArrayArray6[local235][3];
						@Pc(289) int local289 = local11.anIntArrayArray6[local235][4];
						@Pc(296) int local296 = local11.anIntArrayArray6[local235][5];
						if (local282 != 0 || local289 != 0 || local296 != 0) {
							local187[local235].method5308(local289, local282, local296);
						}
						if (local261 != 0 || local268 != 0 || local275 != 0) {
							local187[local235].method5309(local268, local261, local275);
						}
					}
				}
			}
			if (arg1 != null) {
				local140 = local9 | 0x4000;
			}
			@Pc(369) Class229 local369 = new Class229(local187, local187.length);
			local7 = arg0.method9700(local369, local140, Static697.anInt10712, 64, 850);
			if (arg1 != null) {
				for (local261 = 0; local261 < 10; local261++) {
					for (local268 = 0; local268 < Static75.aShortArrayArray1[local261].length; local268++) {
						if (arg1.anIntArray221[local261] < Static87.aShortArrayArrayArray1[local261][local268].length) {
							local7.ia(Static75.aShortArrayArray1[local261][local268], Static87.aShortArrayArrayArray1[local261][local268][arg1.anIntArray221[local261]]);
						}
					}
				}
			}
			if (Static332.aClass85_38 != null) {
				local7.s(local9);
				Static332.aClass85_38.method1745(local107, 16383, local7);
			}
		}
		if (arg3 == null) {
			return local7;
		} else {
			@Pc(467) Class45 local467 = local7.method5768((byte) 1, local9, true);
			arg3.method4097(0, local467);
			return local467;
		}
	}
}
