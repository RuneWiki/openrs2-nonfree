import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public static int anInt1094 = 0;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_336 = Static13.method257("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!qc;")
	public static Class47 aClass47_12 = new Class47(64);

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_337 = Static13.method257("Last password change:*6n@gre@");

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_338 = Static13.method257("To play on this world move to a free area first");

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_339 = Static13.method257("@yel@*V");

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public static int anInt1095 = 0;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_340 = Static13.method257("From");

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	public static int anInt1097 = 0;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_341 = Static13.method257("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_342 = Static13.method257("yellow:");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public static void method801() {
		Static25.aFontMetrics1 = null;
		Static79.anImage4 = null;
		Static21.aFont1 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method802() {
		aClass40_336 = null;
		aClass40_338 = null;
		aClass40_342 = null;
		aClass40_339 = null;
		aClass47_12 = null;
		aClass40_341 = null;
		aClass40_340 = null;
		anIntArray225 = null;
		aClass40_337 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method803(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static32.anInt737 > 0) {
			local19 = Static16.aByteArrayArray3[--Static32.anInt737];
			Static16.aByteArrayArray3[Static32.anInt737] = null;
			return local19;
		} else if (arg0 == 5000 && Static37.anInt965 > 0) {
			local19 = Static30.aByteArrayArray8[--Static37.anInt965];
			Static30.aByteArrayArray8[Static37.anInt965] = null;
			return local19;
		} else if (arg0 == 30000 && Static10.anInt264 > 0) {
			local19 = Static79.aByteArrayArray9[--Static10.anInt264];
			Static79.aByteArrayArray9[Static10.anInt264] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}
