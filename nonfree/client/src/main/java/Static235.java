import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!p", name = "h", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array14;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!pl;")
	public static Class162 aClass162_4;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "I")
	public static int anInt4746 = -1;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt4750 = 0;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "I")
	public static int anInt4759 = 0;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_161 = new Class18(8, -1);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method4350() {
		Static99.anInt2276 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static242.aClass1_Sub7Array1[local14] = null;
			Static83.aByteArray39[local14] = 1;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lclient!ll;")
	public static Class57 method4352() {
		try {
			return (Class57) Class.forName("Class57_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ct;BLclient!ic;)V")
	public static void method4354(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Interface3 arg1) {
		Static128.aClass30_87 = arg0;
		Static185.anInterface3_4 = arg1;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method4355() {
		if (Static140.anInt3024 != 0) {
			Static24.anInt577 -= Static140.anInt3024 * 5;
			if (Static13.anInt332 <= Static24.anInt577) {
				Static24.anInt577 = Static13.anInt332 - 1;
			}
			Static140.anInt3024 = 0;
			if (Static24.anInt577 < 0) {
				Static24.anInt577 = 0;
			}
		}
		if (Static221.anInt4462 < 102) {
			Static221.anInt4462 += 6;
		}
		@Pc(50) int local50;
		for (@Pc(40) int local40 = 0; local40 < Static27.anInt619; local40++) {
			local50 = Static204.aClass159Array1[local40].method4339();
			@Pc(56) char local56 = Static204.aClass159Array1[local40].method4340();
			if (local50 == 84) {
				Static122.method1327();
			} else if (Static271.aClass60_2.method1863(82) && local50 == 66) {
				if (Static96.aClipboard1 != null) {
					@Pc(346) String local346 = "";
					for (@Pc(351) int local351 = Static282.aStringArray33.length - 1; local351 >= 0; local351--) {
						if (Static282.aStringArray33[local351] != null && Static282.aStringArray33[local351].length() > 0) {
							local346 = local346 + Static282.aStringArray33[local351] + '\n';
						}
					}
					Static96.aClipboard1.setContents(new StringSelection(local346), null);
				}
			} else if (Static271.aClass60_2.method1863(82) && local50 == 67) {
				if (Static96.aClipboard1 != null) {
					@Pc(85) Transferable local85 = Static96.aClipboard1.getContents(null);
					if (local85 != null) {
						try {
							@Pc(92) String local92 = (String) local85.getTransferData(DataFlavor.stringFlavor);
							if (local92 != null) {
								@Pc(101) String[] local101 = Static143.method2850('\n', local92);
								if (local101.length > 1) {
									for (@Pc(109) int local109 = 0; local109 < local101.length; local109++) {
										Static268.aString50 = local101[local109];
										Static122.method1327();
									}
								} else {
									Static268.aString50 = Static268.aString50 + local92;
								}
							}
						} catch (@Pc(135) Exception local135) {
						}
					}
				}
			} else if (local50 == 85 && Static188.anInt3801 > 0) {
				Static268.aString50 = Static268.aString50.substring(0, Static188.anInt3801 - 1) + Static268.aString50.substring(Static188.anInt3801);
				Static188.anInt3801--;
			} else if (local50 == 101 && Static188.anInt3801 < Static268.aString50.length()) {
				Static268.aString50 = Static268.aString50.substring(0, Static188.anInt3801) + Static268.aString50.substring(Static188.anInt3801 + 1);
			} else if (local50 == 96 && Static188.anInt3801 > 0) {
				Static188.anInt3801--;
			} else if (local50 == 97 && Static188.anInt3801 < Static268.aString50.length()) {
				Static188.anInt3801++;
			} else if (local50 == 102) {
				Static188.anInt3801 = 0;
			} else if (local50 == 103) {
				Static188.anInt3801 = Static268.aString50.length();
			} else if (local50 == 104 && Static282.aStringArray33.length > Static260.anInt5193) {
				Static260.anInt5193++;
				Static48.method2780();
				Static188.anInt3801 = Static268.aString50.length();
			} else if (local50 == 105 && Static260.anInt5193 > 0) {
				Static260.anInt5193--;
				Static48.method2780();
				Static188.anInt3801 = Static268.aString50.length();
			} else if (Static330.method5560(local56) || local56 == ':' || local56 == ',' || local56 == ' ' || local56 == '_' || local56 == '-' || local56 == '+' || local56 == '[' || local56 == ']') {
				Static268.aString50 = Static268.aString50.substring(0, Static188.anInt3801) + Static204.aClass159Array1[local40].method4340() + Static268.aString50.substring(Static188.anInt3801);
				Static188.anInt3801++;
			}
		}
		Static27.anInt619 = 0;
		for (local50 = 0; local50 < 100; local50++) {
			@Pc(407) int local407;
			if (Static162.aBooleanArray17[local50]) {
				local407 = Static247.anIntArray387[local50]++;
				if (Static247.anIntArray387[local50] > 102) {
					Static162.aBooleanArray17[local50] = false;
				}
			} else {
				local407 = Static247.anIntArray387[local50]--;
				if (Static247.anIntArray387[local50] < 0) {
					Static12.anIntArray25[local50] = (int) (Math.random() * (double) Static213.anInt4274);
					Static16.anIntArray34[local50] = (int) (Math.random() * 350.0D);
					Static247.anIntArray387[local50] = 0;
					Static162.aBooleanArray17[local50] = true;
				}
			}
		}
		Static113.method2415();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	public static void method4357(@OriginalArg(0) int arg0) {
		if (!Static272.method4850(arg0)) {
			return;
		}
		@Pc(19) Class112[] local19 = Static341.aClass112ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class112 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt3409 = 0;
				local27.anInt3441 = 1;
				local27.anInt3407 = 0;
			}
		}
	}
}
