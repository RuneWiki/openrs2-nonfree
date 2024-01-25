import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "J")
	public static long aLong245;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	public static final int anInt8122 = 52;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
	public static final int[] anIntArray685 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!vw;Lclient!jp;I)Lclient!ae;")
	public static Class7 method7102(@OriginalArg(0) Class374 arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		@Pc(15) Class7 local15 = new Class7(arg0);
		@Pc(19) int local19 = arg1.method8632();
		@Pc(30) boolean local30 = (local19 & 0x1) != 0;
		@Pc(38) boolean local38 = (local19 & 0x2) != 0;
		@Pc(46) boolean local46 = (local19 & 0x4) != 0;
		@Pc(57) boolean local57 = (local19 & 0x8) != 0;
		if (local30) {
			local15.anIntArray14[0] = arg1.method8593();
			local15.anIntArray16[0] = arg1.method8593();
			if (arg0.anInt10308 != -1 || arg0.anInt10323 != -1) {
				local15.anIntArray14[1] = arg1.method8593();
				local15.anIntArray16[1] = arg1.method8593();
			}
			if (arg0.anInt10273 != -1 || arg0.anInt10312 != -1) {
				local15.anIntArray14[2] = arg1.method8593();
				local15.anIntArray16[2] = arg1.method8593();
			}
		}
		if (local38) {
			local15.anIntArray13[0] = arg1.method8593();
			local15.anIntArray15[0] = arg1.method8593();
			if (arg0.anInt10291 != -1 || arg0.anInt10318 != -1) {
				local15.anIntArray13[1] = arg1.method8593();
				local15.anIntArray15[1] = arg1.method8593();
			}
		}
		@Pc(163) int local163;
		@Pc(166) int[] local166;
		@Pc(198) int local198;
		if (local46) {
			local163 = arg1.method8593();
			local166 = new int[] { local163 & 0xF, local163 >> 4 & 0xF, local163 >> 8 & 0xF, local163 >> 12 & 0xF };
			for (local198 = 0; local198 < 4; local198++) {
				if (local166[local198] != 15) {
					local15.aShortArray1[local166[local198]] = (short) arg1.method8593();
				}
			}
		}
		if (local57) {
			local163 = arg1.method8632();
			local166 = new int[] { local163 & 0xF, local163 >> 4 & 0xF };
			for (local198 = 0; local198 < 2; local198++) {
				if (local166[local198] != 15) {
					local15.aShortArray2[local166[local198]] = (short) arg1.method8593();
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
	public static boolean method7103(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 45 || arg0 == 50 || arg0 == 9 || arg0 == 25) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public static void method7107() {
		Static46.anInt1071 = 1;
		Static41.anInt961 = -1;
		Static191.method3505("", Static342.aString58.equals(""), Static342.aString58, true);
	}
}
