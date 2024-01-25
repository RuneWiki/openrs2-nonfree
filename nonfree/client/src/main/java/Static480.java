import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!td;")
	public static Class24 aClass24_27;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!wk;")
	public static final Class374 aClass374_4 = new Class374();

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!wg;")
	public static final Class372 aClass372_14 = new Class372();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILclient!kw;)Lclient!of;")
	public static Class76_Sub3_Sub1 method7172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub2 arg3) {
		if (arg3.aBoolean379 || Static323.method5278(arg2) && Static323.method5278(arg1)) {
			return new Class76_Sub3_Sub1(arg3, 3553, arg0, arg2, arg1);
		} else if (arg3.aBoolean384) {
			return new Class76_Sub3_Sub1(arg3, 34037, arg0, arg2, arg1);
		} else {
			return new Class76_Sub3_Sub1(arg3, arg0, arg2, arg1, Static109.method2234(arg2), Static109.method2234(arg1));
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!o;I)V")
	public static void method7173(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.aClass4_Sub1_Sub2_Sub1_1 = null;
		if (Static166.anInt3238 < 20) {
			Static232.aClass120_3.method2960(arg0);
			Static166.anInt3238++;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIIII)V")
	public static void method7175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static110.anInt3020 / (float) Static110.anInt3019;
		@Pc(17) int local17 = arg2;
		@Pc(19) int local19 = arg1;
		if (local9 < 1.0F) {
			local19 = (int) ((float) arg2 * local9);
		} else {
			local17 = (int) ((float) arg1 / local9);
		}
		@Pc(46) int local46 = arg3 - (arg1 - local19) / 2;
		@Pc(55) int local55 = arg0 - (arg2 - local17) / 2;
		Static632.anInt10105 = -1;
		Static561.anInt9391 = Static110.anInt3020 - Static110.anInt3020 * local46 / local19;
		Static380.anInt7101 = -1;
		Static365.anInt6941 = Static110.anInt3019 * local55 / local17;
		Static509.method7605();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	public static int method7176() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static205.aClass138_2.aBoolean276 && !Static205.aClass138_2.aBoolean278) {
			if (Static211.aString44.startsWith("win")) {
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
			local7 = true;
		}
		if (Static537.aBoolean655) {
			local9 = false;
		}
		if (Static121.aBoolean174) {
			local7 = false;
		}
		if (Static14.aBoolean58) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static279.method4519();
		}
		@Pc(54) int local54 = -1;
		@Pc(56) int local56 = -1;
		@Pc(58) int local58 = -1;
		if (local7) {
			try {
				local54 = Static602.method8408(1000, 2);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (local11) {
			try {
				local58 = Static602.method8408(1000, 3);
				if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 3) {
					@Pc(86) Class103 local86 = Static323.aClass5_9.method7569();
					@Pc(91) long local91 = local86.aLong70 & 0xFFFFFFFFFFFFL;
					@Pc(94) int local94 = local86.anInt2908;
					if (local94 == 4318) {
						local9 &= local91 >= 64425238954L;
					} else if (local94 == 4098) {
						local9 &= local91 >= 60129613779L;
					}
				}
			} catch (@Pc(128) Exception local128) {
			}
		}
		if (local9) {
			try {
				local56 = Static602.method8408(1000, 1);
			} catch (@Pc(138) Exception local138) {
			}
		}
		if (local54 == -1 && local56 == -1 && local58 == -1) {
			return Static279.method4519();
		}
		local56 = (int) ((float) local56 * 1.1F);
		local58 = (int) ((float) local58 * 1.1F);
		if (local58 < local54 && local54 > local56) {
			return Static36.method1268(local54);
		} else if (local56 >= local58) {
			return Static354.method5838(local56, 1);
		} else {
			return Static354.method5838(local58, 3);
		}
	}
}
