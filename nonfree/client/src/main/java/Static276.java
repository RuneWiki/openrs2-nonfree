import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[Lclient!aca;")
	public static Interface1[] anInterface1Array2;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_54 = new Class286(36, 8);

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "[I")
	public static final int[] anIntArray213 = new int[1];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)[Lclient!ju;")
	public static Class180[] method3093() {
		return new Class180[] { Static193.aClass180_1, Static193.aClass180_2, Static193.aClass180_3, Static193.aClass180_4, Static193.aClass180_5, Static193.aClass180_6, Static193.aClass180_7, Static193.aClass180_8, Static193.aClass180_9, Static193.aClass180_10, Static193.aClass180_11, Static193.aClass180_12, Static193.aClass180_13, Static193.aClass180_14 };
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method3094(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static573.aBoolean715) {
			try {
				@Pc(20) Class195 local20 = (Class195) Class.forName("Class195_Sub1").getDeclaredConstructor().newInstance();
				local20.method5290(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static573.aBoolean715 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;Lclient!es;)I")
	public static int method3095(@OriginalArg(1) String arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		@Pc(11) int local11 = arg1.anInt5241;
		@Pc(15) byte[] local15 = Static229.method3602(arg0);
		arg1.method4286(local15.length);
		arg1.anInt5241 += Static99.aClass92_1.method1749(local15.length, arg1.anInt5241, arg1.aByteArray62, local15, 0);
		return arg1.anInt5241 - local11;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lclient!cj;")
	public static Class55 method3098(@OriginalArg(0) int arg0) {
		@Pc(10) Class55 local10 = (Class55) Static482.aClass313_48.method6989((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static391.aClass259_124.method5985(arg0, 0);
		local10 = new Class55();
		if (local20 != null) {
			local10.method1030(new Class2_Sub15(local20), arg0);
		}
		Static482.aClass313_48.method6980((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[IIII)V")
	public static void method3099(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg0--;
		@Pc(16) int local16 = arg3 - 1;
		@Pc(19) int local19 = local16 - 7;
		while (arg0 < local19) {
			@Pc(23) int local23 = arg0 + 1;
			arg1[local23] = arg2;
			@Pc(28) int local28 = local23 + 1;
			arg1[local28] = arg2;
			@Pc(33) int local33 = local28 + 1;
			arg1[local33] = arg2;
			@Pc(38) int local38 = local33 + 1;
			arg1[local38] = arg2;
			@Pc(43) int local43 = local38 + 1;
			arg1[local43] = arg2;
			@Pc(48) int local48 = local43 + 1;
			arg1[local48] = arg2;
			@Pc(53) int local53 = local48 + 1;
			arg1[local53] = arg2;
			arg0 = local53 + 1;
			arg1[arg0] = arg2;
		}
		while (arg0 < local16) {
			arg0++;
			arg1[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIZ)I")
	public static int method3100(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub23 local8 = Static124.method1801(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && local8.anIntArray234.length > arg0) {
			return local8.anIntArray234[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!qi;Lclient!bda;ILclient!ac;III)V")
	public static void method3101(@OriginalArg(1) Class6_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) Class32 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub1_Sub1_Sub1_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub39 local7 = new Class2_Sub39();
		local7.anInt7745 = arg5 << 9;
		local7.anInt7753 = arg6;
		local7.anInt7751 = arg4 << 9;
		if (arg1 != null) {
			local7.aClass32_1 = arg1;
			@Pc(40) int local40 = arg1.anInt788;
			@Pc(43) int local43 = arg1.anInt793;
			if (arg2 == 1 || arg2 == 3) {
				local40 = arg1.anInt793;
				local43 = arg1.anInt788;
			}
			local7.anInt7748 = arg5 + local43 << 9;
			local7.anInt7747 = arg1.anInt806 << 9;
			local7.anInt7743 = arg1.anInt804;
			local7.aBoolean611 = arg1.aBoolean54;
			local7.anIntArray514 = arg1.anIntArray46;
			local7.anInt7744 = arg1.anInt824;
			local7.anInt7749 = local40 + arg4 << 9;
			local7.anInt7754 = arg1.anInt777;
			local7.aBoolean609 = arg1.aBoolean52;
			local7.anInt7741 = arg1.anInt825;
			if (arg1.anIntArray50 != null) {
				local7.aBoolean610 = true;
				local7.method6368();
			}
			if (local7.anIntArray514 != null) {
				local7.anInt7752 = local7.anInt7743 + (int) ((double) (local7.anInt7741 - local7.anInt7743) * Math.random());
			}
			Static418.aClass8_45.method212(local7);
		} else if (arg3 != null) {
			local7.aClass6_Sub1_Sub1_Sub1_Sub1_2 = arg3;
			@Pc(147) Class86 local147 = arg3.aClass86_1;
			if (local147.anIntArray136 != null) {
				local7.aBoolean610 = true;
				local147 = local147.method1567(Static70.aClass78_1);
			}
			if (local147 != null) {
				local7.anInt7748 = local147.anInt2152 + arg5 << 9;
				local7.anInt7749 = local147.anInt2152 + arg4 << 9;
				local7.anInt7744 = Static505.method7026(arg3);
				local7.anInt7747 = local147.anInt2165 << 9;
				local7.aBoolean611 = local147.aBoolean194;
				local7.anInt7754 = local147.anInt2131;
			}
			Static33.aClass8_2.method212(local7);
		} else if (arg0 != null) {
			local7.aClass6_Sub1_Sub1_Sub1_Sub2_1 = arg0;
			local7.anInt7749 = arg0.method6165() + arg4 << 9;
			local7.anInt7748 = arg5 + arg0.method6165() << 9;
			local7.anInt7744 = Static579.method7833(arg0);
			local7.anInt7754 = arg0.anInt7462;
			local7.aBoolean611 = arg0.aBoolean576;
			local7.anInt7747 = arg0.anInt7450 << 9;
			Static175.aClass162_19.method3522(local7, (long) arg0.lb);
		}
	}
}
