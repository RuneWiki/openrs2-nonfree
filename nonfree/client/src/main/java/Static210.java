import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "[I")
	public static int[] anIntArray575;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public static int anInt4202 = 0;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	public static int anInt4204 = 0;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_40 = new Class103(64);

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Lclient!os;")
	public static Class159 method3747(@OriginalArg(0) int arg0) {
		@Pc(10) Class159 local10 = (Class159) aClass103_40.method2682((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static179.aClass180_49.method4560(arg0, 35);
		local10 = new Class159();
		if (local20 != null) {
			local10.method4102(new Class7_Sub3(local20));
		}
		local10.method4100();
		aClass103_40.method2687(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!oo;Lclient!tj;ILclient!pe;)V")
	public static void method3748(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class7_Sub37 arg1, @OriginalArg(3) Class89 arg2) {
		@Pc(8) Class52 local8 = arg0.method4083(arg2);
		if (local8 == null) {
			return;
		}
		@Pc(14) int local14 = local8.method4124();
		if (local8.method4134() > local14) {
			local14 = local8.method4134();
		}
		@Pc(26) int local26 = arg1.anInt5842;
		@Pc(29) int local29 = arg1.anInt5836;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(49) int local49;
		@Pc(75) int local75;
		if (arg0.aString294 != null) {
			local31 = Static226.aClass208_6.method5373(arg0.aString294, Static96.aStringArray25, null, null);
			for (local49 = 0; local49 < local31; local49++) {
				@Pc(54) String local54 = Static96.aStringArray25[local49];
				if (local49 < local31 - 1) {
					local54 = local54.substring(0, local54.length() - 4);
				}
				local75 = Static12.aClass4_3.method56(local54);
				if (local75 > local33) {
					local33 = local75;
				}
			}
			local35 = local31 * Static12.aClass4_3.method52() + Static12.aClass4_3.method54() / 2;
		}
		local49 = local14 / 2 + arg1.anInt5842;
		if (local26 < Static306.anInt3322 + local14) {
			local26 = Static306.anInt3322;
			local49 = Static306.anInt3322 + local14 / 2 + local33 / 2 + 10 + 5;
		} else if (Static306.anInt3321 - local14 < local26) {
			local49 = Static306.anInt3321 - local14 / 2 - local33 / 2 - 10 - 5;
			local26 = Static306.anInt3321 - local14;
		}
		@Pc(158) int local158 = arg1.anInt5836;
		if (local14 + Static306.anInt3328 > local29) {
			local158 = local14 / 2 + Static306.anInt3328 + 10;
			local29 = Static306.anInt3328;
		} else if (local29 > Static306.anInt3323 - local14) {
			local158 = Static306.anInt3323 - local35 - local14 / 2 - 10;
			local29 = Static306.anInt3323 - local14;
		}
		local75 = (int) (Math.atan2((double) (local26 - arg1.anInt5842), (double) (local29 - arg1.anInt5836)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local8.method4129((float) local14 / 2.0F + (float) local26, (float) local14 / 2.0F + (float) local29, 4096, local75);
		@Pc(242) int local242 = -2;
		@Pc(244) int local244 = -2;
		@Pc(246) int local246 = -2;
		@Pc(248) int local248 = -2;
		local14 >>= 0x1;
		if (arg0.aString294 != null) {
			local242 = local49 - local33 / 2 - 5;
			local244 = local158;
			local246 = local242 + local33 + 10;
			local248 = local31 * Static12.aClass4_3.method52() + local158 + 3;
			if (arg0.anInt4660 != 0) {
				arg2.method5477(local158, local242, local248 - local158, -local242 + local246, arg0.anInt4660);
			}
			if (arg0.anInt4687 != 0) {
				arg2.method5454(local242, local158, arg0.anInt4687, local248 - local158, local246 + -local242);
			}
			for (@Pc(321) int local321 = 0; local321 < local31; local321++) {
				@Pc(326) String local326 = Static96.aStringArray25[local321];
				if (local321 < local31 - 1) {
					local326 = local326.substring(0, local326.length() - 4);
				}
				Static12.aClass4_3.method55(arg2, local326, local49, local158, arg0.anInt4664);
				local158 += Static12.aClass4_3.method52();
			}
		}
		if ((Static240.anInt6396 <= local26 - local14 || Static240.anInt6396 >= local26 + local14 || local29 - local14 >= Static100.anInt2436 || local14 + local29 <= Static100.anInt2436) && (local242 >= Static240.anInt6396 || Static240.anInt6396 >= local246 || Static100.anInt2436 <= local244 || Static100.anInt2436 >= local248)) {
			return;
		}
		if (arg0.aStringArray40[4] != null) {
			Static198.method3544(0, -1, arg0.aStringArray40[4], (long) arg1.anInt5839, arg0.aString295, 1005, 0);
		}
		if (arg0.aStringArray40[3] != null) {
			Static198.method3544(0, -1, arg0.aStringArray40[3], (long) arg1.anInt5839, arg0.aString295, 1007, 0);
		}
		if (arg0.aStringArray40[2] != null) {
			Static198.method3544(0, -1, arg0.aStringArray40[2], (long) arg1.anInt5839, arg0.aString295, 1003, 0);
		}
		if (arg0.aStringArray40[1] != null) {
			Static198.method3544(0, -1, arg0.aStringArray40[1], (long) arg1.anInt5839, arg0.aString295, 1012, 0);
		}
		if (arg0.aStringArray40[0] != null) {
			Static198.method3544(0, -1, arg0.aStringArray40[0], (long) arg1.anInt5839, arg0.aString295, 1001, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3749(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < Static124.anInt2775; local14++) {
			if (arg0.equalsIgnoreCase(Static64.aStringArray15[local14])) {
				return local14;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)V")
	public static void method3750() {
		@Pc(1) Class103 local1 = Static200.aClass103_37;
		synchronized (Static200.aClass103_37) {
			Static200.aClass103_37.method2679(5);
		}
	}
}
