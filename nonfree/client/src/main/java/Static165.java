import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_55 = new Class145(12, -1);

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "[I")
	public static int[] anIntArray219 = new int[2];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
	public static void method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 != null) {
			Static43.method1103(local7.aClass16_Sub1_Sub3_1);
			if (local7.aClass16_Sub1_Sub3_1 != null) {
				local7.aClass16_Sub1_Sub3_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public static void method2815(@OriginalArg(0) int arg0) {
		if (Static305.aClass2_Sub49_15.aClass33_Sub11_1.method3726() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static21.anInt454) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class174 local29 = Static649.aClass81_5.method1997(arg0);
			@Pc(33) Class139 local33 = local29.method4277();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static265.aClass286_3.method6573(Static150.aCanvas4, local33.method3457(), new Point(local29.anInt4856, local29.anInt4859), local33.method3452(), local33.method3451());
				Static21.anInt454 = arg0;
			}
		}
		if (arg0 == -1 && Static21.anInt454 != -1) {
			Static265.aClass286_3.method6573(Static150.aCanvas4, -1, new Point(), (int[]) null, -1);
			Static21.anInt454 = -1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLjava/lang/String;Lclient!qg;ZZ)V")
	public static void method2816(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class286 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg0) {
			Static41.method926(arg1, arg2, 3);
			return;
		}
		@Pc(28) String local28;
		if (Static465.aString65.startsWith("win") && arg2.aBoolean536) {
			local28 = null;
			if (Static107.anApplet1 != null) {
				local28 = Static107.anApplet1.getParameter("haveie6");
			}
			if (local28 == null || !local28.equals("1")) {
				@Pc(46) Class319 local46 = Static41.method926(arg1, arg2, 0);
				Static425.aClass319_4 = local46;
				Static116.aString23 = arg1;
				Static638.aClass286_6 = arg2;
				return;
			}
		}
		if (Static465.aString65.startsWith("mac")) {
			local28 = null;
			if (Static107.anApplet1 != null) {
				local28 = Static107.anApplet1.getParameter("havefirefox");
			}
			if (local28 != null && local28.equals("1") && arg3) {
				Static41.method926(arg1, arg2, 1);
				return;
			}
		}
		Static41.method926(arg1, arg2, 2);
	}
}
