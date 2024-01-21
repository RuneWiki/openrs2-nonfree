import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1653 = Static122.method531(":");

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1654 = Static122.method531("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lclient!hc;")
	public static Class30 method2146(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class30_Sub1");
			@Pc(15) Class30 local15 = (Class30) local11.getDeclaredConstructor().newInstance();
			local15.method2027(arg2, arg1, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class30_Sub2 local28 = new Class30_Sub2();
			local28.method2027(arg2, arg1, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!ud;)V")
	public static void method2152(@OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg0) {
		if (arg0.anInt3167 == 0) {
			arg0.anInt3139 = 1024;
		}
		arg0.anInt3181 = 0;
		@Pc(28) int local28 = arg0.anInt3158 * 128 + arg0.anInt3140 * 64;
		@Pc(34) int local34 = arg0.anInt3128 - Static44.anInt1024;
		@Pc(44) int local44 = arg0.anInt3140 * 64 + arg0.anInt3165 * 128;
		arg0.anInt3159 += (local28 - arg0.anInt3159) / local34;
		arg0.anInt3169 += (local44 - arg0.anInt3169) / local34;
		if (arg0.anInt3167 == 1) {
			arg0.anInt3139 = 1536;
		}
		if (arg0.anInt3167 == 2) {
			arg0.anInt3139 = 0;
		}
		if (arg0.anInt3167 == 3) {
			arg0.anInt3139 = 512;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	public static void method2158() {
		aClass73_1654 = null;
		aClass73_1653 = null;
	}
}
