import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_16 = new Class244(38, 7);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static int anInt1204 = 0;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
	public static final int[] anIntArray108 = new int[13];

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt1205 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBLclient!b;)Lclient!w;")
	public static Class3_Sub7_Sub16 method1040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(16) Class3_Sub5 local16 = new Class3_Sub5(arg2.method253(arg0, arg1));
		@Pc(51) Class3_Sub7_Sub16 local51 = new Class3_Sub7_Sub16(arg0, local16.method2788(), local16.method2788(), local16.method2726(), local16.method2726(), local16.method2739() == 1, local16.method2739(), local16.method2739());
		@Pc(57) int local57 = local16.method2739();
		for (@Pc(64) int local64 = 0; local64 < local57; local64++) {
			local51.aClass138_46.method3053(new Class3_Sub9(local16.method2739(), local16.method2767(), local16.method2767(), local16.method2767(), local16.method2767(), local16.method2767(), local16.method2767(), local16.method2767(), local16.method2767()));
		}
		local51.method5625();
		return local51;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)I")
	public static int method1041() {
		return 16;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method1042(@OriginalArg(0) int arg0) {
		Static253.anInt4565 = -1;
		if (arg0 == 37) {
			Static42.aFloat5 = 3.0F;
		} else if (arg0 == 50) {
			Static42.aFloat5 = 4.0F;
		} else if (arg0 == 75) {
			Static42.aFloat5 = 6.0F;
		} else if (arg0 == 100) {
			Static42.aFloat5 = 8.0F;
		} else if (arg0 == 200) {
			Static42.aFloat5 = 16.0F;
		}
		Static253.anInt4565 = -1;
	}
}
