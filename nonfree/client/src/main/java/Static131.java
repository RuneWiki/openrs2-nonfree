import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public static int anInt2260;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!vp;")
	public static Class254 aClass254_13 = new Class254();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)Z")
	public static boolean method1782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static455.method5635(arg0, arg1) || Static6.method105(arg1, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZIIIZ)V")
	public static void method1783(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static70.aFrame1 != null && (arg2 != 3 || arg0 != Static336.aClass106_Sub1_1.anInt5700 || arg3 != Static336.aClass106_Sub1_1.anInt5683)) {
			Static208.method2803(Static41.aClass124_2, Static70.aFrame1);
			Static70.aFrame1 = null;
		}
		if (arg2 == 3 && Static70.aFrame1 == null) {
			Static70.aFrame1 = Static399.method5009(arg3, arg0, Static41.aClass124_2, 0);
			if (Static70.aFrame1 != null) {
				Static336.aClass106_Sub1_1.anInt5683 = arg3;
				Static336.aClass106_Sub1_1.anInt5700 = arg0;
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
			}
		}
		if (arg2 == 3 && Static70.aFrame1 == null) {
			method1783(-1, true, Static336.aClass106_Sub1_1.anInt5679, -1, arg4);
			return;
		}
		@Pc(102) Container local102;
		@Pc(76) Insets local76;
		if (Static70.aFrame1 != null) {
			Static320.anInt5295 = arg0;
			Static347.anInt5659 = arg3;
			local102 = Static70.aFrame1;
		} else if (Static158.aFrame2 == null) {
			local102 = Static41.aClass124_2.anApplet1;
			Static320.anInt5295 = local102.getSize().width;
			Static347.anInt5659 = local102.getSize().height;
		} else {
			local76 = Static158.aFrame2.getInsets();
			@Pc(82) int local82 = -local76.right;
			Static320.anInt5295 = Static158.aFrame2.getSize().width + local82 - local76.left;
			@Pc(94) int local94 = -local76.bottom;
			Static347.anInt5659 = Static158.aFrame2.getSize().height + local94 - local76.top;
			local102 = Static158.aFrame2;
		}
		@Pc(167) int local167;
		if (arg2 == 1) {
			Static92.anInt1618 = Static96.anInt1679;
			Static126.anInt2202 = Static110.anInt1939;
			Static434.anInt4327 = (Static320.anInt5295 - Static110.anInt1939) / 2;
			Static239.anInt3852 = 0;
		} else if (Static144.anInt2437 < 96 && Static410.anInt6680 == 0) {
			local167 = Static320.anInt5295 > 1024 ? 1024 : Static320.anInt5295;
			Static126.anInt2202 = local167;
			Static434.anInt4327 = (Static320.anInt5295 - local167) / 2;
			@Pc(184) int local184 = Static347.anInt5659 > 768 ? 768 : Static347.anInt5659;
			Static239.anInt3852 = 0;
			Static92.anInt1618 = local184;
		} else {
			Static92.anInt1618 = Static347.anInt5659;
			Static434.anInt4327 = 0;
			Static126.anInt2202 = Static320.anInt5295;
			Static239.anInt3852 = 0;
		}
		if (Static209.aClass166_6 != Static136.aClass166_3) {
			@Pc(198) boolean local198;
			if (Static126.anInt2202 < 1024 && Static92.anInt1618 < 768) {
				local198 = true;
			} else {
				local198 = false;
			}
		}
		if (arg1) {
			Static258.method3270();
		} else {
			Static226.aCanvas9.setSize(Static126.anInt2202, Static92.anInt1618);
			Static213.aClass128_22.method3549(Static226.aCanvas9);
			if (local102 == Static158.aFrame2) {
				local76 = Static158.aFrame2.getInsets();
				Static226.aCanvas9.setLocation(Static434.anInt4327 + local76.left, Static239.anInt3852 + local76.top);
			} else {
				Static226.aCanvas9.setLocation(Static434.anInt4327, Static239.anInt3852);
			}
		}
		if (arg2 < 2) {
			Static32.aBoolean49 = false;
		} else {
			Static32.aBoolean49 = true;
		}
		if (Static169.anInt2522 != -1) {
			Static28.method503(true);
		}
		if (Static48.aClass3_2 != null && (Static98.anInt1721 == 30 || Static98.anInt1721 == 25)) {
			Static326.method4184();
		}
		for (local167 = 0; local167 < 100; local167++) {
			Static145.aBooleanArray15[local167] = true;
		}
		Static107.aBoolean140 = true;
	}
}
