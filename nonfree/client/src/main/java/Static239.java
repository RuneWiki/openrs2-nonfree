import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "J")
	public static long aLong222 = 20000000L;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public static int anInt8665 = 0;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt8669 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!fga;BI)V")
	public static void method7071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class4_Sub36 local10 = (Class4_Sub36) Static88.aClass244_18.method5963(); local10 != null; local10 = (Class4_Sub36) Static88.aClass244_18.method5965()) {
			if (local10.anInt8123 == arg3 && local10.anInt8131 == arg0 << 9 && arg1 << 9 == local10.anInt8132 && arg2.anInt2942 == local10.aClass101_1.anInt2942) {
				if (local10.aClass4_Sub7_Sub4_1 != null) {
					Static444.aClass4_Sub7_Sub1_2.method400(local10.aClass4_Sub7_Sub4_1);
					local10.aClass4_Sub7_Sub4_1 = null;
				}
				if (local10.aClass4_Sub7_Sub4_2 != null) {
					Static444.aClass4_Sub7_Sub1_2.method400(local10.aClass4_Sub7_Sub4_2);
					local10.aClass4_Sub7_Sub4_2 = null;
				}
				local10.method8379();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[J[Ljava/lang/Object;BI)V")
	public static void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg3; local56 < arg0; local56++) {
			if (arg1[local56] < (long) (local56 & local54) + local20) {
				@Pc(73) long local73 = arg1[local56];
				arg1[local56] = arg1[local16];
				arg1[local16] = local73;
				@Pc(87) Object local87 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16++] = local87;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg0] = arg2[local16];
		arg2[local16] = local34;
		method7072(local16 - 1, arg1, arg2, arg3);
		method7072(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method7074() {
		if (Static5.method133(Static203.anInt3855) || Static272.method4728(Static203.anInt3855)) {
			Static217.method8377(5000, Static110.anInt2624 >> 12, Static24.anInt387 >> 12);
		} else {
			@Pc(20) int local20 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0] >> 3;
			@Pc(27) int local27 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0] >> 3;
			if (local20 >= 0 && Static428.anInt8046 >> 3 > local20 && local27 >= 0 && Static119.anInt2717 >> 3 > local27) {
				Static217.method8377(5000, local27, local20);
			} else {
				Static217.method8377(0, Static119.anInt2717 >> 4, Static428.anInt8046 >> 4);
			}
		}
		Static525.method7620();
		Static511.method7460();
		Static187.method3302();
		Static333.method5937();
	}
}
