import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Lclient!eo;")
	public static Class2_Sub3_Sub3 aClass2_Sub3_Sub3_3;

	@OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
	public static int anInt5507;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
	public static int anInt5505 = 0;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Lclient!bj;")
	public static Class20_Sub1 method4894() {
		return Static303.aClass20_Sub1Array3.length > Static36.anInt686 ? Static303.aClass20_Sub1Array3[Static36.anInt686++] : null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZBI)I")
	public static int method4895(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub26 local8 = Static42.method991(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray269.length) {
			return local8.anIntArray269[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)I")
	public static int method4897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg2;
			arg2 = arg5;
			arg5 = local16;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return 7 + 1 - arg0 - arg2;
		} else if (local7 == 2) {
			return 1 + 7 - arg5 - arg3;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
	public static void method4898() {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(15, 0);
		local8.method5539();
	}
}
