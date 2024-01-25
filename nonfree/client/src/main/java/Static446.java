import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "[Lclient!jl;")
	public static Class161[] aClass161Array1;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	public static int anInt7749;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean528 = true;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_163 = new Class275();

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!bc;")
	public static final Class24 aClass24_2 = new Class24(1);

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBIIIII)V")
	public static void method6406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg5 - arg2;
		@Pc(14) int local14 = arg2 + arg3;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static455.method6536(arg4, arg1, arg0, Static503.anIntArrayArray12[local16]);
		}
		@Pc(39) int local39 = arg4 - arg2;
		@Pc(43) int local43 = arg1 + arg2;
		for (@Pc(45) int local45 = arg5; local45 > local10; local45--) {
			Static455.method6536(arg4, arg1, arg0, Static503.anIntArrayArray12[local45]);
		}
		for (@Pc(66) int local66 = local14; local66 <= local10; local66++) {
			@Pc(72) int[] local72 = Static503.anIntArrayArray12[local66];
			Static455.method6536(local43, arg1, arg0, local72);
			Static455.method6536(arg4, local39, arg0, local72);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I")
	public static int method6407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static24.aShortArrayArray11 == null ? 0 : Static24.aShortArrayArray11[arg0][arg1] & 0xFFFF;
	}
}
