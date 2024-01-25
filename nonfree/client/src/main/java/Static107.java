import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	public static int anInt2391;

	@OriginalMember(owner = "client!go", name = "R", descriptor = "I")
	public static int anInt2397;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!go", name = "N", descriptor = "[I")
	public static final int[] anIntArray219 = new int[] { 0, 0, 0, 0, 0, 2, 7, 0, 8, 0, 0, 0, 0, 0, 2, 0, 0, 0, 20, 0, 11, 7, -1, 0, 0, 0, 5, 0, 0, 0, 6, 12, 0, 0, 6, 0, 0, -1, 7, 0, -1, 0, 0, 12, -2, 0, 0, 0, -1, 0, -2, 0, 4, -2, 6, 0, 0, 0, -1, 6, 4, 2, 0, 0, 0, 0, 8, 0, 1, 0, 0, 0, 0, 6, 0, 6, 0, 0, 0, 0, 3, 0, 8, 6, 0, 6, 0, 0, 0, 0, 0, 12, -2, 0, -1, 0, -1, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 8, 0, 0, 0, 0, 8, 0, 5, 0, 0, -2, 0, 5, 0, -1, 0, 3, 2, 15, 0, 0, -1, 0, -1, 3, 0, 28, 1, 0, 0, -1, -2, 0, 0, 0, 6, 8, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, -1, -2, 14, 0, 7, 0, 10, 0, 0, 0, 0, -2, 0, 6, -1, -2, 0, 8, 3, 3, 0, 0, 0, 8, 0, 0, 2, 0, -1, 6, 0, 9, 0, 0, 8, 2, 12, 0, 2, -1, 0, 4, -2, 0, 4, 0, 3, 1, 14, 3, 0, 5, 0, 0, 0, 0, 8, 0, 10, -2, 10, 0, 0, 0, 0, 10, 0, 0, 12, 0, -1, 0, 2, 0, 0, 0, 0, 17, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1, 1, 6, 0, 0, 0, 15, 0, 0, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(III)I")
	public static int method2323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class14_Sub37 local12 = (Class14_Sub37) Static316.aClass25_15.method691((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local12.anIntArray612.length; local26++) {
				if (local12.anIntArray614[local26] == arg0) {
					local24 += local12.anIntArray612[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2324(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lclient!wd;")
	public static Class212 method2326(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static241.aFloat108 == 3.0D) {
				return Static108.aClass212_4;
			}
			if ((double) Static241.aFloat108 == 4.0D) {
				return Static255.aClass212_13;
			}
			if ((double) Static241.aFloat108 == 6.0D) {
				return Static121.aClass212_5;
			}
			if ((double) Static241.aFloat108 >= 8.0D) {
				return Static319.aClass212_16;
			}
		} else if (arg0 == 1) {
			if ((double) Static241.aFloat108 == 3.0D) {
				return Static121.aClass212_5;
			}
			if ((double) Static241.aFloat108 == 4.0D) {
				return Static319.aClass212_16;
			}
			if ((double) Static241.aFloat108 == 6.0D) {
				return Static222.aClass212_12;
			}
			if ((double) Static241.aFloat108 >= 8.0D) {
				return Static90.aClass212_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static241.aFloat108 == 3.0D) {
				return Static222.aClass212_12;
			}
			if ((double) Static241.aFloat108 == 4.0D) {
				return Static90.aClass212_3;
			}
			if ((double) Static241.aFloat108 == 6.0D) {
				return Static156.aClass212_15;
			}
			if ((double) Static241.aFloat108 >= 8.0D) {
				return Static307.aClass212_7;
			}
		}
		return null;
	}
}
