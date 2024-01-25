import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(Z)Lclient!cc;")
	public static Class44 method2495() {
		try {
			return (Class44) Class.forName("Class44_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)Lclient!nf;")
	public static Class4_Sub1_Sub3 method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_Sub3_2;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIB)Lclient!dk;")
	public static Class3_Sub14 method2498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub14 local5 = null;
		if (arg0 == 0) {
			local5 = Static139.method2308(Static548.aClass130_123, Static24.aClass233_1);
		}
		if (arg0 == 1) {
			local5 = Static139.method2308(Static577.aClass130_129, Static24.aClass233_1);
		}
		local5.aClass3_Sub3_Sub2_2.method4202(Static299.anInt5307 + arg2);
		local5.aClass3_Sub3_Sub2_2.method4203(Static339.aClass163_1.method4104(82) ? 1 : 0);
		local5.aClass3_Sub3_Sub2_2.method4201(arg1 + Static171.anInt3340);
		Static142.aBoolean634 = false;
		Static300.anInt5337 = arg1;
		Static520.anInt9372 = arg2;
		Static368.method5986();
		return local5;
	}
}
