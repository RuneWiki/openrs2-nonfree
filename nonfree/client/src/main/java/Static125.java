import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gh", name = "S", descriptor = "Lclient!ll;")
	public static Class152 aClass152_5;

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
	public static int anInt2215 = -1;

	@OriginalMember(owner = "client!gh", name = "M", descriptor = "[I")
	public static final int[] anIntArray233 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
	public static int anInt2225 = 0;

	@OriginalMember(owner = "client!gh", name = "V", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_33 = new Class25(53, -1);

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(BII)V")
	public static void method2033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg0, 1);
		local8.method3043();
		local8.anInt3397 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIIII)I")
	public static int method2034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg2 : arg1;
		@Pc(38) int local38 = local12 < 4 ? arg2 : local12 == 12 || local12 == 14 ? arg1 : arg3;
		return ((local12 & 0x1) == 0 ? local19 : -local19) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}
}
