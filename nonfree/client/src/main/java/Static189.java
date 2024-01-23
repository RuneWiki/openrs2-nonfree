import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
	public static int[] anIntArray408;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!ak;")
	public static Class7 aClass7_154;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "[S")
	public static short[] aShortArray83;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[Lclient!oa;")
	public static Class124[] aClass124Array3;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public static int anInt3540 = 20;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString120 = "Loading fonts - ";

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString121 = " is already on your friend list.";

	@OriginalMember(owner = "client!of", name = "j", descriptor = "J")
	public static long aLong119 = 0L;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public static boolean method2839(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		if (local8 < local11) {
			return false;
		}
		for (@Pc(29) int local29 = 0; local29 < local11; local29++) {
			@Pc(40) char local40 = arg0.charAt(local29);
			@Pc(44) char local44 = arg1.charAt(local29);
			if (local40 != local44 && Character.toLowerCase(local40) != Character.toLowerCase(local44) && Character.toUpperCase(local40) != Character.toUpperCase(local44)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method2840() {
		@Pc(11) int local11 = Static210.anInt4223;
		@Pc(13) int local13 = Static275.anInt5486;
		@Pc(15) int local15 = Static112.anInt2084;
		@Pc(19) int local19 = Static229.anInt4793 - 3;
		if (Static6.aClass1_Sub2_Sub2_1 == null || Static108.aClass1_Sub2_Sub2_5 == null) {
			if (Static58.aClass7_58.method242(Static61.anInt1269) && Static58.aClass7_58.method242(Static188.anInt3532)) {
				Static6.aClass1_Sub2_Sub2_1 = Static269.method4137(Static61.anInt1269, Static58.aClass7_58);
				Static108.aClass1_Sub2_Sub2_5 = Static269.method4137(Static188.anInt3532, Static58.aClass7_58);
				if (Static240.aBoolean369) {
					if (Static6.aClass1_Sub2_Sub2_1 instanceof Class1_Sub2_Sub2_Sub1_Sub1) {
						Static6.aClass1_Sub2_Sub2_1 = new Class1_Sub2_Sub2_Sub2_Sub1((Class1_Sub2_Sub2_Sub1) Static6.aClass1_Sub2_Sub2_1);
					} else {
						Static6.aClass1_Sub2_Sub2_1 = new Class1_Sub2_Sub2_Sub2((Class1_Sub2_Sub2_Sub1) Static6.aClass1_Sub2_Sub2_1);
					}
					if (Static108.aClass1_Sub2_Sub2_5 instanceof Class1_Sub2_Sub2_Sub1_Sub1) {
						Static108.aClass1_Sub2_Sub2_5 = new Class1_Sub2_Sub2_Sub2_Sub1((Class1_Sub2_Sub2_Sub1) Static108.aClass1_Sub2_Sub2_5);
					} else {
						Static108.aClass1_Sub2_Sub2_5 = new Class1_Sub2_Sub2_Sub2((Class1_Sub2_Sub2_Sub1) Static108.aClass1_Sub2_Sub2_5);
					}
				}
			} else if (Static240.aBoolean369) {
				Static50.method871(local13, local15, local11, 20, Static196.anInt3765, 256 - Static55.anInt1173);
			} else {
				Static213.method3374(local13, local15, local11, 20, Static196.anInt3765, 256 - Static55.anInt1173);
			}
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		if (Static6.aClass1_Sub2_Sub2_1 != null && Static108.aClass1_Sub2_Sub2_5 != null) {
			local128 = (local11 - Static108.aClass1_Sub2_Sub2_5.anInt5119 * 2) / Static6.aClass1_Sub2_Sub2_1.anInt5119;
			for (local130 = 0; local130 < local128; local130++) {
				Static6.aClass1_Sub2_Sub2_1.method3921(local130 * Static6.aClass1_Sub2_Sub2_1.anInt5119 + Static108.aClass1_Sub2_Sub2_5.anInt5119 + local13, local15);
			}
			Static108.aClass1_Sub2_Sub2_5.method3921(local13, local15);
			Static108.aClass1_Sub2_Sub2_5.method3919(local11 + local13 - Static108.aClass1_Sub2_Sub2_5.anInt5119, local15);
		}
		Static10.aClass1_Sub2_Sub12_1.method4394(Static167.aString104, local13 + 3, local15 + 14, Static54.anInt1144, -1);
		if (Static240.aBoolean369) {
			Static50.method871(local13, local15 + 20, local11, local19 - 20, Static196.anInt3765, 256 - Static55.anInt1173);
		} else {
			Static213.method3374(local13, local15 + 20, local11, local19 - 20, Static196.anInt3765, 256 - Static55.anInt1173);
		}
		local128 = Static224.anInt4700;
		local130 = Static293.anInt5833;
		@Pc(216) int local216;
		@Pc(234) int local234;
		for (local216 = 0; local216 < Static29.anInt626; local216++) {
			local234 = (Static29.anInt626 - local216 - 1) * 15 + local15 + 20 + 13;
			if (local13 < local128 && local128 < local13 + local11 && local130 > local234 - 13 && local234 + 3 > local130) {
				if (Static240.aBoolean369) {
					Static50.method871(local13, local234 - 12, local11, 15, Static134.anInt2545, 256 - Static13.anInt3332);
				} else {
					Static213.method3374(local13, local234 - 12, local11, 15, Static134.anInt2545, 256 - Static13.anInt3332);
				}
			}
		}
		if ((Static13.aClass1_Sub2_Sub2_7 == null || Static244.aClass1_Sub2_Sub2_11 == null || Static13.aClass1_Sub2_Sub2_8 == null) && Static58.aClass7_58.method242(Static196.anInt3777) && Static58.aClass7_58.method242(Static55.anInt1169) && Static58.aClass7_58.method242(Static202.anInt3984)) {
			Static13.aClass1_Sub2_Sub2_7 = Static269.method4137(Static196.anInt3777, Static58.aClass7_58);
			Static244.aClass1_Sub2_Sub2_11 = Static269.method4137(Static55.anInt1169, Static58.aClass7_58);
			Static13.aClass1_Sub2_Sub2_8 = Static269.method4137(Static202.anInt3984, Static58.aClass7_58);
			if (Static240.aBoolean369) {
				if (Static13.aClass1_Sub2_Sub2_7 instanceof Class1_Sub2_Sub2_Sub1_Sub1) {
					Static13.aClass1_Sub2_Sub2_7 = new Class1_Sub2_Sub2_Sub2_Sub1((Class1_Sub2_Sub2_Sub1) Static13.aClass1_Sub2_Sub2_7);
				} else {
					Static13.aClass1_Sub2_Sub2_7 = new Class1_Sub2_Sub2_Sub2((Class1_Sub2_Sub2_Sub1) Static13.aClass1_Sub2_Sub2_7);
				}
				if (Static244.aClass1_Sub2_Sub2_11 instanceof Class1_Sub2_Sub2_Sub1_Sub1) {
					Static244.aClass1_Sub2_Sub2_11 = new Class1_Sub2_Sub2_Sub2_Sub1((Class1_Sub2_Sub2_Sub1) Static244.aClass1_Sub2_Sub2_11);
				} else {
					Static244.aClass1_Sub2_Sub2_11 = new Class1_Sub2_Sub2_Sub2((Class1_Sub2_Sub2_Sub1) Static244.aClass1_Sub2_Sub2_11);
				}
				if (Static13.aClass1_Sub2_Sub2_8 instanceof Class1_Sub2_Sub2_Sub1_Sub1) {
					Static13.aClass1_Sub2_Sub2_8 = new Class1_Sub2_Sub2_Sub2_Sub1((Class1_Sub2_Sub2_Sub1) Static13.aClass1_Sub2_Sub2_8);
				} else {
					Static13.aClass1_Sub2_Sub2_8 = new Class1_Sub2_Sub2_Sub2((Class1_Sub2_Sub2_Sub1) Static13.aClass1_Sub2_Sub2_8);
				}
			}
		}
		@Pc(450) int local450;
		if (Static13.aClass1_Sub2_Sub2_7 != null && Static244.aClass1_Sub2_Sub2_11 != null && Static13.aClass1_Sub2_Sub2_8 != null) {
			local216 = (local11 - Static13.aClass1_Sub2_Sub2_8.anInt5119 * 2) / Static13.aClass1_Sub2_Sub2_7.anInt5119;
			for (local234 = 0; local234 < local216; local234++) {
				Static13.aClass1_Sub2_Sub2_7.method3921(local13 + Static13.aClass1_Sub2_Sub2_8.anInt5119 + local234 * Static13.aClass1_Sub2_Sub2_7.anInt5119, local15 + (local19 - Static13.aClass1_Sub2_Sub2_7.anInt5112));
			}
			local234 = (local19 - Static13.aClass1_Sub2_Sub2_8.anInt5112 - 20) / Static244.aClass1_Sub2_Sub2_11.anInt5112;
			for (local450 = 0; local450 < local234; local450++) {
				Static244.aClass1_Sub2_Sub2_11.method3921(local13, local15 + local450 * Static244.aClass1_Sub2_Sub2_11.anInt5112 + 20);
				Static244.aClass1_Sub2_Sub2_11.method3919(local13 + local11 - Static244.aClass1_Sub2_Sub2_11.anInt5119, local450 * Static244.aClass1_Sub2_Sub2_11.anInt5112 + local15 - -20);
			}
			Static13.aClass1_Sub2_Sub2_8.method3921(local13, local19 + local15 - Static13.aClass1_Sub2_Sub2_8.anInt5112);
			Static13.aClass1_Sub2_Sub2_8.method3919(local11 + local13 - Static13.aClass1_Sub2_Sub2_8.anInt5119, -Static13.aClass1_Sub2_Sub2_8.anInt5112 + local19 + local15);
		}
		for (local216 = 0; local216 < Static29.anInt626; local216++) {
			local234 = local15 + (-local216 + Static29.anInt626 + -1) * 15 + 20 + 13;
			local450 = Static54.anInt1144;
			if (local13 < local128 && local13 + local11 > local128 && local234 - 13 < local130 && local130 < local234 + 3) {
				local450 = Static5.anInt167;
			}
			Static10.aClass1_Sub2_Sub12_1.method4394(Static242.method3843(local216), local13 + 3, local234, local450, 0);
		}
		Static216.method3455(Static275.anInt5486, Static229.anInt4793, Static112.anInt2084, Static210.anInt4223);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB)I")
	public static int method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
