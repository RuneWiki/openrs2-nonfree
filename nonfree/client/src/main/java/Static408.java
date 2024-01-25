import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
	public static int anInt7795;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
	public static int anInt7804;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "[Lclient!qfa;")
	public static final Class272[] aClass272Array1 = new Class272[2048];

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_80 = new Class257(34, 7);

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "Z")
	public static boolean aBoolean563 = false;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!tp;)Ljava/lang/String;")
	public static String method6463(@OriginalArg(1) Class331 arg0) {
		if (Static73.method1921(arg0).method5219() == 0) {
			return null;
		} else if (arg0.aString97 == null || arg0.aString97.trim().length() == 0) {
			return Static54.aBoolean127 ? "Hidden-use" : null;
		} else {
			return arg0.aString97;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)V")
	public static void method6464(@OriginalArg(0) byte arg0) {
		if (Static28.aByteArrayArrayArray7 == null) {
			Static28.aByteArrayArrayArray7 = new byte[4][Static372.anInt7082][Static218.anInt5023];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(26) int local26 = 0; local26 < Static372.anInt7082; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static218.anInt5023; local30++) {
					Static28.aByteArrayArrayArray7[local22][local26][local30] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)Lclient!v;")
	public static Class15_Sub1_Sub5 method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub1_Sub5_1;
	}
}
