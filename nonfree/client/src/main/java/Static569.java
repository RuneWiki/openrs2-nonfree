import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array15;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString114 = null;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public static int anInt9617 = 0;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z[BILclient!ap;IIII)Lclient!hea;")
	public static Class132_Sub1_Sub1 method8023(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9_Sub2 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean69 || Static85.method1890(arg1) && Static85.method1890(arg3)) {
			return new Class132_Sub1_Sub1(arg2, 3553, 6406, arg1, arg3, false, arg0, 6406);
		} else if (arg2.aBoolean60) {
			return new Class132_Sub1_Sub1(arg2, 34037, 6406, arg1, arg3, false, arg0, 6406);
		} else {
			return new Class132_Sub1_Sub1(arg2, 6406, arg1, arg3, Static247.method4363(arg1), Static247.method4363(arg3), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!wd;)V")
	public static void method8024(@OriginalArg(0) Class342 arg0) {
		if (Static258.anInt5217 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub29 local6 = arg0.aClass6_Sub29_2;
		Static470.aClass342Array1[Static258.anInt5217] = arg0;
		Static262.aBooleanArray17[Static258.anInt5217] = false;
		Static258.anInt5217++;
		@Pc(21) int local21 = arg0.anInt9576;
		if (arg0.aBoolean710) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt9576;
		if (arg0.aBoolean709) {
			local29 = Static192.anInt4157 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6165() + Static406.anInt9843 - local6.method6160() >> Static494.anInt8859;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6165() + local6.method6160() - Static406.anInt9843 >> Static494.anInt8859;
			if (local73 >= Static54.anInt1441) {
				local73 = Static54.anInt1441 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray161[local41++];
				@Pc(105) int local105 = (local6.method6164() + Static406.anInt9843 - local6.method6160() >> Static494.anInt8859) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static396.anInt7505) {
					local113 = Static396.anInt7505 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static447.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static447.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static258.anInt5217;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static447.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static258.anInt5217 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static447.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static258.anInt5217 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static447.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static258.anInt5217 << 48;
					}
				}
			}
		}
	}
}
