import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
	public static int anInt4126;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "Lclient!wa;")
	public static Class175 aClass175_3;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "Lclient!km;")
	public static Class91 aClass91_157;

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "Z")
	public static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString243 = "Opened title screen";

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!in;)V")
	public static void method3282(@OriginalArg(1) Class71 arg0) {
		@Pc(8) int local8 = arg0.anInt2713;
		if (local8 == 324) {
			if (Static217.anInt4285 == -1) {
				Static228.anInt4521 = arg0.anInt2649;
				Static217.anInt4285 = arg0.anInt2675;
			}
			if (Static170.aClass93_2.aBoolean237) {
				arg0.anInt2675 = Static217.anInt4285;
			} else {
				arg0.anInt2675 = Static228.anInt4521;
			}
		} else if (local8 == 325) {
			if (Static217.anInt4285 == -1) {
				Static217.anInt4285 = arg0.anInt2675;
				Static228.anInt4521 = arg0.anInt2649;
			}
			if (Static170.aClass93_2.aBoolean237) {
				arg0.anInt2675 = Static228.anInt4521;
			} else {
				arg0.anInt2675 = Static217.anInt4285;
			}
		} else if (local8 == 327) {
			arg0.anInt2635 = 150;
			arg0.anInt2672 = (int) (Math.sin((double) Static237.anInt4710 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2651 = -1;
			arg0.anInt2705 = 5;
		} else if (local8 == 328) {
			if (Static197.aClass14_Sub2_Sub1_2.aString99 == null) {
				arg0.anInt2651 = 0;
			} else {
				arg0.anInt2635 = 150;
				arg0.anInt2672 = (int) (Math.sin((double) Static237.anInt4710 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2705 = 5;
				arg0.anInt2651 = ((int) Static93.method1658(Static197.aClass14_Sub2_Sub1_2.aString99) << 11) + 2047;
				arg0.anInt2668 = 0;
				arg0.anInt2687 = Static197.aClass14_Sub2_Sub1_2.anInt4658;
				arg0.anInt2654 = Static197.aClass14_Sub2_Sub1_2.anInt4638;
				arg0.anInt2717 = Static197.aClass14_Sub2_Sub1_2.anInt4663;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
	public static void method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class165 local3 = new Class165();
		local3.anInt5243 = arg1 / 128;
		local3.anInt5230 = arg2 / 128;
		local3.anInt5248 = arg3 / 128;
		local3.anInt5233 = arg4 / 128;
		local3.anInt5228 = arg0;
		local3.anInt5239 = arg1;
		local3.anInt5246 = arg2;
		local3.anInt5242 = arg3;
		local3.anInt5234 = arg4;
		local3.anInt5229 = arg5;
		local3.anInt5232 = arg6;
		Static126.aClass165Array3[Static154.anInt3331++] = local3;
	}
}
