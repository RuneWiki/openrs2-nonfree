import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public static int anInt5648;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
	public static int anInt5649;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public static int anInt5645 = 0;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_49 = new Class87(8);

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIZIILclient!uo;I)V")
	public static void method4842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class32 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface5 local11 = (Interface5) Static352.method5612(arg0, arg7, arg2);
		@Pc(19) Class141 local19;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local11 != null) {
			local19 = Static119.method2548(local11.method4799());
			local25 = local11.method4797() & 0x3;
			local29 = local11.method4794();
			if (local19.anInt4287 == -1) {
				local44 = arg3;
				if (local19.anInt4294 > 0) {
					local44 = arg1;
				}
				if (local29 == 0 || local29 == 2) {
					if (local25 == 0) {
						arg6.method2206(4, local44, arg5, arg4);
					} else if (local25 == 1) {
						arg6.method2157(4, arg5, arg4, local44);
					} else if (local25 == 2) {
						arg6.method2206(4, local44, arg5, arg4 + 3);
					} else if (local25 == 3) {
						arg6.method2157(4, arg5 + 3, arg4, local44);
					}
				}
				if (local29 == 3) {
					if (local25 == 0) {
						arg6.method2191(local44, arg4, 1, arg5, 1);
					} else if (local25 == 1) {
						arg6.method2191(local44, arg4 + 3, 1, arg5, 1);
					} else if (local25 == 2) {
						arg6.method2191(local44, arg4 + 3, 1, arg5 + 3, 1);
					} else if (local25 == 3) {
						arg6.method2191(local44, arg4, 1, arg5 + 3, 1);
					}
				}
				if (local29 == 2) {
					if (local25 == 0) {
						arg6.method2157(4, arg5, arg4, local44);
					} else if (local25 == 1) {
						arg6.method2206(4, local44, arg5, arg4 + 3);
					} else if (local25 == 2) {
						arg6.method2157(4, arg5 + 3, arg4, local44);
					} else if (local25 == 3) {
						arg6.method2206(4, local44, arg5, arg4);
					}
				}
			} else {
				Static213.method4105(arg4, arg5, local19, local25, arg6);
			}
		}
		local11 = (Interface5) Static258.method4649(arg0, arg7, arg2, ol.class);
		if (local11 != null) {
			local19 = Static119.method2548(local11.method4799());
			local25 = local11.method4797() & 0x3;
			local29 = local11.method4794();
			if (local19.anInt4287 != -1) {
				Static213.method4105(arg4, arg5, local19, local25, arg6);
			} else if (local29 == 9) {
				local44 = -1118482;
				if (local19.anInt4294 > 0) {
					local44 = -1179648;
				}
				if (local25 == 0 || local25 == 2) {
					arg6.method2185(arg5, arg4, local44, arg5 + 3, arg4 + 3);
				} else {
					arg6.method2185(arg5 + 3, arg4, local44, arg5, arg4 + 3);
				}
			}
		}
		local11 = (Interface5) Static127.method2619(arg0, arg7, arg2);
		if (local11 == null) {
			return;
		}
		local19 = Static119.method2548(local11.method4799());
		local25 = local11.method4797() & 0x3;
		if (local19.anInt4287 != -1) {
			Static213.method4105(arg4, arg5, local19, local25, arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method4843(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(58) char[] local58 = new char[local34];
		local58[0] = '+';
		for (@Pc(66) int local66 = local34 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 >= 10) {
				local58[local66] = (char) (local81 + 87);
			} else {
				local58[local66] = (char) (local81 + 48);
			}
		}
		return new String(local58);
	}
}
