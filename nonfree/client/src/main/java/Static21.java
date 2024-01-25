import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "[[[Lclient!dq;")
	public static Class73[][][] aClass73ArrayArrayArray1;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "[I")
	public static final int[] anIntArray42 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)B")
	public static byte method508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!jw;I)V")
	public static void method510(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub5_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (!Static333.aBoolean400) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(30) int local30;
		for (@Pc(16) Class4_Sub5_Sub17 local16 = (Class4_Sub5_Sub17) arg1.aClass367_5.method8308(); local16 != null; local16 = (Class4_Sub5_Sub17) arg1.aClass367_5.method8309()) {
			local30 = Static485.method6637(local16);
			if (local30 > local10) {
				local10 = local30;
			}
		}
		local10 += 8;
		Static485.anInt7635 = (Static523.aBoolean633 ? 26 : 22) + arg1.anInt4687 * 16;
		local30 = arg1.anInt4687 * 16 + 21;
		@Pc(66) int local66 = Static506.anInt7915 + Static357.anInt5417;
		if (Static632.anInt9867 < local66 + local10) {
			local66 = Static357.anInt5417 - local10;
		}
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(91) int local91 = Static523.aBoolean633 ? 33 : 31;
		@Pc(97) int local97 = arg2 + 13 - local91;
		if (Static357.anInt5421 < local97 + local30) {
			local97 = Static357.anInt5421 - local30;
		}
		if (local97 < 0) {
			local97 = 0;
		}
		Static398.anInt5803 = local66;
		Static4.anInt76 = local10;
		Static587.anInt9057 = local97;
		Static581.aClass4_Sub5_Sub12_1 = arg1;
	}
}
