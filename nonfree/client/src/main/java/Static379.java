import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "Lclient!hh;")
	public static Class109 aClass109_85;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	public static int anInt6817 = 0;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Lclient!ti;")
	public static final Class1_Sub14 aClass1_Sub14_6 = new Class1_Sub14(new byte[5000]);

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_18 = new Class222(7, 0, 1, 1);

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
	public static int anInt6822 = -1;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	public static int anInt6823 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZI)Lclient!ej;")
	public static Class1_Sub13 method5347(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class1_Sub13) Static85.aClass51_6.method930(local17);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;IZJBIZI)V")
	public static void method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static378.aBoolean549 && Static119.anInt2296 < 500) {
			@Pc(18) int local18 = arg1 == -1 ? Static139.anInt2525 : arg1;
			@Pc(32) Class1_Sub3 local32 = new Class1_Sub3(arg3, arg2, local18, arg7, arg0, arg6, arg4, arg9, arg8, arg5);
			Static251.aClass142_26.method3212(local32);
			Static119.anInt2296++;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!ir;I)V")
	public static void method5350(@OriginalArg(0) int arg0, @OriginalArg(1) Class47_Sub1_Sub5 arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (Static123.anInt2333 < arg1.anInt5344) {
			Static191.method3008(arg1);
		} else if (Static123.anInt2333 <= arg1.anInt5380) {
			Static228.method3296(arg1);
		} else {
			Static288.method3961(false, arg1);
			local14 = Static437.anInt7634;
			local12 = Static105.anInt2074;
		}
		if (arg1.anInt7060 < 128 || arg1.anInt7066 < 128 || Static80.anInt6558 * 128 - 128 <= arg1.anInt7060 || arg1.anInt7066 >= Static104.anInt2048 * 128 - 128) {
			arg1.anInt5381 = -1;
			arg1.anInt5348 = -1;
			local14 = 0;
			local12 = -1;
			arg1.anInt5380 = 0;
			arg1.anInt5392 = -1;
			arg1.anInt5344 = 0;
			arg1.anInt7060 = arg1.anIntArray407[0] * 128 + arg1.method4317() * 64;
			arg1.anInt7066 = arg1.anIntArray408[0] * 128 + arg1.method4317() * 64;
			arg1.method4331();
		}
		if (arg1 == Static255.aClass47_Sub1_Sub5_Sub2_2 && (arg1.anInt7060 < 1536 || arg1.anInt7066 < 1536 || arg1.anInt7060 >= (Static80.anInt6558 - 12) * 128 || Static104.anInt2048 * 128 - 1536 <= arg1.anInt7066)) {
			local12 = -1;
			arg1.anInt5380 = 0;
			arg1.anInt5344 = 0;
			arg1.anInt5348 = -1;
			arg1.anInt5392 = -1;
			local14 = 0;
			arg1.anInt5381 = -1;
			arg1.anInt7060 = arg1.anIntArray407[0] * 128 + arg1.method4317() * 64;
			arg1.anInt7066 = arg1.anIntArray408[0] * 128 + arg1.method4317() * 64;
			arg1.method4331();
		}
		@Pc(220) int local220 = Static111.method1741(arg1);
		Static35.method477(local14, local220, local12, arg1);
		Static213.method3213(arg1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZF)F")
	public static float method5351(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[BIII)V")
	public static void method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(15) int local15 = arg3 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg3 - arg0 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(24) int local24 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg2[local24] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			arg1 = local34 + 1;
			arg2[local34] = 1;
		}
	}
}
