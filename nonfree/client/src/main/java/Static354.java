import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public static int anInt4885;

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
	public static int anInt4900;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "D")
	public static double aDouble13 = -1.0D;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public static void method4051() {
		Static143.aClass72Array2 = null;
		Static123.method2465(-1, Static310.anInt6220, 0, 0, Static38.anInt832, 0, 0, Static202.anInt4258);
		if (Static143.aClass72Array2 != null) {
			Static269.method4690(Static217.anInt4544, Static143.aClass72Array2, Static352.aClass72_20.anInt1856, 0, Static38.anInt832, Static98.anInt6647, Static202.anInt4258, -1412584499, 0);
			Static143.aClass72Array2 = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method4052(@OriginalArg(0) Class2_Sub2_Sub1_Sub1 arg0) {
		@Pc(19) Class4_Sub37 local19 = (Class4_Sub37) Static124.aClass198_23.method5261((long) arg0.anInt6535);
		if (local19 == null) {
			return;
		}
		if (local19.aClass4_Sub13_Sub1_2 != null) {
			Static337.aClass4_Sub13_Sub2_2.method2499(local19.aClass4_Sub13_Sub1_2);
			local19.aClass4_Sub13_Sub1_2 = null;
		}
		local19.method5667();
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public static void method4058() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static71.aBooleanArray11[local7] = false;
		}
		Static303.anInt3065 = 1;
		Static76.anInt1672 = -1;
		Static11.anInt263 = 0;
		Static293.anInt5930 = 0;
		Static179.anInt3943 = -1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BIII)V")
	public static void method4065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static155.method2994(arg0, 9);
		local12.method2031();
		local12.anInt2405 = arg1;
		local12.anInt2410 = arg2;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Lclient!aj;")
	public static Class10 method4067(@OriginalArg(0) int arg0) {
		@Pc(5) Class154 local5 = Static46.aClass154_13;
		@Pc(14) Class10 local14;
		synchronized (Static46.aClass154_13) {
			local14 = (Class10) Static46.aClass154_13.method4222((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static298.aClass11_132.method288(arg0, 32);
		local14 = new Class10();
		if (local30 != null) {
			local14.method244(new Class4_Sub7(local30));
		}
		local14.method249();
		@Pc(55) Class154 local55 = Static46.aClass154_13;
		synchronized (Static46.aClass154_13) {
			Static46.aClass154_13.method4221((long) arg0, local14);
			return local14;
		}
	}
}
