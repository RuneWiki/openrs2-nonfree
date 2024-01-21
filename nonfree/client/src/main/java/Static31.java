import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt910;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!me;")
	public static Class4_Sub3_Sub6_Sub1_Sub1 aClass4_Sub3_Sub6_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
	public static int[] anIntArray93;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public static int anInt909 = 99;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_309 = Static41.method597("<col=c0ff00>");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!od;")
	private static Class60 aClass60_310 = Static41.method597(" from your friend list first");

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_311 = aClass60_310;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_312 = Static41.method597("Texturen geladen)3");

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_313 = Static41.method597("sl_arrows");

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_314 = Static41.method597("<)4col> x");

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!od;")
	private static Class60 aClass60_318 = Static41.method597("Please enter your username)3");

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_315 = aClass60_318;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_7 = null;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_316 = Static41.method597("title_mute");

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
	public static int[] anIntArray94 = new int[128];

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_319 = Static41.method597("null");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] method481(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static50.method853(local18) : local18;
		} else if (arg1 instanceof Class33) {
			@Pc(32) Class33 local32 = (Class33) arg1;
			return local32.method677();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method482() {
		@Pc(1) Class82 local1 = Static7.aClass82_1;
		synchronized (Static7.aClass82_1) {
			Static24.anInt834 = Static55.anInt1495;
			Static36.anInt1006 = Static122.anInt2792;
			Static85.anInt2015 = Static66.anInt1658;
			Static97.anInt2284 = Static76.anInt1843;
			Static122.anInt2791 = Static78.anInt1894;
			Static63.anInt1591 = Static39.anInt1052;
			Static96.aLong75 = Static22.aLong26;
			Static76.anInt1843 = 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method483() {
		anIntArray94 = null;
		aClass60_316 = null;
		aClass60_311 = null;
		aClass60_309 = null;
		aClass60_319 = null;
		aClass4_Sub14_7 = null;
		aClass60_315 = null;
		aClass60_314 = null;
		aClass60_318 = null;
		anIntArray93 = null;
		aClass60_310 = null;
		aClass60_313 = null;
		aClass4_Sub3_Sub6_Sub1_Sub1_3 = null;
		aClass60_312 = null;
	}
}
