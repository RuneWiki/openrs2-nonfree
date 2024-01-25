import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "J")
	public static long aLong102 = 20000000L;

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[BIIB[BIII)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg6; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg2++;
				arg1[local31] += arg4[arg7++];
				@Pc(43) int local43 = arg2++;
				arg1[local43] += arg4[arg7++];
				@Pc(55) int local55 = arg2++;
				arg1[local55] += arg4[arg7++];
				@Pc(67) int local67 = arg2++;
				arg1[local67] += arg4[arg7++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local31 = arg2++;
				arg1[local31] += arg4[arg7++];
			}
			arg2 += arg5;
			arg7 += arg0;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)V")
	public static void method3188(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 8);
		local9.method1709();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3189(@OriginalArg(1) String arg0) {
		if (Class359.aString121.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class359.aString121.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class359.aString121.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
