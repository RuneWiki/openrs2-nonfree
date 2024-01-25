import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public static int anInt6084;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_163 = new Class363(53, 2);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Lclient!tba;")
	public static Class2_Sub42 method5056() {
		return Static344.anInt6233 == 0 ? new Class2_Sub42() : Static454.aClass2_Sub42Array1[--Static344.anInt6233];
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method5057(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(5, arg0);
		local8.method6095();
	}
}
