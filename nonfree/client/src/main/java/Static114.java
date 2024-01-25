import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z")
	public static boolean method1789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public static void method1790(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(1, arg0);
		local8.method6593();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)Z")
	public static boolean method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!lt;IBLclient!bga;IILclient!r;Lclient!sp;)V")
	public static void method1793(@OriginalArg(0) Class1_Sub32 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class134 arg5, @OriginalArg(7) Class310 arg6) {
		@Pc(19) int local19 = arg0.anInt5295 - arg3 / 2 - 5;
		@Pc(23) int local23 = arg1 + 2;
		if (arg6.anInt8115 != 0) {
			arg5.method6929(arg3 + 10, local23, local19, arg6.anInt8115, arg1 + arg2.method486() * arg4 + 1 - local23);
		}
		if (arg6.anInt8119 != 0) {
			arg5.method6927(arg3 + 10, arg6.anInt8119, local23, arg4 * arg2.method486() + arg1 + 1 - local23, local19);
		}
		@Pc(76) int local76 = arg6.anInt8126;
		if (arg0.aBoolean426 && arg6.anInt8121 != -1) {
			local76 = arg6.anInt8121;
		}
		for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
			@Pc(95) String local95 = Static594.aStringArray44[local89];
			if (local89 < arg4 - 1) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg2.method483(arg5, local95, arg0.anInt5295, arg1, local76);
			arg1 += arg2.method486();
		}
	}
}
