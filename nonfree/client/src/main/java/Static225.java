import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "Lclient!ql;")
	public static Class1_Sub13 aClass1_Sub13_6 = new Class1_Sub13(new byte[5000]);

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
	public static int anInt4488 = 0;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Lclient!ab;")
	public static Class3 aClass3_20 = new Class3();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public static void method3388() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static238.anInt5146; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static237.anIntArray447[local3];
			}
			@Pc(22) Class9_Sub1_Sub1 local22 = Static147.aClass9_Sub1_Sub1Array1[local12];
			if (local22 != null && local22.anInt402 > 0) {
				local22.anInt402--;
				if (local22.anInt402 == 0) {
					local22.aString13 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static16.anInt4955; local12++) {
			@Pc(59) int local59 = Static142.anIntArray260[local12];
			@Pc(63) Class9_Sub1_Sub2 local63 = Static36.aClass9_Sub1_Sub2Array2[local59];
			if (local63 != null && local63.anInt402 > 0) {
				local63.anInt402--;
				if (local63.anInt402 == 0) {
					local63.aString13 = null;
				}
			}
		}
	}
}
