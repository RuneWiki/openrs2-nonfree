import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
	public static int anInt5861;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
	public static int anInt5863;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
	public static int anInt5850 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!sl;)V")
	public static void method5080(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (Static67.aClass204_1 == null) {
			return;
		}
		try {
			Static67.aClass204_1.method4773(0L);
			Static67.aClass204_1.method4771(arg0, arg1.aByteArray26, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)Z")
	public static boolean method5082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static476.method6756(arg1, arg0) | (arg1 & 0x40000) != 0 || Static591.method8346(arg1, arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!nd;)V")
	public static void method5083(@OriginalArg(1) Class238 arg0) {
		Static513.aClass238_243 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(Z)I")
	public static int method5085() {
		if (Static113.aBoolean192) {
			return 6;
		} else if (Static10.aClass2_Sub7_Sub21_1 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static10.aClass2_Sub7_Sub21_1.anInt10014;
			if (Static281.method4503(local14)) {
				return 1;
			} else if (Static572.method7950(local14)) {
				return 2;
			} else if (Static342.method5178(local14)) {
				return 3;
			} else if (Static303.method4765(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
	public static void method5086() {
		Static191.aClass2_Sub11_Sub1_2.method1525();
		Static510.aClass238_229 = null;
		Static275.anInt5095 = 1;
		Static79.aClass2_Sub11_Sub1_1 = null;
	}
}
