import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!dfa", name = "v", descriptor = "Lclient!rha;")
	public static final Class309 aClass309_2 = new Class309("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "Lclient!im;")
	public static Class181 aClass181_38 = null;

	@OriginalMember(owner = "client!dfa", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method2009(@OriginalArg(1) Class16 arg0) {
		if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != Static122.anInt2388 && (Static332.aClass247ArrayArrayArray1 != null && Static112.method2104(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142, arg0))) {
			Static122.anInt2388 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2010(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.length();
		while (local18 < local21 && Static249.method3946(arg0.charAt(local18))) {
			local18++;
		}
		while (local18 < local21 && Static249.method3946(arg0.charAt(local21 - 1))) {
			local21--;
		}
		@Pc(55) int local55 = local21 - local18;
		if (local55 < 1 || local55 > 12) {
			return null;
		}
		@Pc(68) StringBuffer local68 = new StringBuffer(local55);
		for (@Pc(70) int local70 = local18; local70 < local21; local70++) {
			@Pc(76) char local76 = arg0.charAt(local70);
			if (Static57.method6350(local76)) {
				@Pc(86) char local86 = Static333.method5118(local76);
				if (local86 != '\u0000') {
					local68.append(local86);
				}
			}
		}
		if (local68.length() == 0) {
			return null;
		} else {
			return local68.toString();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIB)Z")
	public static boolean method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static670.method8772(arg1, arg0) || Static464.method6665(arg0, arg1);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZLclient!gj;)Lclient!kc;")
	public static Class202 method2014(@OriginalArg(0) int arg0, @OriginalArg(3) Class143 arg1) {
		@Pc(14) byte[] local14 = arg1.method3125(0, arg0);
		return local14 == null ? null : new Class202(local14);
	}

	@OriginalMember(owner = "client!dfa", name = "g", descriptor = "(I)I")
	public static int method2016() {
		return Static166.anInt3024;
	}

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)I")
	public static int method2018() {
		return Static418.anInt7055 == 1 ? Static554.anInt8569 : Static278.anInt5212;
	}
}
