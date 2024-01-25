import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
	public static int anInt4704;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_6 = new Class228(8, 1);

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_112 = new Class136(10, -1);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method4296(@OriginalArg(1) Class126 arg0) {
		if (Static568.aClass306_57.method7306() == 0) {
			return;
		}
		@Pc(22) Class5_Sub31 local22;
		if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 0) {
			for (local22 = (Class5_Sub31) Static568.aClass306_57.method7313(); local22 != null; local22 = (Class5_Sub31) Static568.aClass306_57.method7301()) {
				Static479.aClass348_1.method8201(false, local22.aBoolean487 ? Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 : null, arg0, false, local22.anInt5839, arg0, local22.anInt5840, local22.anInt5841, Static288.aClass6_8, local22.anInt5845, local22.anInt5843);
				local22.method8911();
			}
			Static101.method1476();
			return;
		}
		if (Static11.aClass126_3 == null) {
			@Pc(69) Canvas local69 = new Canvas();
			local69.setSize(36, 32);
			Static11.aClass126_3 = Static64.method1078(0, 0, Static306.anInterface8_5, Static40.aClass384_20, local69);
			Static507.aClass6_15 = Static11.aClass126_3.method7000(Static64.method1079(Static499.anInt8495, Static288.aClass384_72), Static654.method4059(Static488.aClass384_112, Static499.anInt8495));
		}
		for (local22 = (Class5_Sub31) Static568.aClass306_57.method7313(); local22 != null; local22 = (Class5_Sub31) Static568.aClass306_57.method7301()) {
			Static479.aClass348_1.method8201(false, local22.aBoolean487 ? Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 : null, arg0, false, local22.anInt5839, Static11.aClass126_3, local22.anInt5840, local22.anInt5841, Static507.aClass6_15, local22.anInt5845, local22.anInt5843);
			local22.method8911();
		}
	}
}
