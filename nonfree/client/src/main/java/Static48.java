import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!dd;")
	public static Class4_Sub8 aClass4_Sub8_10;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!la;")
	public static Class17 aClass17_17;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!gf;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!uf;")
	public static Class75 aClass75_4;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!la;")
	public static Class17 aClass17_18;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	public static int anInt1234;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_540 = Static134.method2017("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt1228 = 0;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!v;")
	private static Class76 aClass76_541 = Static134.method2017("Free world");

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][13][13];

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_542 = Static134.method2017(" loggt sich ein)3");

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public static int anInt1229 = 0;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	public static int anInt1230 = 0;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_543 = aClass76_541;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
	public static int[] anIntArray155 = new int[32];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBLclient!v;)V")
	public static void method839(@OriginalArg(0) int arg0, @OriginalArg(2) Class76 arg1) {
		Static69.aClass4_Sub10_Sub1_2.method611(114);
		Static69.aClass4_Sub10_Sub1_2.method600(arg0);
		Static69.aClass4_Sub10_Sub1_2.method588(arg1.method1872());
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method840() {
		aClass76_543 = null;
		anIntArray155 = null;
		aClass75_4 = null;
		aClass17_18 = null;
		aClass28_4 = null;
		aClass76_542 = null;
		aClass4_Sub8_10 = null;
		aClass17_17 = null;
		aClass76_540 = null;
		anIntArrayArrayArray2 = null;
		aClass76_541 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[BII)I")
	public static int method841(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class15.anIntArray44[(arg1[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}
}
