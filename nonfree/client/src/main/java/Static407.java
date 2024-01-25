import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Lclient!fn;")
	public static final Class103 aClass103_19 = new Class103();

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
	public static int anInt7000 = -1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILjava/lang/String;Lclient!ga;)Lclient!oca;")
	public static Class236 method5753(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class111 arg2) {
		@Pc(10) int local10 = arg2.method2462(arg1);
		if (local10 == -1) {
			return new Class236(0);
		}
		@Pc(24) int[] local24 = arg2.method2457(local10);
		@Pc(30) Class236 local30 = new Class236(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local32 < local30.anInt6600) {
				@Pc(50) Class1_Sub20 local50 = new Class1_Sub20(arg2.method2441(local24[local34++], local10));
				@Pc(54) int local54 = local50.method4371();
				@Pc(58) int local58 = local50.method4426();
				@Pc(62) int local62 = local50.method4393();
				if (!arg0 && local62 == 1) {
					local30.anInt6600--;
				} else {
					local30.anIntArray441[local32] = local54;
					local30.anIntArray443[local32] = local58;
					local32++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([SII)[S")
	public static short[] method5754(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static600.method3770(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIBIII)V")
	public static void method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = Static12.aShort1 + local7 * (Static319.aShort52 - Static12.aShort1) / 100;
		@Pc(38) int local38 = local32 * arg6 >> 8;
		@Pc(45) int local45 = 16384 - arg4 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg1 & 0x3FFF;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = local38;
		if (local45 != 0) {
			local56 = Class151.anIntArray244[local45] * -local38 >> 14;
			local58 = local38 * Class151.anIntArray245[local45] >> 14;
		}
		if (local52 != 0) {
			local54 = Class151.anIntArray244[local52] * local58 >> 14;
			local58 = Class151.anIntArray245[local52] * local58 >> 14;
		}
		Static350.anInt6168 = arg3 - local56;
		Static124.anInt2517 = arg4;
		Static202.anInt4065 = arg1;
		Static333.anInt5940 = arg5 - local54;
		Static216.anInt4203 = arg0 - local58;
		Static427.anInt7255 = 0;
	}
}
