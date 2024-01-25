import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Lclient!qs;")
	public static Class211 aClass211_72;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!pl;")
	public static Class1_Sub35 aClass1_Sub35_2;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	public static int anInt5748 = -1;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString52 = null;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lclient!sr;")
	public static Class41_Sub7 method4409(@OriginalArg(1) int arg0) {
		@Pc(15) Class117[] local15 = Class41_Sub2.aClass117Array1;
		synchronized (Class41_Sub2.aClass117Array1) {
			@Pc(35) Class41_Sub7 local35;
			if (arg0 >= Class41_Sub2.aClass117Array1.length || Class41_Sub2.aClass117Array1[arg0].method2959()) {
				local35 = new Class41_Sub7();
				local35.aClass41_Sub8Array1 = new Class41_Sub8[arg0];
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					local35.aClass41_Sub8Array1[local41] = new Class41_Sub8();
				}
			} else {
				local35 = (Class41_Sub7) Class41_Sub2.aClass117Array1[arg0].method2969();
				local35.method5447();
				@Pc(74) int local74 = Static93.anIntArray609[arg0]--;
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method4410() {
		if (Static193.aClass31_2 != null) {
			Static193.aClass31_2.method2010();
		}
		if (Static99.aClass31_1 != null) {
			Static99.aClass31_1.method2010();
		}
	}
}
