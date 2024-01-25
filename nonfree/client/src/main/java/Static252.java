import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "[I")
	public static final int[] anIntArray306 = new int[200];

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "F")
	public static float aFloat47 = 0.0F;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)I")
	public static int method3754(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z[Lclient!f;)V")
	public static void method3756(@OriginalArg(1) Class8[] arg0) {
		Static156.anInt3151 = arg0.length;
		Static430.aClass8Array88 = new Class8[Static156.anInt3151 + 10];
		Static221.anIntArray276 = new int[Static156.anInt3151 + 10];
		Static462.method4614(arg0, 0, Static430.aClass8Array88, 0, Static156.anInt3151);
		for (@Pc(30) int local30 = 0; local30 < Static156.anInt3151; local30++) {
			Static221.anIntArray276[local30] = Static430.aClass8Array88[local30].JA();
		}
		for (@Pc(44) int local44 = Static156.anInt3151; local44 < Static430.aClass8Array88.length; local44++) {
			Static221.anIntArray276[local44] = 12;
		}
	}
}
