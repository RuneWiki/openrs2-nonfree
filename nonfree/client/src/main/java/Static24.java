import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!uj;")
	public static Class4_Sub3_Sub14 aClass4_Sub3_Sub14_1;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "Lclient!ib;")
	public static Class4_Sub3_Sub10 aClass4_Sub3_Sub10_2;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	public static int anInt344 = 255;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "S")
	public static short aShort9 = 1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)Lclient!rl;")
	public static Class4_Sub27 method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub27 local9 = new Class4_Sub27();
		local9.anInt4620 = arg1;
		local9.anInt4621 = arg0;
		Static148.aClass85_13.method1841(local9, (long) arg2);
		Static15.method230(arg0);
		@Pc(28) Class189 local28 = Static114.method1814(arg2);
		if (local28 != null) {
			Static205.method3283(local28);
		}
		if (Static252.aClass189_14 != null) {
			Static205.method3283(Static252.aClass189_14);
			Static252.aClass189_14 = null;
		}
		@Pc(52) int local52 = Static300.anInt5638;
		@Pc(54) int local54;
		for (local54 = 0; local54 < local52; local54++) {
			if (Static237.method3696(Static262.aShortArray100[local54])) {
				Static181.method2942(local54);
			}
		}
		if (Static300.anInt5638 == 1) {
			Static18.aBoolean17 = false;
			Static4.method66(Static234.anInt4441, Static122.anInt2394, Static201.anInt3890, Static181.anInt3455);
		} else {
			Static4.method66(Static234.anInt4441, Static122.anInt2394, Static201.anInt3890, Static181.anInt3455);
			local54 = Static211.aClass4_Sub3_Sub5_3.method2259(Static171.aString202);
			for (@Pc(95) int local95 = 0; local95 < Static300.anInt5638; local95++) {
				@Pc(108) int local108 = Static211.aClass4_Sub3_Sub5_3.method2259(Static190.method3005(local95));
				if (local54 < local108) {
					local54 = local108;
				}
			}
			Static122.anInt2394 = (Static300.aBoolean390 ? 26 : 22) + Static300.anInt5638 * 15;
			Static234.anInt4441 = local54 + 8;
		}
		if (local28 != null) {
			Static272.method4288(false, local28);
		}
		Static71.method1102(arg0);
		if (Static107.anInt5399 != -1) {
			Static205.method3290(Static107.anInt5399, 1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIJ)V")
	public static void method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class182 local8 = new Class182();
		local8.aLong193 = arg8;
		local8.anInt5493 = arg1 * 128 + 64;
		local8.anInt5492 = arg2 * 128 + 64;
		local8.anInt5495 = arg3;
		local8.aClass53_5 = arg4;
		local8.aClass53_4 = arg5;
		local8.anInt5494 = arg6;
		local8.anInt5489 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static6.aClass4_Sub19ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static6.aClass4_Sub19ArrayArrayArray1[local42][arg1][arg2] = new Class4_Sub19(local42, arg1, arg2);
			}
		}
		Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass182_1 = local8;
	}
}
