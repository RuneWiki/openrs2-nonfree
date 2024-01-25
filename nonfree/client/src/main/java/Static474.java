import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
	public static boolean method6817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static719.method9569(arg0, arg1) | (arg1 & 0x800) != 0 || Static400.method5898(arg1, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BC)Ljava/lang/String;")
	public static String method6818(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(19) int local19 = arg0.length();
		@Pc(21) int local21 = local8;
		@Pc(25) int local25 = local19 - 1;
		if (local25 != 0) {
			@Pc(32) int local32 = 0;
			while (true) {
				local32 = arg1.indexOf(13, local32);
				if (local32 < 0) {
					break;
				}
				local32++;
				local21 += local25;
			}
		}
		@Pc(54) StringBuffer local54 = new StringBuffer(local21);
		@Pc(56) int local56 = 0;
		while (true) {
			@Pc(61) int local61 = arg1.indexOf(13, local56);
			if (local61 < 0) {
				local54.append(arg1.substring(local56));
				return local54.toString();
			}
			local54.append(arg1.substring(local56, local61));
			local56 = local61 + 1;
			local54.append(arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)Lclient!sj;")
	public static Class4_Sub2_Sub1_Sub2 method6819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class311 local13 = Static632.aClass311ArrayArrayArray3[arg2][arg1][arg0];
		if (local13 == null) {
			return null;
		}
		@Pc(20) Class4_Sub2_Sub1_Sub2 local20 = null;
		@Pc(30) int local30 = -1;
		for (@Pc(33) Class142 local33 = local13.aClass142_2; local33 != null; local33 = local33.aClass142_1) {
			@Pc(37) Class4_Sub2_Sub1 local37 = local33.aClass4_Sub2_Sub1_1;
			if (local37 instanceof Class4_Sub2_Sub1_Sub2) {
				@Pc(43) Class4_Sub2_Sub1_Sub2 local43 = (Class4_Sub2_Sub1_Sub2) local37;
				@Pc(53) int local53 = (local43.method2046() - 1) * 256 + 252;
				@Pc(60) int local60 = local43.anInt10229 - local53 >> 9;
				@Pc(68) int local68 = local43.anInt10228 - local53 >> 9;
				@Pc(76) int local76 = local43.anInt10229 + local53 >> 9;
				@Pc(83) int local83 = local53 + local43.anInt10228 >> 9;
				if (arg1 >= local60 && arg0 >= local68 && local76 >= arg1 && arg0 <= local83) {
					@Pc(119) int local119 = (local76 + 1 - arg1) * (-arg0 + (local83 - -1));
					if (local119 > local30) {
						local30 = local119;
						local20 = local43;
					}
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method6820(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub6_Sub12 local17 = Static636.method8647(17, (long) arg0);
		local17.method6245();
	}
}
