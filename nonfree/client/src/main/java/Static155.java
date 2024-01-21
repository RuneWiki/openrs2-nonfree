import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!oe;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int anInt3943 = 0;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public static int anInt3944 = -1;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1065 = Static158.method3034("Your profile will be transferred in:");

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1062 = aClass60_1065;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1063 = Static158.method3034("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1067 = Static158.method3034("Loaded input handler");

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1064 = aClass60_1067;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1066 = Static158.method3034("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "[I")
	public static final int[] anIntArray439 = new int[32];

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1068 = Static158.method3034("<)4col>");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)Z")
	public static boolean method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static189.anInt4498 + arg0 * Static135.anInt3581 >> 16;
		@Pc(19) int local19 = arg2 * Static135.anInt3581 - arg0 * Static189.anInt4498 >> 16;
		@Pc(29) int local29 = arg1 * Static94.anInt2812 + local19 * Static108.anInt3076 >> 16;
		@Pc(39) int local39 = arg1 * Static108.anInt3076 - local19 * Static94.anInt2812 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static184.anInt4447 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static5.anInt136 + (local39 << 9) / local29;
			return local55 >= Static30.anInt900 && local55 <= Static152.anInt2806 && local63 >= Static10.anInt332 && local63 <= Static105.anInt3627;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZIIII)V")
	public static void method2995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static42.anInt1305; local7++) {
			if (Static38.anIntArray101[local7] + Static99.anIntArray329[local7] > arg2 && arg2 + arg1 > Static38.anIntArray101[local7] && arg3 < Static16.anIntArray42[local7] + Static98.anIntArray326[local7] && arg3 + arg0 > Static16.anIntArray42[local7]) {
				Static196.aBooleanArray19[local7] = true;
			}
		}
	}
}
