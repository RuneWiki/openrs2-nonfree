import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public static int anInt2122;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!kka;")
	public static Class197 aClass197_2;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!uq;")
	public static Class362 aClass362_22;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!sia;")
	public static final Class323 aClass323_2 = new Class323();

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[Ljava/lang/Object;B[II)V")
	public static void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg0) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local25;
		@Pc(39) Object local39 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local39;
		@Pc(56) int local56 = local25 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg3; local58 < arg0; local58++) {
			if (local25 + (local56 & local58) > arg2[local58]) {
				@Pc(73) int local73 = arg2[local58];
				arg2[local58] = arg2[local21];
				arg2[local21] = local73;
				@Pc(87) Object local87 = arg1[local58];
				arg1[local58] = arg1[local21];
				arg1[local21++] = local87;
			}
		}
		arg2[arg0] = arg2[local21];
		arg2[local21] = local25;
		arg1[arg0] = arg1[local21];
		arg1[local21] = local39;
		method1795(local21 - 1, arg1, arg2, arg3);
		method1795(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIZI)V")
	public static void method1799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 0) {
			Static345.method5025(false);
		} else {
			Static449.anInt7237 = Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899();
			Static168.method2665(true, 0);
		}
		Static468.aBoolean529 = arg2;
		Static622.anInt10289 = arg3;
		Static388.anInt6479 = arg0;
		Static671.method7637(arg1);
	}
}
