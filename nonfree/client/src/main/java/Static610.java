import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!un", name = "k", descriptor = "I")
	public static int anInt9834;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Lclient!eca;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIILclient!mj;Lclient!ha;)V")
	public static void method8371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class238 arg3, @OriginalArg(5) Class100 arg4) {
		for (@Pc(8) int local8 = 7; local8 >= 0; local8--) {
			for (@Pc(14) int local14 = 127; local14 >= 0; local14--) {
				@Pc(32) int local32 = (arg1 & 0x3F) << 10 | (local8 & 0x7) << 7 | local14 & 0x7F;
				Static207.method3389(true, false);
				@Pc(40) int local40 = Static408.anIntArray407[local32];
				Static616.method8461(false, true);
				arg4.aa((arg3.anInt5985 * local14 >> 7) + arg0, arg2 - -(arg3.anInt5973 * (7 - local8) >> 3), (arg3.anInt5985 >> 7) + 1, (arg3.anInt5973 >> 3) - -1, local40, 0);
			}
		}
		anInt9834++;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method8373(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static366.method5329(0, arg0.length - 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZILclient!vf;III[II)Lclient!ub;")
	public static Class29_Sub3_Sub1 method8375(@OriginalArg(1) int arg0, @OriginalArg(2) Class100_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (arg1.aBoolean736 || Static197.method3300(arg2) && Static197.method3300(arg0)) {
			return new Class29_Sub3_Sub1(arg1, 3553, arg2, arg0, false, arg5, arg4, 0);
		} else if (arg1.aBoolean731) {
			return new Class29_Sub3_Sub1(arg1, 34037, arg2, arg0, false, arg5, arg4, 0);
		} else {
			return new Class29_Sub3_Sub1(arg1, arg2, arg0, Static146.method2737(arg2), Static146.method2737(arg0), arg5);
		}
	}
}
