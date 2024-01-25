import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Ljava/lang/Class;")
	private static Class aClass14;

	// $FF: synthetic field
	@OriginalMember(owner = "client!nda", name = "j", descriptor = "Ljava/lang/Class;")
	private static Class aClass15;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "Lclient!si;")
	public static final Class338 aClass338_40 = new Class338(8);

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(Z)I")
	public static int method6185() {
		@Pc(7) int local7 = 0;
		@Pc(26) Field[] local26 = (aClass14 == null ? (aClass14 = Class251.a("vba")) : aClass14).getDeclaredFields();
		for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
			@Pc(36) Field local36 = local26[local30];
			if ((aClass15 == null ? (aClass15 = Class251.a("tk")) : aClass15).isAssignableFrom(local36.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BZ)V")
	public static void method6188(@OriginalArg(1) boolean arg0) {
		if (Static140.aString44.length() == 0) {
			return;
		}
		Static269.method4123("--> " + Static140.aString44);
		Static659.method8818(false, Static140.aString44, arg0);
		if (!arg0) {
			Static663.anInt10567 = 0;
			Static140.aString44 = "";
		}
		Static131.anInt2468 = 0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V")
	public static void method6189(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(17) int local17 = (arg0 + arg2) / 2;
		@Pc(19) int local19 = arg2;
		@Pc(23) int local23 = arg3[local17];
		arg3[local17] = arg3[arg0];
		arg3[arg0] = local23;
		@Pc(37) Object local37 = arg1[local17];
		arg1[local17] = arg1[arg0];
		arg1[arg0] = local37;
		@Pc(57) int local57 = ~local23 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg2; local59 < arg0; local59++) {
			if (local23 + (local59 & local57) > arg3[local59]) {
				@Pc(77) int local77 = arg3[local59];
				arg3[local59] = arg3[local19];
				arg3[local19] = local77;
				@Pc(91) Object local91 = arg1[local59];
				arg1[local59] = arg1[local19];
				arg1[local19++] = local91;
			}
		}
		arg3[arg0] = arg3[local19];
		arg3[local19] = local23;
		arg1[arg0] = arg1[local19];
		arg1[local19] = local37;
		method6189(local19 - 1, arg1, arg2, arg3);
		method6189(arg0, arg1, local19 + 1, arg3);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!an;Lclient!an;B)V")
	public static void method6190(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_342 != null) {
			arg0.method9446();
		}
		arg0.aClass3_341 = arg1;
		arg0.aClass3_342 = arg1.aClass3_342;
		arg0.aClass3_342.aClass3_341 = arg0;
		arg0.aClass3_341.aClass3_342 = arg0;
	}
}
