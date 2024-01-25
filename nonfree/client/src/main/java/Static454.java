import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	public static int anInt7274 = 0;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "[I")
	public static final int[] anIntArray643 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "[I")
	public static final int[] anIntArray644 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method5698(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static220.anInt3626 = arg1;
		Static263.anInt3675 = 2;
		Static26.method370(arg0, arg2);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method5700(@OriginalArg(0) Class163 arg0) {
		if (Static297.aClass156_38.method3164() == 0) {
			return;
		}
		@Pc(28) Class2_Sub45 local28;
		if (Static288.anInt4743 == 0) {
			for (local28 = (Class2_Sub45) Static297.aClass156_38.method3155(); local28 != null; local28 = (Class2_Sub45) Static297.aClass156_38.method3150()) {
				Static384.aClass164_2.method3455(arg0, local28.anInt7249, false, local28.anInt7243, arg0, local28.anInt7246, false, local28.anInt7244, local28.anInt7245, Static46.aClass92_2, local28.aBoolean524 ? Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1 : null);
				local28.method5703();
			}
			Static204.method2721();
			return;
		}
		if (Static416.aClass163_10 == null) {
			@Pc(75) Canvas local75 = new Canvas();
			local75.setSize(36, 32);
			Static416.aClass163_10 = Static460.method5567(0, 0, local75, Static65.anInterface9_6, Static79.aClass183_2);
			Static211.aClass92_4 = Static416.aClass163_10.method5537(Static69.method1057(Static129.anInt2330, Static77.aClass54_26), Static461.method256(Static103.aClass54_28, Static129.anInt2330));
		}
		for (local28 = (Class2_Sub45) Static297.aClass156_38.method3155(); local28 != null; local28 = (Class2_Sub45) Static297.aClass156_38.method3150()) {
			Static384.aClass164_2.method3455(arg0, local28.anInt7249, false, local28.anInt7243, Static416.aClass163_10, local28.anInt7246, false, local28.anInt7244, local28.anInt7245, Static211.aClass92_4, local28.aBoolean524 ? Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1 : null);
			local28.method5703();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!dc;)I")
	public static int method5701(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		if (arg0.anInt4948 == 0) {
			return 0;
		}
		@Pc(62) int local62;
		@Pc(55) int local55;
		if (arg0.anInt4936 != -1) {
			@Pc(18) Class3_Sub4_Sub1 local18 = null;
			if (arg0.anInt4936 < 32768) {
				@Pc(42) Class2_Sub28 local42 = (Class2_Sub28) Static49.aClass72_11.method1659((long) arg0.anInt4936);
				if (local42 != null) {
					local18 = local42.aClass3_Sub4_Sub1_Sub1_1;
				}
			} else if (arg0.anInt4936 >= 32768) {
				local18 = Static152.aClass3_Sub4_Sub1_Sub2Array1[arg0.anInt4936 - 32768];
			}
			if (local18 != null) {
				local55 = arg0.anInt6833 - local18.anInt6833;
				local62 = arg0.anInt6835 - local18.anInt6835;
				if (local55 != 0 || local62 != 0) {
					arg0.method4003((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class3_Sub4_Sub1_Sub2) {
			@Pc(167) Class3_Sub4_Sub1_Sub2 local167 = (Class3_Sub4_Sub1_Sub2) arg0;
			if (local167.anInt4980 != -1 && (local167.anInt4977 == 0 || local167.anInt4978 > 0)) {
				local167.method4003(local167.anInt4980);
				local167.anInt4980 = -1;
			}
		} else if (arg0 instanceof Class3_Sub4_Sub1_Sub1) {
			@Pc(96) Class3_Sub4_Sub1_Sub1 local96 = (Class3_Sub4_Sub1_Sub1) arg0;
			if (local96.anInt3304 != -1 && (local96.anInt4977 == 0 || local96.anInt4978 > 0)) {
				local55 = local96.anInt6833 - (local96.anInt3304 - Static275.anInt4506 - Static275.anInt4506) * 64;
				local62 = local96.anInt6835 - (local96.anInt3308 - Static209.anInt3497 - Static209.anInt3497) * 64;
				if (local55 != 0 || local62 != 0) {
					local96.method4003((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
				local96.anInt3304 = -1;
			}
		}
		return arg0.method4005();
	}
}
