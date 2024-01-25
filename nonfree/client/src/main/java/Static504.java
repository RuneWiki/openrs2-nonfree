import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
	public static int anInt8432;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "Lclient!rc;")
	public static final Class279 aClass279_13 = new Class279();

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_151 = new Class286(51, 4);

	@OriginalMember(owner = "client!tda", name = "h", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_250 = new Class363(15, -2);

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
	public static int anInt8433 = 0;

	@OriginalMember(owner = "client!tda", name = "j", descriptor = "[I")
	public static final int[] anIntArray599 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)I")
	public static int method7010() {
		return Static527.aClass175_1.method3938();
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!es;I)Lclient!tm;")
	public static Class9_Sub1 method7012(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(7) Class9 local7 = Static295.method7119(arg0);
		@Pc(11) int local11 = arg0.method4294();
		@Pc(15) int local15 = arg0.method4294();
		@Pc(19) int local19 = arg0.method4294();
		@Pc(23) int local23 = arg0.method4294();
		@Pc(27) int local27 = arg0.method4294();
		@Pc(36) int local36 = arg0.method4294();
		return new Class9_Sub1(local7.aClass62_10, local7.aClass279_9, local7.anInt5035, local7.anInt5029, local7.anInt5034, local7.anInt5030, local7.anInt5032, local7.anInt5027, local7.anInt5031, local11, local15, local19, local23, local27, local36);
	}
}
