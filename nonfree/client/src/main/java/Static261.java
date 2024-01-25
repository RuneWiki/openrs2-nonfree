import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public static int anInt2240;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_13 = new Class156();

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
	public static final int[] anIntArray178 = new int[25];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZII)Z")
	public static boolean method1844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static176.method68(arg1, arg0)) {
			return Static314.method4289(arg1, arg0) | (arg0 & 0xB000) != 0 | Static104.method1553(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static225.method2960(arg1, arg0) | Static289.method3847(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)V")
	public static void method1845(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static26.aClass2_Sub13_Sub2_1.method3619(Static209.anInt3493) >= 15) {
				@Pc(22) int local22 = Static26.aClass2_Sub13_Sub2_1.method3615(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					@Pc(36) Class2_Sub28 local36 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local22);
					@Pc(42) Class3_Sub4_Sub1_Sub1 local42;
					if (local36 == null) {
						local42 = new Class3_Sub4_Sub1_Sub1();
						local42.anInt4915 = local22;
						local36 = new Class2_Sub28(local42);
						Static49.aClass72_11.method1653(local36, (long) local22);
						local29 = true;
						Static332.aClass2_Sub28Array1[Static384.anInt6329++] = local36;
					}
					local42 = local36.aClass3_Sub4_Sub1_Sub1_1;
					Static40.anIntArray84[Static351.anInt5969++] = local22;
					local42.anInt4942 = Static266.anInt4392;
					if (local42.aClass245_1 != null && local42.aClass245_1.method5204()) {
						Static192.method2588(local42);
					}
					@Pc(98) int local98 = Static26.aClass2_Sub13_Sub2_1.method3615(1);
					@Pc(103) int local103 = Static26.aClass2_Sub13_Sub2_1.method3615(2);
					@Pc(108) int local108 = Static26.aClass2_Sub13_Sub2_1.method3615(1);
					if (local108 == 1) {
						Static25.anIntArray41[Static332.anInt5613++] = local22;
					}
					@Pc(128) int local128;
					if (arg0) {
						local128 = Static26.aClass2_Sub13_Sub2_1.method3615(8);
						if (local128 > 127) {
							local128 -= 256;
						}
					} else {
						local128 = Static26.aClass2_Sub13_Sub2_1.method3615(5);
						if (local128 > 15) {
							local128 -= 32;
						}
					}
					@Pc(154) int local154;
					if (arg0) {
						local154 = Static26.aClass2_Sub13_Sub2_1.method3615(8);
						if (local154 > 127) {
							local154 -= 256;
						}
					} else {
						local154 = Static26.aClass2_Sub13_Sub2_1.method3615(5);
						if (local154 > 15) {
							local154 -= 32;
						}
					}
					@Pc(182) int local182 = (Static26.aClass2_Sub13_Sub2_1.method3615(3) + 4 & 0xB8400007) << 11;
					local42.method2629(Static155.aClass263_1.method5581(Static26.aClass2_Sub13_Sub2_1.method3615(14)));
					local42.method4008(local42.aClass245_1.anInt6704);
					local42.anInt4948 = local42.aClass245_1.anInt6705 << 3;
					if (local29) {
						local42.method3999(true, local182);
					}
					local42.method2626(local103, local128 + Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0], local42.method4009(), local154 + Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0], local98 == 1);
					if (local42.aClass245_1.method5204()) {
						Static160.method2246(local42.anIntArray424[0], local42.anIntArray425[0], null, 0, local42, null, local42.aByte91);
					}
					continue;
				}
			}
			Static26.aClass2_Sub13_Sub2_1.method3617();
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ti;Lclient!za;ILclient!vu;IILclient!fk;Z)V")
	public static void method1846(@OriginalArg(0) Class2_Sub40 arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class260 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class78 arg6) {
		@Pc(14) int local14 = arg0.anInt6351 - arg2 / 2 - 5;
		@Pc(18) int local18 = arg4 + 2;
		if (arg6.anInt2139 != 0) {
			arg1.method5545(arg4 + arg3.method5479() * arg5 + 1 - local18, arg6.anInt2139, arg2 + 10, local18, local14);
		}
		if (arg6.anInt2152 != 0) {
			arg1.method5504(arg6.anInt2152, arg2 + 10, local18, arg3.method5479() * arg5 + arg4 + 1 - local18, local14);
		}
		@Pc(69) int local69 = arg6.anInt2167;
		if (arg0.aBoolean455 && arg6.anInt2146 != -1) {
			local69 = arg6.anInt2146;
		}
		for (@Pc(85) int local85 = 0; local85 < arg5; local85++) {
			@Pc(91) String local91 = Static428.aStringArray40[local85];
			if (local85 < arg5 - 1) {
				local91 = local91.substring(0, local91.length() - 4);
			}
			arg3.method5483(arg1, local91, arg0.anInt6351, arg4, local69);
			arg4 += arg3.method5479();
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)Lclient!dq;")
	public static Class56 method1848() {
		try {
			return (Class56) Class.forName("Class56_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BII)I")
	public static int method1849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static318.method4344(arg0 + 45365, 4, arg1 + 91923) + (Static318.method4344(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static318.method4344(arg0, 1, arg1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
