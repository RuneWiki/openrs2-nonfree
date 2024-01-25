import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jda", name = "l", descriptor = "[Lclient!df;")
	public static Class8_Sub1[] aClass8_Sub1Array1;

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
	public static int anInt4763;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
	public static void method4038() {
		if (Static110.aClass120ArrayArray1 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static110.aClass120ArrayArray1.length; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static110.aClass120ArrayArray1[local14].length; local18++) {
				Static110.aClass120ArrayArray1[local14][local18] = Static152.aClass120_1;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V")
	public static void method4041(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static370.method8913(0, arg0, arg1, arg0.length - 1);
	}
}
