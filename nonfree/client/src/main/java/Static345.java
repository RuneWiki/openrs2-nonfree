import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!vk", name = "J", descriptor = "Z")
	public static boolean aBoolean600 = false;

	@OriginalMember(owner = "client!vk", name = "M", descriptor = "[I")
	public static final int[] anIntArray512 = new int[500];

	@OriginalMember(owner = "client!vk", name = "O", descriptor = "[Lclient!gr;")
	public static final Class84[] aClass84Array2 = new Class84[14];

	@OriginalMember(owner = "client!vk", name = "Q", descriptor = "[I")
	public static final int[] anIntArray513 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!vk", name = "V", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_56 = new Class107(8);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZIIIII)V")
	public static void method5621(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(31) int local31 = arg4 - 334;
		if (local31 < 0) {
			local31 = 0;
		} else if (local31 > 100) {
			local31 = 100;
		}
		@Pc(53) int local53 = (Static94.aShort31 - Static301.aShort80) * local31 / 100 + Static301.aShort80;
		if (local53 < Static81.aShort29) {
			local53 = Static81.aShort29;
		} else if (local53 > Static260.aShort73) {
			local53 = Static260.aShort73;
		}
		@Pc(83) int local83 = arg4 * local53 * 512 / (arg3 * 334);
		@Pc(116) int local116;
		@Pc(123) int local123;
		@Pc(91) short local91;
		if (Static270.aShort74 > local83) {
			local91 = Static270.aShort74;
			local53 = arg3 * local91 * 334 / (arg4 * 512);
			if (local53 > Static260.aShort73) {
				local53 = Static260.aShort73;
				local116 = local53 * 512 * arg4 / (local91 * 334);
				local123 = (arg3 - local116) / 2;
				if (arg0) {
					Static51.aClass37_1.method3709();
					Static51.aClass37_1.method3694(local123, -16777216, arg4, arg1, arg2);
					Static51.aClass37_1.method3694(local123, -16777216, arg4, arg3 + arg1 - local123, arg2);
				}
				arg1 += local123;
				arg3 -= local123 * 2;
			}
		} else if (local83 > Static50.aShort11) {
			local91 = Static50.aShort11;
			local53 = arg3 * 334 * local91 / (arg4 * 512);
			if (local53 < Static81.aShort29) {
				local53 = Static81.aShort29;
				local116 = local91 * arg3 * 334 / (local53 * 512);
				local123 = (arg4 - local116) / 2;
				if (arg0) {
					Static51.aClass37_1.method3709();
					Static51.aClass37_1.method3694(arg3, -16777216, local123, arg1, arg2);
					Static51.aClass37_1.method3694(arg3, -16777216, local123, arg1, arg4 + arg2 - local123);
				}
				arg2 += local123;
				arg4 -= local123 * 2;
			}
		}
		Static124.anInt2617 = local53 * arg4 / 334;
		Static300.anInt5980 = (short) arg3;
		Static297.anInt5864 = arg2;
		Static113.anInt2395 = (short) arg4;
		Static104.anInt2182 = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIIBI)V")
	public static void method5622(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1) {
			Static213.method3997();
		}
		if (Static229.aFrame3 != null && (arg0 != 3 || Static128.anInt2762 != arg4 || arg2 != Static218.anInt4842)) {
			Static155.method3199(Static229.aFrame3, Static62.aClass179_2);
			Static229.aFrame3 = null;
		}
		if (arg0 == 3 && Static229.aFrame3 == null) {
			Static229.aFrame3 = Static281.method4796(0, arg2, Static62.aClass179_2, arg4);
			if (Static229.aFrame3 != null) {
				Static218.anInt4842 = arg2;
				Static128.anInt2762 = arg4;
				Static167.method3337(Static62.aClass179_2);
			}
		}
		if (arg0 == 3 && Static229.aFrame3 == null) {
			method5622(Static313.anInt6146, true, -1, arg3, -1);
			return;
		}
		@Pc(94) Container local94;
		@Pc(72) Insets local72;
		if (Static229.aFrame3 != null) {
			Static38.anInt556 = arg2;
			Static286.anInt5753 = arg4;
			local94 = Static229.aFrame3;
		} else if (Static291.aFrame4 == null) {
			local94 = Static62.aClass179_2.anApplet1;
			Static286.anInt5753 = local94.getSize().width;
			Static38.anInt556 = local94.getSize().height;
		} else {
			local72 = Static291.aFrame4.getInsets();
			Static286.anInt5753 = Static291.aFrame4.getSize().width - local72.right - local72.left;
			Static38.anInt556 = Static291.aFrame4.getSize().height - local72.bottom - local72.top;
			local94 = Static291.aFrame4;
		}
		@Pc(132) int local132;
		if (arg0 == 1) {
			Static10.anInt185 = (Static286.anInt5753 - Static2.anInt54) / 2;
			Static25.anInt396 = Static30.anInt482;
			Static177.anInt3977 = 0;
			Static335.anInt6496 = Static2.anInt54;
		} else if (Static147.anInt3175 < 96 && Static114.anInt2421 == 0) {
			local132 = Static286.anInt5753 > 1024 ? 1024 : Static286.anInt5753;
			@Pc(141) int local141 = Static38.anInt556 <= 768 ? Static38.anInt556 : 768;
			Static10.anInt185 = (Static286.anInt5753 - local132) / 2;
			Static335.anInt6496 = local132;
			Static25.anInt396 = local141;
			Static177.anInt3977 = 0;
		} else {
			Static335.anInt6496 = Static286.anInt5753;
			Static25.anInt396 = Static38.anInt556;
			Static177.anInt3977 = 0;
			Static10.anInt185 = 0;
		}
		if (Static260.anInt5453 != 0) {
			@Pc(189) boolean local189;
			if (Static335.anInt6496 < 1024 && Static25.anInt396 < 768) {
				local189 = true;
			} else {
				local189 = false;
			}
		}
		if (arg1) {
			Static212.method3988(Static114.anInt2421);
		} else {
			Static95.aCanvas3.setSize(Static335.anInt6496, Static25.anInt396);
			if (Static51.aClass37_1 != null) {
				Static51.aClass37_1.method3721();
			}
			if (local94 == Static291.aFrame4) {
				local72 = Static291.aFrame4.getInsets();
				Static95.aCanvas3.setLocation(local72.left + Static10.anInt185, local72.top + Static177.anInt3977);
			} else {
				Static95.aCanvas3.setLocation(Static10.anInt185, Static177.anInt3977);
			}
		}
		if (arg0 >= 2) {
			Static164.aBoolean325 = true;
		} else {
			Static164.aBoolean325 = false;
		}
		if (Static269.anInt6658 != -1) {
			Static205.method3918(true);
		}
		if (Static129.aClass117_2 != null && (Static176.anInt3971 == 30 || Static176.anInt3971 == 25)) {
			Static227.method4205();
		}
		for (local132 = 0; local132 < 100; local132++) {
			Static269.aBooleanArray29[local132] = true;
		}
		Static266.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
	public static void method5624() {
		for (@Pc(20) Class57_Sub3 local20 = (Class57_Sub3) Static319.aClass193_9.method5225(); local20 != null; local20 = (Class57_Sub3) Static319.aClass193_9.method5225()) {
			Static121.method2359(local20);
		}
		@Pc(41) int local41;
		@Pc(39) int local39;
		if (Static230.method4872()) {
			local39 = 3;
			local41 = 0;
		} else {
			local39 = Static30.anInt483;
			local41 = Static30.anInt483;
		}
		Static46.method892();
		for (@Pc(50) int local50 = local41; local50 <= local39; local50++) {
			Static46.method888();
			Static46.method895(local50);
			Static46.method891(local50);
		}
		Static46.method880();
		Static46.method894();
	}
}
