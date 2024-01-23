import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString303;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array11;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "[Lclient!we;")
	public static Class177[] aClass177Array1 = new Class177[6];

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
	public static int[] anIntArray458 = new int[14];

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	public static int anInt5132 = 2;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lclient!cg;")
	public static Class1_Sub11 method4020() {
		@Pc(8) Class1_Sub11 local8 = new Class1_Sub11(34);
		local8.method2655(11);
		local8.method2655(Static285.anInt5431);
		local8.method2655(Static278.aBoolean421 ? 1 : 0);
		local8.method2655(Static223.aBoolean343 ? 1 : 0);
		local8.method2655(Static116.aBoolean450 ? 1 : 0);
		local8.method2655(Static276.aBoolean217 ? 1 : 0);
		local8.method2655(Static209.aBoolean321 ? 1 : 0);
		local8.method2655(Static200.aBoolean310 ? 1 : 0);
		local8.method2655(Static23.aBoolean37 ? 1 : 0);
		local8.method2655(Static199.aBoolean308 ? 1 : 0);
		local8.method2655(anInt5132);
		local8.method2655(Static188.aBoolean295 ? 1 : 0);
		local8.method2655(Static236.aBoolean353 ? 1 : 0);
		local8.method2655(Static129.aBoolean213 ? 1 : 0);
		local8.method2655(Static20.anInt381);
		local8.method2655(Static147.aBoolean236 ? 1 : 0);
		local8.method2655(Static127.anInt2836);
		local8.method2655(Static184.anInt3815);
		local8.method2655(Static119.anInt2761);
		local8.method2660(Static75.anInt1605);
		local8.method2660(Static146.anInt3171);
		local8.method2655(Static235.method3620());
		local8.method2659(Static108.anInt2518);
		local8.method2655(Static296.anInt5585);
		local8.method2655(Static219.aBoolean339 ? 1 : 0);
		local8.method2655(Static19.aBoolean30 ? 1 : 0);
		local8.method2655(Static214.anInt4259);
		local8.method2655(Static134.aBoolean218 ? 1 : 0);
		local8.method2655(Static83.aBoolean132 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([II[J)V")
	public static void method4021(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static109.method2009(arg1.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)[Lclient!kj;")
	public static Class90[] method4022() {
		if (Static291.aClass90Array1 == null) {
			@Pc(8) Class90[] local8 = Static170.method2925(Static253.aClass175_4);
			@Pc(12) Class90[] local12 = new Class90[local8.length];
			@Pc(14) int local14 = 0;
			label52: for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
				@Pc(28) Class90 local28 = local8[local16];
				if ((local28.anInt3056 <= 0 || local28.anInt3056 >= 24) && local28.anInt3054 >= 800 && local28.anInt3047 >= 600) {
					for (@Pc(54) int local54 = 0; local54 < local14; local54++) {
						@Pc(61) Class90 local61 = local12[local54];
						if (local28.anInt3054 == local61.anInt3054 && local28.anInt3047 == local61.anInt3047) {
							if (local61.anInt3056 < local28.anInt3056) {
								local12[local54] = local28;
							}
							continue label52;
						}
					}
					local12[local14] = local28;
					local14++;
				}
			}
			Static291.aClass90Array1 = new Class90[local14];
			Static304.method2611(local12, 0, Static291.aClass90Array1, 0, local14);
			@Pc(106) int[] local106 = new int[Static291.aClass90Array1.length];
			for (@Pc(108) int local108 = 0; local108 < Static291.aClass90Array1.length; local108++) {
				@Pc(116) Class90 local116 = Static291.aClass90Array1[local108];
				local106[local108] = local116.anInt3047 * local116.anInt3054;
			}
			Static181.method3037(local106, Static291.aClass90Array1);
		}
		return Static291.aClass90Array1;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
	public static void method4024() {
		for (@Pc(15) Class1_Sub20 local15 = (Class1_Sub20) Static80.aClass61_3.method1835(); local15 != null; local15 = (Class1_Sub20) Static80.aClass61_3.method1836()) {
			if (local15.anInt3346 > 0) {
				local15.anInt3346--;
			}
			if (local15.anInt3346 != 0) {
				if (local15.anInt3347 > 0) {
					local15.anInt3347--;
				}
				if (local15.anInt3347 == 0 && local15.anInt3353 >= 1 && local15.anInt3341 >= 1 && local15.anInt3353 <= 102 && local15.anInt3341 <= 102 && (local15.anInt3344 < 0 || Static89.method1557(local15.anInt3344, local15.anInt3350))) {
					Static124.method2170(local15.anInt3350, local15.anInt3343, local15.anInt3348, local15.anInt3344, local15.anInt3341, local15.anInt3349, local15.anInt3353);
					local15.anInt3347 = -1;
					if (local15.anInt3344 == local15.anInt3342 && local15.anInt3342 == -1) {
						local15.method4441();
					} else if (local15.anInt3344 == local15.anInt3342 && local15.anInt3348 == local15.anInt3345 && local15.anInt3350 == local15.anInt3352) {
						local15.method4441();
					}
				}
			} else if (local15.anInt3342 < 0 || Static89.method1557(local15.anInt3342, local15.anInt3352)) {
				Static124.method2170(local15.anInt3352, local15.anInt3343, local15.anInt3345, local15.anInt3342, local15.anInt3341, local15.anInt3349, local15.anInt3353);
				local15.method4441();
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
	public static void method4025() {
		if (Static214.aClass52_2 != null) {
			Static214.aClass52_2.method4083();
		}
		if (Static117.aClass52_1 != null) {
			Static117.aClass52_1.method4083();
		}
		Static26.method530(Static147.aBoolean236);
		Static214.aClass52_2 = Static190.method3155(22050, Static156.aCanvas2, Static253.aClass175_4, 0);
		Static214.aClass52_2.method4078(Static164.aClass1_Sub5_Sub2_1);
		Static117.aClass52_1 = Static190.method3155(2048, Static156.aCanvas2, Static253.aClass175_4, 1);
		Static117.aClass52_1.method4078(Static141.aClass1_Sub5_Sub4_1);
	}
}
