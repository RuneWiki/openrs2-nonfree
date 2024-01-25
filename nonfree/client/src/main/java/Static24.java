import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt439;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public static int anInt437 = 0;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString16 = "flash2:";

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[J")
	public static final long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public static void method401(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static168.aBooleanArray17[arg0]) {
			return;
		}
		Static237.aClass134_112.method3034(arg0);
		if (Static313.aClass163ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static313.aClass163ArrayArray1[arg0].length; local28++) {
			if (Static313.aClass163ArrayArray1[arg0][local28] != null) {
				if (Static313.aClass163ArrayArray1[arg0][local28].anInt4934 == 2) {
					local26 = false;
				} else {
					Static313.aClass163ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static313.aClass163ArrayArray1[arg0] = null;
		}
		Static168.aBooleanArray17[arg0] = false;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public static void method402() {
		Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
		Static48.anInt1219 = -1;
		Static237.anInt4904 = 0;
		Static128.anInt3532 = -1;
		Static257.anInt5276 = -1;
		Static74.anInt1559 = -1;
		Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
		Static321.anInt6389 = 0;
		Static67.anInt1458 = 0;
		Static56.method1103();
		Static92.method1452();
		for (@Pc(39) int local39 = 0; local39 < Static202.aClass10_Sub1_Sub2_Sub2Array1.length; local39++) {
			if (Static202.aClass10_Sub1_Sub2_Sub2Array1[local39] != null) {
				Static202.aClass10_Sub1_Sub2_Sub2Array1[local39].anInt4061 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static178.aClass10_Sub1_Sub2_Sub1Array1.length; local57++) {
			if (Static178.aClass10_Sub1_Sub2_Sub1Array1[local57] != null) {
				Static178.aClass10_Sub1_Sub2_Sub1Array1[local57].anInt4061 = -1;
			}
		}
		Static76.method1300();
		Static246.anInt5156 = 1;
		Static16.method298(30);
		for (@Pc(82) int local82 = 0; local82 < 100; local82++) {
			Static19.aBooleanArray1[local82] = true;
		}
		Static14.method204();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method404(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static224.aClass3_1);
		arg0.removeFocusListener(Static224.aClass3_1);
		Static94.anInt1779 = -1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I")
	public static int method406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}
}
