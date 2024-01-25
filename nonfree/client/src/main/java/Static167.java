import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_51 = new Class198("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public static void method2333() {
		for (@Pc(15) Class5_Sub41 local15 = (Class5_Sub41) Static122.aClass177_13.method3618(); local15 != null; local15 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			if (Static425.method5640(local15.anInt6815)) {
				Static411.method5423(local15);
			}
		}
		if (Static18.anInt395 == 1) {
			Static284.method3503();
			return;
		}
		Static258.method3330(Static335.anInt5447, Static285.anInt4431, Static381.anInt3882, Static78.anInt4643);
		@Pc(51) int local51 = Static21.aClass14_1.method286(Static226.aClass198_62.method4012(Static38.anInt4834));
		for (@Pc(56) Class5_Sub41 local56 = (Class5_Sub41) Static122.aClass177_13.method3618(); local56 != null; local56 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			@Pc(62) int local62 = Static120.method1713(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static78.anInt4643 = local51 + 8;
		Static335.anInt5447 = Static18.anInt395 * 16 + (Static286.aBoolean295 ? 26 : 22);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z")
	public static boolean method2334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static303.method3770(arg0, arg1) || Static452.method5943(arg1, arg0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIZI)V")
	public static void method2336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static317.aFrame2 != null && (arg4 != 3 || arg1 != Static216.aClass1_Sub1_1.anInt4506 || arg0 != Static216.aClass1_Sub1_1.anInt4508)) {
			Static218.method3704(Static7.aClass93_1, Static317.aFrame2);
			Static317.aFrame2 = null;
		}
		if (arg4 == 3 && Static317.aFrame2 == null) {
			Static317.aFrame2 = Static46.method1526(Static7.aClass93_1, 0, arg1, arg0);
			if (Static317.aFrame2 != null) {
				Static216.aClass1_Sub1_1.anInt4506 = arg1;
				Static216.aClass1_Sub1_1.anInt4508 = arg0;
				Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
			}
		}
		if (arg4 == 3 && Static317.aFrame2 == null) {
			method2336(-1, -1, arg2, true, Static216.aClass1_Sub1_1.anInt4516);
			return;
		}
		@Pc(79) Container local79;
		@Pc(86) Insets local86;
		if (Static317.aFrame2 != null) {
			Static273.anInt4301 = arg0;
			Static236.anInt3873 = arg1;
			local79 = Static317.aFrame2;
		} else if (Static34.aFrame1 == null) {
			local79 = Static7.aClass93_1.anApplet1;
			Static236.anInt3873 = local79.getSize().width;
			Static273.anInt4301 = local79.getSize().height;
		} else {
			local86 = Static34.aFrame1.getInsets();
			@Pc(92) int local92 = -local86.left;
			Static236.anInt3873 = Static34.aFrame1.getSize().width + local92 - local86.right;
			@Pc(104) int local104 = -local86.top;
			Static273.anInt4301 = Static34.aFrame1.getSize().height + local104 - local86.bottom;
			local79 = Static34.aFrame1;
		}
		@Pc(169) int local169;
		if (arg4 == 1) {
			Static178.anInt5792 = Static36.anInt724;
			Static433.anInt7213 = (Static236.anInt3873 - Static36.anInt724) / 2;
			Static102.anInt1723 = Static243.anInt3934;
			Static59.anInt1109 = 0;
		} else if (Static102.anInt1724 < 96 && Static146.anInt2644 == 0) {
			local169 = Static236.anInt3873 > 1024 ? 1024 : Static236.anInt3873;
			@Pc(178) int local178 = Static273.anInt4301 > 768 ? 768 : Static273.anInt4301;
			Static178.anInt5792 = local169;
			Static433.anInt7213 = (Static236.anInt3873 - local169) / 2;
			Static59.anInt1109 = 0;
			Static102.anInt1723 = local178;
		} else {
			Static433.anInt7213 = 0;
			Static178.anInt5792 = Static236.anInt3873;
			Static102.anInt1723 = Static273.anInt4301;
			Static59.anInt1109 = 0;
		}
		if (Static289.aClass170_8 != Static350.aClass170_10) {
			@Pc(203) boolean local203;
			if (Static178.anInt5792 < 1024 && Static102.anInt1723 < 768) {
				local203 = true;
			} else {
				local203 = false;
			}
		}
		if (arg3) {
			Static64.method998();
		} else {
			Static246.aCanvas2.setSize(Static178.anInt5792, Static102.anInt1723);
			Static407.aClass200_9.method5831(Static246.aCanvas2);
			if (Static34.aFrame1 == local79) {
				local86 = Static34.aFrame1.getInsets();
				Static246.aCanvas2.setLocation(Static433.anInt7213 + local86.left, Static59.anInt1109 + local86.top);
			} else {
				Static246.aCanvas2.setLocation(Static433.anInt7213, Static59.anInt1109);
			}
		}
		if (arg4 < 2) {
			Static242.aBoolean251 = false;
		} else {
			Static242.aBoolean251 = true;
		}
		if (Static199.anInt3319 != -1) {
			Static330.method4011(true);
		}
		if (Static14.aClass99_2 != null && Static99.method1399(Static376.anInt6324)) {
			Static458.method6018();
		}
		for (local169 = 0; local169 < 100; local169++) {
			Static99.aBooleanArray5[local169] = true;
		}
		Static448.aBoolean495 = true;
	}
}
