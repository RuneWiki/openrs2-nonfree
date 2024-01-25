import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_48 = new Class14();

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "[I")
	public static final int[] anIntArray598 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
	public static int anInt7073 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BC)Z")
	public static boolean method5582(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)Lclient!id;")
	public static Class3_Sub4 method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class3_Sub4 local14 = local7.aClass3_Sub4_1;
			local7.aClass3_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)Lclient!hj;")
	public static Class109 method5584() {
		try {
			return (Class109) Class.forName("Class109_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public static void method5586() {
		for (@Pc(1) int local1 = 0; local1 < Static177.anInt3468; local1++) {
			@Pc(6) Class3_Sub2 local6 = Static96.aClass3_Sub2Array2[local1];
			Static269.method4019(local6);
			Static96.aClass3_Sub2Array2[local1] = null;
		}
		Static177.anInt3468 = 0;
	}
}
