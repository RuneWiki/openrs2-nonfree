import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_97 = new Class186(93, 12);

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_98 = new Class186(36, -1);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!pi;IIII)V")
	public static void method4736(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static26.method2141(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static401.anInt6621) {
			Static26.method2141(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static26.method2141(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static364.anInt6134) {
			Static26.method2141(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static364.anInt6134) {
			Static26.method2141(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static401.anInt6621 && arg4 <= Static364.anInt6134) {
			Static26.method2141(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static26.method2141(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static401.anInt6621 && arg4 > 0) {
			Static26.method2141(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!iq;")
	public static Class71 method4737(@OriginalArg(2) Component arg0) {
		return new Class71_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BI)V")
	public static void method4738(@OriginalArg(1) int arg0) {
		if (!Static367.method5802(arg0)) {
			return;
		}
		@Pc(18) Class239[] local18 = Static129.aClass239ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class239 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt6498 = 0;
				local26.anInt6460 = 0;
				local26.anInt6469 = 1;
			}
		}
	}
}
