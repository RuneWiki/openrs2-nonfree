import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ie", name = "pb", descriptor = "I")
	public static int anInt1144;

	@OriginalMember(owner = "client!ie", name = "vb", descriptor = "[S")
	public static short[] aShortArray14;

	@OriginalMember(owner = "client!ie", name = "Rb", descriptor = "Lclient!r;")
	public static Class70 aClass70_3;

	@OriginalMember(owner = "client!ie", name = "Pb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_519 = Static119.method1462("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_517 = aClass65_519;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "[I")
	public static int[] anIntArray143 = new int[100];

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Lclient!pe;")
	public static Class65 aClass65_518 = Static119.method1462("mn");

	@OriginalMember(owner = "client!ie", name = "fb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ie", name = "tb", descriptor = "I")
	public static int anInt1148 = 0;

	@OriginalMember(owner = "client!ie", name = "Mb", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!ie", name = "Sb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_520 = Static119.method1462("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!ie", name = "Tb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_521 = Static119.method1462("<br>(X");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method796(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static96.aClass43_1);
		arg0.removeFocusListener(Static96.aClass43_1);
		Static46.anInt1105 = -1;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public static void method806() {
		aClass65_521 = null;
		anIntArray143 = null;
		aClass65_518 = null;
		aClass65_520 = null;
		aClass65_517 = null;
		aClass65_519 = null;
		aClass70_3 = null;
		aShortArray14 = null;
		aCRC32_1 = null;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V")
	public static void method808() {
		while (true) {
			@Pc(12) Class13 local12 = Static9.aClass13_4;
			@Pc(19) Class2_Sub19 local19;
			synchronized (Static9.aClass13_4) {
				local19 = (Class2_Sub19) Static72.aClass13_11.method267();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass56_Sub1_28.method1698((int) local19.aLong100, local19.aByteArray36, false, local19.aClass24_3);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B[Lclient!pe;)[Lclient!pe;")
	public static Class65[] method810(@OriginalArg(1) Class65[] arg0) {
		@Pc(8) Class65[] local8 = new Class65[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static35.method647(new Class65[] { Static120.method1871(local10), Static40.aClass65_408 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static35.method647(new Class65[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
	public static void method817() {
		Static65.aBoolean56 = false;
		Static48.aBoolean47 = false;
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)V")
	public static void method823() {
		@Pc(3) Class43 local3 = Static96.aClass43_1;
		synchronized (Static96.aClass43_1) {
			Static68.anInt2857 = Static86.anInt1844;
			@Pc(11) int local11;
			if (Static46.anInt1105 < 0) {
				for (local11 = 0; local11 < 112; local11++) {
					Static35.aBooleanArray6[local11] = false;
				}
				Static46.anInt1105 = Static28.anInt694;
			} else {
				while (Static28.anInt694 != Static46.anInt1105) {
					local11 = Static50.anIntArray155[Static28.anInt694];
					Static28.anInt694 = Static28.anInt694 + 1 & 0x7F;
					if (local11 < 0) {
						Static35.aBooleanArray6[~local11] = false;
					} else {
						Static35.aBooleanArray6[local11] = true;
					}
				}
			}
			Static86.anInt1844 = Static134.anInt2942;
		}
	}
}
