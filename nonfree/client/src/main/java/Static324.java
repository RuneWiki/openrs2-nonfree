import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
	public static int anInt5529;

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_102 = new Class156(19, -1);

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(ILclient!wq;)Lclient!vha;")
	public static Class132_Sub3 method4953(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(9) Class132 local9 = Static145.method2733(arg0);
		@Pc(21) int local21 = arg0.method7268();
		@Pc(27) int local27 = arg0.method7268();
		return new Class132_Sub3(local9.aClass189_13, local9.aClass346_14, local9.anInt10380, local9.anInt10382, local9.anInt10377, local9.anInt10374, local9.anInt10373, local9.anInt10383, local9.anInt10378, local21, local27);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	public static void method4954() {
		if (Static657.aClass361_8 == null) {
			return;
		}
		if (Static657.aClass361_8.anInt9720 == 1) {
			Static657.aClass361_8 = null;
			return;
		}
		if (Static657.aClass361_8.anInt9720 == 2) {
			Static390.method5745(Static528.aString95, 2, Static573.aClass349_5);
			Static657.aClass361_8 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ID)V")
	public static void method4955(@OriginalArg(1) double arg0) {
		if (arg0 == Static6.aDouble1) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(33) int local33 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static619.anIntArray554[local19] = local33 > 255 ? 255 : local33;
		}
		Static6.aDouble1 = arg0;
	}
}
