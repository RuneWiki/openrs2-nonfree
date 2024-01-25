import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!r;")
	public static Class12 aClass12_8;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJ)V")
	public static void method2285(@OriginalArg(1) long arg0) {
		if (Static118.aClass293ArrayArrayArray14 != null) {
			if (Static585.anInt9461 == 1 || Static585.anInt9461 == 5) {
				Static341.method5076(arg0);
			} else if (Static585.anInt9461 == 4) {
				Static493.method6901(arg0);
			}
		}
		Static478.method6712(aClass12_8, (long) Static81.anInt1910);
		if (Static219.anInt4263 != -1) {
			Static81.method1661(Static219.anInt4263);
		}
		for (@Pc(49) int local49 = 0; local49 < Static288.anInt5333; local49++) {
			if (Static510.aBooleanArray29[local49]) {
				Static551.aBooleanArray28[local49] = true;
			}
			Static210.aBooleanArray10[local49] = Static510.aBooleanArray29[local49];
			Static510.aBooleanArray29[local49] = false;
		}
		Static466.anInt2594 = Static81.anInt1910;
		if (Static219.anInt4263 != -1) {
			Static288.anInt5333 = 0;
			Static460.method6538();
		}
		aClass12_8.JA();
		Static432.method6070(aClass12_8);
		@Pc(95) int local95 = Static430.method6015();
		if (local95 == -1) {
			local95 = Static325.anInt9473;
		}
		if (local95 == -1) {
			local95 = Static316.anInt5680;
		}
		Static441.method6334(local95);
		Static430.method6016(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796, Static236.anInt4451, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795);
		Static236.anInt4451 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
	public static void method2286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static158.method2429(local7.aClass20_Sub2_Sub1_1);
		Static158.method2429(local7.aClass20_Sub2_Sub1_2);
		if (local7.aClass20_Sub2_Sub1_1 != null) {
			local7.aClass20_Sub2_Sub1_1 = null;
		}
		if (local7.aClass20_Sub2_Sub1_2 != null) {
			local7.aClass20_Sub2_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!fa;)Lclient!r;")
	public static Class12 method2288(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface5 arg2) {
		return new Class12_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
	public static void method2289() {
		Static414.method5808(Static479.aClass1_Sub7_Sub1_1.aBoolean233);
		Static303.aClass1_Sub8_Sub3_43 = new Class1_Sub8_Sub3();
		Static303.aClass1_Sub8_Sub3_43.method4661();
		Static583.aClass141_2 = Static354.method5189(0, Static26.aCanvas3, Static246.aClass114_10, 22050);
		Static583.aClass141_2.method5527(Static303.aClass1_Sub8_Sub3_43);
		Static492.method6899(Static303.aClass1_Sub8_Sub3_43, Static144.aClass111_33, Static546.aClass111_117, Static239.aClass111_50);
		Static378.aClass141_1 = Static354.method5189(1, Static26.aCanvas3, Static246.aClass114_10, 2048);
		Static298.aClass1_Sub8_Sub4_2 = new Class1_Sub8_Sub4();
		Static378.aClass141_1.method5527(Static298.aClass1_Sub8_Sub4_2);
		Static154.aClass229_1 = new Class229(22050, Static426.anInt7216);
		Static492.anInt8283 = Static153.aClass111_34.method2462("scape main");
	}
}
