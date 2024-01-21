import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public static int anInt125;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
	public static final int[] anIntArray3 = new int[256];

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_90 = Static193.method3027("Bad session id)3");

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!oc;")
	public static Class70 aClass70_88 = aClass70_90;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_89 = Static193.method3027(")4l");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIZI)V")
	public static void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		Static16.method304(arg2);
		@Pc(16) int local16 = arg2;
		@Pc(21) int local21 = arg2 - arg4;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(31) int local31 = -arg2;
		@Pc(33) int local33 = local21;
		@Pc(36) int local36 = -local21;
		@Pc(38) int local38 = -1;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(91) int local91;
		if (arg1 >= Static26.anInt554 && arg1 <= Static52.anInt1117) {
			@Pc(56) int[] local56 = Static157.anIntArrayArray24[arg1];
			local65 = Static130.method1827(Static200.anInt4074, arg0 - arg2, Static119.anInt2428);
			local74 = Static130.method1827(Static200.anInt4074, arg0 + arg2, Static119.anInt2428);
			local83 = Static130.method1827(Static200.anInt4074, arg0 - local21, Static119.anInt2428);
			local91 = Static130.method1827(Static200.anInt4074, arg0 + local21, Static119.anInt2428);
			Static16.method302(arg5, local65, local83, local56);
			Static16.method302(arg3, local83, local91, local56);
			Static16.method302(arg5, local91, local74, local56);
		}
		@Pc(111) int local111 = -1;
		while (local11 < local16) {
			local38 += 2;
			local31 += local38;
			local111 += 2;
			local36 += local111;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				local36 -= local33 << 1;
				Static22.anIntArray32[local33] = local11;
			}
			local11++;
			@Pc(250) int local250;
			@Pc(258) int local258;
			@Pc(269) int[] local269;
			@Pc(157) int local157;
			if (local31 >= 0) {
				local16--;
				local65 = arg1 + local16;
				local157 = arg1 - local16;
				local31 -= local16 << 1;
				if (Static26.anInt554 <= local65 && local157 <= Static52.anInt1117) {
					if (local21 <= local16) {
						local74 = Static130.method1827(Static200.anInt4074, arg0 + local11, Static119.anInt2428);
						local83 = Static130.method1827(Static200.anInt4074, arg0 - local11, Static119.anInt2428);
						if (Static52.anInt1117 >= local65) {
							Static16.method302(arg5, local83, local74, Static157.anIntArrayArray24[local65]);
						}
						if (local157 >= Static26.anInt554) {
							Static16.method302(arg5, local83, local74, Static157.anIntArrayArray24[local157]);
						}
					} else {
						local74 = Static22.anIntArray32[local16];
						local83 = Static130.method1827(Static200.anInt4074, local11 + arg0, Static119.anInt2428);
						local91 = Static130.method1827(Static200.anInt4074, arg0 - local11, Static119.anInt2428);
						local250 = Static130.method1827(Static200.anInt4074, local74 + arg0, Static119.anInt2428);
						local258 = Static130.method1827(Static200.anInt4074, arg0 - local74, Static119.anInt2428);
						if (Static52.anInt1117 >= local65) {
							local269 = Static157.anIntArrayArray24[local65];
							Static16.method302(arg5, local91, local258, local269);
							Static16.method302(arg3, local258, local250, local269);
							Static16.method302(arg5, local250, local83, local269);
						}
						if (Static26.anInt554 <= local157) {
							local269 = Static157.anIntArrayArray24[local157];
							Static16.method302(arg5, local91, local258, local269);
							Static16.method302(arg3, local258, local250, local269);
							Static16.method302(arg5, local250, local83, local269);
						}
					}
				}
			}
			local157 = arg1 - local11;
			local65 = arg1 + local11;
			if (Static26.anInt554 <= local65 && Static52.anInt1117 >= local157) {
				local83 = arg0 - local16;
				local74 = local16 + arg0;
				if (Static119.anInt2428 <= local74 && local83 <= Static200.anInt4074) {
					local74 = Static130.method1827(Static200.anInt4074, local74, Static119.anInt2428);
					local83 = Static130.method1827(Static200.anInt4074, local83, Static119.anInt2428);
					if (local21 > local11) {
						local91 = local33 >= local11 ? local33 : Static22.anIntArray32[local11];
						local250 = Static130.method1827(Static200.anInt4074, local91 + arg0, Static119.anInt2428);
						local258 = Static130.method1827(Static200.anInt4074, arg0 - local91, Static119.anInt2428);
						if (local65 <= Static52.anInt1117) {
							local269 = Static157.anIntArrayArray24[local65];
							Static16.method302(arg5, local83, local258, local269);
							Static16.method302(arg3, local258, local250, local269);
							Static16.method302(arg5, local250, local74, local269);
						}
						if (local157 >= Static26.anInt554) {
							local269 = Static157.anIntArrayArray24[local157];
							Static16.method302(arg5, local83, local258, local269);
							Static16.method302(arg3, local258, local250, local269);
							Static16.method302(arg5, local250, local74, local269);
						}
					} else {
						if (local65 <= Static52.anInt1117) {
							Static16.method302(arg5, local83, local74, Static157.anIntArrayArray24[local65]);
						}
						if (local157 >= Static26.anInt554) {
							Static16.method302(arg5, local83, local74, Static157.anIntArrayArray24[local157]);
						}
					}
				}
			}
		}
	}
}
