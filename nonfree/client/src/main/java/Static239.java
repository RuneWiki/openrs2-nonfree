import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!os", name = "F", descriptor = "I")
	public static int anInt6274;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "I")
	public static volatile int anInt6269 = 0;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString234 = "Unable to find ";

	@OriginalMember(owner = "client!os", name = "E", descriptor = "Z")
	public static boolean aBoolean430 = false;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
	public static void method5608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(6, arg0);
		local8.method3540();
		local8.anInt3805 = arg1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Lclient!fd;")
	public static Class14_Sub2_Sub6 method5611(@OriginalArg(0) int arg0) {
		@Pc(15) Class14_Sub2_Sub6 local15 = (Class14_Sub2_Sub6) Static93.aClass178_5.method4772((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static26.aClass143_16.method3745(11, arg0);
		local15 = new Class14_Sub2_Sub6();
		if (local27 != null) {
			local15.method2031(new Class14_Sub4(local27));
		}
		Static93.aClass178_5.method4767(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Lclient!fn;ILclient!e;IZIZII[BI)V")
	public static void method5612(@OriginalArg(0) int arg0, @OriginalArg(1) Class65[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class14_Sub4 local10 = new Class14_Sub4(arg9);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method2507();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method2525();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 >> 12;
				@Pc(54) int local54 = local10.method2548();
				@Pc(58) int local58 = local54 >> 2;
				@Pc(62) int local62 = local54 & 0x3;
				if (arg10 == local50 && arg8 <= local46 && arg8 + 8 > local46 && local40 >= arg7 && local40 < arg7 + 8) {
					@Pc(93) Class59 local93 = Static232.method2200(local12);
					@Pc(110) int local110 = Static214.method3856(arg4, local40 & 0x7, local46 & 0x7, local62, local93.anInt1912, local93.anInt1950) + arg6;
					@Pc(128) int local128 = arg2 + Static254.method4386(local93.anInt1950, local40 & 0x7, arg4, local46 & 0x7, local62, local93.anInt1912);
					if (local110 > 0 && local128 > 0 && local110 < Static195.anInt3965 - 1 && Static298.anInt5716 - 1 > local128) {
						@Pc(151) Class65 local151 = null;
						if (!arg5) {
							@Pc(155) int local155 = arg0;
							if ((Static108.aByteArrayArrayArray5[1][local110][local128] & 0x2) == 2) {
								local155 = arg0 - 1;
							}
							if (local155 >= 0) {
								local151 = arg1[local155];
							}
						}
						Static137.method2761(arg5, local151, local110, arg3, local128, true, -1, local58, local62 + arg4 & 0x3, local12, arg0, arg0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V")
	public static void method5614() {
		if (Static289.aBoolean368) {
			return;
		}
		if (Static61.aBoolean94) {
			Static274.aFloat100 = (int) Static274.aFloat100 - 17 & 0xFFFFFFF0;
		} else {
			Static232.aFloat44 += (-12.0F - Static232.aFloat44) / 2.0F;
		}
		Static289.aBoolean368 = true;
		Static72.aBoolean114 = true;
	}
}
