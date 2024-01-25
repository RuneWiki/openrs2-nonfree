import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!tda;")
	public static Class237 method5217(@OriginalArg(1) Component arg0) {
		return new Class237_Sub1(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!jm;I)V")
	public static void method5219(@OriginalArg(0) Class3_Sub29 arg0) {
		if (Static189.aClass333ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface14 local8 = null;
		if (arg0.anInt5003 == 0) {
			local8 = (Interface14) Static597.method8185(arg0.anInt5004, arg0.anInt5007, arg0.anInt5012);
		}
		if (arg0.anInt5003 == 1) {
			local8 = (Interface14) Static542.method7423(arg0.anInt5004, arg0.anInt5007, arg0.anInt5012);
		}
		if (arg0.anInt5003 == 2) {
			local8 = (Interface14) Static13.method122(arg0.anInt5004, arg0.anInt5007, arg0.anInt5012, ofa.class);
		}
		if (arg0.anInt5003 == 3) {
			local8 = (Interface14) Static134.method2611(arg0.anInt5004, arg0.anInt5007, arg0.anInt5012);
		}
		if (local8 == null) {
			arg0.anInt5006 = 0;
			arg0.anInt5005 = -1;
			arg0.anInt5008 = 0;
		} else {
			arg0.anInt5005 = local8.method4958();
			arg0.anInt5006 = local8.method4959();
			arg0.anInt5008 = local8.method4961();
		}
	}
}
