import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!id", name = "S", descriptor = "I")
	public static int anInt3383;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "[Lclient!vg;")
	public static Class256[] aClass256Array1;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "Lclient!cd;")
	public static final Class36 aClass36_8 = new Class36("", 15);

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(III)V")
	public static void method2820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(15, 0);
		local8.method5345();
		local8.anInt6813 = arg1;
		local8.anInt6806 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(III)V")
	public static void method2822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static310.method4308(Static35.aClass27_15);
		Static337.aClass10_Sub8_Sub2_2.method2497(arg0);
		Static337.aClass10_Sub8_Sub2_2.method2523(arg1);
	}
}
