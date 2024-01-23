import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "[I")
	public static int[] anIntArray297 = new int[500];

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString101 = "Loading...";

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString102 = "Loaded defaults";

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString103 = "glow1:";

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
	public static int anInt3016 = 0;

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString104 = "Members object";

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(CI)Z")
	public static boolean method2421(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_';
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZB)V")
	public static void method2422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (Static116.aBoolean184) {
			@Pc(27) int local27 = arg1 - 334;
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 100) {
				local27 = 100;
			}
			@Pc(53) int local53 = local27 * (Static227.aShort70 - Static10.aShort3) / 100 + Static10.aShort3;
			if (local53 < Static305.aShort89) {
				local53 = Static305.aShort89;
			} else if (local53 > Static143.aShort49) {
				local53 = Static143.aShort49;
			}
			@Pc(84) int local84 = arg1 * 512 * local53 / (arg0 * 334);
			@Pc(123) int local123;
			@Pc(129) int local129;
			@Pc(93) short local93;
			if (local84 < Static29.aShort8) {
				local93 = Static29.aShort8;
				local53 = local93 * 334 * arg0 / (arg1 * 512);
				if (Static143.aShort49 < local53) {
					local53 = Static143.aShort49;
					local123 = arg1 * local53 * 512 / (local93 * 334);
					local129 = (arg0 - local123) / 2;
					if (arg4) {
						Static111.method1884();
						Static111.method1888(arg3, arg2, local129, arg1, 0);
						Static111.method1888(arg3 + arg0 - local129, arg2, local129, arg1, 0);
					}
					arg3 += local129;
					arg0 -= local129 * 2;
				}
			} else if (Static21.aShort6 < local84) {
				local93 = Static21.aShort6;
				local53 = local93 * 334 * arg0 / (arg1 * 512);
				if (local53 < Static305.aShort89) {
					local53 = Static305.aShort89;
					local123 = arg0 * local93 * 334 / (local53 * 512);
					local129 = (arg1 - local123) / 2;
					if (arg4) {
						Static111.method1884();
						Static111.method1888(arg3, arg2, arg0, local129, 0);
						Static111.method1888(arg3, arg1 + arg2 - local129, arg0, local129, 0);
					}
					arg2 += local129;
					arg1 -= local129 * 2;
				}
			}
			Static166.anInt3674 = local53 * arg1 / 334;
		}
		Static198.anInt4179 = (short) arg0;
		Static159.anInt3554 = arg2;
		Static15.anInt310 = arg3;
		Static229.anInt4617 = (short) arg1;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method2424() {
		for (@Pc(6) Class2_Sub4 local6 = (Class2_Sub4) Static132.aClass101_8.method2868(); local6 != null; local6 = (Class2_Sub4) Static132.aClass101_8.method2859()) {
			@Pc(12) int local12 = local6.anInt274;
			if (Static268.method4233(local12)) {
				@Pc(18) boolean local18 = true;
				@Pc(22) Class56[] local22 = Static262.aClass56ArrayArray1[local12];
				@Pc(24) int local24;
				for (local24 = 0; local24 < local22.length; local24++) {
					if (local22[local24] != null) {
						local18 = local22[local24].aBoolean132;
						break;
					}
				}
				if (!local18) {
					local24 = (int) local6.aLong214;
					@Pc(53) Class56 local53 = Static38.method715(local24);
					if (local53 != null) {
						Static287.method4466(local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(CBILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
	public static StringBuffer method2426(@OriginalArg(3) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(13) int local13 = local8; local13 < 0; local13++) {
			arg0.setCharAt(local13, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIILclient!ml;IJIIII)Z")
	public static boolean method2427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static84.method1512(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
