import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "Lclient!qm;")
	public static Class206 aClass206_2;

	@OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
	public static int anInt4366;

	@OriginalMember(owner = "client!mr", name = "P", descriptor = "Lclient!la;")
	public static Class63 aClass63_7;

	@OriginalMember(owner = "client!mr", name = "Q", descriptor = "[[Lclient!mh;")
	public static Class156[][] aClass156ArrayArray1;

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_94 = new Class253(2, 6);

	@OriginalMember(owner = "client!mr", name = "K", descriptor = "[I")
	public static final int[] anIntArray371 = new int[1000];

	@OriginalMember(owner = "client!mr", name = "O", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!go;I)V")
	public static void method3455(@OriginalArg(0) Class95 arg0) {
		if (!Static402.aBoolean412) {
			return;
		}
		if (arg0.anObjectArray28 != null) {
			@Pc(14) Class95 local14 = Static407.method5110(Static228.anInt3966, Static68.anInt1325);
			if (local14 != null) {
				@Pc(20) Class7_Sub18 local20 = new Class7_Sub18();
				local20.anObjectArray1 = arg0.anObjectArray28;
				local20.aClass95_4 = local14;
				local20.aClass95_5 = arg0;
				Static159.method2352(local20);
			}
		}
		Static81.method1414(Static191.aClass2_57);
		Static255.aClass7_Sub14_Sub1_2.method3933(arg0.anInt2583);
		Static255.aClass7_Sub14_Sub1_2.method3955(arg0.anInt2599);
		Static255.aClass7_Sub14_Sub1_2.method3955(Static175.anInt3126);
		Static255.aClass7_Sub14_Sub1_2.method3989(arg0.anInt2602);
		Static255.aClass7_Sub14_Sub1_2.method3958(Static68.anInt1325);
		Static255.aClass7_Sub14_Sub1_2.method3933(Static228.anInt3966);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3456(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static293.anInt4886 <= arg4 && arg2 <= Static137.anInt2576 && arg1 >= Static316.anInt5188 && arg0 <= Static82.anInt1667) {
			Static92.method1634(arg5, arg2, arg6, arg3, arg0, arg1, arg4);
		} else {
			Static315.method4098(arg5, arg1, arg6, arg4, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public static int method3459(@OriginalArg(0) String arg0) {
		return Static109.method1895(arg0, 10);
	}
}
