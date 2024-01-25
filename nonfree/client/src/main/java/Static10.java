import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	public static int anInt312;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "[I")
	public static final int[] anIntArray41 = new int[100];

	@OriginalMember(owner = "client!as", name = "j", descriptor = "I")
	public static int anInt307 = -1;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "I")
	public static int anInt310 = -1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Z")
	public static boolean method371() {
		try {
			return Static304.method2118();
		} catch (@Pc(15) IOException local15) {
			Static4.method188();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(80) String local80 = "T2 - " + (Static265.aClass77_123 == null ? -1 : Static265.aClass77_123.method1792()) + "," + (Static229.aClass77_164 == null ? -1 : Static229.aClass77_164.method1792()) + "," + (Static327.aClass77_147 == null ? -1 : Static327.aClass77_147.method1792()) + " - " + Static327.anInt5773 + "," + (Static376.anInt6607 + Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0]) + "," + (Static133.anInt2474 + Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0]) + " - ";
			for (@Pc(82) int local82 = 0; Static327.anInt5773 > local82 && local82 < 50; local82++) {
				local80 = local80 + Static85.aClass2_Sub13_Sub2_11.aByteArray77[local82] + ",";
			}
			Static235.method3843(local80, local20);
			Static321.method4949();
			return true;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)V")
	public static void method373(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 16);
		local8.method412();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!de;)V")
	public static void method376(@OriginalArg(1) Class22_Sub3 arg0) {
		arg0.aClass12_Sub1_Sub2_1 = null;
		if (Static332.anInt5819 < 20) {
			Static80.aClass56_3.method1253(arg0);
			Static332.anInt5819++;
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
	public static void method377() {
		if (Static145.aBoolean200) {
			return;
		}
		Static317.method4926(Static242.aClass227ArrayArrayArray4);
		if (Static91.aClass227ArrayArrayArray1 != null) {
			Static317.method4926(Static91.aClass227ArrayArrayArray1);
		}
		Static145.aBoolean200 = true;
	}
}
