import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray92;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "[[Lclient!pca;")
	public static Class251[][] aClass251ArrayArray2;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array14;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	public static int anInt8891;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "Z")
	public static boolean aBoolean592 = false;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIII)V")
	public static void method6951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) Class333 local15 = Static189.aClass333ArrayArrayArray1[arg4][arg2][arg3];
		if (local15 == null) {
			local15 = new Class333(arg4);
		}
		if (arg0 == 1) {
			local15.aShort118 = (short) arg5;
			local15.aShort117 = (short) arg1;
		} else if (arg0 == 2) {
			local15.aShort116 = (short) arg5;
			local15.aShort119 = (short) arg1;
		}
		if (Static467.aBoolean560) {
			Static70.method1705();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z")
	public static boolean method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
