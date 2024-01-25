import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!cr;")
	public static Class40 aClass40_3;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray84;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "Lclient!vg;")
	public static final Class247 aClass247_4 = new Class247("WIP", 2);

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "Lclient!kr;")
	public static final Class3_Sub26 aClass3_Sub26_2 = new Class3_Sub26(0, -1);

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_122 = new Class175("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_129 = new Class184(105, 6);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class182 local13 = local7.aClass182_3; local13 != null; local13 = local13.aClass182_2) {
			@Pc(17) Class1_Sub3 local17 = local13.aClass1_Sub3_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort181 == arg1 && local17.aShort179 == arg2) {
				Static171.method2966(local17);
				return;
			}
		}
	}
}
