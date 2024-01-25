import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
	public static int anInt7760;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
	public static int anInt7762 = 0;

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "[Lclient!vi;")
	public static Class354_Sub1[] aClass354_Sub1Array2 = new Class354_Sub1[0];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	public static void method6760() {
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt2825; local1++) {
			@Pc(6) Class9_Sub2_Sub1 local6 = Static513.aClass9_Sub2_Sub1Array1[local1];
			Static256.method4295(local6, true);
			Static513.aClass9_Sub2_Sub1Array1[local1] = null;
		}
		Static135.anInt2825 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)Z")
	public static boolean method6761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static221.method8615(arg1, arg0) | (arg1 & 0x60000) != 0 || Static610.method8361(arg0, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public static void method6762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static567.aClass351ArrayArrayArray4[0][arg1][arg2] != null && Static567.aClass351ArrayArrayArray4[0][arg1][arg2].aClass351_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static567.aClass351ArrayArrayArray4[local22][arg1][arg2] == null) {
				@Pc(44) Class351 local44 = Static567.aClass351ArrayArrayArray4[local22][arg1][arg2] = new Class351(local22);
				if (local20) {
					local44.aByte118++;
				}
			}
		}
	}
}
