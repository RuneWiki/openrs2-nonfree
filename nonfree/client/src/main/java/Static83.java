import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ef", name = "yd", descriptor = "Lclient!ls;")
	public static final Class156 aClass156_1 = new Class156();

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(II)V")
	public static void method1597() {
		@Pc(1) Class171 local1 = Static226.aClass171_22;
		synchronized (Static226.aClass171_22) {
			Static226.aClass171_22.method3933(5);
		}
		local1 = Static224.aClass171_36;
		synchronized (Static224.aClass171_36) {
			Static224.aClass171_36.method3933(5);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIIII)V")
	public static void method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static327.method4554(arg2, Static181.anInt3543, Static430.anInt7123);
		@Pc(17) int local17 = Static327.method4554(arg3, Static181.anInt3543, Static430.anInt7123);
		@Pc(23) int local23 = Static327.method4554(arg5, Static184.anInt3600, Static8.anInt223);
		@Pc(29) int local29 = Static327.method4554(arg1, Static184.anInt3600, Static8.anInt223);
		@Pc(38) int local38 = Static327.method4554(arg2 + arg0, Static181.anInt3543, Static430.anInt7123);
		@Pc(47) int local47 = Static327.method4554(arg3 - arg0, Static181.anInt3543, Static430.anInt7123);
		for (@Pc(53) int local53 = local11; local53 < local38; local53++) {
			Static64.method1247(local23, Static280.anIntArrayArray51[local53], local29, arg4);
		}
		for (@Pc(73) int local73 = local17; local73 > local47; local73--) {
			Static64.method1247(local23, Static280.anIntArrayArray51[local73], local29, arg4);
		}
		@Pc(99) int local99 = Static327.method4554(arg5 + arg0, Static184.anInt3600, Static8.anInt223);
		@Pc(108) int local108 = Static327.method4554(arg1 - arg0, Static184.anInt3600, Static8.anInt223);
		for (@Pc(110) int local110 = local38; local110 <= local47; local110++) {
			@Pc(116) int[] local116 = Static280.anIntArrayArray51[local110];
			Static64.method1247(local23, local116, local99, arg4);
			Static64.method1247(local108, local116, local29, arg4);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIZI)V")
	public static void method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg2 << 1;
		@Pc(41) int local41 = local17 * (1 - local33) + local25;
		@Pc(50) int local50 = local21 - local29 * (local33 - 1);
		@Pc(54) int local54 = local17 << 2;
		@Pc(58) int local58 = local21 << 2;
		@Pc(66) int local66 = local25 * 3;
		@Pc(74) int local74 = local29 * ((arg2 << 1) - 3);
		@Pc(80) int local80 = local58;
		@Pc(86) int local86 = (arg2 - 1) * local54;
		Static64.method1247(arg1 - arg0, Static280.anIntArrayArray51[arg3], arg1 + arg0, arg4);
		while (local13 > 0) {
			if (local41 < 0) {
				while (local41 < 0) {
					local50 += local80;
					local41 += local66;
					local11++;
					local80 += local58;
					local66 += local58;
				}
			}
			if (local50 < 0) {
				local41 += local66;
				local50 += local80;
				local11++;
				local80 += local58;
				local66 += local58;
			}
			local41 += -local86;
			local50 += -local74;
			local13--;
			local86 -= local54;
			local74 -= local54;
			@Pc(173) int local173 = arg3 - local13;
			@Pc(178) int local178 = arg3 + local13;
			@Pc(182) int local182 = arg1 + local11;
			@Pc(187) int local187 = arg1 - local11;
			Static64.method1247(local187, Static280.anIntArrayArray51[local173], local182, arg4);
			Static64.method1247(local187, Static280.anIntArrayArray51[local178], local182, arg4);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZII)Z")
	public static boolean method1622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
