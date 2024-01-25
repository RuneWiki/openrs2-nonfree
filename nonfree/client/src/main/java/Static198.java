import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public static int anInt3676;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_116 = new Class235(116, 4);

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "Lclient!rca;")
	public static final Class283 aClass283_1 = new Class283("RC", 1);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIZIZ)V")
	public static void method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static12.aLong165 = 0L;
		@Pc(8) int local8 = Static195.method2980();
		if (arg0 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static16.aClass134_1.method6900()) {
			arg2 = true;
		}
		Static107.method1468(arg2, arg1, arg3, arg0, local8);
	}
}
