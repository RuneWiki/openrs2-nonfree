import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
	public static int anInt2253;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
	public static final int[] anIntArray149 = new int[3];

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public static int anInt2252 = 1;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_8 = new Class6(1, 2);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBLclient!ka;I)Lclient!dg;")
	public static Class77 method2088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class77(arg1, arg3, arg0, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method2089(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class3_Sub44 local12 = Static275.method5689(Static287.aClass376_73, Static540.aClass282_4);
		local12.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(arg1) + 1);
		local12.aClass3_Sub17_Sub2_3.method4849(arg0);
		local12.aClass3_Sub17_Sub2_3.method4878(arg1);
		Static616.method8089(local12);
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public static void method2090() {
		if (Static176.anInt3320 < 0) {
			Static577.anInt9150 = -1;
			Static176.anInt3320 = 0;
			Static296.anInt8194 = -1;
		}
		if (Static574.anInt8360 < Static176.anInt3320) {
			Static296.anInt8194 = -1;
			Static577.anInt9150 = -1;
			Static176.anInt3320 = Static574.anInt8360;
		}
		if (Static462.anInt7931 < 0) {
			Static462.anInt7931 = 0;
			Static577.anInt9150 = -1;
			Static296.anInt8194 = -1;
		}
		if (Static462.anInt7931 > Static574.anInt8364) {
			Static462.anInt7931 = Static574.anInt8364;
			Static296.anInt8194 = -1;
			Static577.anInt9150 = -1;
		}
	}
}
