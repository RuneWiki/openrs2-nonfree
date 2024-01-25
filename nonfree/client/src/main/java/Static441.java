import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_47 = new Class202(14, 4);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method7833(@OriginalArg(0) Class42 arg0) {
		if (Static283.aClass73_76.method2013() == 0) {
			return;
		}
		@Pc(48) Class12_Sub30 local48;
		if (Static148.anInt6867 == 0) {
			for (local48 = (Class12_Sub30) Static283.aClass73_76.method2005(); local48 != null; local48 = (Class12_Sub30) Static283.aClass73_76.method2009()) {
				Static150.aClass254_2.method6345(arg0, local48.aBoolean402 ? Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1 : null, local48.anInt5214, local48.anInt5212, local48.anInt5210, local48.anInt5208, arg0, local48.anInt5209, false, Static340.aClass80_3, false);
				local48.method7967();
			}
			Static445.method6725();
			return;
		}
		if (Static383.aClass42_7 == null) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(36, 32);
			Static383.aClass42_7 = Static391.method5858(0, local18, 0, Static7.aClass16_118, Static450.anInterface11_12);
			Class54_Sub1.lb = Static383.aClass42_7.method5850(Static173.method3438(Static208.anInt4588, Static466.aClass16_109), Static550.method895(Static440.aClass16_103, Static208.anInt4588));
		}
		for (local48 = (Class12_Sub30) Static283.aClass73_76.method2005(); local48 != null; local48 = (Class12_Sub30) Static283.aClass73_76.method2009()) {
			Static150.aClass254_2.method6345(Static383.aClass42_7, local48.aBoolean402 ? Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1 : null, local48.anInt5214, local48.anInt5212, local48.anInt5210, local48.anInt5208, arg0, local48.anInt5209, false, Class54_Sub1.lb, false);
			local48.method7967();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method7838() {
		Static383.aClass12_Sub8_Sub2_1.method5223(Static242.aClass16_65.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static252.aClass16_68.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static539.aClass16_120.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static315.aClass16_82.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static85.aClass16_17.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static129.aClass16_119.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static250.aClass16_67.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static103.aClass16_21.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static440.aClass16_103.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static107.aClass16_28.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static369.aClass16_89.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static207.aClass16_53.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static306.aClass16_77.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static466.aClass16_109.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static482.aClass16_112.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static25.aClass16_5.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static362.aClass16_88.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static458.aClass16_106.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static222.aClass16_59.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static115.aClass16_29.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static354.aClass16_87.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static170.aClass16_47.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static395.aClass16_93.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static224.aClass16_108.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static336.aClass16_84.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static55.aClass16_10.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static96.aClass16_20.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static371.aClass16_90.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static81.aClass16_16.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static19.aClass16_4.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static398.aClass16_97.method392());
		Static383.aClass12_Sub8_Sub2_1.method5223(Static7.aClass16_118.method392());
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)V")
	public static void method7842(@OriginalArg(1) int arg0) {
		Static247.anInt5085 = 3;
		Static288.anInt5602 = -1;
		Static40.anInt812 = 100;
		Static420.anInt7807 = arg0;
	}
}
