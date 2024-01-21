import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_38;

	@OriginalMember(owner = "client!eb", name = "rc", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!eb", name = "eb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_346 = Static75.method1216("Empf-=nger:");

	@OriginalMember(owner = "client!eb", name = "ib", descriptor = "Lclient!ad;")
	private static Class4 aClass4_348 = Static75.method1216("Unable to find ");

	@OriginalMember(owner = "client!eb", name = "ob", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_349 = Static75.method1216("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_350 = aClass4_348;

	@OriginalMember(owner = "client!eb", name = "Ob", descriptor = "Lclient!ad;")
	private static Class4 aClass4_355 = Static75.method1216("Please contact customer support)3");

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_351 = aClass4_355;

	@OriginalMember(owner = "client!eb", name = "Ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_352 = Static75.method1216(":");

	@OriginalMember(owner = "client!eb", name = "Zb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_356 = Static75.method1216("Unexpected server response");

	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_353 = aClass4_356;

	@OriginalMember(owner = "client!eb", name = "Gb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_354 = Static75.method1216("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!eb", name = "ic", descriptor = "I")
	public static volatile int anInt754 = -1;

	@OriginalMember(owner = "client!eb", name = "oc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_357 = Static75.method1216(":tradereq:");

	@OriginalMember(owner = "client!eb", name = "pc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_358 = Static75.method1216("Stufe)2");

	@OriginalMember(owner = "client!eb", name = "qc", descriptor = "I")
	public static int anInt760 = 0;

	@OriginalMember(owner = "client!eb", name = "sc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_359 = Static75.method1216("Neuer Benutzer");

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
	public static void method489() {
		aClass4_346 = null;
		aClass4_355 = null;
		aClass4_356 = null;
		aClass4_349 = null;
		aClass4_348 = null;
		aClass4_358 = null;
		aClass4_351 = null;
		aClass4_350 = null;
		aClass4_352 = null;
		aCRC32_2 = null;
		aClass4_357 = null;
		aClass4_354 = null;
		aClass4_359 = null;
		aClass25_38 = null;
		aClass4_353 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ[BI)V")
	public static void method494(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		if (Static8.aClass30_1 == null) {
			return;
		}
		if (Static35.anInt640 >= 0) {
			Static8.aClass30_1.method1883();
			Static9.anInt310 = 20;
			Static56.aByteArray16 = null;
			Static35.anInt640 = -1;
			Static113.anInt2852 = 0;
		}
		if (arg1 == null) {
			return;
		}
		if (Static9.anInt310 > 0) {
			Static8.aClass30_1.method1873(arg2);
			Static9.anInt310 = 0;
		}
		Static35.anInt640 = arg2;
		Static8.aClass30_1.method1875(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!tb;)V")
	public static void method495(@OriginalArg(1) int arg0, @OriginalArg(2) Class64_Sub1 arg1) {
		if (Static1.aClass3_Sub4_1 == null) {
			Static13.method219(0, 255, 255, true, null, (byte) 0);
			Static81.aClass64_Sub1Array1[arg0] = arg1;
		} else {
			Static1.aClass3_Sub4_1.anInt627 = arg0 * 4 + 5;
			@Pc(20) int local20 = Static1.aClass3_Sub4_1.method438();
			arg1.method1645(local20);
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)V")
	public static void method496() {
		if (Static77.anInt1842 != 1) {
			return;
		}
		if (Static4.anInt194 >= 539 && Static4.anInt194 <= 573 && Static91.anInt2055 >= 169 && Static91.anInt2055 < 205 && Static13.anIntArray15[0] != -1) {
			Static39.aBoolean74 = true;
			Static70.anInt1686 = 0;
			Static89.aBoolean159 = true;
		}
		if (Static4.anInt194 >= 569 && Static4.anInt194 <= 599 && Static91.anInt2055 >= 168 && Static91.anInt2055 < 205 && Static13.anIntArray15[1] != -1) {
			Static70.anInt1686 = 1;
			Static39.aBoolean74 = true;
			Static89.aBoolean159 = true;
		}
		if (Static4.anInt194 >= 597 && Static4.anInt194 <= 627 && Static91.anInt2055 >= 168 && Static91.anInt2055 < 205 && Static13.anIntArray15[2] != -1) {
			Static89.aBoolean159 = true;
			Static39.aBoolean74 = true;
			Static70.anInt1686 = 2;
		}
		if (Static4.anInt194 >= 625 && Static4.anInt194 <= 669 && Static91.anInt2055 >= 168 && Static91.anInt2055 < 203 && Static13.anIntArray15[3] != -1) {
			Static70.anInt1686 = 3;
			Static39.aBoolean74 = true;
			Static89.aBoolean159 = true;
		}
		if (Static4.anInt194 >= 666 && Static4.anInt194 <= 696 && Static91.anInt2055 >= 168 && Static91.anInt2055 < 205 && Static13.anIntArray15[4] != -1) {
			Static70.anInt1686 = 4;
			Static89.aBoolean159 = true;
			Static39.aBoolean74 = true;
		}
		if (Static4.anInt194 >= 694 && Static4.anInt194 <= 724 && Static91.anInt2055 >= 168 && Static91.anInt2055 < 205 && Static13.anIntArray15[5] != -1) {
			Static39.aBoolean74 = true;
			Static70.anInt1686 = 5;
			Static89.aBoolean159 = true;
		}
		if (Static4.anInt194 >= 722 && Static4.anInt194 <= 756 && Static91.anInt2055 >= 169 && Static91.anInt2055 < 205 && Static13.anIntArray15[6] != -1) {
			Static70.anInt1686 = 6;
			Static89.aBoolean159 = true;
			Static39.aBoolean74 = true;
		}
		if (Static4.anInt194 >= 540 && Static4.anInt194 <= 574 && Static91.anInt2055 >= 466 && Static91.anInt2055 < 502 && Static13.anIntArray15[7] != -1) {
			Static89.aBoolean159 = true;
			Static39.aBoolean74 = true;
			Static70.anInt1686 = 7;
		}
		if (Static4.anInt194 >= 572 && Static4.anInt194 <= 602 && Static91.anInt2055 >= 466 && Static91.anInt2055 < 503 && Static13.anIntArray15[8] != -1) {
			Static70.anInt1686 = 8;
			Static89.aBoolean159 = true;
			Static39.aBoolean74 = true;
		}
		if (Static4.anInt194 >= 599 && Static4.anInt194 <= 629 && Static91.anInt2055 >= 466 && Static91.anInt2055 < 503 && Static13.anIntArray15[9] != -1) {
			Static70.anInt1686 = 9;
			Static89.aBoolean159 = true;
			Static39.aBoolean74 = true;
		}
		if (Static4.anInt194 >= 627 && Static4.anInt194 <= 671 && Static91.anInt2055 >= 467 && Static91.anInt2055 < 502 && Static13.anIntArray15[10] != -1) {
			Static39.aBoolean74 = true;
			Static89.aBoolean159 = true;
			Static70.anInt1686 = 10;
		}
		if (Static4.anInt194 >= 669 && Static4.anInt194 <= 699 && Static91.anInt2055 >= 466 && Static91.anInt2055 < 503 && Static13.anIntArray15[11] != -1) {
			Static39.aBoolean74 = true;
			Static70.anInt1686 = 11;
			Static89.aBoolean159 = true;
		}
		if (Static4.anInt194 >= 696 && Static4.anInt194 <= 726 && Static91.anInt2055 >= 466 && Static91.anInt2055 < 503 && Static13.anIntArray15[12] != -1) {
			Static70.anInt1686 = 12;
			Static39.aBoolean74 = true;
			Static89.aBoolean159 = true;
		}
		if (Static4.anInt194 >= 724 && Static4.anInt194 <= 758 && Static91.anInt2055 >= 466 && Static91.anInt2055 < 502 && Static13.anIntArray15[13] != -1) {
			Static39.aBoolean74 = true;
			Static70.anInt1686 = 13;
			Static89.aBoolean159 = true;
		}
	}
}
