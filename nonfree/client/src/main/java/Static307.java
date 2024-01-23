import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
	public static int[] anIntArray526 = new int[50];

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public static int anInt5799 = 0;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray65 = new boolean[100];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method4557() {
		Static63.aClass1_Sub1_Sub3Array6 = null;
		Static197.aClass103Array3 = null;
		Static245.aClass1_Sub1_Sub12_2 = null;
		Static289.aClass1_Sub1_Sub12_4 = null;
		Static276.aClass1_Sub1_Sub3Array12 = null;
		Static152.aClass1_Sub1_Sub3_5 = null;
		Static236.aClass1_Sub1_Sub3Array16 = null;
		Static56.aClass1_Sub1_Sub3Array5 = null;
		Static110.aClass1_Sub1_Sub12_Sub2_1 = null;
		Static297.aClass1_Sub1_Sub3Array17 = null;
		Static231.aClass103Array4 = null;
		Static105.aClass1_Sub1_Sub3Array7 = null;
		Static233.aClass1_Sub1_Sub12_3 = null;
		Static119.aClass1_Sub1_Sub3Array20 = null;
		Static188.aClass1_Sub1_Sub3Array13 = null;
		Static119.aClass1_Sub1_Sub3Array19 = null;
		Static309.aClass1_Sub1_Sub3Array18 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZBI)V")
	public static void method4558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static162.method2753(false);
		Static175.anInt3628 = arg0;
		Static220.aBoolean425 = arg2;
		Static49.anInt952 = arg1;
		Static58.method2033(arg3);
		Static49.aClass156_3 = new Class156(8);
		Static98.aClass156_8 = new Class156(8);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI)V")
	public static void method4559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static46.anIntArray78[arg1] = arg0;
		@Pc(14) Class1_Sub21 local14 = (Class1_Sub21) Static276.aClass156_15.method3821((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub21(Static135.method2186() + 500L);
			Static276.aClass156_15.method3816((long) arg1, local14);
		} else {
			local14.aLong158 = Static135.method2186() + 500L;
		}
	}
}
