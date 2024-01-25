import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!me", name = "l", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
	public static final int[] anIntArray425 = new int[5];

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!rf;")
	public static Class284 aClass284_2 = null;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIILclient!r;Lclient!bda;I)V")
	public static void method5045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class32 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class358 local9 = Static165.aClass306_3.method6830(arg3.anInt784);
		if (local9.anInt9511 == -1) {
			return;
		}
		if (arg3.aBoolean46) {
			@Pc(22) int local22 = arg4 + arg3.anInt792;
			arg4 = local22 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(38) Class39 local38 = local9.method7915(arg3.aBoolean49, arg2, arg4);
		if (local38 == null) {
			return;
		}
		@Pc(48) int local48 = arg3.anInt788;
		@Pc(51) int local51 = arg3.anInt793;
		if ((arg4 & 0x1) == 1) {
			local48 = arg3.anInt793;
			local51 = arg3.anInt788;
		}
		@Pc(65) int local65 = local38.A();
		@Pc(68) int local68 = local38.ca();
		if (local9.aBoolean728) {
			local68 = local51 * 4;
			local65 = local48 * 4;
		}
		if (local9.anInt9514 == 0) {
			local38.method7848(arg0, arg1 + 4 - local51 * 4, local65, local68);
		} else {
			local38.method7850(arg0, arg1 - (local51 - 1) * 4, local65, local68, 0, local9.anInt9514 | 0xFF000000, 1);
		}
	}
}
