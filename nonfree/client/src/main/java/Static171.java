import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!eb;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Lclient!uu;")
	public static Class250 aClass250_48;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!uu;")
	public static Class250 aClass250_49;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Lclient!la;")
	public static final Class136 aClass136_83 = new Class136(68, -1);

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public static int anInt3094 = 0;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "Lclient!la;")
	public static final Class136 aClass136_84 = new Class136(56, 4);

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Z")
	public static boolean aBoolean244 = true;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lclient!ci;")
	public static Class23_Sub2 method2615() {
		@Pc(16) Class23_Sub2 local16 = (Class23_Sub2) Static459.aClass194_8.method4575();
		if (local16 == null) {
			return new Class23_Sub2();
		} else {
			Static52.anInt944--;
			return local16;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIIIIB)V")
	public static void method2617(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static52.aFrame1 != null && (arg3 != 3 || Static39.aClass79_Sub1_1.anInt2148 != arg1 || Static39.aClass79_Sub1_1.anInt2146 != arg2)) {
			Static442.method6045(Static32.aClass51_1, Static52.aFrame1);
			Static52.aFrame1 = null;
		}
		if (arg3 == 3 && Static52.aFrame1 == null) {
			Static52.aFrame1 = Static103.method1720(arg1, Static32.aClass51_1, arg2, 0);
			if (Static52.aFrame1 != null) {
				Static39.aClass79_Sub1_1.anInt2148 = arg1;
				Static39.aClass79_Sub1_1.anInt2146 = arg2;
				Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
			}
		}
		if (arg3 == 3 && Static52.aFrame1 == null) {
			method2617(true, -1, -1, Static39.aClass79_Sub1_1.anInt2150, arg4);
			return;
		}
		@Pc(74) Container local74;
		@Pc(87) Insets local87;
		if (Static52.aFrame1 != null) {
			Static277.anInt5005 = arg1;
			Static199.anInt3571 = arg2;
			local74 = Static52.aFrame1;
		} else if (Static456.aFrame2 == null) {
			local74 = Static32.aClass51_1.anApplet1;
			Static277.anInt5005 = local74.getSize().width;
			Static199.anInt3571 = local74.getSize().height;
		} else {
			local87 = Static456.aFrame2.getInsets();
			Static277.anInt5005 = Static456.aFrame2.getSize().width - local87.left - local87.right;
			Static199.anInt3571 = Static456.aFrame2.getSize().height - local87.bottom - local87.top;
			local74 = Static456.aFrame2;
		}
		@Pc(164) int local164;
		if (arg3 == 1) {
			Static229.anInt3847 = (Static277.anInt5005 - Static28.anInt495) / 2;
			Static159.anInt2944 = 0;
			Static166.anInt3014 = Static459.anInt5917;
			Static310.anInt5307 = Static28.anInt495;
		} else if (Static61.anInt1155 < 96 && Static402.anInt6656 == 0) {
			local164 = Static277.anInt5005 <= 1024 ? Static277.anInt5005 : 1024;
			@Pc(173) int local173 = Static199.anInt3571 <= 768 ? Static199.anInt3571 : 768;
			Static310.anInt5307 = local164;
			Static229.anInt3847 = (Static277.anInt5005 - local164) / 2;
			Static159.anInt2944 = 0;
			Static166.anInt3014 = local173;
		} else {
			Static310.anInt5307 = Static277.anInt5005;
			Static159.anInt2944 = 0;
			Static229.anInt3847 = 0;
			Static166.anInt3014 = Static199.anInt3571;
		}
		if (Static230.aClass35_2 != Static80.aClass35_1) {
			@Pc(200) boolean local200;
			if (Static310.anInt5307 < 1024 && Static166.anInt3014 < 768) {
				local200 = true;
			} else {
				local200 = false;
			}
		}
		if (arg0) {
			Static303.method4312();
		} else {
			Static151.aCanvas2.setSize(Static310.anInt5307, Static166.anInt3014);
			Static413.aClass167_11.method5970(Static151.aCanvas2);
			if (local74 == Static456.aFrame2) {
				local87 = Static456.aFrame2.getInsets();
				Static151.aCanvas2.setLocation(local87.left + Static229.anInt3847, local87.top + Static159.anInt2944);
			} else {
				Static151.aCanvas2.setLocation(Static229.anInt3847, Static159.anInt2944);
			}
		}
		if (arg3 < 2) {
			Static235.aBoolean295 = false;
		} else {
			Static235.aBoolean295 = true;
		}
		if (Static343.anInt5785 != -1) {
			Static213.method3196(true);
		}
		if (Static328.aClass116_1 != null && Static1.method6243(Static345.anInt5823)) {
			Static162.method2549();
		}
		for (local164 = 0; local164 < 100; local164++) {
			Static391.aBooleanArray22[local164] = true;
		}
		Static99.aBoolean112 = true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)Lclient!co;")
	public static Class35 method2618(@OriginalArg(1) int arg0) {
		@Pc(15) Class35[] local15 = Static99.method1680();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class35 local23 = local15[local17];
			if (local23.anInt1109 == arg0) {
				return local23;
			}
		}
		return null;
	}
}
