import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cea", name = "id", descriptor = "I")
	public static int anInt1298;

	@OriginalMember(owner = "client!cea", name = "Pd", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!cea", name = "Zc", descriptor = "[I")
	public static int[] anIntArray96 = null;

	@OriginalMember(owner = "client!cea", name = "bd", descriptor = "I")
	public static int anInt1293 = -50;

	@OriginalMember(owner = "client!cea", name = "ud", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!cea", name = "vd", descriptor = "I")
	public static int anInt1307 = 0;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!dc;)Lclient!gs;")
	public static Class3_Sub2 method1150(@OriginalArg(1) Class3_Sub9 arg0) {
		arg0.method5633();
		@Pc(13) int local13 = arg0.method5633();
		@Pc(17) Class3_Sub2 local17 = Static327.method5371(local13);
		local17.anInt10284 = arg0.method5633();
		@Pc(26) int local26 = arg0.method5633();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method5633();
			local17.method8663(arg0, local39);
		}
		local17.method8673();
		return local17;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IBII)I")
	public static int method1151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(27) int local27 = (arg0 & 0x7F) * local13 + arg1 * (arg2 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * arg1 + local13 * (arg0 & 0x380) >> 7;
		@Pc(60) int local60 = arg1 * (arg2 & 0xFC00) + local13 * (arg0 & 0xFC00) >> 7;
		return local46 & 0x380 | local60 & 0xFC00 | local27 & 0x7F;
	}
}
