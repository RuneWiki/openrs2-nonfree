import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public static int anInt6440;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!mq;)V")
	public static void method5010(@OriginalArg(1) Class156 arg0) {
		if (Static36.anInt1021 == arg0.anInt4829) {
			Static55.aBooleanArray8[arg0.anInt4857] = true;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZBI)V")
	public static void method5011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static438.aFrame2 != null && (arg2 != 3 || arg0 != Static374.aClass20_Sub1_1.anInt2344 || Static374.aClass20_Sub1_1.anInt2359 != arg1)) {
			Static225.method3375(Static66.aClass143_2, Static438.aFrame2);
			Static438.aFrame2 = null;
		}
		if (arg2 == 3 && Static438.aFrame2 == null) {
			Static438.aFrame2 = Static261.method661(arg1, 0, Static66.aClass143_2, arg0);
			if (Static438.aFrame2 != null) {
				Static374.aClass20_Sub1_1.anInt2344 = arg0;
				Static374.aClass20_Sub1_1.anInt2359 = arg1;
				Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
			}
		}
		if (arg2 == 3 && Static438.aFrame2 == null) {
			method5011(-1, -1, Static374.aClass20_Sub1_1.anInt2353, true, arg4);
			return;
		}
		@Pc(81) Container local81;
		@Pc(93) Insets local93;
		if (Static438.aFrame2 != null) {
			local81 = Static438.aFrame2;
			Static348.anInt5912 = arg1;
			Static301.anInt2468 = arg0;
		} else if (Static10.aFrame1 == null) {
			local81 = Static66.aClass143_2.anApplet1;
			Static301.anInt2468 = local81.getSize().width;
			Static348.anInt5912 = local81.getSize().height;
		} else {
			local93 = Static10.aFrame1.getInsets();
			@Pc(102) int local102 = local93.left + local93.right;
			Static301.anInt2468 = Static10.aFrame1.getSize().width - local102;
			@Pc(110) int local110 = -local93.top;
			Static348.anInt5912 = Static10.aFrame1.getSize().height + local110 - local93.bottom;
			local81 = Static10.aFrame1;
		}
		@Pc(171) int local171;
		if (arg2 == 1) {
			Static163.anInt6305 = (Static301.anInt2468 - Static349.anInt5940) / 2;
			Static123.anInt2625 = Static213.anInt4087;
			Static333.anInt5712 = Static349.anInt5940;
			Static64.anInt1683 = 0;
		} else if (Static286.anInt1448 < 96 && Static105.anInt2382 == 0) {
			local171 = Static301.anInt2468 <= 1024 ? Static301.anInt2468 : 1024;
			Static333.anInt5712 = local171;
			@Pc(180) int local180 = Static348.anInt5912 <= 768 ? Static348.anInt5912 : 768;
			Static163.anInt6305 = (Static301.anInt2468 - local171) / 2;
			Static64.anInt1683 = 0;
			Static123.anInt2625 = local180;
		} else {
			Static333.anInt5712 = Static301.anInt2468;
			Static123.anInt2625 = Static348.anInt5912;
			Static163.anInt6305 = 0;
			Static64.anInt1683 = 0;
		}
		if (Static191.aClass182_6 != Static10.aClass182_1) {
			@Pc(201) boolean local201;
			if (Static333.anInt5712 < 1024 && Static123.anInt2625 < 768) {
				local201 = true;
			} else {
				local201 = false;
			}
		}
		if (arg3) {
			Static1.method6();
		} else {
			Static392.aCanvas6.setSize(Static333.anInt5712, Static123.anInt2625);
			Static121.aClass172_3.method5514(Static392.aCanvas6);
			if (Static10.aFrame1 == local81) {
				local93 = Static10.aFrame1.getInsets();
				Static392.aCanvas6.setLocation(local93.left + Static163.anInt6305, Static64.anInt1683 + local93.top);
			} else {
				Static392.aCanvas6.setLocation(Static163.anInt6305, Static64.anInt1683);
			}
		}
		if (arg2 < 2) {
			Static9.aBoolean15 = false;
		} else {
			Static9.aBoolean15 = true;
		}
		if (Static226.anInt4225 != -1) {
			Static430.method2668(true);
		}
		if (Static88.aClass251_2 != null && (Static120.anInt2584 == 30 || Static120.anInt2584 == 25)) {
			Static104.method1813();
		}
		for (local171 = 0; local171 < 100; local171++) {
			Static55.aBooleanArray8[local171] = true;
		}
		Static180.aBoolean307 = true;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!mq;)Lclient!mq;")
	public static Class156 method5013(@OriginalArg(1) Class156 arg0) {
		if (arg0.anInt4839 != -1) {
			return Static435.method5705(arg0.anInt4839);
		}
		@Pc(18) int local18 = arg0.anInt4850 >>> 16;
		@Pc(23) Class120 local23 = new Class120(Static318.aClass11_42);
		for (@Pc(30) Class3_Sub9 local30 = (Class3_Sub9) local23.method2980(); local30 != null; local30 = (Class3_Sub9) local23.method2979()) {
			if (local30.anInt1804 == local18) {
				return Static435.method5705((int) local30.aLong234);
			}
		}
		return null;
	}
}
