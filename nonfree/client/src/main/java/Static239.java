import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt4701 = 0;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_65 = new Class212(14, 2);

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt4704 = -1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III[BII)Z")
	public static boolean method4009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class4_Sub20 local16 = new Class4_Sub20(arg3);
		@Pc(18) int local18 = -1;
		label54: while (true) {
			@Pc(22) int local22 = local16.method4620();
			if (local22 == 0) {
				return local7;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(43) int local43;
				while (!local35) {
					local43 = local16.method4575();
					if (local43 == 0) {
						continue label54;
					}
					local33 += local43 - 1;
					@Pc(70) int local70 = local33 & 0x3F;
					@Pc(76) int local76 = local33 >> 6 & 0x3F;
					@Pc(82) int local82 = local16.method4614() >> 2;
					@Pc(87) int local87 = local76 + arg4;
					@Pc(91) int local91 = local70 + arg1;
					if (local87 > 0 && local91 > 0 && local87 < arg2 - 1 && local91 < arg0 - 1) {
						@Pc(117) Class139 local117 = Static146.aClass228_1.method5203(local18);
						if (local82 != 22 || Static157.aClass185_Sub1_1.aBoolean400 || local117.anInt4358 != 0 || local117.anInt4367 == 1 || local117.aBoolean280) {
							local35 = true;
							if (!local117.method3748()) {
								Static93.anInt2062++;
								local7 = false;
							}
						}
					}
				}
				local43 = local16.method4575();
				if (local43 == 0) {
					break;
				}
				local16.method4614();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)I")
	public static int method4011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 1);
	}
}
