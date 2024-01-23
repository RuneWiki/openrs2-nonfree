import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public static int anInt1406;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "Lclient!hc;")
	public static Class51 aClass51_19;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "I")
	public static int anInt1415;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "J")
	public static long aLong43 = 0L;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
	public static int[] anIntArray106 = new int[25];

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	public static int anInt1409 = 0;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "I")
	public static int anInt1414 = 0;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7 = new String[200];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIIII)V")
	public static void method981(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static202.aLong145 = 0L;
		@Pc(8) int local8 = Static110.method2246();
		if (arg3 == 3 || local8 == 3) {
			arg0 = true;
		}
		@Pc(18) boolean local18 = false;
		if (local8 <= 0 == arg3 > 0) {
			local18 = true;
		}
		if (Static40.aString58.startsWith("mac") && arg3 > 0) {
			arg0 = true;
		}
		if (arg0 && arg3 > 0) {
			local18 = true;
		}
		Static251.method4071(local18, arg0, local8, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
	public static String method983(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(14) int local14 = arg1.length();
		if (local11 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(28) int local28 = local8;
		@Pc(32) int local32 = local14 - local11;
		if (local32 != 0) {
			@Pc(36) int local36 = 0;
			while (true) {
				local36 = arg0.indexOf(arg2, local36);
				if (local36 < 0) {
					break;
				}
				local28 += local32;
				local36 += local11;
			}
		}
		@Pc(58) StringBuffer local58 = new StringBuffer(local28);
		@Pc(60) int local60 = 0;
		while (true) {
			@Pc(65) int local65 = arg0.indexOf(arg2, local60);
			if (local65 < 0) {
				local58.append(arg0.substring(local60));
				return local58.toString();
			}
			local58.append(arg0.substring(local60, local65));
			local60 = local11 + local65;
			local58.append(arg1);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	public static void method984() {
		if (Static110.aBoolean160) {
			Static216.aClass1_Sub2_Sub4_7 = null;
			Static203.aClass7_1 = null;
			Static110.aBoolean160 = false;
		}
	}
}
