import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!jb;")
	public static Class28 aClass28_14;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static int anInt583;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	public static int anInt585;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public static int anInt589;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_204 = null;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "[Lclient!qh;")
	public static Class99[] aClass99Array1 = new Class99[5000];

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
	public static void method585() {
		if (Static77.anInt1732 != -1) {
			Static39.method747(Static77.anInt1732);
		}
		for (@Pc(19) int local19 = 0; local19 < Static14.anInt333; local19++) {
			if (Static39.aBooleanArray5[local19]) {
				Static175.aBooleanArray24[local19] = true;
			}
			Static20.aBooleanArray18[local19] = Static39.aBooleanArray5[local19];
			Static39.aBooleanArray5[local19] = false;
		}
		Static233.aClass86_17 = null;
		Static122.anInt2673 = -1;
		Static168.anInt3626 = -1;
		Static176.anInt3805 = Static128.anInt2802;
		if (Static77.anInt1732 != -1) {
			Static14.anInt333 = 0;
			Static84.method1419(-1, 0, 0, 0, Static77.anInt1732, Static180.anInt4990, 0, Static158.anInt3484);
		}
		Static205.method3241();
		Static204.anInt2498 = 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!jb;I)V")
	public static void method586(@OriginalArg(0) Class28 arg0) {
		Static165.aClass28_41 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method587() {
		if (Static100.aClass62_1 != null) {
			Static100.aClass62_1.method2407();
		}
		if (Static186.aClass62_2 != null) {
			Static186.aClass62_2.method2407();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public static void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub9 local28 = Static174.aClass1_Sub9ArrayArrayArray2[local9][arg0][arg1] = Static174.aClass1_Sub9ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1418--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1416; local38++) {
					@Pc(44) Class99 local44 = local28.aClass99Array2[local38];
					if ((local44.aLong140 >> 29 & 0x3L) == 2L && local44.anInt3819 == arg0 && local44.anInt3808 == arg1) {
						local44.anInt3806--;
					}
				}
			}
		}
		if (Static174.aClass1_Sub9ArrayArrayArray2[0][arg0][arg1] == null) {
			Static174.aClass1_Sub9ArrayArrayArray2[0][arg0][arg1] = new Class1_Sub9(0, arg0, arg1);
		}
		Static174.aClass1_Sub9ArrayArrayArray2[0][arg0][arg1].aClass1_Sub9_1 = local7;
		Static174.aClass1_Sub9ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)Z")
	public static boolean method589() {
		if (Static100.anInt2169 != 0) {
			try {
				if ((Boolean) Static198.aClass107_1131.method3113(Static117.aClass34_2.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}
}
