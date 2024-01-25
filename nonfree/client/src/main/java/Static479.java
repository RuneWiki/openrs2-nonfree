import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!tv", name = "G", descriptor = "Lclient!dn;")
	public static Class69 aClass69_93;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_419 = new Class305(17, 6);

	@OriginalMember(owner = "client!tv", name = "L", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_59 = new Class295();

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!pp;")
	public static Class99 method7469(@OriginalArg(2) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class99_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class99) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class99_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)Lclient!ig;")
	public static Class20_Sub3 method7470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class20_Sub3 local14 = local7.aClass20_Sub3_1;
			local7.aClass20_Sub3_1 = null;
			return local14;
		}
	}
}
