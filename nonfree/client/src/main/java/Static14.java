import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_6 = new Class265(29, 6);

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
	public static int anInt343 = 1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIII)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static88.anInt4522 / (float) Static88.anInt4519;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(39) int local39 = arg3 - (arg2 - local13) / 2;
		@Pc(48) int local48 = arg0 - (arg1 - local11) / 2;
		Static314.anInt5538 = -1;
		Static133.anInt2851 = Static88.anInt4519 * local48 / local11;
		Static60.anInt1343 = -1;
		Static129.anInt2786 = Static88.anInt4522 - local39 * Static88.anInt4522 / local13;
		Static282.method4106();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)Z")
	public static boolean method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static362.method4949(arg0, arg1) || Static58.method1145(arg0, arg1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!tt;BLclient!tt;ZZII)I")
	public static int method310(@OriginalArg(0) Class219_Sub1 arg0, @OriginalArg(2) Class219_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static293.method4211(arg3, arg0, arg5, arg1);
		if (local15 != 0) {
			return arg3 ? -local15 : local15;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static293.method4211(arg2, arg0, arg4, arg1);
			return arg2 ? -local37 : local37;
		}
	}
}
