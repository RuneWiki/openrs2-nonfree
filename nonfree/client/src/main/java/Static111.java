import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "[I")
	public static final int[] anIntArray138 = new int[25];

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "[J")
	public static final long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1603(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static35.aClass9_1);
		arg0.addMouseMotionListener(Static35.aClass9_1);
		arg0.addFocusListener(Static35.aClass9_1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)Lclient!q;")
	public static Class3_Sub3_Sub21 method1604(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub21 local10 = (Class3_Sub3_Sub21) Static41.aClass85_5.method2558((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static144.aClass52_33.method1581(28, arg0);
		local10 = new Class3_Sub3_Sub21();
		if (local25 != null) {
			local10.method2281(new Class3_Sub4(local25));
		}
		Static41.aClass85_5.method2560(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class87 local3 = new Class87();
		local3.anInt3630 = arg2 / 128;
		local3.anInt3638 = arg3 / 128;
		local3.anInt3624 = arg4 / 128;
		local3.anInt3623 = arg5 / 128;
		local3.anInt3627 = arg1;
		local3.anInt3641 = arg2;
		local3.anInt3628 = arg3;
		local3.anInt3633 = arg4;
		local3.anInt3626 = arg5;
		local3.anInt3632 = arg6;
		local3.anInt3637 = arg7;
		Static103.aClass87ArrayArray1[arg0][Static103.anIntArray117[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	public static void method1606() {
		Static175.aClass3_Sub19_Sub2_2.method2872();
		Static79.anInt1588 = 1;
		Static78.aClass52_18 = null;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
	public static void method1607() {
		Static151.aClass85_30.method2557();
		Static37.aClass94_8.method3157();
		Static123.aClass94_5.method3157();
		Static199.aClass94_13.method3157();
	}
}
