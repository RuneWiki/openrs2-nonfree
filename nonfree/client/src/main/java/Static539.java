import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
	public static int anInt8855;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_58 = new Class265(128, 4);

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "[I")
	public static final int[] anIntArray482 = new int[1];

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
	public static int anInt8853 = 0;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)V")
	public static void method7461() {
		Static451.aClass265_50.method6570(50);
		Static493.aClass265_54.method6570(50);
		Static314.aClass265_31.method6570(50);
		Static667.aClass265_65.method6570(50);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!dd;)[I")
	public static int[] method7462(@OriginalArg(1) Class5_Sub16 arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.method3651(10);
		local8.method3679(local11[0]);
		local8.method3679(local11[1]);
		local8.method3679(local11[2]);
		local8.method3679(local11[3]);
		for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
			local8.method3679((int) (Math.random() * 9.9999999E7D));
		}
		local8.method3660((int) (Math.random() * 9.9999999E7D));
		local8.method3652(Static198.aBigInteger2, Static517.aBigInteger6);
		arg0.aClass5_Sub15_Sub2_1.method3685(local8.aByteArray45, local8.anInt4144, 0);
		return local11;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZLclient!li;)V")
	public static void method7465(@OriginalArg(1) Class41_Sub1_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class41_Sub1_Sub1_Sub3_Sub1) {
			@Pc(14) Class41_Sub1_Sub1_Sub3_Sub1 local14 = (Class41_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local14.aClass311_1 != null) {
				Static603.method8109(local14, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local14.aByte149);
				return;
			}
		} else if (arg0 instanceof Class41_Sub1_Sub1_Sub3_Sub2) {
			@Pc(39) Class41_Sub1_Sub1_Sub3_Sub2 local39 = (Class41_Sub1_Sub1_Sub3_Sub2) arg0;
			Static238.method3424(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != local39.aByte149, local39);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II[F)[F")
	public static float[] method7466(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static685.method8326(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
