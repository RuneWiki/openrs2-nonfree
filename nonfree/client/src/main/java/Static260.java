import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Lclient!bm;")
	public static Class28 aClass28_10;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "Lclient!er;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray38;

	@OriginalMember(owner = "client!ni", name = "J", descriptor = "Lclient!nk;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
	public static final int anInt4866 = 1405;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZIB)V")
	public static void method3912(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static33.aClass49_1 = Static455.method4474(arg1, Static43.aClass59_5, Static427.anInterface4_8, Static339.aCanvas7, Static12.aClass79_Sub1_1.anInt4930 * 2);
		} else {
			if (arg0) {
				Static33.aClass49_1 = Static455.method4474(0, Static43.aClass59_5, Static427.anInterface4_8, Static339.aCanvas7, 0);
				Static33.aClass49_1.p(0);
				@Pc(27) Class58 local27 = Static334.method4661(Static410.aClass160_77, Static192.anInt3704);
				@Pc(36) Class116 local36 = Static33.aClass49_1.method4479(local27, Static459.method2071(Static153.aClass160_25, Static192.anInt3704));
				Static452.method5851(local36, true, Static99.aClass209_54.method4562(Static388.anInt6533));
				Static33.aClass49_1.method4412();
				Static137.method2320();
				Static33.aClass49_1.method4437();
			}
			try {
				Static33.aClass49_1 = Static455.method4474(arg1, Static43.aClass59_5, Static427.anInterface4_8, Static339.aCanvas7, Static12.aClass79_Sub1_1.anInt4930 * 2);
				if (Static33.aClass49_1.method4447()) {
					@Pc(69) Class2_Sub17 local69 = Static33.aClass49_1.method4440();
					Static33.aClass49_1.method4453(local69);
				}
			} catch (@Pc(74) Throwable local74) {
				arg1 = 0;
				Static33.aClass49_1 = Static455.method4474(0, Static43.aClass59_5, Static427.anInterface4_8, Static339.aCanvas7, 0);
			}
		}
		Static399.anInt6653 = arg1;
		Static289.method4174();
		if (!Static33.aClass49_1.method4459()) {
			Static64.anInt1455 = 1;
		}
		Static33.aClass49_1.method4424(Static64.anInt1455);
		Static33.aClass49_1.method4407(0);
		Static33.aClass49_1.MA(8);
		Static17.aClass35_4 = Static33.aClass49_1.method4467();
		Static66.aClass35_3 = Static33.aClass49_1.method4467();
		Static70.method1328();
		Static33.aClass49_1.method4476(!Static12.aClass79_Sub1_1.aBoolean361);
		if (Static33.aClass49_1.method4450()) {
			Static320.method4495(Static12.aClass79_Sub1_1.aBoolean364);
		}
		Static280.method4100(Static229.anInt4427 >> 3, Static33.aClass49_1, Static379.anInt6422 >> 3);
		Static277.method4067();
		Static120.aBoolean204 = false;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I")
	public static int method3916(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
	public static boolean method3919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(18) Class134 local18 = Static118.aClass165_2.method3799(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local18.method2977(arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ICI)I")
	public static int method3924(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
	public static void method3925() {
		Static159.method2586(Static111.aClass54_39);
		Static424.aClass2_Sub23_Sub2_1.method5502(Static25.anInt589);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	public static void method3927() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static243.aBooleanArray19[local8] = true;
		}
	}
}
