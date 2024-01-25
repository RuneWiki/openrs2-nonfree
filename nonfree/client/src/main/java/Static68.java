import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!am;")
	public static Class11 aClass11_33;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Z")
	public static boolean aBoolean122 = true;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public static int anInt1532 = 99;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt1533 = -2;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!vm;I)V")
	public static void method1265(@OriginalArg(0) Class92 arg0) {
		if (Static270.anInt6606 != Static279.anInt5645 && (Static18.aClass57ArrayArrayArray1 != null && Static22.method394(Static279.anInt5645, arg0))) {
			Static270.anInt6606 = Static279.anInt5645;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method1266(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local46 >= '0' && local46 <= '9') {
				local75 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local75 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local75 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local75 >= arg1) {
				throw new NumberFormatException();
			}
			if (local26) {
				local75 = -local75;
			}
			@Pc(121) int local121 = local75 + arg1 * local35;
			if (local35 != local121 / arg1) {
				throw new NumberFormatException();
			}
			local28 = true;
			local35 = local121;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
	public static void method1269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg0 < arg2) {
			for (local15 = arg0; local15 < arg2; local15++) {
				Static30.anIntArrayArray10[local15][arg3] = arg1;
			}
		} else {
			for (local15 = arg2; local15 < arg0; local15++) {
				Static30.anIntArrayArray10[local15][arg3] = arg1;
			}
		}
	}
}
