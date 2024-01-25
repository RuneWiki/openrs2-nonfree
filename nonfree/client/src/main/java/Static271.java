import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static271 {

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "[Lclient!de;")
	public static Class67[] aClass67Array1;

	@OriginalMember(owner = "client!jaa", name = "x", descriptor = "I")
	public static int anInt5093 = 0;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(CB)I")
	public static int method4637(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class4_Sub18.anIntArray328.length > arg0 ? Class4_Sub18.anIntArray328[arg0] : -1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!gga;B)V")
	public static void method4639(@OriginalArg(0) Class124 arg0) {
		Static28.aClass124_8 = arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)V")
	public static void method4640() {
		Static367.anIntArray329 = Static95.method1630(0.4F);
	}
}
