import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public static int anInt679;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!ch;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "Z")
	private static boolean aBoolean30;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_216 = Static151.method2243("::tele 0)1");

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_217 = Static151.method2243("<col=ffff00>");

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_221 = Static151.method2243("flash1:");

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!mb;")
	public static Class62 aClass62_218 = aClass62_221;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_219 = Static151.method2243("(U0a )2 in: ");

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_220 = Static151.method2243(")2");

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_222 = aClass62_221;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILclient!mf;IJIIII)Z")
	public static boolean method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static112.method1716(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(Z)V")
	public static void method516() {
		if (Static159.anIntArray290 != null && Static63.anIntArray104 != null) {
			return;
		}
		Static63.anIntArray104 = new int[256];
		Static159.anIntArray290 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static159.anIntArray290[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static63.anIntArray104[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}
}
