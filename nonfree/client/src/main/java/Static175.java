import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	public static int anInt3636;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	public static int anInt3639;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public static int anInt3640;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "J")
	public static long aLong93 = 0L;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	public static int anInt3641 = 0;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
	public static final int[] anIntArray220 = new int[3];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
	public static boolean method3215(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(CZ)Z")
	public static boolean method3216(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
	public static int method3218() {
		@Pc(7) Class100 local7 = Static162.aClass100_7;
		@Pc(9) boolean local9 = false;
		if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static280.method4926((Class353) null, local18, (Interface4) null, 0, 0);
		}
		@Pc(37) long local37 = Static32.method595();
		for (@Pc(39) int local39 = 0; local39 < 10000; local39++) {
			local7.method8792();
		}
		@Pc(73) int local73 = (int) (Static32.method595() - local37);
		local7.method8815(0, -16777216, 100, 0, 100);
		if (local9) {
			local7.method8789();
		}
		return local73;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBLjava/lang/Object;)[B")
	public static byte[] method3219(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg1;
			return Static360.method5726(arg0, local20);
		} else if (arg1 instanceof Class263) {
			@Pc(32) Class263 local32 = (Class263) arg1;
			return local32.method6923(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V")
	public static void method3220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(75) int local75 = ((arg1 << 1) - 3) * local25;
		@Pc(81) int local81 = local54;
		@Pc(99) int local99;
		@Pc(108) int local108;
		if (arg0 >= Static100.anInt10042 && arg0 <= Static567.anInt9578) {
			local99 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 + arg2);
			local108 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 - arg2);
			Static312.method5228(arg4, Static484.anIntArrayArray41[arg0], local99, local108);
		}
		@Pc(122) int local122 = local50 * (arg1 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local81;
					local38 += local62;
					local7++;
					local62 += local54;
					local81 += local54;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local81;
				local7++;
				local81 += local54;
				local62 += local54;
			}
			local46 += -local75;
			local38 += -local122;
			local122 -= local50;
			local9--;
			local75 -= local50;
			local99 = arg0 - local9;
			local108 = local9 + arg0;
			if (Static100.anInt10042 <= local108 && Static567.anInt9578 >= local99) {
				@Pc(211) int local211 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local7 + arg3);
				@Pc(220) int local220 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg3 - local7);
				if (local99 >= Static100.anInt10042) {
					Static312.method5228(arg4, Static484.anIntArrayArray41[local99], local211, local220);
				}
				if (local108 <= Static567.anInt9578) {
					Static312.method5228(arg4, Static484.anIntArrayArray41[local108], local211, local220);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method3221() {
		@Pc(7) int local7 = Static530.anInt8592;
		@Pc(9) int[] local9 = Static551.anIntArray576;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class20_Sub2_Sub2_Sub1_Sub1 local19 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static200.method3538(local19.method4913(), local19);
			}
		}
	}
}
