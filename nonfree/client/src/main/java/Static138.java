import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!nb;")
	public static Class15 aClass15_29;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	public static int anInt3208;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array49;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!i;")
	private static Class41 aClass41_879 = Static184.method2923("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!i;")
	public static Class41 aClass41_878 = aClass41_879;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!fc;")
	public static Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method2198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg7 && arg4 == arg3 && arg8 == arg2 && arg6 == arg5) {
			Static92.method1617(arg7, arg5, arg1, arg4, arg2);
			return;
		}
		@Pc(33) int local33 = arg7;
		@Pc(35) int local35 = arg4;
		@Pc(39) int local39 = arg7 * 3;
		@Pc(43) int local43 = arg4 * 3;
		@Pc(47) int local47 = arg6 * 3;
		@Pc(51) int local51 = arg3 * 3;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(59) int local59 = arg0 * 3;
		@Pc(69) int local69 = arg5 + local51 - arg4 - local47;
		@Pc(80) int local80 = arg2 + local59 - arg7 - local55;
		@Pc(90) int local90 = local55 + local39 - local59 - local59;
		@Pc(98) int local98 = local43 + local47 - local51 - local51;
		@Pc(103) int local103 = local59 - local39;
		@Pc(108) int local108 = local51 - local43;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local118 * local110 >> 12;
			@Pc(128) int local128 = local80 * local124;
			@Pc(132) int local132 = local118 * local90;
			@Pc(136) int local136 = local110 * local103;
			@Pc(140) int local140 = local118 * local98;
			@Pc(144) int local144 = local69 * local124;
			@Pc(148) int local148 = local108 * local110;
			@Pc(161) int local161 = arg7 + (local128 + local132 + local136 >> 12);
			@Pc(172) int local172 = arg4 + (local148 + local144 + local140 >> 12);
			Static92.method1617(local33, local172, arg1, local35, local161);
			local35 = local172;
			local33 = local161;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!uh;")
	public static Class2_Sub2_Sub22 method2199(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub22 local10 = (Class2_Sub2_Sub22) Static94.aClass43_8.method1464((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static180.aClass15_38.method387(Static63.method1159(arg0), Static213.method3262(arg0));
		local10 = new Class2_Sub2_Sub22();
		if (local26 != null) {
			local10.method3114(new Class2_Sub3(local26));
		}
		Static94.aClass43_8.method1462((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public static void method2200() {
		Static122.aClass43_12.method1469();
		Static204.aClass16_10.method436();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nb;Lclient!sb;Lclient!nb;B)V")
	public static void method2201(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class15 arg2) {
		Static68.aClass15_17 = arg2;
		Static219.anInterface4_1 = arg1;
		Static34.aClass15_7 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public static void method2202() {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = -1; local3 < Static50.anInt2126; local3++) {
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static156.anIntArray386[local3];
			}
			@Pc(21) Class12_Sub3_Sub1 local21 = Static216.aClass12_Sub3_Sub1Array1[local13];
			if (local21 != null && local21.anInt3941 > 0) {
				local21.anInt3941--;
				if (local21.anInt3941 == 0) {
					local21.aClass41_1039 = null;
				}
			}
		}
		for (local13 = 0; local13 < Static50.anInt2134; local13++) {
			@Pc(57) int local57 = Static23.anIntArray47[local13];
			@Pc(61) Class12_Sub3_Sub2 local61 = Static199.aClass12_Sub3_Sub2Array1[local57];
			if (local61 != null && local61.anInt3941 > 0) {
				local61.anInt3941--;
				if (local61.anInt3941 == 0) {
					local61.aClass41_1039 = null;
				}
			}
		}
	}
}
