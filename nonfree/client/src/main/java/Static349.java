import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "Lclient!bu;")
	public static Class44 aClass44_113;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public static int anInt6487 = 0;

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public static void method5325() {
		if (Static677.aClass137_47.method7873()) {
			Static677.aClass137_47.method7910(Static68.aCanvas2);
			Static553.method7782();
			if (Static128.aBoolean202) {
				Static354.method5357(Static68.aCanvas2);
			} else {
				@Pc(23) Dimension local23 = Static68.aCanvas2.getSize();
				Static677.aClass137_47.method7920(Static68.aCanvas2, local23.width, local23.height);
			}
			Static677.aClass137_47.method7939(Static68.aCanvas2);
		} else {
			Static155.method2506(Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541(), false);
		}
		Static31.method720();
		Static17.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Lclient!ru;")
	public static Class217_Sub1 method5326() {
		return Static118.anInt2444 < Static372.aClass217_Sub1Array1.length ? Static372.aClass217_Sub1Array1[Static118.anInt2444++] : null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZZB)V")
	public static void method5327(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static18.anInt248--;
			if (Static18.anInt248 == 0) {
				Static659.anIntArray816 = null;
			}
		}
		if (arg1) {
			Static593.anInt10137--;
			if (Static593.anInt10137 == 0) {
				Static520.anIntArray666 = null;
			}
		}
	}
}
