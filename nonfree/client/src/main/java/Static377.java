import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZZI)V")
	public static void method6034(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static455.aClass4_11 = Static386.method7191(Static312.aCanvas12, Static286.aClass1_Sub15_Sub1_1.anInt7032 * 2, Static405.aClass69_77, Static67.anInterface13_6, 0);
		} else {
			if (arg0) {
				Static455.aClass4_11 = Static386.method7191(Static312.aCanvas12, 0, Static405.aClass69_77, Static67.anInterface13_6, 0);
				Static455.aClass4_11.Z(0);
				@Pc(25) Class96 local25 = Static363.method5898(Static226.anInt4370, Static61.aClass69_18);
				@Pc(34) Class36 local34 = Static455.aClass4_11.method7193(local25, Static547.method1918(Static46.aClass69_14, Static226.anInt4370));
				Static433.method6712(Static246.aClass45_71.method1474(Static544.anInt7853), true, local34);
				Static455.aClass4_11.method7164();
				Static311.method5393();
				Static455.aClass4_11.method7150();
			}
			try {
				Static455.aClass4_11 = Static386.method7191(Static312.aCanvas12, Static286.aClass1_Sub15_Sub1_1.anInt7032 * 2, Static405.aClass69_77, Static67.anInterface13_6, arg1);
				if (Static455.aClass4_11.method7180()) {
					@Pc(65) boolean local65 = true;
					try {
						local65 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(75) Throwable local75) {
					}
					@Pc(81) Class1_Sub23 local81;
					if (local65) {
						local81 = Static455.aClass4_11.method7220(146800640);
					} else {
						local81 = Static455.aClass4_11.method7220(104857600);
					}
					Static455.aClass4_11.method7210(local81);
				}
			} catch (@Pc(92) Throwable local92) {
				arg1 = 0;
				Static455.aClass4_11 = Static386.method7191(Static312.aCanvas12, 0, Static405.aClass69_77, Static67.anInterface13_6, 0);
			}
		}
		Static449.anInt7876 = arg1;
		Static538.method8166();
		if (!Static455.aClass4_11.method7152()) {
			Static154.anInt3012 = 1;
		}
		Static455.aClass4_11.method7185(Static154.anInt3012);
		Static455.aClass4_11.method7196(0);
		Static455.aClass4_11.L(8);
		Static224.aClass128_5 = Static455.aClass4_11.method7189();
		Static437.aClass128_7 = Static455.aClass4_11.method7189();
		Static229.method4130();
		Static455.aClass4_11.method7160(!Static286.aClass1_Sub15_Sub1_1.aBoolean533);
		if (Static455.aClass4_11.method7209()) {
			Static164.method2944(Static286.aClass1_Sub15_Sub1_1.aBoolean520);
		}
		Static508.method7755(Static373.anInt6694 >> 3, Static455.aClass4_11, Static237.anInt4563 >> 3);
		Static22.method601();
		Static473.aBoolean625 = false;
	}
}
