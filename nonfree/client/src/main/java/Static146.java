import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!mt;")
	public static final Class162 aClass162_7 = new Class162();

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt2721 = -1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)Lclient!ql;")
	public static Class12_Sub7 method2294(@OriginalArg(0) int arg0) {
		@Pc(7) Class22[] local7 = Class38.aClass22Array3;
		synchronized (Class38.aClass22Array3) {
			@Pc(32) Class12_Sub7 local32;
			if (arg0 >= Class38.aClass22Array3.length || Class38.aClass22Array3[arg0].method282()) {
				local32 = new Class12_Sub7();
				local32.aClass12_Sub5Array1 = new Class12_Sub5[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass12_Sub5Array1[local38] = new Class12_Sub5();
				}
			} else {
				local32 = (Class12_Sub7) Class38.aClass22Array3[arg0].method283();
				local32.method5277();
				@Pc(67) int local67 = Static22.anIntArray37[arg0]--;
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
	public static void method2295(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static97.method1633(arg1 + arg0, Static365.anInt6140, Static221.anInt3917);
		@Pc(36) int local36 = Static97.method1633(arg1 - arg0, Static365.anInt6140, Static221.anInt3917);
		Static349.method5265(local36, local27, arg3, Static325.anIntArrayArray50[arg2]);
		while (local14 > local12) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(92) int local92;
			@Pc(100) int local100;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local68 = arg2 - local14;
				local72 = local14 + arg2;
				if (Static26.anInt345 <= local72 && Static272.anInt4750 >= local68) {
					local92 = Static97.method1633(local12 + arg1, Static365.anInt6140, Static221.anInt3917);
					local100 = Static97.method1633(arg1 - local12, Static365.anInt6140, Static221.anInt3917);
					if (local72 <= Static272.anInt4750) {
						Static349.method5265(local100, local92, arg3, Static325.anIntArrayArray50[local72]);
					}
					if (local68 >= Static26.anInt345) {
						Static349.method5265(local100, local92, arg3, Static325.anIntArrayArray50[local68]);
					}
				}
			}
			local12++;
			local68 = arg2 - local12;
			local72 = arg2 + local12;
			if (local72 >= Static26.anInt345 && local68 <= Static272.anInt4750) {
				local92 = Static97.method1633(local14 + arg1, Static365.anInt6140, Static221.anInt3917);
				local100 = Static97.method1633(arg1 - local14, Static365.anInt6140, Static221.anInt3917);
				if (Static272.anInt4750 >= local72) {
					Static349.method5265(local100, local92, arg3, Static325.anIntArrayArray50[local72]);
				}
				if (local68 >= Static26.anInt345) {
					Static349.method5265(local100, local92, arg3, Static325.anIntArrayArray50[local68]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JIBIZ)Ljava/lang/String;")
	public static String method2297(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg0 < 0L) {
			local22 = true;
			arg0 = -arg0;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(42) int local42;
		@Pc(47) int local47;
		if (arg1 > 0) {
			for (local42 = 0; local42 < arg1; local42++) {
				local47 = (int) arg0;
				arg0 /= 10L;
				local38.append((char) (local47 + 48 - (int) arg0 * 10));
			}
			local38.append(local7);
		}
		local42 = 0;
		while (true) {
			local47 = (int) arg0;
			arg0 /= 10L;
			local38.append((char) (local47 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local22) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg3) {
				local42++;
				if (local42 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method2298() {
		@Pc(16) boolean local16 = Static313.aClass62_18 != null || Static43.anInt778 > 0;
		if (local16) {
			Static247.anInt4442 = 1;
		}
		if (Static282.aBoolean391 && Static322.aClass89_25.method1847(81) && Static105.anInt2076 > 2) {
			if (local16) {
				Static293.aClass3_Sub4_2 = (Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244.aClass3_244;
			} else {
				Static96.method1617((Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244.aClass3_244, Static46.aClass3_Sub33_1.method5156(), Static46.aClass3_Sub33_1.method5157());
			}
		} else if (local16) {
			Static293.aClass3_Sub4_2 = (Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244;
		} else {
			Static96.method1617((Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244, Static46.aClass3_Sub33_1.method5156(), Static46.aClass3_Sub33_1.method5157());
		}
	}
}
