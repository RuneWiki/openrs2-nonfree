import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
	public static int anInt4705;

	@OriginalMember(owner = "client!ql", name = "O", descriptor = "Lclient!ek;")
	public static Class42 aClass42_74;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "Lclient!ne;")
	public static Class2_Sub8_Sub14 aClass2_Sub8_Sub14_7;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "Lclient!gg;")
	public static Class2_Sub15 aClass2_Sub15_1 = new Class2_Sub15(0, 0);

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
	public static int anInt4707 = 1;

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString161 = "Examine";

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIB)V")
	public static void method3796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		if (arg3 > arg0) {
			for (local14 = arg0; local14 < arg3; local14++) {
				Static275.anIntArrayArray37[local14][arg1] = arg2;
			}
		} else {
			for (local14 = arg3; local14 < arg0; local14++) {
				Static275.anIntArrayArray37[local14][arg1] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BIII)I")
	public static int method3798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static9.anIntArrayArrayArray7 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > 103 || local15 > 103) {
			return 0;
		}
		@Pc(39) int local39 = arg2;
		@Pc(43) int local43 = arg0 & 0x7F;
		@Pc(47) int local47 = arg1 & 0x7F;
		if (arg2 < 3 && (Static13.aByteArrayArrayArray2[1][local11][local15] & 0x2) == 2) {
			local39 = arg2 + 1;
		}
		@Pc(90) int local90 = Static9.anIntArrayArrayArray7[local39][local11 + 1][local15] * local47 + (128 - local47) * Static9.anIntArrayArrayArray7[local39][local11][local15] >> 7;
		@Pc(120) int local120 = Static9.anIntArrayArrayArray7[local39][local11 + 1][local15 + 1] * local47 + Static9.anIntArrayArrayArray7[local39][local11][local15 + 1] * (128 - local47) >> 7;
		return local90 * (128 - local43) + local43 * local120 >> 7;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	public static void method3799() {
		@Pc(8) Container local8;
		if (Static127.aFrame2 != null) {
			local8 = Static127.aFrame2;
		} else if (Static72.aFrame1 == null) {
			local8 = Static164.aClass102_2.anApplet1;
		} else {
			local8 = Static72.aFrame1;
		}
		Static32.anInt875 = local8.getSize().width;
		Static237.anInt4775 = local8.getSize().height;
		@Pc(31) Insets local31;
		if (local8 == Static72.aFrame1) {
			local31 = Static72.aFrame1.getInsets();
			Static237.anInt4775 -= local31.bottom + local31.top;
			Static32.anInt875 -= local31.left + local31.right;
		}
		if (Static141.method2503() >= 2) {
			Static14.anInt276 = 0;
			Static237.anInt4772 = 0;
			Static120.anInt2649 = Static237.anInt4775;
			Static60.anInt1510 = Static32.anInt875;
		} else {
			Static60.anInt1510 = 765;
			Static120.anInt2649 = 503;
			Static237.anInt4772 = (Static32.anInt875 - 765) / 2;
			Static14.anInt276 = 0;
		}
		if (Static116.aBoolean184) {
			Static116.method1966(Static60.anInt1510, Static120.anInt2649);
		}
		Static227.aCanvas1.setSize(Static60.anInt1510, Static120.anInt2649);
		if (Static72.aFrame1 == local8) {
			local31 = Static72.aFrame1.getInsets();
			Static227.aCanvas1.setLocation(local31.left + Static237.anInt4772, local31.top - -Static14.anInt276);
		} else {
			Static227.aCanvas1.setLocation(Static237.anInt4772, Static14.anInt276);
		}
		if (Static303.anInt5868 != -1) {
			Static130.method2397(true);
		}
		Static30.method577();
	}
}
