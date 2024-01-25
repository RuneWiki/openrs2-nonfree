import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
	public static int anInt6621;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
	public static int anInt6633;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "[I")
	public static final int[] anIntArray576 = new int[50];

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[4];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZ)V")
	public static void method5464(@OriginalArg(1) boolean arg0) {
		Static88.method1553();
		if (Static54.anInt1123 != 30 && Static54.anInt1123 != 25) {
			return;
		}
		Static367.anInt7089++;
		if (Static367.anInt7089 < 50 && !arg0) {
			return;
		}
		Static367.anInt7089 = 0;
		if (!Static234.aBoolean264 && Static103.aClass30_1 != null) {
			Static298.method4373(Static405.aClass25_106);
			try {
				Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, Static449.aClass6_Sub15_Sub1_2.anInt3487);
				Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
			} catch (@Pc(52) IOException local52) {
				Static234.aBoolean264 = true;
			}
		}
		Static88.method1553();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class239 local8 = Static316.method5795(arg0, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray21 != null) {
			@Pc(18) Class6_Sub29 local18 = new Class6_Sub29();
			local18.anObjectArray4 = local8.anObjectArray21;
			local18.aClass239_10 = local8;
			local18.aString44 = arg2;
			local18.anInt5270 = arg3;
			Static308.method4424(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt6442 != 0) {
			local35 = Static344.method4845(local8);
		}
		if (!local35 || !Static54.method1017(local8).method4840(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static298.method4373(Static368.aClass25_97);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 2) {
			Static298.method4373(Static312.aClass25_81);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 3) {
			Static298.method4373(Static434.aClass25_112);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 4) {
			Static298.method4373(Static221.aClass25_55);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 5) {
			Static298.method4373(Static303.aClass25_79);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 6) {
			Static298.method4373(Static383.aClass25_102);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 7) {
			Static298.method4373(Static301.aClass25_44);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 8) {
			Static298.method4373(Static392.aClass25_103);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 9) {
			Static298.method4373(Static370.aClass25_99);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
		if (arg3 == 10) {
			Static298.method4373(Static102.aClass25_80);
			Static202.method3190(arg1, local8.anInt6492, arg0);
		}
	}
}
