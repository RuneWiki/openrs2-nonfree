import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt417;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_278 = Static80.method1463("l");

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_279 = Static80.method1463("@yel@");

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!rd;")
	private static Class63 aClass63_280 = Static80.method1463("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_281 = Static80.method1463("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!mb;")
	public static Class49 aClass49_5 = new Class49(50);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_282 = Static80.method1463("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
	public static int[] anIntArray50 = new int[200];

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_283 = aClass63_280;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public static int anInt421 = 0;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!rd;")
	private static Class63 aClass63_284 = Static80.method1463("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Lclient!rd;")
	private static Class63 aClass63_286 = Static80.method1463("This world is full)3");

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_285 = aClass63_286;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!rd;")
	private static Class63 aClass63_288 = Static80.method1463("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!rd;")
	public static Class63 aClass63_287 = aClass63_288;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_289 = aClass63_284;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!wa;")
	public static Class6_Sub3_Sub17 method339(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static68.aClass6_Sub3_Sub17ArrayArray1[local12] == null || Static68.aClass6_Sub3_Sub17ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static36.method866(local12);
			if (!local30) {
				return null;
			}
		}
		return Static68.aClass6_Sub3_Sub17ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!rd;II)V")
	public static void method340(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		Static23.aClass6_Sub4_Sub1_4.method1347(12);
		Static23.aClass6_Sub4_Sub1_4.method1334(arg0.method1823());
		Static23.aClass6_Sub4_Sub1_4.method1291(arg1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method341() {
		aClass63_278 = null;
		aClass63_282 = null;
		aClass49_5 = null;
		anIntArray50 = null;
		aClass63_279 = null;
		aClass63_283 = null;
		aClass63_287 = null;
		aClass63_289 = null;
		aClass63_284 = null;
		aClass63_285 = null;
		aClass63_288 = null;
		aClass63_286 = null;
		aClass63_280 = null;
		aClass63_281 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
	public static boolean method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}
}
