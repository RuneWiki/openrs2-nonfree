import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
	private static int anInt437;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[Lclient!fd;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array2 = new Class2_Sub1_Sub4_Sub1[4];

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!kc;")
	public static Class36 aClass36_216 = Static14.method2017(" )2> @yel@");

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "Lclient!kc;")
	private static Class36 aClass36_220 = Static14.method2017("Unexpected server response");

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_217 = aClass36_220;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public static final int anInt408 = 50;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[I")
	public static int[] anIntArray28 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_2 = new Class1();

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Lclient!kc;")
	public static Class36 aClass36_218 = Static14.method2017("scape main");

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "Lclient!kc;")
	public static Class36 aClass36_219 = Static14.method2017("Empf-=nger:");

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
	public static int anInt426 = 0;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "Lclient!kc;")
	public static Class36 aClass36_221 = Static14.method2017("blinken3:");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method316() {
		Static94.aClass14_29.method1472();
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method326() {
		Static113.aClass14_39.method1472();
		Static17.aClass2_Sub1_Sub1_Sub1_6.method97(0, 0);
		Static113.anIntArray350 = Static87.method1600(Static113.anIntArray350);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	public static boolean method328(@OriginalArg(1) int arg0) {
		if (Static100.aBooleanArray14[arg0]) {
			return true;
		} else if (Static91.aClass3_22.method930(arg0)) {
			@Pc(23) int local23 = Static91.aClass3_22.method946(arg0);
			if (local23 == 0) {
				Static100.aBooleanArray14[arg0] = true;
				return true;
			}
			if (Static42.aClass2_Sub1_Sub6ArrayArray1[arg0] == null) {
				Static42.aClass2_Sub1_Sub6ArrayArray1[arg0] = new Class2_Sub1_Sub6[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static91.aClass3_22.method928(local42, arg0);
					if (local56 != null) {
						Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local42] = new Class2_Sub1_Sub6();
						Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local42].anInt680 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local42].method542(new Class2_Sub12(local56));
						} else {
							Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local42].method550(new Class2_Sub12(local56));
						}
					}
				}
			}
			Static100.aBooleanArray14[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
	public static void method331() {
		Static35.aBoolean51 = false;
		Static93.aBoolean108 = false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!qc;II)V")
	public static void method332(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3 || Static43.anInt1141 >= 400) {
			return;
		}
		@Pc(63) Class36 local63;
		if (arg1.anInt2209 == 0) {
			local63 = Static49.method949(new Class36[] { arg1.aClass36_1027, Static15.method274(arg1.anInt2222, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2222), Static115.aClass36_880, Static6.aClass36_90, Static57.method1055(arg1.anInt2222), Static13.aClass36_174 });
		} else {
			local63 = Static49.method949(new Class36[] { arg1.aClass36_1027, Static115.aClass36_880, Static39.aClass36_498, Static57.method1055(arg1.anInt2209), Static13.aClass36_174 });
		}
		@Pc(103) int local103;
		if (Static20.anInt500 == 1) {
			Static34.method717(13, arg3, arg0, Static49.method949(new Class36[] { Static78.aClass36_958, Static118.aClass36_1461, local63 }), arg2, Static27.aClass36_397);
		} else if (!Static56.aBoolean70) {
			for (local103 = 4; local103 >= 0; local103--) {
				if (Static45.aClass36Array22[local103] != null) {
					@Pc(115) int local115 = 0;
					@Pc(117) short local117 = 0;
					if (Static45.aClass36Array22[local103].method1024(Static3.aClass36_645)) {
						if (arg1.anInt2222 > Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2222) {
							local117 = 2000;
						}
						if (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2208 != 0 && arg1.anInt2208 != 0) {
							if (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2208 == arg1.anInt2208) {
								local117 = 2000;
							} else {
								local117 = 0;
							}
						}
					} else if (Static66.aBooleanArray11[local103]) {
						local117 = 2000;
					}
					if (local103 == 0) {
						local115 = local117 + 32;
					}
					if (local103 == 1) {
						local115 = local117 + 7;
					}
					if (local103 == 2) {
						local115 = local117 + 17;
					}
					if (local103 == 3) {
						local115 = local117 + 36;
					}
					if (local103 == 4) {
						local115 = local117 + 42;
					}
					Static34.method717(local115, arg3, arg0, Static49.method949(new Class36[] { Static36.aClass36_489, local63 }), arg2, Static45.aClass36Array22[local103]);
				}
			}
		} else if ((Static88.anInt2320 & 0x8) == 8) {
			Static34.method717(41, arg3, arg0, Static49.method949(new Class36[] { Static73.aClass36_890, Static118.aClass36_1461, local63 }), arg2, Static55.aClass36_1328);
		}
		for (local103 = 0; local103 < Static43.anInt1141; local103++) {
			if (Static55.anIntArray329[local103] == 18) {
				Static90.aClass36Array40[local103] = Static49.method949(new Class36[] { Static23.aClass36_321, Static89.aClass36_1084, Static36.aClass36_489, local63 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method334() {
		anIntArray28 = null;
		aClass36_219 = null;
		aClass1_2 = null;
		aClass2_Sub1_Sub4_Sub1Array2 = null;
		aClass36_218 = null;
		aClass36_220 = null;
		aByteArrayArray9 = null;
		aClass36_216 = null;
		aClass36_221 = null;
		aClass36_217 = null;
	}
}
