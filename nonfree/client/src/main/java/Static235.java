import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
	public static int anInt4750;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "Lclient!tn;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "[Lclient!nga;")
	public static Class242[] aClass242Array1;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZIIIIB)V")
	public static void method4043(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static528.aFrame1 != null && (arg3 != 3 || Static189.aClass4_Sub2_Sub1_1.anInt9305 != arg2 || arg4 != Static189.aClass4_Sub2_Sub1_1.anInt9296)) {
			Static159.method3159(Static528.aFrame1, Static147.aClass161_4);
			Static528.aFrame1 = null;
		}
		if (arg3 == 3 && Static528.aFrame1 == null) {
			Static528.aFrame1 = Static306.method4735(0, arg4, arg2, Static147.aClass161_4);
			if (Static528.aFrame1 != null) {
				Static189.aClass4_Sub2_Sub1_1.anInt9296 = arg4;
				Static189.aClass4_Sub2_Sub1_1.anInt9305 = arg2;
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
			}
		}
		if (arg3 == 3 && Static528.aFrame1 == null) {
			method4043(true, arg1, -1, Static189.aClass4_Sub2_Sub1_1.anInt9290, -1);
			return;
		}
		@Pc(77) Container local77;
		@Pc(86) Insets local86;
		if (Static528.aFrame1 != null) {
			Static376.anInt6720 = arg2;
			local77 = Static528.aFrame1;
			Static86.anInt2256 = arg4;
		} else if (Static537.aFrame2 == null) {
			if (Static55.anApplet1 == null) {
				local77 = Static31.anApplet_Sub1_1;
			} else {
				local77 = Static55.anApplet1;
			}
			Static376.anInt6720 = local77.getSize().width;
			Static86.anInt2256 = local77.getSize().height;
		} else {
			local86 = Static537.aFrame2.getInsets();
			Static376.anInt6720 = Static537.aFrame2.getSize().width - local86.right - local86.left;
			Static86.anInt2256 = Static537.aFrame2.getSize().height - local86.bottom - local86.top;
			local77 = Static537.aFrame2;
		}
		if (arg3 == 1) {
			Static2.anInt29 = Static9.anInt8933;
			Static19.anInt390 = Static576.anInt9547;
			Static191.anInt5908 = (Static376.anInt6720 - Static9.anInt8933) / 2;
			Static249.anInt4946 = 0;
		} else {
			Static165.method3184();
		}
		if (Static106.aClass315_4 != Static327.aClass315_8) {
			@Pc(161) boolean local161;
			if (Static2.anInt29 < 1024 && Static19.anInt390 < 768) {
				local161 = true;
			} else {
				local161 = false;
			}
		}
		if (arg0) {
			Static382.method5666();
		} else {
			Static379.aCanvas13.setSize(Static2.anInt29, Static19.anInt390);
			Static185.aClass66_14.method6815(Static379.aCanvas13);
			if (Static537.aFrame2 == local77) {
				local86 = Static537.aFrame2.getInsets();
				Static379.aCanvas13.setLocation(Static191.anInt5908 + local86.left, Static249.anInt4946 + local86.top);
			} else {
				Static379.aCanvas13.setLocation(Static191.anInt5908, Static249.anInt4946);
			}
		}
		if (arg3 < 2) {
			Static502.aBoolean605 = false;
		} else {
			Static502.aBoolean605 = true;
		}
		if (Static249.anInt4945 != -1) {
			Static435.method6179(true);
		}
		if (aClass45_1 != null && Static259.method4294(Static598.anInt9831)) {
			Static453.method6407();
		}
		for (@Pc(232) int local232 = 0; local232 < 100; local232++) {
			Static271.aBooleanArray21[local232] = true;
		}
		Static493.aBoolean599 = true;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIII)V")
	public static void method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < arg0) {
			Static336.method5023(arg3, arg0, Static383.anIntArrayArray62[arg2], arg1);
		} else {
			Static336.method5023(arg3, arg1, Static383.anIntArrayArray62[arg2], arg0);
		}
	}
}
