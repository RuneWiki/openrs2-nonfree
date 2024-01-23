import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
	public static int anInt1517;

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "I")
	public static int anInt1521;

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "Lclient!gj;")
	public static Class59 aClass59_17;

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
	public static int anInt1519 = 0;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString87 = "Loaded defaults";

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILclient!cf;ILclient!hi;I)V")
	public static void method1435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class66 arg4, @OriginalArg(6) int arg5) {
		if (arg2 == null) {
			return;
		}
		@Pc(13) int local13 = (int) Static49.aFloat32 + Static189.anInt3613 & 0x7FF;
		@Pc(29) int local29 = Math.max(arg4.anInt2204 / 2, arg4.anInt2207 / 2) + 10;
		@Pc(38) int local38 = arg3 * arg3 + arg0 * arg0;
		if (local29 * local29 < local38) {
			return;
		}
		@Pc(53) int local53 = Class135.anIntArray335[local13];
		@Pc(61) int local61 = local53 * 256 / (Static309.anInt5618 + 256);
		@Pc(65) int local65 = Class135.anIntArray338[local13];
		@Pc(73) int local73 = local65 * 256 / (Static309.anInt5618 + 256);
		@Pc(84) int local84 = arg0 * local73 - local61 * arg3 >> 16;
		@Pc(94) int local94 = arg0 * local61 + arg3 * local73 >> 16;
		if (Static156.aBoolean211) {
			((Class23_Sub2) arg2).method3912(arg4.anInt2204 / 2 + arg1 + local94 - arg2.anInt4476 / 2, arg5 + arg4.anInt2207 / 2 + -local84 - arg2.anInt4468 / 2, (Class1_Sub2_Sub1_Sub1) arg4.method1920(false));
		} else {
			((Class23_Sub1) arg2).method1498(local94 + arg4.anInt2204 / 2 + arg1 - arg2.anInt4476 / 2, -local84 + arg4.anInt2207 / 2 + arg5 + -(arg2.anInt4468 / 2), arg4.anIntArray198, arg4.anIntArray190);
		}
	}
}
