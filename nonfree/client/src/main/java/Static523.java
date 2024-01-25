import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static523 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public static void method7604() {
		Static476.aClass62_2.method1422();
		Static281.aClass49_1.method2424();
		Static554.aClient1.method1293();
		Static617.aCanvas13.setBackground(Color.black);
		Static257.anInt5006 = -1;
		Static476.aClass62_2 = Static647.method8675(Static617.aCanvas13);
		Static281.aClass49_1 = Static633.method1297(Static617.aCanvas13);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7605(@OriginalArg(0) Class82 arg0) {
		if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 != Static617.anInt9920 && (Static567.aClass351ArrayArrayArray4 != null && Static504.method7332(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, arg0))) {
			Static617.anInt9920 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127;
		}
	}
}
