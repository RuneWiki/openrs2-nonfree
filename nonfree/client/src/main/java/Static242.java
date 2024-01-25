import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "I")
	public static int anInt4460;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IBZ)Lclient!gh;")
	public static Class4_Sub6 method4012(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class99[] local7 = Class216.aClass99Array1;
		synchronized (Class216.aClass99Array1) {
			@Pc(26) Class4_Sub6 local26;
			if (arg0 >= Class216.aClass99Array1.length || Class216.aClass99Array1[arg0].method2036()) {
				local26 = new Class4_Sub6();
				local26.aClass4_Sub9Array1 = new Class4_Sub9[arg0];
				for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
					local26.aClass4_Sub9Array1[local48] = new Class4_Sub9();
				}
			} else {
				local26 = (Class4_Sub6) Class216.aClass99Array1[arg0].method2040();
				local26.method8713();
				@Pc(33) int local33 = Static308.anIntArray378[arg0]--;
			}
			local26.aBoolean220 = arg1;
			return local26;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)V")
	public static void method4013() {
		Static78.aClass87_48.method1793(50);
		Static207.aClass87_105.method1793(50);
		Static395.aClass87_165.method1793(50);
		Static393.aClass87_249.method1793(50);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
	public static void method4014() {
		if (!Static305.method3662()) {
			return;
		}
		if (Static590.aStringArray77 == null) {
			Static300.method4663();
		}
		Static257.aBoolean338 = true;
		Static384.anInt6356 = 0;
	}
}
