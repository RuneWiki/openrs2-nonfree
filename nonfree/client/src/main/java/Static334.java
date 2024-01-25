import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!va", name = "H", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_226 = new Class18(57, -1);

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "[Lclient!np;")
	public static final Class1_Sub4_Sub20[] aClass1_Sub4_Sub20Array5 = new Class1_Sub4_Sub20[14];

	@OriginalMember(owner = "client!va", name = "Ub", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_207 = new Class217(43, -1);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!kg;I)Ljava/lang/String;")
	public static String method5882(@OriginalArg(0) Class112 arg0) {
		if (Static44.method1079(arg0).method5745() == 0) {
			return null;
		} else if (arg0.aString27 == null || arg0.aString27.trim().length() == 0) {
			return Static339.aBoolean444 ? "Hidden-use" : null;
		} else {
			return arg0.aString27;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BIZLclient!fp;[Lclient!th;I)V")
	public static void method5885(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class63 arg3, @OriginalArg(5) Class196[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class1_Sub7 local10 = new Class1_Sub7(arg1);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method2152();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method2134();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local10.method2132();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				@Pc(70) int local70 = local50 + arg5;
				@Pc(74) int local74 = arg0 + local44;
				if (local70 > 0 && local74 > 0 && local70 < Static311.anInt5653 - 1 && Static189.anInt3820 - 1 > local74) {
					@Pc(93) Class196 local93 = null;
					if (!arg2) {
						@Pc(97) int local97 = local54;
						if ((Static264.aByteArrayArrayArray7[1][local70][local74] & 0x2) == 2) {
							local97 = local54 - 1;
						}
						if (local97 >= 0) {
							local93 = arg4[local97];
						}
					}
					Static181.method3454(local70, local54, local16, local74, local93, true, local54, -1, arg3, arg2, local66, local62);
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)Lclient!sd;")
	public static Class13 method5891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 76724863L ^ (long) arg3 * 986053L ^ (long) arg0 * 97549L ^ (long) arg1 * 67481L ^ (long) arg4 * 475427L ^ (long) arg5 * 32147369L;
		@Pc(39) Class13 local39 = (Class13) Static176.aClass21_170.method854(local33);
		if (local39 == null) {
			local39 = Static51.aClass63_2.method4571(arg1, arg0, arg4, arg3, arg5, arg2);
			Static176.aClass21_170.method843(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}
}
