import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "Lclient!ik;")
	public static Class182 aClass182_89;

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	public static void method5741(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 3);
		local9.method9260();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
	public static void method5744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static379.anInt5859 != arg0) {
			Static497.anIntArray579 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static497.anIntArray579[local13] = (local13 << 12) / arg0;
			}
			Static711.anInt10997 = arg0 - 1;
			Static416.anInt3517 = arg0 * 32;
			Static379.anInt5859 = arg0;
		}
		if (Static24.anInt740 == arg1) {
			return;
		}
		if (arg1 == Static379.anInt5859) {
			Static121.anIntArray145 = Static497.anIntArray579;
		} else {
			Static121.anIntArray145 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static121.anIntArray145[local13] = (local13 << 12) / arg1;
			}
		}
		Static24.anInt740 = arg1;
		Static652.anInt2344 = arg1 - 1;
	}
}
