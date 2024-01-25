import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	public static int anInt3885;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "Lclient!ie;")
	public static Class5_Sub29 aClass5_Sub29_2;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "Lclient!dl;")
	public static final Class87 aClass87_2 = new Class87(2);

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	public static final int anInt3884 = 1400;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "[I")
	public static final int[] anIntArray196 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!go", name = "t", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_33 = new Class305(9, 3);

	@OriginalMember(owner = "client!go", name = "u", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)Lclient!g;")
	public static Class127 method3303(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static330.aFloat8 == 3.0D) {
				return Static32.aClass127_2;
			}
			if ((double) Static330.aFloat8 == 4.0D) {
				return Static255.aClass127_4;
			}
			if ((double) Static330.aFloat8 == 6.0D) {
				return Static603.aClass127_10;
			}
			if ((double) Static330.aFloat8 >= 8.0D) {
				return Static614.aClass127_12;
			}
		} else if (arg0 == 1) {
			if ((double) Static330.aFloat8 == 3.0D) {
				return Static603.aClass127_10;
			}
			if ((double) Static330.aFloat8 == 4.0D) {
				return Static614.aClass127_12;
			}
			if ((double) Static330.aFloat8 == 6.0D) {
				return Static418.aClass127_7;
			}
			if ((double) Static330.aFloat8 >= 8.0D) {
				return Static449.aClass127_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static330.aFloat8 == 3.0D) {
				return Static418.aClass127_7;
			}
			if ((double) Static330.aFloat8 == 4.0D) {
				return Static449.aClass127_8;
			}
			if ((double) Static330.aFloat8 == 6.0D) {
				return Static1.aClass127_11;
			}
			if ((double) Static330.aFloat8 >= 8.0D) {
				return Static593.aClass127_9;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)I")
	public static int method3304() {
		@Pc(12) int local12 = Static123.aClass259_1.method6132();
		if (local12 < Static672.aClass259Array1.length - 1) {
			Static123.aClass259_1 = Static672.aClass259Array1[local12 + 1];
		}
		return 100;
	}
}
