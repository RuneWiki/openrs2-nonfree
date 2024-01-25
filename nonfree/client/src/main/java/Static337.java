import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
	public static int anInt5569;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "Lclient!sw;")
	public static final Class327 aClass327_12 = new Class327(1);

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
	public static int anInt5568 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5081(@OriginalArg(0) String arg0) {
		return Static590.aHashtable6.containsKey(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public static void method5082(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static317.aFloat113 = 3.0F;
		} else if (arg0 == 50) {
			Static317.aFloat113 = 4.0F;
		} else if (arg0 == 75) {
			Static317.aFloat113 = 6.0F;
		} else if (arg0 == 100) {
			Static317.aFloat113 = 8.0F;
		} else if (arg0 == 200) {
			Static317.aFloat113 = 16.0F;
		}
		Static88.anInt1725 = -1;
		Static88.anInt1725 = -1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!jp;I)Lclient!mo;")
	public static Class222 method5084(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(7) int local7 = arg0.method8593();
		@Pc(14) Class356 local14 = Static126.method2369()[arg0.method8632()];
		@Pc(21) Class56 local21 = Static398.method5612()[arg0.method8632()];
		@Pc(25) int local25 = arg0.method8589();
		@Pc(34) int local34 = arg0.method8589();
		return new Class222(local7, local14, local21, local25, local34);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
	public static void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 != 8 && arg4 != 16) {
			@Pc(19) Class164 local19 = Static15.aClass164ArrayArrayArray5[arg1][arg5][arg2];
			if (local19 == null) {
				local19 = new Class164(arg1);
			}
			if (arg4 == 1) {
				local19.aShort47 = (short) arg3;
				local19.aShort46 = (short) arg0;
			} else if (arg4 == 2) {
				local19.aShort49 = (short) arg3;
				local19.aShort48 = (short) arg0;
			}
			if (Static66.aBoolean90) {
				Static309.method4731();
			}
			return;
		}
		@Pc(69) int local69;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(103) int local103;
		if (arg4 != 8) {
			local69 = Static207.anInt4003 + (arg5 << Static391.anInt10262);
			local74 = local69 - Static207.anInt4003;
			local78 = arg2 << Static391.anInt10262;
			local83 = Static207.anInt4003 + local78;
			local91 = Static582.aClass21Array3[arg1].method7973(arg5 + 1, arg2);
			local103 = Static582.aClass21Array3[arg1].method7973(arg5, arg2 + 1);
			Static492.aClass60Array9[Static169.anInt3342++] = new Class60(arg4, arg1, local69, local74, local74, local69, local91, local103, local103 - arg0, -arg0 + local91, local78, local83, local83, local78);
			return;
		}
		local69 = arg5 << Static391.anInt10262;
		local74 = local69 + Static207.anInt4003;
		local78 = arg2 << Static391.anInt10262;
		local83 = local78 + Static207.anInt4003;
		local91 = Static582.aClass21Array3[arg1].method7973(arg5, arg2);
		local103 = Static582.aClass21Array3[arg1].method7973(arg5 + 1, arg2 - -1);
		Static492.aClass60Array9[Static169.anInt3342++] = new Class60(arg4, arg1, local69, local74, local74, local69, local91, local103, local103 - arg0, local91 + -arg0, local78, local83, local83, local78);
	}
}
