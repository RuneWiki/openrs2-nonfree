import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
	public static int anInt8785;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_112 = new Class316(52, 7);

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
	public static int anInt8786 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
	public static void method7003(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static497.aHashtable6.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public static void method7005() {
		Static542.anInt9320 = -1;
		Static567.anInt9818 = -1;
		Static82.anInt1372 = -1;
		Static154.anInt2875 = 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIII)V")
	public static void method7006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg2 << 1) - 3) * local25;
		@Pc(82) int local82 = local55;
		@Pc(88) int local88 = (arg2 - 1) * local51;
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (arg0 >= Static133.anInt2531 && arg0 <= Static52.anInt1226) {
			local107 = Static502.method6952(Static205.anInt3906, arg1 + arg3, Static529.anInt9806);
			local116 = Static502.method6952(Static205.anInt3906, arg1 - arg3, Static529.anInt9806);
			Static264.method4006(local107, arg4, local116, Static155.anIntArrayArray32[arg0]);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local47 += local82;
					local39 += local63;
					local63 += local55;
					local82 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local47 += local82;
				local39 += local63;
				local82 += local55;
				local7++;
				local63 += local55;
			}
			local39 += -local88;
			local47 += -local71;
			local9--;
			local88 -= local51;
			local71 -= local51;
			local107 = arg0 - local9;
			local116 = arg0 + local9;
			if (local116 >= Static133.anInt2531 && local107 <= Static52.anInt1226) {
				@Pc(222) int local222 = Static502.method6952(Static205.anInt3906, arg1 + local7, Static529.anInt9806);
				@Pc(231) int local231 = Static502.method6952(Static205.anInt3906, arg1 - local7, Static529.anInt9806);
				if (local107 >= Static133.anInt2531) {
					Static264.method4006(local222, arg4, local231, Static155.anIntArrayArray32[local107]);
				}
				if (Static52.anInt1226 >= local116) {
					Static264.method4006(local222, arg4, local231, Static155.anIntArrayArray32[local116]);
				}
			}
		}
	}
}
