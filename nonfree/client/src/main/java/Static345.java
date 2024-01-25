import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[I")
	public static int[] anIntArray635;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	public static final int anInt6586 = 50;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
	public static final int[] anIntArray630 = new int[anInt6586];

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString244 = "";

	@OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
	public static final int[] anIntArray631 = new int[anInt6586];

	@OriginalMember(owner = "client!we", name = "e", descriptor = "[I")
	public static final int[] anIntArray632 = new int[anInt6586];

	@OriginalMember(owner = "client!we", name = "f", descriptor = "[I")
	public static final int[] anIntArray633 = new int[anInt6586];

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[112];

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString245 = "Loading wordpack - ";

	@OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
	public static final int[] anIntArray634 = new int[anInt6586];

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public static int anInt6584 = 255;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "J")
	public static long aLong213 = 0L;

	@OriginalMember(owner = "client!we", name = "G", descriptor = "[I")
	public static final int[] anIntArray636 = new int[anInt6586];

	@OriginalMember(owner = "client!we", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray75 = new String[anInt6586];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
	public static int method5870() {
		return 6;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)I")
	public static int method5871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static144.anIntArray274[arg0 & 0x3] : Static154.anIntArray288[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIIII)V")
	public static void method5872(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0) {
			Static262.method4488();
		}
		if (Static267.aFrame1 != null && (arg3 != 3 || arg1 != Static325.anInt6256 || arg2 != Static106.anInt2354)) {
			Static34.method3923(Static105.aClass15_2, Static267.aFrame1);
			Static267.aFrame1 = null;
		}
		if (arg3 == 3 && Static267.aFrame1 == null) {
			Static267.aFrame1 = Static180.method3496(Static105.aClass15_2, arg2, arg1, 0);
			if (Static267.aFrame1 != null) {
				Static106.anInt2354 = arg2;
				Static325.anInt6256 = arg1;
				Static324.method5568(Static105.aClass15_2);
			}
		}
		if (arg3 == 3 && Static267.aFrame1 == null) {
			method5872(true, -1, -1, Static333.anInt6446, arg4);
			return;
		}
		@Pc(72) Container local72;
		@Pc(85) Insets local85;
		if (Static267.aFrame1 != null) {
			Static2.anInt104 = arg1;
			Static218.anInt4396 = arg2;
			local72 = Static267.aFrame1;
		} else if (Static277.aFrame2 == null) {
			local72 = Static105.aClass15_2.anApplet1;
			Static2.anInt104 = local72.getSize().width;
			Static218.anInt4396 = local72.getSize().height;
		} else {
			local85 = Static277.aFrame2.getInsets();
			Static2.anInt104 = Static277.aFrame2.getSize().width - local85.left - local85.right;
			@Pc(105) int local105 = local85.bottom + local85.top;
			Static218.anInt4396 = Static277.aFrame2.getSize().height - local105;
			local72 = Static277.aFrame2;
		}
		@Pc(150) int local150;
		if (arg3 == 1) {
			Static205.anInt4113 = (Static2.anInt104 - 765) / 2;
			Static249.anInt4822 = 0;
			Static294.anInt5659 = 765;
			Static46.anInt1173 = 503;
		} else if (Static127.anInt2786 < 96 && Static67.anInt1615 == 0) {
			local150 = Static2.anInt104 <= 1024 ? Static2.anInt104 : 1024;
			Static205.anInt4113 = (Static2.anInt104 - local150) / 2;
			Static294.anInt5659 = local150;
			@Pc(165) int local165 = Static218.anInt4396 > 768 ? 768 : Static218.anInt4396;
			Static249.anInt4822 = 0;
			Static46.anInt1173 = local165;
		} else {
			Static46.anInt1173 = Static218.anInt4396;
			Static205.anInt4113 = 0;
			Static294.anInt5659 = Static2.anInt104;
			Static249.anInt4822 = 0;
		}
		if (Static322.anInt6208 != 0) {
			@Pc(190) boolean local190;
			if (Static294.anInt5659 < 1024 && Static46.anInt1173 < 768) {
				local190 = true;
			} else {
				local190 = false;
			}
		}
		if (arg0) {
			Static253.method1025(Static67.anInt1615);
		} else {
			Static95.aCanvas2.setSize(Static294.anInt5659, Static46.anInt1173);
			if (Static218.aClass46_5 != null) {
				Static218.aClass46_5.method5117();
			}
			if (local72 == Static277.aFrame2) {
				local85 = Static277.aFrame2.getInsets();
				Static95.aCanvas2.setLocation(local85.left + Static205.anInt4113, local85.top + Static249.anInt4822);
			} else {
				Static95.aCanvas2.setLocation(Static205.anInt4113, Static249.anInt4822);
			}
		}
		if (arg3 >= 2) {
			Static335.aBoolean434 = true;
		} else {
			Static335.aBoolean434 = false;
		}
		if (Static324.anInt6226 != -1) {
			Static161.method3223(true);
		}
		if (Static138.aClass159_3 != null && (Static302.anInt5842 == 30 || Static302.anInt5842 == 25)) {
			Static104.method2276();
		}
		for (local150 = 0; local150 < 100; local150++) {
			Static338.aBooleanArray29[local150] = true;
		}
		Static116.aBoolean180 = true;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(ZIIIII)V")
	public static void method5874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg0; local12 <= arg3; local12++) {
			Static27.method690(arg4, Static104.anIntArrayArray31[local12], arg1, arg2);
		}
	}
}
