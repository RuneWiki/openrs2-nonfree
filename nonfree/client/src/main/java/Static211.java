import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!qb", name = "mc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!qb", name = "oc", descriptor = "[Lclient!jd;")
	public static Class76[] aClass76Array1;

	@OriginalMember(owner = "client!qb", name = "Bc", descriptor = "I")
	public static int anInt4210;

	@OriginalMember(owner = "client!qb", name = "Mc", descriptor = "Lclient!lc;")
	public static Class98 aClass98_127;

	@OriginalMember(owner = "client!qb", name = "Sc", descriptor = "I")
	public static int anInt4222;

	@OriginalMember(owner = "client!qb", name = "pc", descriptor = "I")
	public static int anInt4200 = 0;

	@OriginalMember(owner = "client!qb", name = "vc", descriptor = "I")
	public static int anInt4204 = -1;

	@OriginalMember(owner = "client!qb", name = "Jc", descriptor = "[Lclient!hj;")
	public static Class60[] aClass60Array1 = new Class60[50];

	@OriginalMember(owner = "client!qb", name = "Pc", descriptor = "[I")
	public static int[] anIntArray381 = new int[4096];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!p;Ljava/lang/String;I)I")
	public static int method3377(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt2400;
		@Pc(10) byte[] local10 = Static153.method2439(arg1);
		arg0.method1847(local10.length);
		arg0.anInt2400 += Static173.aClass31_1.method708(arg0.aByteArray30, 0, local10.length, arg0.anInt2400, local10);
		return arg0.anInt2400 - local6;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3379(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(35) long local35 = arg0; local35 != 0L; local35 /= 37L) {
				local28++;
			}
			@Pc(51) StringBuffer local51 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static275.aCharArray41[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					local73 = ' ';
					@Pc(83) int local83 = local51.length() - 1;
					local51.setCharAt(local83, Character.toUpperCase(local51.charAt(local83)));
				}
				local51.append(local73);
			}
			local51.reverse();
			local51.setCharAt(0, Character.toUpperCase(local51.charAt(0)));
			return local51.toString();
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
	public static void method3381() {
		aClass60Array1 = null;
		aClass76Array1 = null;
		aClass98_127 = null;
		anIntArrayArrayArray9 = null;
		anIntArray381 = null;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	public static int method3384(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
