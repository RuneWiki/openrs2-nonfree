import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt5632;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static int anInt5634;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt5630 = 10;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!ia;")
	public static Class78 aClass78_2 = new Class78();

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
	public static int[] anIntArray515 = new int[5];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)V")
	public static void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(6, arg1);
		local8.method294();
		local8.anInt293 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
	public static int method4452(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
