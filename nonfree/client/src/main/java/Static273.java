import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
	public static int anInt5205;

	@OriginalMember(owner = "client!ti", name = "Z", descriptor = "[[Lclient!nk;")
	public static Class1_Sub20[][] aClass1_Sub20ArrayArray5;

	@OriginalMember(owner = "client!ti", name = "db", descriptor = "Lclient!ph;")
	public static Class138 aClass138_75;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
	public static int anInt5203 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4041(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub1_Sub2 local13 = Static46.method824(2, arg1);
		local13.method294();
		local13.aString12 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIII)V")
	public static void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(33) int local33 = local13 << 1;
		@Pc(37) int local37 = arg4 << 1;
		@Pc(41) int local41 = local13 << 2;
		@Pc(50) int local50 = (1 - local37) * local13 + local21;
		@Pc(54) int local54 = local17 << 2;
		@Pc(63) int local63 = local17 - (local37 - 1) * local33;
		@Pc(71) int local71 = local21 * 3;
		@Pc(77) int local77 = local54;
		@Pc(85) int local85 = ((arg4 << 1) - 3) * local33;
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (Static240.anInt1319 <= arg0 && Static59.anInt1155 >= arg0) {
			local107 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg2 + arg3);
			local116 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg2 - arg3);
			Static109.method1795(local116, Static51.anIntArrayArray1[arg0], local107, arg1);
		}
		@Pc(130) int local130 = (arg4 - 1) * local41;
		while (local9 > 0) {
			local9--;
			if (local50 < 0) {
				while (local50 < 0) {
					local50 += local71;
					local71 += local54;
					local3++;
					local63 += local77;
					local77 += local54;
				}
			}
			if (local63 < 0) {
				local50 += local71;
				local3++;
				local63 += local77;
				local71 += local54;
				local77 += local54;
			}
			local107 = arg0 - local9;
			local116 = arg0 + local9;
			local63 += -local85;
			local50 += -local130;
			local130 -= local41;
			local85 -= local41;
			if (Static240.anInt1319 <= local116 && local107 <= Static59.anInt1155) {
				@Pc(225) int local225 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, local3 + arg2);
				@Pc(234) int local234 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg2 - local3);
				if (Static240.anInt1319 <= local107) {
					Static109.method1795(local234, Static51.anIntArrayArray1[local107], local225, arg1);
				}
				if (local116 <= Static59.anInt1155) {
					Static109.method1795(local234, Static51.anIntArrayArray1[local116], local225, arg1);
				}
			}
		}
	}
}
