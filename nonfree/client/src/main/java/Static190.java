import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!me", name = "i", descriptor = "[Lclient!hd;")
	public static Class10_Sub3_Sub1_Sub1[] aClass10_Sub3_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public static int anInt3870;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	public static int anInt3890;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!me", name = "O", descriptor = "Z")
	public static boolean aBoolean248 = true;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([SI)[S")
	public static short[] method3474(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static363.method1669(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	public static void method3475() {
		@Pc(6) Class26 local6 = Static342.aClass26_60;
		synchronized (Static342.aClass26_60) {
			Static342.aClass26_60.method329(5);
		}
		local6 = Static262.aClass26_48;
		synchronized (Static262.aClass26_48) {
			Static262.aClass26_48.method329(5);
		}
		@Pc(38) Class54 local38 = Static72.aClass54_1;
		synchronized (Static72.aClass54_1) {
			Static72.aClass54_1.method924();
		}
	}
}
