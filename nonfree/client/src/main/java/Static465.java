import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public static int anInt8381;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!lr;")
	public static Class104 aClass104_2;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!rk;")
	public static Class249 aClass249_64 = new Class249();

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_26 = new Class91(6, 3);

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_235 = new Class202("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public static int anInt8383 = 0;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
	public static int anInt8385 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
	public static void method7009() {
		Static117.aClass286_4.method7233();
		Static16.aClass16_3.method573();
		Static289.aClass125_1.method3171();
		Static505.aClass206_4.method5333();
		Static21.aClass255_2.method6582();
		Static464.aClass115_1.method2976();
		Static396.aClass157_2.method3749();
		Static305.aClass14_1.method556();
		Static79.aClass80_1.method2316();
		Static266.aClass230_1.method6003();
		Static492.aClass218_1.method5794();
		Static387.aClass56_4.method1686();
		Static537.aClass112_4.method2961();
		Static66.aClass247_1.method6473();
		Static221.aClass225_1.method5909();
		Static222.aClass299_2.method7464();
		Static171.aClass131_1.method3291();
		Static129.aClass100_1.method2659();
		Static70.aClass61_1.method1763();
		Static172.aClass211_2.method5364();
		Static276.method4358();
		Static458.method6977();
		Static129.method2391();
		Static290.method4605();
		Static30.aClass231_8.method6231(5);
		Static202.aClass231_37.method6231(5);
		Static253.aClass231_43.method6231(5);
		Static392.aClass231_57.method6231(5);
		Static258.aClass231_44.method6231(5);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)I")
	public static int method7010(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
	public static void method7011() {
		if (!Static21.aBoolean31) {
			return;
		}
		@Pc(19) Class310 local19 = Static519.method7538(Static116.anInt2332, Static55.anInt970);
		if (local19 != null && local19.anObjectArray8 != null) {
			@Pc(28) Class2_Sub28 local28 = new Class2_Sub28();
			local28.aClass310_8 = local19;
			local28.anObjectArray2 = local19.anObjectArray8;
			Static258.method4037(local28);
		}
		Static357.anInt6796 = -1;
		Static94.anInt1853 = -1;
		Static21.aBoolean31 = false;
		if (local19 != null) {
			Static273.method4342(local19);
		}
	}
}
