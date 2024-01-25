import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
	public static int anInt9099;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Lclient!nb;")
	public static final Class217 aClass217_5 = new Class217("game4", 3);

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "Z")
	public static boolean aBoolean645 = false;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[Lclient!ig;")
	public static final Class8_Sub8[] aClass8_Sub8Array1 = new Class8_Sub8[2048];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!aia;)Z")
	public static boolean method7455(@OriginalArg(1) Class17 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean75) {
			return false;
		} else if (!arg0.method764(Static110.anInterface17_2)) {
			return false;
		} else if (Static332.aClass253_23.method6594((long) arg0.anInt818) == null) {
			return Static207.aClass253_13.method6594((long) arg0.anInt811) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!ha;I)Lclient!ur;")
	public static Class345 method7460(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3 local17 = Static265.method4616(arg0, true, arg1);
		return local17 == null ? null : local17.aClass345_1;
	}
}
