import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "Z")
	public static boolean aBoolean55;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "Lclient!sha;")
	public static Class309 aClass309_1;

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_1 = new Class129(8, 1);

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	public static int anInt519 = 0;

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_1 = new Class352(2, 4, 4, 0);

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "[I")
	public static final int[] anIntArray11 = new int[1];

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "Lclient!rga;")
	public static Class290 aClass290_1 = null;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIILclient!sba;Lclient!aa;IBLclient!ufa;)V")
	public static void method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class302 arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class4 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static554.anInt9497 == 4) {
			local16 = (int) Static595.aFloat184 & 0x3FFF;
		} else {
			local16 = (int) Static595.aFloat184 + Static372.anInt7080 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt8909 / 2, arg3.anInt8872 / 2) + 10;
		@Pc(44) int local44 = arg5 * arg5 + arg1 * arg1;
		if (local35 * local35 < local44) {
			return;
		}
		@Pc(58) int local58 = Class78_Sub2_Sub2.anIntArray270[local16];
		@Pc(67) int local67 = Class78_Sub2_Sub2.anIntArray271[local16];
		if (Static554.anInt9497 != 4) {
			local58 = local58 * 256 / (Static289.anInt10738 + 256);
			local67 = local67 * 256 / (Static289.anInt10738 + 256);
		}
		@Pc(99) int local99 = local58 * arg1 + local67 * arg5 >> 14;
		@Pc(110) int local110 = arg1 * local67 - arg5 * local58 >> 14;
		arg6.method7692(local99 + arg3.anInt8909 / 2 + arg2 - arg6.method7700() / 2, -local110 + arg3.anInt8872 / 2 + arg0 + -(arg6.method7712() / 2), arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	public static void method486() {
		if (Static630.aClass212_18 != Static496.aClass212_17) {
			try {
				Static651.method5913("tbrefresh", Static545.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
