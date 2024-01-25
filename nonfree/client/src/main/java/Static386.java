import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array16;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method5696() {
		Static187.aClass136_46.method3474(50);
		Static509.aClass136_106.method3474(50);
		Static422.aClass136_81.method3474(50);
		Static523.aClass136_102.method3474(50);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBIII[FIFI)V")
	public static void method5697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg8 - arg3;
		@Pc(9) int local9 = arg6 - arg1;
		@Pc(22) int local22 = arg2 - arg4;
		@Pc(43) float local43 = arg5[0] * (float) local5 + (float) local9 * arg5[1] + (float) local22 * arg5[2];
		@Pc(64) float local64 = arg5[4] * (float) local9 + arg5[3] * (float) local5 + (float) local22 * arg5[5];
		@Pc(85) float local85 = arg5[7] * (float) local9 + arg5[6] * (float) local5 + arg5[8] * (float) local22;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local85 * local85 + local43 * local43 + local64 * local64));
		@Pc(111) float local111 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg7 + (float) Math.asin((double) (local64 / local100)) / 3.1415927F + 0.5F;
		@Pc(139) float local139;
		if (arg0 == 1) {
			local139 = local111;
			local111 = -local124;
			local124 = local139;
		} else if (arg0 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg0 == 3) {
			local139 = local111;
			local111 = local124;
			local124 = -local139;
		}
		Static445.aFloat162 = local111;
		Static343.aFloat141 = local124;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method5698() {
		if (!Static522.aBoolean636) {
			return;
		}
		while (true) {
			while (Static332.aClass299_Sub1Array2.length > Static385.anInt6774) {
				@Pc(22) Class299_Sub1 local22 = Static332.aClass299_Sub1Array2[Static385.anInt6774];
				if (local22 != null && local22.anInt8034 == -1) {
					if (Static254.aClass6_Sub40_3 == null) {
						Static254.aClass6_Sub40_3 = Static304.aClass23_1.method887(local22.aString83);
					}
					@Pc(45) int local45 = Static254.aClass6_Sub40_3.anInt8165;
					if (local45 == -1) {
						return;
					}
					Static254.aClass6_Sub40_3 = null;
					local22.anInt8034 = local45;
					Static385.anInt6774++;
				} else {
					Static385.anInt6774++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public static void method5699() {
		if (Static15.aFrame1 != null) {
			return;
		}
		@Pc(18) Container local18;
		if (Static547.aFrame2 != null) {
			local18 = Static547.aFrame2;
		} else if (Static249.anApplet1 == null) {
			local18 = Static340.anApplet_Sub1_1;
		} else {
			local18 = Static249.anApplet1;
		}
		Static1.anInt9404 = local18.getSize().width;
		Static120.anInt2852 = local18.getSize().height;
		@Pc(40) Insets local40;
		if (Static547.aFrame2 == local18) {
			local40 = Static547.aFrame2.getInsets();
			Static120.anInt2852 -= local40.bottom + local40.top;
			Static1.anInt9404 -= local40.left + local40.right;
		}
		if (Static74.method1450() == 1) {
			Static309.anInt5674 = 0;
			Static196.anInt4059 = Static579.anInt9514;
			Static543.anInt8951 = (Static1.anInt9404 - Static592.anInt9585) / 2;
			Static240.anInt4852 = Static592.anInt9585;
		} else {
			Static278.method4564();
		}
		if (Static542.aClass194_5 != Static580.aClass194_7) {
			@Pc(91) boolean local91;
			if (Static240.anInt4852 < 1024 && Static196.anInt4059 < 768) {
				local91 = true;
			} else {
				local91 = false;
			}
		}
		Static32.aCanvas3.setSize(Static240.anInt4852, Static196.anInt4059);
		if (Static240.aClass14_7 != null) {
			Static240.aClass14_7.method6823(Static32.aCanvas3);
		}
		if (Static547.aFrame2 == local18) {
			local40 = Static547.aFrame2.getInsets();
			Static32.aCanvas3.setLocation(Static543.anInt8951 + local40.left, local40.top - -Static309.anInt5674);
		} else {
			Static32.aCanvas3.setLocation(Static543.anInt8951, Static309.anInt5674);
		}
		if (Static468.anInt8036 != -1) {
			Static396.method7542(true);
		}
		Static535.method7308();
	}
}
