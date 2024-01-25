import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!sba", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString187 = "";

	@OriginalMember(owner = "client!sba", name = "G", descriptor = "I")
	public static int anInt7698 = 10;

	@OriginalMember(owner = "client!sba", name = "H", descriptor = "[I")
	public static final int[] anIntArray723 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZIZ)I")
	public static int method6819(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub8 local14 = Static271.method4828(arg0, false);
		if (local14 == null) {
			return Static409.aClass257_1.method6645(arg0).anInt3123;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray118.length; local31++) {
			if (local14.anIntArray118[local31] == -1) {
				local24++;
			}
		}
		return local24 + Static409.aClass257_1.method6645(arg0).anInt3123 - local14.anIntArray118.length;
	}
}
