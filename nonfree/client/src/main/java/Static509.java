import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "Lclient!hd;")
	public static final Class146 aClass146_6 = new Class146();

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "Z")
	public static boolean aBoolean545 = false;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_165 = new Class156(18, -1);

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z")
	public static boolean method7016(@OriginalArg(0) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(31) boolean local31 = false;
		@Pc(45) boolean local45 = false;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = arg0.length();
		for (@Pc(52) int local52 = 0; local52 < local50; local52++) {
			@Pc(60) char local60 = arg0.charAt(local52);
			if (local52 == 0) {
				if (local60 == '-') {
					local31 = true;
					continue;
				}
				if (local60 == '+' && true) {
					continue;
				}
			}
			@Pc(97) int local97;
			if (local60 >= '0' && local60 <= '9') {
				local97 = local60 - '0';
			} else if (local60 >= 'A' && local60 <= 'Z') {
				local97 = local60 - '7';
			} else if (local60 >= 'a' && local60 <= 'z') {
				local97 = local60 - 'W';
			} else {
				return false;
			}
			if (local97 >= 10) {
				return false;
			}
			if (local31) {
				local97 = -local97;
			}
			@Pc(153) int local153 = local47 * 10 + local97;
			if (local153 / 10 != local47) {
				return false;
			}
			local47 = local153;
			local45 = true;
		}
		return local45;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIII)V")
	public static void method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static171.anInt5360; local3++) {
			@Pc(9) Rectangle local9 = Class147.aRectangleArray1[local3];
			if (local9.x + local9.width > arg2 && arg2 + arg3 > local9.x && arg0 < local9.y + local9.height && arg1 + arg0 > local9.y) {
				Static325.aBooleanArray15[local3] = true;
			}
		}
		Static395.method5811(arg0, arg2 + arg3, arg0 + arg1, arg2);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)Z")
	public static boolean method7018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIZII)V")
	public static void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg2 + 1;
		Static161.method2977(arg4, arg0, arg3, Static120.anIntArrayArray18[arg2], -115);
		@Pc(20) int local20 = arg1 - 1;
		Static161.method2977(arg4, arg0, arg3, Static120.anIntArrayArray18[arg1], -127);
		for (@Pc(37) int local37 = local11; local37 <= local20; local37++) {
			@Pc(43) int[] local43 = Static120.anIntArrayArray18[local37];
			local43[arg4] = local43[arg3] = arg0;
		}
	}
}
