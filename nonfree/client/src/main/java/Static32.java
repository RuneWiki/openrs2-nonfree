import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static int anInt5104;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIII)V")
	public static void method4588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg5 - arg3;
		@Pc(15) int local15 = arg4 - arg2;
		if (local10 == arg0) {
			if (local15 != 0) {
				Static260.method4250(arg4, arg1, arg2, arg3);
			}
		} else if (local15 == 0) {
			Static634.method8800(arg2, arg3, arg5, arg1, arg0 ^ 0x4);
		} else {
			@Pc(52) int local52 = (local15 << 12) / local10;
			@Pc(61) int local61 = arg2 - (local52 * arg3 >> 12);
			@Pc(78) int local78;
			@Pc(76) int local76;
			if (arg5 < Static230.anInt3962) {
				local76 = local61 + (Static230.anInt3962 * local52 >> 12);
				local78 = Static230.anInt3962;
			} else if (Static463.anInt7530 >= arg5) {
				local78 = arg5;
				local76 = arg4;
			} else {
				local78 = Static463.anInt7530;
				local76 = local61 + (Static463.anInt7530 * local52 >> 12);
			}
			@Pc(115) int local115;
			@Pc(117) int local117;
			if (Static230.anInt3962 > arg3) {
				local117 = (Static230.anInt3962 * local52 >> 12) + local61;
				local115 = Static230.anInt3962;
			} else if (arg3 <= Static463.anInt7530) {
				local115 = arg3;
				local117 = arg2;
			} else {
				local115 = Static463.anInt7530;
				local117 = local61 + (Static463.anInt7530 * local52 >> 12);
			}
			if (local117 < Static573.anInt8986) {
				local117 = Static573.anInt8986;
				local115 = (Static573.anInt8986 - local61 << 12) / local52;
			} else if (Static319.anInt5445 < local117) {
				local115 = (Static319.anInt5445 - local61 << 12) / local52;
				local117 = Static319.anInt5445;
			}
			if (local76 < Static573.anInt8986) {
				local78 = (Static573.anInt8986 - local61 << 12) / local52;
				local76 = Static573.anInt8986;
			} else if (local76 > Static319.anInt5445) {
				local78 = (Static319.anInt5445 - local61 << 12) / local52;
				local76 = Static319.anInt5445;
			}
			Static149.method2750(local76, local117, local78, local115, arg1);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!vf;IIIII)Lclient!ub;")
	public static Class29_Sub3_Sub1 method4589(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean736 || Static197.method3300(arg2) && Static197.method3300(arg3)) {
			return new Class29_Sub3_Sub1(arg0, 3553, arg1, arg4, arg2, arg3, true);
		} else if (arg0.aBoolean731) {
			return new Class29_Sub3_Sub1(arg0, 34037, arg1, arg4, arg2, arg3, true);
		} else {
			return new Class29_Sub3_Sub1(arg0, arg1, arg4, arg2, arg3, Static146.method2737(arg2), Static146.method2737(arg3), true);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4590(@OriginalArg(1) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static665.aStringArray24.length; local13++) {
			if (Static665.aStringArray24[local13].equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}
}
