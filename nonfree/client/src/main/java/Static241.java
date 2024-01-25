import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array29;

	@OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
	public static int anInt4411;

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!jda", name = "u", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_60 = new Class98(2, -1);

	@OriginalMember(owner = "client!jda", name = "v", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!jda", name = "x", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
	public static void method3748() {
		if (Static252.anInt4624 == 6) {
			Static252.anInt4624 = 7;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIII)V")
	public static void method3750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class6_Sub5_Sub8 local13 = Static49.method760(8, arg1);
		local13.method3256();
		local13.anInt3734 = arg2;
		local13.anInt3739 = arg3;
		local13.anInt3740 = arg0;
	}
}
