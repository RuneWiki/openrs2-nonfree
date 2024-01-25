import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!uc", name = "S", descriptor = "Z")
	public static boolean aBoolean563 = true;

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "[I")
	public static final int[] anIntArray468 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	public static void method5536(@OriginalArg(0) byte arg0) {
		if (Static66.aByteArrayArrayArray3 == null) {
			Static66.aByteArrayArrayArray3 = new byte[4][Static95.anInt6381][Static237.anInt4532];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static95.anInt6381; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static237.anInt4532; local27++) {
					Static66.aByteArrayArrayArray3[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
	public static void method5541() {
		for (@Pc(6) Class2_Sub7 local6 = (Class2_Sub7) Static47.aClass216_17.method5992(); local6 != null; local6 = (Class2_Sub7) Static47.aClass216_17.method6000()) {
			if (local6.aBoolean65) {
				local6.method761();
			}
		}
		for (@Pc(30) Class2_Sub7 local30 = (Class2_Sub7) Static283.aClass216_43.method5992(); local30 != null; local30 = (Class2_Sub7) Static283.aClass216_43.method6000()) {
			if (local30.aBoolean65) {
				local30.method761();
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
	public static boolean method5542(@OriginalArg(3) String arg0) {
		@Pc(34) boolean local34 = false;
		@Pc(36) boolean local36 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local34 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(95) int local95;
			if (local49 >= '0' && local49 <= '9') {
				local95 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local95 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local95 = local49 - 'W';
			} else {
				return false;
			}
			if (local95 >= 10) {
				return false;
			}
			if (local34) {
				local95 = -local95;
			}
			@Pc(119) int local119 = local95 + local38 * 10;
			if (local119 / 10 != local38) {
				return false;
			}
			local36 = true;
			local38 = local119;
		}
		return local36;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!sj;IIZILclient!ae;)V")
	public static void method5543(@OriginalArg(1) Class37 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		if (arg3) {
			Static304.aClass31_123.method4377((Static136.anInt2829 - Static304.aClass31_123.method4376()) / 2, (Static198.anInt3876 - Static304.aClass31_123.method4378()) / 2);
			Static26.aClass31_16.method4377((Static136.anInt2829 - Static26.aClass31_16.method4376()) / 2, 18);
		}
		arg0.method5263(Static198.anInt3876 / 2 - 26, arg2, Static41.anInt830 == 1 ? Static130.aClass93_90.method2819(Static21.anInt455) : Static41.aClass93_11.method2819(Static21.anInt455), Static136.anInt2829 / 2, -1);
		@Pc(69) int local69 = Static198.anInt3876 / 2 - 18;
		arg5.method4287(Static136.anInt2829 / 2 - 152, local69, 304, 34, arg1, 0);
		arg5.method4287(Static136.anInt2829 / 2 - 151, local69 - -1, 302, 32, 0, 0);
		arg5.method4246(Static136.anInt2829 / 2 - 150, local69 + 2, Static113.anInt2538 * 3, 30, arg4, 0);
		arg5.method4246(Static113.anInt2538 * 3 + Static136.anInt2829 / 2 - 150, local69 + 2, 300 - Static113.anInt2538 * 3, 30, 0, 0);
		arg0.method5263(Static198.anInt3876 / 2 + 4, arg2, Static341.aString64, Static136.anInt2829 / 2, -1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIILclient!ae;[[[BBIII)V")
	public static void method5545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4 arg7, @OriginalArg(8) byte[][][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg1 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg9 = arg9 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg9 = arg9 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg9 = arg9 + 3 & 0x3;
			arg6 = 8;
		}
		arg7.method4247(arg3, arg10, arg11, arg4, arg0, arg5, arg8[arg6 - 1][arg9], arg1, arg2);
	}
}
