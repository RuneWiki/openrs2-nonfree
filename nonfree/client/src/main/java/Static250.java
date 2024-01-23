import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt4959;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public static int anInt4960;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
	public static int[] anIntArray373 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
	public static int[] anIntArray374 = new int[100];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!jj;")
	public static Class8_Sub1_Sub5_Sub2 method3750(@OriginalArg(0) int arg0) {
		@Pc(10) Class8_Sub1_Sub5_Sub2 local10 = (Class8_Sub1_Sub5_Sub2) Static107.aClass61_16.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static35.aClass132_13.method3194(arg0, 0);
		local10 = new Class8_Sub1_Sub5_Sub2(local21);
		local10.method2017(Static199.aClass43Array4, null);
		Static107.aClass61_16.method1377((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!am;ZZIIZII)Lclient!wd;")
	public static Class8_Sub1_Sub7 method3751(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) Class10 local7 = Static140.method2222(arg0);
		if (arg6 > 1 && local7.anIntArray11 != null) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (local7.anIntArray10[local17] <= arg6 && local7.anIntArray10[local17] != 0) {
					local15 = local7.anIntArray11[local17];
				}
			}
			if (local15 != -1) {
				local7 = Static140.method2222(local15);
			}
		}
		@Pc(57) Class36_Sub2_Sub2 local57 = local7.method86(arg1);
		if (local57 == null) {
			return null;
		}
		@Pc(64) Class8_Sub1_Sub7_Sub1 local64 = null;
		if (local7.anInt139 != -1) {
			local64 = (Class8_Sub1_Sub7_Sub1) method3751(local7.anInt132, arg1, true, true, 0, false, 10, 1);
			if (local64 == null) {
				return null;
			}
		} else if (local7.anInt129 != -1) {
			local64 = (Class8_Sub1_Sub7_Sub1) method3751(local7.anInt110, arg1, false, true, arg4, false, arg6, arg7);
			if (local64 == null) {
				return null;
			}
		}
		@Pc(114) int[] local114 = Static103.anIntArray155;
		@Pc(116) int local116 = Static103.anInt2161;
		@Pc(119) int[] local119 = new int[4];
		@Pc(121) int local121 = Static103.anInt2164;
		Static103.method1676(local119);
		@Pc(129) Class8_Sub1_Sub7_Sub1 local129 = new Class8_Sub1_Sub7_Sub1(36, 32);
		Static103.method1675(local129.anIntArray150, 36, 32);
		Static96.method1541();
		Static96.method1540(16, 16);
		Static96.aBoolean144 = false;
		@Pc(143) int local143 = local7.anInt152;
		if (arg2) {
			local143 = (int) ((double) local143 * 1.5D);
		} else if (arg7 == 2) {
			local143 = (int) ((double) local143 * 1.04D);
		}
		@Pc(171) int local171 = Class68.anIntArray137[local7.anInt119] * local143 >> 16;
		@Pc(180) int local180 = Class68.anIntArray139[local7.anInt119] * local143 >> 16;
		local57.method3949(local7.anInt124, local7.anInt126, local7.anInt119, local7.anInt153, local171 + local7.anInt97 - local57.method4175() / 2, local180 - -local7.anInt97, (long) -1);
		if (arg7 >= 1) {
			local129.method1644(1);
			if (arg7 >= 2) {
				local129.method1644(16777215);
			}
			Static103.method1675(local129.anIntArray150, 36, 32);
		}
		if (arg4 != 0) {
			local129.method1653(arg4);
		}
		if (local7.anInt139 != -1) {
			local64.method2811(0, 0);
		} else if (local7.anInt129 != -1) {
			Static103.method1675(local64.anIntArray150, 36, 32);
			local129.method2811(0, 0);
			local129 = local64;
		}
		if (arg5 && (local7.anInt147 == 1 || arg6 != 1) && arg6 != -1) {
			Static132.aClass8_Sub1_Sub5_Sub2_3.method2027(Static88.method1441(arg6), 0, 9, 16776960, 1);
		}
		Static103.method1675(local114, local116, local121);
		Static103.method1666(local119);
		Static96.method1541();
		Static96.aBoolean144 = true;
		return Static116.aBoolean188 && !arg3 ? new Class8_Sub1_Sub7_Sub2(local129) : local129;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)Lclient!pb;")
	public static Class96 method3753() {
		try {
			return (Class96) Class.forName("Class96_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(24) Throwable local24) {
			return null;
		}
	}
}
