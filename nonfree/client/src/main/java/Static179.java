import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_103 = new Class202("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "J")
	public static long aLong91 = 20000000L;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
	public static int anInt3323 = 0;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	public static void method2978() {
		Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
		Static397.aClass239_147 = null;
		Static472.anInt8247 = 0;
		Static126.aClass239_152 = null;
		Static162.aClass239_77 = null;
		Static91.aClass239_38 = null;
		Static6.anInt158 = 0;
		Static78.anInt1655 = 0;
		Static70.aClass2_Sub29_Sub2_1.anInt6132 = 0;
		Static512.method7485();
		Static381.method5976();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static278.aClass1_Sub1_Sub2_Sub1Array1[local31] = null;
		}
		Static266.aClass1_Sub1_Sub2_Sub1_1 = null;
		for (@Pc(45) int local45 = 0; local45 < Static61.anInt1174; local45++) {
			@Pc(57) Class1_Sub1_Sub2_Sub2 local57 = Static539.aClass2_Sub11Array1[local45].aClass1_Sub1_Sub2_Sub2_1;
			if (local57 != null) {
				local57.anInt5062 = -1;
			}
		}
		Static471.method7072();
		Static427.anInt7875 = 1;
		Static301.method4738(9);
		for (@Pc(75) int local75 = 0; local75 < 100; local75++) {
			Static368.aBooleanArray32[local75] = true;
		}
		Static383.method5988();
		Static374.aClass2_Sub51_1 = null;
		Static340.aLong160 = 0L;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method2981() {
		Static311.aClass189_1.method4711();
		Static61.aClass214_1.method7247();
		Static456.aClient1.method1218();
		Static517.aCanvas14.setBackground(Color.black);
		Static545.anInt9377 = -1;
		Static311.aClass189_1 = Static284.method7818(Static517.aCanvas14);
		Static61.aClass214_1 = Static225.method3543(Static517.aCanvas14);
	}
}
