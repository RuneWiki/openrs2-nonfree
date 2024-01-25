import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public static int anInt8063;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "[Lclient!bia;")
	public static final Class37[] aClass37Array1 = new Class37[6];

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_79 = new Class269(81, 6);

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
	public static int anInt8064 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B[II[Ljava/lang/Object;I)V")
	public static void method6758(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(16) int local16 = (arg3 + arg1) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) int local22 = arg0[local16];
		arg0[local16] = arg0[arg1];
		arg0[arg1] = local22;
		@Pc(36) Object local36 = arg2[local16];
		arg2[local16] = arg2[arg1];
		arg2[arg1] = local36;
		@Pc(55) int local55 = ~local22 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg3; local57 < arg1; local57++) {
			if (local22 + (local55 & local57) > arg0[local57]) {
				@Pc(72) int local72 = arg0[local57];
				arg0[local57] = arg0[local18];
				arg0[local18] = local72;
				@Pc(86) Object local86 = arg2[local57];
				arg2[local57] = arg2[local18];
				arg2[local18++] = local86;
			}
		}
		arg0[arg1] = arg0[local18];
		arg0[local18] = local22;
		arg2[arg1] = arg2[local18];
		arg2[local18] = local36;
		method6758(arg0, local18 - 1, arg2, arg3);
		method6758(arg0, arg1, arg2, local18 + 1);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ha;I)Lclient!kr;")
	public static Class20 method6759(@OriginalArg(1) Class87 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub29 local10 = (Class2_Sub29) Static581.aClass222_41.method5468((long) arg1);
		if (local10 != null) {
			@Pc(25) Class2_Sub16_Sub2 local25 = local10.aClass52_Sub1_1.method1226();
			local10.aBoolean416 = true;
			if (local25 != null) {
				return local25.method2813(arg0);
			}
		}
		return null;
	}
}
