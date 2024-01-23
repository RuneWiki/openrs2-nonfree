import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!fh;")
	public static Class58 aClass58_60;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	public static int anInt2583 = 0;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!ll;")
	public static Class114 aClass114_14 = new Class114();

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!uk;")
	public static Class178 aClass178_11 = new Class178();

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
	public static int[] anIntArray225 = new int[32];

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIILclient!ch;II)V")
	public static void method2019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) long local9 = 0L;
		if (arg4 == 0) {
			local9 = Static174.method2739(arg0, arg5, arg2);
		} else if (arg4 == 1) {
			local9 = Static308.method4776(arg0, arg5, arg2);
		} else if (arg4 == 2) {
			local9 = Static128.method1961(arg0, arg5, arg2);
		} else if (arg4 == 3) {
			local9 = Static150.method2421(arg0, arg5, arg2);
		}
		@Pc(67) int local67 = (int) local9 >> 14 & 0x1F;
		@Pc(74) int local74 = Integer.MAX_VALUE & (int) (local9 >>> 32);
		@Pc(81) int local81 = (int) local9 >> 20 & 0x3;
		@Pc(85) Class184 local85 = Static6.method99(local74);
		if (local85.method4500()) {
			Static141.method4727(arg2, local85, arg0, arg5);
		}
		if (local9 == 0L) {
			return;
		}
		@Pc(105) Class53 local105 = null;
		@Pc(107) Class53 local107 = null;
		if (arg4 == 0) {
			@Pc(117) Class182 local117 = Static151.method2422(arg0, arg5, arg2);
			if (local117 != null) {
				local107 = local117.aClass53_4;
				local105 = local117.aClass53_5;
			}
			if (local85.anInt5510 != 0) {
				arg3.method569(local81, !local85.aBoolean386, arg5, local67, local85.aBoolean375, arg2);
			}
		} else if (arg4 == 1) {
			@Pc(155) Class186 local155 = Static248.method3918(arg0, arg5, arg2);
			if (local155 != null) {
				local105 = local155.aClass53_10;
				local107 = local155.aClass53_9;
			}
		} else if (arg4 == 2) {
			@Pc(173) Class33 local173 = Static161.method2606(arg0, arg5, arg2);
			if (local173 != null) {
				local105 = local173.aClass53_1;
			}
			if (local85.anInt5510 != 0 && arg5 + local85.anInt5528 < 104 && local85.anInt5528 + arg2 < 104 && arg5 + local85.anInt5517 < 104 && local85.anInt5517 + arg2 < 104) {
				arg3.method568(local81, arg2, local85.anInt5517, local85.aBoolean375, arg5, local85.anInt5528, !local85.aBoolean386);
			}
		} else if (arg4 == 3) {
			@Pc(238) Class42 local238 = Static182.method2945(arg0, arg5, arg2);
			if (local238 != null) {
				local105 = local238.aClass53_2;
			}
			if (local85.anInt5510 == 1) {
				arg3.method582(arg5, arg2);
			}
		}
		if (local85.anIntArray631 != null) {
			local85 = local85.method4490();
		}
		if (!Static94.aBoolean138 || local85 == null || !local85.aBoolean373) {
			return;
		}
		if (local67 == 2) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3769();
			} else {
				Static76.method4629(arg5, 0, local81 + 4, arg1, local85, 0, arg2, local67);
			}
			if (local107 instanceof Class53_Sub7) {
				((Class53_Sub7) local107).method3769();
			} else {
				Static76.method4629(arg5, 0, local81 + 1 & 0x3, arg1, local85, 0, arg2, local67);
			}
		} else if (local67 == 5) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3769();
			} else {
				Static76.method4629(arg5, Static169.anIntArray315[local81] * 8, local81, arg1, local85, Static235.anIntArray475[local81] * 8, arg2, 4);
			}
		} else if (local67 == 6) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3769();
			} else {
				Static76.method4629(arg5, Static90.anIntArray166[local81] * 8, local81 + 4, arg1, local85, Static302.anIntArray646[local81] * 8, arg2, 4);
			}
		} else if (local67 == 7) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3769();
			} else {
				Static76.method4629(arg5, 0, (local81 + 2 & 0x3) + 4, arg1, local85, 0, arg2, 4);
			}
		} else if (local67 == 8) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3769();
			} else {
				Static76.method4629(arg5, Static90.anIntArray166[local81] * 8, local81 + 4, arg1, local85, Static302.anIntArray646[local81] * 8, arg2, 4);
			}
			if (local107 instanceof Class53_Sub7) {
				((Class53_Sub7) local107).method3769();
			} else {
				Static76.method4629(arg5, Static90.anIntArray166[local81] * 8, (local81 + 2 & 0x3) + 4, arg1, local85, Static302.anIntArray646[local81] * 8, arg2, 4);
			}
		} else if (local67 == 11) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3769();
			} else {
				Static76.method4629(arg5, 0, local81 + 4, arg1, local85, 0, arg2, 10);
			}
		} else if (local105 instanceof Class53_Sub7) {
			((Class53_Sub7) local105).method3769();
		} else {
			Static76.method4629(arg5, 0, local81, arg1, local85, 0, arg2, local67);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLclient!io;)V")
	public static void method2020(@OriginalArg(1) Class4_Sub13 arg0) {
		Static32.method519(arg0, 200000);
	}
}
