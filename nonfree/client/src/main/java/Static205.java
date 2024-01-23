import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
	public static int anInt4279;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString212 = "Allocating memory";

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
	public static int anInt4276 = 0;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
	public static int anInt4277 = -1;

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString213 = "Loading title screen - ";

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "[I")
	public static int[] anIntArray352 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString214 = "M";

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
	public static void method3454() {
		Static70.aClass46_7.method1077();
		Static116.aClass46_18.method1077();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILclient!fc;JZ)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class65 local6 = new Class65();
		local6.aClass36_5 = arg4;
		local6.anInt2044 = arg1 * 128 + 64;
		local6.anInt2043 = arg2 * 128 + 64;
		local6.anInt2037 = arg3;
		local6.aLong104 = arg5;
		local6.aBoolean155 = arg6;
		if (Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2] = new Class2_Sub31(arg0, arg1, arg2);
		}
		Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2].aClass65_1 = local6;
	}
}
