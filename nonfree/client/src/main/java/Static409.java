import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!um", name = "x", descriptor = "I")
	public static int anInt6740;

	@OriginalMember(owner = "client!um", name = "B", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_103 = new Class217(32, -1);

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public static void method5280() {
		Static312.anInt5522 = -1;
		Static78.anInt1944 = -1;
		Static311.anInt5499 = 0;
		Static80.anInt2013 = -1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IBI)V")
	public static void method5281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static393.method5080(arg1, 12);
		local12.method3248();
		local12.anInt4063 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)V")
	public static void method5282() {
		Static167.aClass126_20.method3140(5);
	}
}
