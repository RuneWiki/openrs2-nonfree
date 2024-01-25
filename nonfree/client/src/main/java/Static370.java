import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!mia", name = "w", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIII)V")
	public static void method5475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 4);
		local9.method1712();
		local9.anInt1782 = arg2;
		local9.anInt1790 = arg3;
		local9.anInt1789 = arg1;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIZB)V")
	public static void method5476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static153.aFrame3 != null && (arg2 != 3 || arg1 != Static103.anInt2170 || arg0 != Static380.anInt6672)) {
			Static185.method3000(Static153.aFrame3, Static499.aClass231_4);
			Static153.aFrame3 = null;
		}
		if (arg2 == 3 && Static153.aFrame3 == null) {
			Static153.aFrame3 = Static249.method3945(arg1, Static499.aClass231_4, arg0, 0);
			if (Static153.aFrame3 != null) {
				Static380.anInt6672 = arg0;
				Static103.anInt2170 = arg1;
				Static57.method6341();
			}
		}
		if (arg2 == 3 && Static153.aFrame3 == null) {
			method5476(-1, -1, Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400(), arg3, true);
			return;
		}
		@Pc(73) Container local73;
		@Pc(90) Insets local90;
		if (Static153.aFrame3 != null) {
			local73 = Static153.aFrame3;
			Static83.anInt1901 = arg1;
			Static597.anInt9407 = arg0;
		} else if (Static90.aFrame2 == null) {
			if (Static287.anApplet2 == null) {
				local73 = Static287.anApplet_Sub1_1;
			} else {
				local73 = Static287.anApplet2;
			}
			Static83.anInt1901 = local73.getSize().width;
			Static597.anInt9407 = local73.getSize().height;
		} else {
			local90 = Static90.aFrame2.getInsets();
			Static83.anInt1901 = Static90.aFrame2.getSize().width - local90.right - local90.left;
			Static597.anInt9407 = Static90.aFrame2.getSize().height - local90.bottom - local90.top;
			local73 = Static90.aFrame2;
		}
		if (arg2 == 1) {
			Static654.anInt10064 = Static507.anInt8484;
			Static483.anInt8181 = Static581.anInt9218;
			Static225.anInt4116 = (Static83.anInt1901 - Static507.anInt8484) / 2;
			Static40.anInt1166 = 0;
		} else {
			Static268.method4280();
		}
		if (Static216.aClass309_6 != Static229.aClass309_8) {
			@Pc(154) boolean local154;
			if (Static654.anInt10064 < 1024 && Static483.anInt8181 < 768) {
				local154 = true;
			} else {
				local154 = false;
			}
		}
		if (arg4) {
			Static435.method6375();
		} else {
			Static469.aCanvas11.setSize(Static654.anInt10064, Static483.anInt8181);
			if (Static649.aBoolean735) {
				Static359.method5385(Static469.aCanvas11);
			} else {
				Static582.aClass16_12.method8118(Static469.aCanvas11, Static654.anInt10064, Static483.anInt8181);
			}
			if (Static90.aFrame2 == local73) {
				local90 = Static90.aFrame2.getInsets();
				Static469.aCanvas11.setLocation(Static225.anInt4116 + local90.left, Static40.anInt1166 + local90.top);
			} else {
				Static469.aCanvas11.setLocation(Static225.anInt4116, Static40.anInt1166);
			}
		}
		if (arg2 >= 2) {
			Static83.aBoolean177 = true;
		} else {
			Static83.aBoolean177 = false;
		}
		if (Static277.anInt5201 != -1) {
			Static345.method5204(true);
		}
		if (Static673.aClass160_3 != null && Static561.method7660(Static520.anInt6836)) {
			Static430.method6354();
		}
		for (@Pc(233) int local233 = 0; local233 < 100; local233++) {
			Static119.aBooleanArray10[local233] = true;
		}
		Static27.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ZLclient!wda;)I")
	public static int method5477(@OriginalArg(1) Class23_Sub2_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) Class5 local8 = arg0.aClass5_1;
		if (local8.anIntArray1 != null) {
			local8 = local8.method56(Static592.aClass47_2);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt67;
		@Pc(27) Class351 local27 = arg0.method8630();
		if (arg0.anInt10148 == -1 || arg0.aBoolean748) {
			local23 = local8.anInt61;
		} else if (local27.anInt9413 == arg0.anInt10148 || local27.anInt9387 == arg0.anInt10148 || arg0.anInt10148 == local27.anInt9406 || arg0.anInt10148 == local27.anInt9404) {
			local23 = local8.anInt37;
		} else if (local27.anInt9417 == arg0.anInt10148 || local27.anInt9400 == arg0.anInt10148 || local27.anInt9411 == arg0.anInt10148 || arg0.anInt10148 == local27.anInt9386) {
			local23 = local8.anInt36;
		}
		return local23;
	}
}
