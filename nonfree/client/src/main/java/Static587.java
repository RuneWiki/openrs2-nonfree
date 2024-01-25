import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static587 {

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "Lclient!ha;")
	public static Class145 aClass145_12;

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_121 = new Class349(39, 0);

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
	public static int anInt8114 = -1;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(ZII)Z")
	public static boolean method7242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static451.method6590(arg0, arg1) & Static12.method208(arg1, arg0);
	}
}
