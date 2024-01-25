import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
	public static int anInt1417;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	public static int anInt1412 = 0;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public static int anInt1413 = 0;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_26 = new Class263(100, 4);

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "Lclient!dw;")
	public static final Class65 aClass65_1 = new Class65("", 11);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIII)V")
	public static void method998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg0, 10);
		local8.method2957();
		local8.anInt3820 = arg3;
		local8.anInt3819 = arg2;
		local8.anInt3823 = arg1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)V")
	public static void method1000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 + Static278.anInt5374;
		@Pc(20) int local20 = arg1 + Static380.anInt6896;
		if (Static67.aClass252ArrayArrayArray2 == null || arg0 < 0 || arg1 < 0 || arg0 >= Static209.anInt4283 || Static211.anInt4295 <= arg1) {
			return;
		}
		@Pc(47) long local47 = (long) (local15 | local20 << 14 | arg2 << 28);
		@Pc(53) Class1_Sub14 local53 = (Class1_Sub14) Static156.aClass38_16.method765(local47);
		if (local53 == null) {
			Static371.method5181(arg2, arg0, arg1);
			return;
		}
		@Pc(67) Class1_Sub21 local67 = (Class1_Sub21) local53.aClass203_9.method4548();
		if (local67 == null) {
			Static371.method5181(arg2, arg0, arg1);
			return;
		}
		@Pc(81) Class30_Sub5_Sub1 local81 = (Class30_Sub5_Sub1) Static371.method5181(arg2, arg0, arg1);
		if (local81 == null) {
			local81 = new Class30_Sub5_Sub1();
		} else {
			local81.anInt6417 = local81.anInt6421 = -1;
		}
		local81.anInt6415 = local67.anInt3508;
		local81.anInt6413 = local67.anInt3507;
		label46: while (true) {
			@Pc(108) Class1_Sub21 local108 = (Class1_Sub21) local53.aClass203_9.method4545();
			if (local108 == null) {
				break;
			}
			if (local108.anInt3507 != local81.anInt6413) {
				local81.anInt6423 = local108.anInt3508;
				local81.anInt6417 = local108.anInt3507;
				while (true) {
					@Pc(133) Class1_Sub21 local133 = (Class1_Sub21) local53.aClass203_9.method4545();
					if (local133 == null) {
						break label46;
					}
					if (local133.anInt3507 != local81.anInt6413 && local81.anInt6417 != local133.anInt3507) {
						local81.anInt6421 = local133.anInt3507;
						local81.anInt6419 = local133.anInt3508;
					}
				}
			}
		}
		@Pc(174) int local174 = Static227.method3475((arg0 << 7) + 64, (arg1 << 7) + 64, arg2);
		Static284.method2363(arg2, arg0, arg1, local174, local81);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BZ)V")
	public static void method1003(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) Class1_Sub22 local8 = (Class1_Sub22) Static30.aClass203_4.method4548(); local8 != null; local8 = (Class1_Sub22) Static30.aClass203_4.method4545()) {
			if (local8.aClass1_Sub19_Sub4_3 != null) {
				Static12.aClass1_Sub19_Sub2_1.method3181(local8.aClass1_Sub19_Sub4_3);
				local8.aClass1_Sub19_Sub4_3 = null;
			}
			if (local8.aClass1_Sub19_Sub4_4 != null) {
				Static12.aClass1_Sub19_Sub2_1.method3181(local8.aClass1_Sub19_Sub4_4);
				local8.aClass1_Sub19_Sub4_4 = null;
			}
			local8.method6178();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class1_Sub22 local54 = (Class1_Sub22) Static262.aClass203_17.method4548(); local54 != null; local54 = (Class1_Sub22) Static262.aClass203_17.method4545()) {
			if (local54.aClass1_Sub19_Sub4_3 != null) {
				Static12.aClass1_Sub19_Sub2_1.method3181(local54.aClass1_Sub19_Sub4_3);
				local54.aClass1_Sub19_Sub4_3 = null;
			}
			local54.method6178();
		}
		for (@Pc(80) Class1_Sub22 local80 = (Class1_Sub22) Static155.aClass38_15.method767(); local80 != null; local80 = (Class1_Sub22) Static155.aClass38_15.method773()) {
			if (local80.aClass1_Sub19_Sub4_3 != null) {
				Static12.aClass1_Sub19_Sub2_1.method3181(local80.aClass1_Sub19_Sub4_3);
				local80.aClass1_Sub19_Sub4_3 = null;
			}
			local80.method6178();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public static void method1005() {
		Static293.aClass68ArrayArray4 = new Class68[Static311.aClass211_73.method4751()][];
		Static181.aClass68ArrayArray3 = new Class68[Static311.aClass211_73.method4751()][];
		Static412.aBooleanArray24 = new boolean[Static311.aClass211_73.method4751()];
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([Lclient!ec;ZIIII)V")
	public static void method1008(@OriginalArg(0) Class68[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(20) Class68 local20 = arg0[local15];
			if (local20 != null && local20.anInt2129 == arg3) {
				Static26.method558(local20, arg1, arg2, arg4);
				Static45.method858(local20, arg2, arg4);
				if (local20.anInt2130 - local20.anInt2107 < local20.anInt2124) {
					local20.anInt2124 = local20.anInt2130 - local20.anInt2107;
				}
				if (local20.anInt2122 - local20.anInt2149 < local20.anInt2125) {
					local20.anInt2125 = local20.anInt2122 - local20.anInt2149;
				}
				if (local20.anInt2124 < 0) {
					local20.anInt2124 = 0;
				}
				if (local20.anInt2125 < 0) {
					local20.anInt2125 = 0;
				}
				if (local20.anInt2153 == 0) {
					Static238.method3609(local20, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZI)V")
	public static void method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static110.aByteArrayArrayArray20 = new byte[4][arg1][arg0];
	}
}
