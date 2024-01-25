import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "[[Lclient!fd;")
	public static Class72[][] aClass72ArrayArray1;

	@OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
	public static int anInt3546;

	@OriginalMember(owner = "client!kj", name = "V", descriptor = "Lclient!vm;")
	public static Class92 aClass92_6;

	@OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
	public static int anInt3553 = 2;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!tm;Lclient!tm;I)V")
	public static void method3052(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class4_Sub1 arg1) {
		if (arg0.aClass4_Sub1_62 != null) {
			arg0.method5555();
		}
		arg0.aClass4_Sub1_62 = arg1;
		arg0.aClass4_Sub1_61 = arg1.aClass4_Sub1_61;
		arg0.aClass4_Sub1_62.aClass4_Sub1_61 = arg0;
		arg0.aClass4_Sub1_61.aClass4_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)V")
	public static void method3053(@OriginalArg(1) int arg0) {
		@Pc(10) Class53 local10 = Static98.aClass53_3;
		synchronized (Static98.aClass53_3) {
			Static93.anInt2052 = arg0;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIII)V")
	public static void method3054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class4_Sub37 local6 = (Class4_Sub37) Static307.aClass130_81.method3499(); local6 != null; local6 = (Class4_Sub37) Static307.aClass130_81.method3512()) {
			Static84.method1499(local6, arg1, arg0, arg2, arg3);
		}
		for (@Pc(31) Class4_Sub37 local31 = (Class4_Sub37) Static182.aClass130_85.method3499(); local31 != null; local31 = (Class4_Sub37) Static182.aClass130_85.method3512()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class10 local40 = local31.aClass2_Sub2_Sub1_Sub2_1.method5428();
			if (local31.aClass2_Sub2_Sub1_Sub2_1.aBoolean569) {
				local35 = 0;
			} else if (local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 == local40.anInt247 || local40.anInt211 == local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 || local40.anInt234 == local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 || local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 == local40.anInt239) {
				local35 = 2;
			} else if (local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 == local40.anInt248 || local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 == local40.anInt224 || local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 == local40.anInt238 || local31.aClass2_Sub2_Sub1_Sub2_1.anInt6540 == local40.anInt208) {
				local35 = 3;
			}
			if (local31.anInt6037 != local35) {
				@Pc(131) int local131 = Static125.method5100(local31.aClass2_Sub2_Sub1_Sub2_1);
				if (local131 != local31.anInt6030) {
					if (local31.aClass4_Sub13_Sub1_2 != null) {
						Static337.aClass4_Sub13_Sub2_2.method2499(local31.aClass4_Sub13_Sub1_2);
						local31.aClass4_Sub13_Sub1_2 = null;
					}
					local31.anInt6030 = local131;
				}
				local31.anInt6037 = local35;
			}
			local31.anInt6033 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt6465;
			local31.anInt6022 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt6465 + local31.aClass2_Sub2_Sub1_Sub2_1.method5425() * 64;
			local31.anInt6024 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt6466;
			local31.anInt6026 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt6466 + local31.aClass2_Sub2_Sub1_Sub2_1.method5425() * 64;
			Static84.method1499(local31, arg1, arg0, arg2, arg3);
		}
		for (@Pc(209) Class4_Sub37 local209 = (Class4_Sub37) Static124.aClass198_23.method5268(); local209 != null; local209 = (Class4_Sub37) Static124.aClass198_23.method5263()) {
			@Pc(213) byte local213 = 1;
			@Pc(218) Class10 local218 = local209.aClass2_Sub2_Sub1_Sub1_2.method5428();
			if (local209.aClass2_Sub2_Sub1_Sub1_2.aBoolean569) {
				local213 = 0;
			} else if (local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540 == local218.anInt247 || local218.anInt211 == local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540 || local218.anInt234 == local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540 || local218.anInt239 == local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540) {
				local213 = 2;
			} else if (local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540 == local218.anInt248 || local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540 == local218.anInt224 || local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540 == local218.anInt238 || local218.anInt208 == local209.aClass2_Sub2_Sub1_Sub1_2.anInt6540) {
				local213 = 3;
			}
			if (local209.anInt6037 != local213) {
				@Pc(313) int local313 = Static225.method3867(local209.aClass2_Sub2_Sub1_Sub1_2);
				if (local209.anInt6030 != local313) {
					if (local209.aClass4_Sub13_Sub1_2 != null) {
						Static337.aClass4_Sub13_Sub2_2.method2499(local209.aClass4_Sub13_Sub1_2);
						local209.aClass4_Sub13_Sub1_2 = null;
					}
					local209.anInt6030 = local313;
				}
				local209.anInt6037 = local213;
			}
			local209.anInt6033 = local209.aClass2_Sub2_Sub1_Sub1_2.anInt6465;
			local209.anInt6022 = local209.aClass2_Sub2_Sub1_Sub1_2.anInt6465 + local209.aClass2_Sub2_Sub1_Sub1_2.method5425() * 64;
			local209.anInt6024 = local209.aClass2_Sub2_Sub1_Sub1_2.anInt6466;
			local209.anInt6026 = local209.aClass2_Sub2_Sub1_Sub1_2.anInt6466 + local209.aClass2_Sub2_Sub1_Sub1_2.method5425() * 64;
			Static84.method1499(local209, arg1, arg0, arg2, arg3);
		}
	}
}
