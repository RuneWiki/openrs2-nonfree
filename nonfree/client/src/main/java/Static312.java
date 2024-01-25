import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "Lclient!el;")
	public static final Class109 aClass109_118 = new Class109(8, -2);

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(III)Z")
	public static boolean method4749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static196.method2833(arg0, arg1) | (arg1 & 0x70000) != 0 || Static38.method660(arg0, arg1);
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
	public static void method4750() {
		if (Static672.aByteArray113 != null) {
			Static679.method9320();
		} else if (Static471.anInt7980 == -1) {
			Static193.method7064(Static289.aString139, Static43.aString11);
		} else {
			Static342.method5197();
		}
	}

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)I")
	public static int method4751() {
		return Static134.anInt2231++;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIZI)V")
	public static void method4752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19 = arg0;
		@Pc(23) int local23 = arg4 * arg4;
		@Pc(27) int local27 = arg0 * arg0;
		@Pc(31) int local31 = local27 << 1;
		@Pc(35) int local35 = local23 << 1;
		@Pc(39) int local39 = arg0 << 1;
		@Pc(48) int local48 = local31 + (1 - local39) * local23;
		@Pc(56) int local56 = local27 - local35 * (local39 - 1);
		@Pc(60) int local60 = local23 << 2;
		@Pc(64) int local64 = local27 << 2;
		@Pc(72) int local72 = local31 * 3;
		@Pc(80) int local80 = ((arg0 << 1) - 3) * local35;
		@Pc(86) int local86 = local64;
		@Pc(92) int local92 = (arg0 - 1) * local60;
		@Pc(113) int local113;
		@Pc(122) int local122;
		if (arg2 >= Static456.anInt7815 && arg2 <= Static604.anInt10083) {
			local113 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg3 + arg4);
			local122 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg3 - arg4);
			Static646.method7025(Static569.anIntArrayArray54[arg2], local122, local113, arg1);
		}
		while (local19 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local56 += local86;
					local48 += local72;
					local72 += local64;
					local86 += local64;
					local7++;
				}
			}
			if (local56 < 0) {
				local48 += local72;
				local56 += local86;
				local7++;
				local72 += local64;
				local86 += local64;
			}
			local48 += -local92;
			local56 += -local80;
			local80 -= local60;
			local92 -= local60;
			local19--;
			local113 = arg2 - local19;
			local122 = arg2 + local19;
			if (local122 >= Static456.anInt7815 && Static604.anInt10083 >= local113) {
				@Pc(238) int local238 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg3 + local7);
				@Pc(247) int local247 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg3 - local7);
				if (Static456.anInt7815 <= local113) {
					Static646.method7025(Static569.anIntArrayArray54[local113], local247, local238, arg1);
				}
				if (Static604.anInt10083 >= local122) {
					Static646.method7025(Static569.anIntArrayArray54[local122], local247, local238, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIII)Lclient!ol;")
	public static Class29 method4753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 67481L ^ (long) arg1 * 97549L ^ (long) arg5 * 475427L ^ (long) arg3 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg2 * 76724863L;
		@Pc(39) Class29 local39 = (Class29) Static432.aClass391_39.method9275(local33);
		if (local39 == null) {
			local39 = Static60.aClass57_1.method7667(arg4, arg1, arg5, arg3, arg0, arg2);
			Static432.aClass391_39.method9273(local33, local39, 1);
			return local39;
		} else {
			return local39;
		}
	}
}
