import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
	public static int anInt3070 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method2773() {
		return Static49.aBoolean36 || Static577.aClass4_Sub39_3 == null ? "" : Static577.aClass4_Sub39_3.aString81;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2775(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static440.aClass44_12 = Static441.method4987(0, Static237.anInterface11_8, Static475.aCanvas12, Static214.aClass4_Sub19_Sub1_1.anInt3061 * 2, Static224.aClass176_61);
			if (arg1 != null) {
				Static440.aClass44_12.ja(0);
				@Pc(162) Class114 local162 = Static288.method8172(Static500.aClass176_119, Static273.anInt7288);
				@Pc(171) Class58 local171 = Static440.aClass44_12.method4983(local162, Static598.method6315(Static281.aClass176_74, Static273.anInt7288));
				Static479.method7194();
				Static85.method1575(Static440.aClass44_12, local171, true, local162, arg1);
			}
		} else {
			@Pc(8) Class44 local8 = null;
			@Pc(27) Class114 local27;
			@Pc(36) Class58 local36;
			if (arg1 != null) {
				local8 = Static441.method4987(0, Static237.anInterface11_8, Static475.aCanvas12, 0, Static224.aClass176_61);
				local8.ja(0);
				local27 = Static288.method8172(Static500.aClass176_119, Static273.anInt7288);
				local36 = local8.method4983(local27, Static598.method6315(Static281.aClass176_74, Static273.anInt7288));
				Static479.method7194();
				Static85.method1575(local8, local36, true, local27, arg1);
			}
			try {
				Static440.aClass44_12 = Static441.method4987(arg0, Static237.anInterface11_8, Static475.aCanvas12, Static214.aClass4_Sub19_Sub1_1.anInt3061 * 2, Static224.aClass176_61);
				if (arg1 != null) {
					local8.ja(0);
					local27 = Static288.method8172(Static500.aClass176_119, Static273.anInt7288);
					local36 = local8.method4983(local27, Static598.method6315(Static281.aClass176_74, Static273.anInt7288));
					Static479.method7194();
					Static85.method1575(local8, local36, true, local27, arg1);
				}
				if (Static440.aClass44_12.method4993()) {
					@Pc(94) boolean local94 = true;
					try {
						local94 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(104) Throwable local104) {
					}
					@Pc(110) Class4_Sub8 local110;
					if (local94) {
						local110 = Static440.aClass44_12.method5027(146800640);
					} else {
						local110 = Static440.aClass44_12.method5027(104857600);
					}
					Static440.aClass44_12.method4988(local110);
				}
			} catch (@Pc(121) Throwable local121) {
				arg0 = 0;
				Static440.aClass44_12 = Static441.method4987(0, Static237.anInterface11_8, Static475.aCanvas12, 0, Static224.aClass176_61);
			}
			if (local8 != null) {
				try {
					local8.method5033();
				} catch (@Pc(138) Throwable local138) {
				}
			}
		}
		Static495.anInt9000 = arg0;
		Static393.method6218();
		Static440.aClass44_12.va(32);
		Static267.aClass8_3 = Static440.aClass44_12.method5025();
		Static410.aClass8_6 = Static440.aClass44_12.method5025();
		Static575.method8212();
		Static440.aClass44_12.method5036(!Static214.aClass4_Sub19_Sub1_1.aBoolean260);
		if (Static440.aClass44_12.method4977()) {
			Static303.method5191(Static214.aClass4_Sub19_Sub1_1.aBoolean257);
		}
		Static168.method3087(Static119.anInt2717 >> 3, Static440.aClass44_12, Static428.anInt8046 >> 3);
		Static214.method3551();
		Static265.aBoolean367 = false;
		Static122.aClass257Array1 = null;
		Static493.aBoolean628 = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLclient!ec;)V")
	public static void method2778(@OriginalArg(1) Class1_Sub4_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class1_Sub4_Sub2_Sub1_Sub1) {
			@Pc(9) Class1_Sub4_Sub2_Sub1_Sub1 local9 = (Class1_Sub4_Sub2_Sub1_Sub1) arg0;
			if (local9.aClass283_1 != null) {
				Static132.method2642(local9.aByte126 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, local9);
			}
		} else if (arg0 instanceof Class1_Sub4_Sub2_Sub1_Sub2) {
			@Pc(31) Class1_Sub4_Sub2_Sub1_Sub2 local31 = (Class1_Sub4_Sub2_Sub1_Sub2) arg0;
			Static325.method8270(local31.aByte126 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, local31);
		}
	}
}
