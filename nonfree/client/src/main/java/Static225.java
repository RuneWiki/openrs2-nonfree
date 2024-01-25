import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "Lclient!cg;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_92 = new Class119(108, 5);

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_26 = new Class126(50);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!li;ILjava/awt/Frame;)V")
	public static void method3375(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(4) Class43 local4 = arg0.method3384(arg1);
			while (local4.anInt1521 == 0) {
				Static360.method4758(10L);
			}
			if (local4.anInt1521 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static360.method4758(100L);
		}
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V")
	public static void method3376() {
		Static436.anIntArray519 = Static77.method1509(0.4F);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg6 + arg4 && arg6 < arg2 + arg0) {
			return arg7 < arg3 + arg5 && arg1 + arg7 > arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)V")
	public static void method3378() {
		for (@Pc(12) Class6_Sub6 local12 = (Class6_Sub6) Static399.aClass138_6.method3305(); local12 != null; local12 = (Class6_Sub6) Static399.aClass138_6.method3305()) {
			Static82.method3176(local12);
		}
		@Pc(33) int local33;
		@Pc(31) int local31;
		if (Static374.aClass20_Sub1_1.method1814(Static105.anInt2382)) {
			local31 = 3;
			local33 = 0;
		} else {
			local31 = Static228.anInt4246;
			local33 = Static228.anInt4246;
		}
		Static53.method1114();
		for (@Pc(47) int local47 = local33; local47 <= local31; local47++) {
			Static53.method1112();
			Static53.method1122(local47);
			Static53.method1125(local47);
		}
		Static53.method1123();
		Static53.method1108();
	}
}
