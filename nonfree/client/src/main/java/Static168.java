import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt3400;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZIILclient!r;)V", line = 15)
	public static void method3368(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class197 arg3) {
		Static358.aBoolean485 = false;
		Static109.aClass197_26 = arg3;
		Static98.anInt2180 = arg0;
		Static318.anInt6364 = 0;
		Static331.anInt6628 = arg2;
		Class123.anInt3361 = 1;
		Static27.anInt672 = Static85.aClass2_Sub12_Sub3_1.method4304() / arg1;
		if (Static27.anInt672 < 1) {
			Static27.anInt672 = 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!bt;)V", line = 40)
	public static void method3369(@OriginalArg(1) Class2_Sub4 arg0) {
		if (arg0.aByteArray73.length - arg0.anInt5289 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4816();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray73.length - arg0.anInt5289 < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method4830();
		if (arg0.aByteArray73.length - arg0.anInt5289 != local43 * 6) {
			return;
		}
		while (true) {
			@Pc(59) int local59;
			@Pc(63) int local63;
			do {
				do {
					do {
						if (arg0.anInt5289 >= arg0.aByteArray73.length) {
							return;
						}
						local59 = arg0.method4830();
						local63 = arg0.method4837();
					} while (Static71.anIntArray117.length <= local59);
				} while (!Static83.aBooleanArray18[local59]);
			} while (Static152.aClass45_1.method1625(local59).aChar2 == '1' && (local63 < -1 || local63 > 1));
			Static71.anIntArray117[local59] = local63;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!r;Lclient!od;I)Z", line = 79)
	public static boolean method3370(@OriginalArg(0) Class197 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class2_Sub12_Sub3 arg3) {
		Static85.aClass2_Sub12_Sub3_1 = arg3;
		Static116.aClass197_30 = arg2;
		Static165.aClass197_48 = arg0;
		Static104.aClass197_25 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 99)
	public static void method3371() {
		Class2_Sub2_Sub8.aClass98_17.method2617(5);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)[Lclient!vr;", line = 111)
	public static Class242[] method3372() {
		return new Class242[] { Class2_Sub2_Sub3.aClass242_1, Class2_Sub2_Sub3.aClass242_2, Class2_Sub2_Sub3.aClass242_3, Class2_Sub2_Sub3.aClass242_4, Class2_Sub2_Sub3.aClass242_5, Class2_Sub2_Sub3.aClass242_6, Class2_Sub2_Sub3.aClass242_7, Class2_Sub2_Sub3.aClass242_8, Class2_Sub2_Sub3.aClass242_9, Class2_Sub2_Sub3.aClass242_10 };
	}
}
