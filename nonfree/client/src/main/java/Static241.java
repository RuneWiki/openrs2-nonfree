import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static int anInt5028;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Lclient!am;")
	public static Class11 aClass11_103;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public static int anInt5032;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public static int anInt5033;

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "Lclient!ib;")
	public static Class23 aClass23_3;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!c;BII)V")
	public static void method4164(@OriginalArg(0) Class2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt6517 == arg1 && arg1 != -1) {
			@Pc(94) Class116 local94 = Static340.method5560(arg1);
			@Pc(97) int local97 = local94.anInt3739;
			if (local97 == 1) {
				arg0.anInt6487 = 0;
				arg0.anInt6493 = 0;
				arg0.anInt6490 = arg2;
				arg0.anInt6534 = 1;
				arg0.anInt6505 = 0;
				Static291.method4975(arg0 == Static110.aClass2_Sub2_Sub1_Sub1_1, local94, arg0.anInt6487, arg0.anInt6465, arg0.anInt6466);
			}
			if (local97 == 2) {
				arg0.anInt6505 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt6517 == -1 || Static340.method5560(arg1).anInt3749 >= Static340.method5560(arg0.anInt6517).anInt3749) {
			arg0.anInt6551 = arg0.anInt6547;
			arg0.anInt6493 = 0;
			arg0.anInt6534 = 1;
			arg0.anInt6517 = arg1;
			arg0.anInt6490 = arg2;
			arg0.anInt6505 = 0;
			arg0.anInt6487 = 0;
			if (arg0.anInt6517 == -1) {
				return;
			}
			Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0, Static340.method5560(arg0.anInt6517), arg0.anInt6487, arg0.anInt6465, arg0.anInt6466);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method4168(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = Static342.anInt6706 - Static207.anInt4345;
		if (local13 >= 100) {
			Static303.anInt3065 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static174.aFloat39;
		if (Static65.anInt1359 >> 8 > local22) {
			local22 = Static65.anInt1359 >> 8;
		}
		if (Static71.aBooleanArray11[4] && local22 < Static59.anIntArray142[4] + 128) {
			local22 = Static59.anIntArray142[4] + 128;
		}
		@Pc(59) int local59 = Static146.anInt3285 + (int) Static138.aFloat35 & 0x3FFF;
		Static298.method5064(local22, (local22 >> 3) * 3 + 600, local59, Static5.anInt133, Static119.method2125(Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466, Static279.anInt5645) - 50, arg0, Static294.anInt3998);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local13) * (-local13 + 100) * (100 - local13)) / 1000000.0F;
		Static230.anInt4796 = (int) (local103 * (float) (Static230.anInt4796 - Static249.anInt5201) + (float) Static249.anInt5201);
		Static133.anInt3056 = (int) ((float) Static336.anInt6660 + local103 * (float) (Static133.anInt3056 - Static336.anInt6660));
		Static288.anInt5845 = (int) ((float) Static63.anInt1302 + local103 * (float) (Static288.anInt5845 - Static63.anInt1302));
		Static105.anInt6098 = (int) ((float) Static184.anInt4058 + local103 * (float) (Static105.anInt6098 - Static184.anInt4058));
		@Pc(154) int local154 = Static332.anInt6592 - Static9.anInt6462;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static332.anInt6592 = (int) ((float) Static9.anInt6462 + (float) local154 * local103);
		Static332.anInt6592 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public static void method4169() {
		if (Static137.anInt3096 <= 0) {
			Static260.aString193 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static154.aStringArray27.length; local15++) {
			if (Static154.aStringArray27[local15].startsWith("--> ")) {
				local13++;
				if (local13 == Static137.anInt3096) {
					Static260.aString193 = Static154.aStringArray27[local15].substring(4);
					break;
				}
			}
		}
	}
}
