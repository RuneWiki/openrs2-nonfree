import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!c;")
	public static Class32 aClass32_7;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_128 = new Class12(31, -1);

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public static int anInt4858 = 64;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
	public static final int[] anIntArray307 = new int[100];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIIIIB)V")
	public static void method3795(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static90.aFrame1 != null && (arg4 != 3 || Static453.aClass136_Sub1_1.anInt4445 != arg2 || arg3 != Static453.aClass136_Sub1_1.anInt4440)) {
			Static226.method3259(Static90.aFrame1, Static183.aClass83_2);
			Static90.aFrame1 = null;
		}
		if (arg4 == 3 && Static90.aFrame1 == null) {
			Static90.aFrame1 = Static15.method232(Static183.aClass83_2, arg2, arg3, 0);
			if (Static90.aFrame1 != null) {
				Static453.aClass136_Sub1_1.anInt4445 = arg2;
				Static453.aClass136_Sub1_1.anInt4440 = arg3;
				Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
			}
		}
		if (arg4 == 3 && Static90.aFrame1 == null) {
			method3795(true, arg1, -1, -1, Static453.aClass136_Sub1_1.anInt4455);
			return;
		}
		@Pc(98) Container local98;
		@Pc(74) Insets local74;
		if (Static90.aFrame1 != null) {
			local98 = Static90.aFrame1;
			Static187.anInt3236 = arg2;
			Static285.anInt5014 = arg3;
		} else if (Static411.aFrame2 == null) {
			local98 = Static183.aClass83_2.anApplet1;
			Static187.anInt3236 = local98.getSize().width;
			Static285.anInt5014 = local98.getSize().height;
		} else {
			local74 = Static411.aFrame2.getInsets();
			@Pc(82) int local82 = local74.right + local74.left;
			Static187.anInt3236 = Static411.aFrame2.getSize().width - local82;
			@Pc(90) int local90 = -local74.bottom;
			Static285.anInt5014 = Static411.aFrame2.getSize().height + local90 - local74.top;
			local98 = Static411.aFrame2;
		}
		@Pc(151) int local151;
		if (arg4 == 1) {
			Static69.anInt1304 = Static313.anInt5427;
			Static338.anInt5777 = Static252.anInt4573;
			Static51.anInt869 = 0;
			Static335.anInt5705 = (Static187.anInt3236 - Static313.anInt5427) / 2;
		} else if (anInt4858 < 96 && Static14.anInt293 == 0) {
			local151 = Static187.anInt3236 > 1024 ? 1024 : Static187.anInt3236;
			Static335.anInt5705 = (Static187.anInt3236 - local151) / 2;
			Static69.anInt1304 = local151;
			@Pc(168) int local168 = Static285.anInt5014 <= 768 ? Static285.anInt5014 : 768;
			Static51.anInt869 = 0;
			Static338.anInt5777 = local168;
		} else {
			Static338.anInt5777 = Static285.anInt5014;
			Static51.anInt869 = 0;
			Static69.anInt1304 = Static187.anInt3236;
			Static335.anInt5705 = 0;
		}
		if (Static459.aClass30_13 != Static328.aClass30_10) {
			@Pc(194) boolean local194;
			if (Static69.anInt1304 < 1024 && Static338.anInt5777 < 768) {
				local194 = true;
			} else {
				local194 = false;
			}
		}
		if (arg0) {
			Static433.method5712();
		} else {
			Static392.aCanvas5.setSize(Static69.anInt1304, Static338.anInt5777);
			Static185.aClass34_7.method5735(Static392.aCanvas5);
			if (Static411.aFrame2 == local98) {
				local74 = Static411.aFrame2.getInsets();
				Static392.aCanvas5.setLocation(local74.left + Static335.anInt5705, Static51.anInt869 + local74.top);
			} else {
				Static392.aCanvas5.setLocation(Static335.anInt5705, Static51.anInt869);
			}
		}
		if (arg4 < 2) {
			Static196.aBoolean739 = false;
		} else {
			Static196.aBoolean739 = true;
		}
		if (Static207.anInt6026 != -1) {
			Static336.method4513(true);
		}
		if (Static395.aClass131_3 != null && Static247.method3528(Static312.anInt5414)) {
			Static107.method1707();
		}
		for (local151 = 0; local151 < 100; local151++) {
			Static369.aBooleanArray23[local151] = true;
		}
		Static388.aBoolean709 = true;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	public static void method3797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 != null && local7.aClass25_Sub2_2 != null) {
			local7.aClass25_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)V")
	public static void method3798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static427.anInt7214 <= arg5 - arg2 && Static434.anInt7302 >= arg5 + arg2 && arg3 - arg2 >= Static289.anInt5053 && arg3 + arg2 <= Static93.anInt1676) {
			Static301.method4122(arg2, arg1, arg0, arg4, arg3, arg5);
		} else {
			Static376.method4977(arg4, arg0, arg2, arg3, arg1, arg5);
		}
	}
}
