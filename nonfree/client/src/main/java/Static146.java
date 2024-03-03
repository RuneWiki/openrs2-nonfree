import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public static int anInt2808;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!sl;")
	public static Class2_Sub34 aClass2_Sub34_1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BZLjava/lang/Object;)[B", line = 23)
	public static byte[] method2789(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static346.method6259(local13) : local13;
		} else if (arg1 instanceof Class212) {
			@Pc(27) Class212 local27 = (Class212) arg1;
			return local27.method5547();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([II[B[[BI[I[[BI)I", line = 58)
	public static int method2790(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4[arg1];
		@Pc(15) int local15 = local9 + arg0[arg1];
		@Pc(19) int local19 = arg4[arg6];
		@Pc(25) int local25 = arg0[arg6] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(45) int local45 = arg2[arg1] & 0xFF;
		if (local45 > (arg2[arg6] & 0xFF)) {
			local45 = arg2[arg6] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg3[arg1];
		@Pc(70) byte[] local70 = arg5[arg6];
		@Pc(75) int local75 = local27 - local9;
		@Pc(80) int local80 = local27 - local19;
		for (@Pc(87) int local87 = local27; local87 < local34; local87++) {
			@Pc(99) int local99 = local70[local80++] + local66[local75++];
			if (local99 < local45) {
				local45 = local99;
			}
		}
		return -local45;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIB)V", line = 114)
	public static void method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != Static211.anInt4031) {
			Static311.anIntArray424 = new int[arg0];
			for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
				Static311.anIntArray424[local9] = (local9 << 12) / arg0;
			}
			Static69.anInt1719 = arg0 - 1;
			Static211.anInt4031 = arg0;
			Static276.anInt5641 = arg0 * 32;
		}
		if (arg1 == Static23.anInt638) {
			return;
		}
		if (arg1 == Static211.anInt4031) {
			Static16.anIntArray322 = Static311.anIntArray424;
		} else {
			Static16.anIntArray322 = new int[arg1];
			for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
				Static16.anIntArray322[local72] = (local72 << 12) / arg1;
			}
		}
		Static139.anInt2715 = arg1 - 1;
		Static23.anInt638 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 171)
	public static void method2792() {
		Static12.aClass13_2 = null;
		Static112.aClass13_7 = null;
		Static128.aClass13Array13 = null;
		Static309.aClass13Array23 = null;
		Static253.aClass130_4 = null;
		Static72.aClass13Array5 = null;
		Static15.aClass13Array3 = null;
		Static187.aClass130_3 = null;
		Static215.aClass13Array17 = null;
		Static119.aClass13Array22 = null;
		Static109.aClass13Array8 = null;
		Static116.aClass13Array10 = null;
		Static117.aClass13Array27 = null;
		Static49.aClass130_1 = null;
		Static265.aClass13Array21 = null;
		Static327.aClass13Array25 = null;
		Static58.aClass13Array9 = null;
		Static213.aClass13Array16 = null;
	}
}
