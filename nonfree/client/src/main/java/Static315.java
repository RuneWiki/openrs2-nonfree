import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!km;")
	public static Class82 aClass82_7;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	public static int anInt5584;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	public static int anInt5585;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_168 = new Class41(70, 3);

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "Lclient!fl;")
	public static final Class75 aClass75_4 = new Class75("RC", 1);

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "[I")
	public static final int[] anIntArray686 = new int[50];

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "[Lclient!as;")
	public static final Class14[] aClass14Array1 = new Class14[6];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIZ)I")
	public static int method4888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBZ)V")
	public static void method4890(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) Class2_Sub16 local16 = Static108.method2083(arg1, arg0);
		if (local16 != null) {
			local16.method5745();
		}
	}
}
