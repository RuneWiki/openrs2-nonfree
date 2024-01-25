import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public static int anInt8945;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_160 = new Class397(89, -1);

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public static int anInt8944 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)I")
	public static int method7580(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
	public static void method7585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class9_Sub1_Sub3 local14 = local7.aClass9_Sub1_Sub3_2;
		@Pc(17) Class9_Sub1_Sub3 local17 = local7.aClass9_Sub1_Sub3_1;
		if (local14 != null) {
			local14.aShort86 = (short) (local14.aShort86 * arg3 / (0x10 << Static626.anInt9669 - 7));
			local14.aShort85 = (short) (local14.aShort85 * arg3 / (0x10 << Static626.anInt9669 - 7));
		}
		if (local17 != null) {
			local17.aShort86 = (short) (local17.aShort86 * arg3 / (0x10 << Static626.anInt9669 - 7));
			local17.aShort85 = (short) (local17.aShort85 * arg3 / (0x10 << Static626.anInt9669 - 7));
		}
	}
}
