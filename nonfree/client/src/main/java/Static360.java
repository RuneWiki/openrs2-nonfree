import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!no", name = "J", descriptor = "[I")
	public static final int[] anIntArray492 = new int[14];

	@OriginalMember(owner = "client!no", name = "K", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_6 = new Class260(1, 2);

	@OriginalMember(owner = "client!no", name = "R", descriptor = "F")
	public static float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "(I)Lclient!qj;")
	public static Class3_Sub41 method5382() {
		if (Static284.aClass130_49 == null || Static26.aClass179_5 == null) {
			return null;
		}
		Static26.aClass179_5.method4383(Static284.aClass130_49);
		@Pc(18) Class3_Sub41 local18 = (Class3_Sub41) Static26.aClass179_5.method4380();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class40 local28 = Static284.aClass168_4.method4062(local18.anInt7163);
			return local28 != null && local28.aBoolean93 && local28.method1125(Static284.anInterface21_2) ? local18 : Static70.method7723();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([BIII)[B")
	public static byte[] method5383(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10;
		if (arg1 > 0) {
			local10 = new byte[arg2];
			for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
				local10[local12] = arg0[arg1 + local12];
			}
		} else {
			local10 = arg0;
		}
		@Pc(39) Class72 local39 = new Class72();
		local39.method2349();
		local39.method2351((long) (arg2 * 8), local10);
		@Pc(53) byte[] local53 = new byte[64];
		local39.method2348(local53);
		return local53;
	}
}
