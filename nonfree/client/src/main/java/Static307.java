import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	public static int anInt6091;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "Lclient!ir;")
	public static Class100 aClass100_120;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Lclient!ie;")
	public static Class3_Sub26 aClass3_Sub26_1;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "Lclient!uh;")
	public static Class201 aClass201_16;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public static int anInt6095 = 0;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "I")
	public static int anInt6097 = 0;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public static int anInt6098 = 0;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "I")
	public static int anInt6101 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIII)V")
	public static void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg4);
		@Pc(17) int local17 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg1);
		@Pc(23) int local23 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg0);
		@Pc(29) int local29 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static162.method1731(local29, Static196.anIntArrayArray37[local31], local23, arg2);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public static void method5173() {
		@Pc(5) Class198 local5 = Static56.aClass198_15;
		synchronized (Static56.aClass198_15) {
			Static56.aClass198_15.method5230();
		}
		local5 = Static161.aClass198_25;
		synchronized (Static161.aClass198_25) {
			Static161.aClass198_25.method5230();
		}
		local5 = Static175.aClass198_28;
		synchronized (Static175.aClass198_28) {
			Static175.aClass198_28.method5230();
		}
		local5 = Static278.aClass198_51;
		synchronized (Static278.aClass198_51) {
			Static278.aClass198_51.method5230();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method5177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg0 && arg6 == arg2 && arg5 == arg4 && arg1 == arg7) {
			Static145.method2369(arg5, arg7, arg8, arg3, arg2);
			return;
		}
		@Pc(19) int local19 = arg8;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg8 * 3;
		@Pc(29) int local29 = arg2 * 3;
		@Pc(33) int local33 = arg0 * 3;
		@Pc(37) int local37 = arg6 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg1 * 3;
		@Pc(55) int local55 = local33 + arg5 - arg8 - local41;
		@Pc(64) int local64 = local37 + arg7 - arg2 - local45;
		@Pc(73) int local73 = local25 + local41 - local33 - local33;
		@Pc(83) int local83 = local45 + local29 - local37 - local37;
		@Pc(87) int local87 = local33 - local25;
		@Pc(92) int local92 = local37 - local29;
		for (@Pc(94) int local94 = 128; local94 <= 4096; local94 += 128) {
			@Pc(102) int local102 = local94 * local94 >> 12;
			@Pc(108) int local108 = local94 * local102 >> 12;
			@Pc(112) int local112 = local55 * local108;
			@Pc(116) int local116 = local64 * local108;
			@Pc(120) int local120 = local102 * local73;
			@Pc(124) int local124 = local102 * local83;
			@Pc(128) int local128 = local94 * local87;
			@Pc(132) int local132 = local92 * local94;
			@Pc(142) int local142 = (local128 + local120 + local112 >> 12) + arg8;
			@Pc(153) int local153 = (local116 + local124 + local132 >> 12) + arg2;
			Static145.method2369(local142, local153, local19, arg3, local21);
			local19 = local142;
			local21 = local153;
		}
	}
}
