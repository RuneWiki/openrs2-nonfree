import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public static int anInt4924;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString310 = "Connection lost.";

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBIII)I")
	public static int method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static331.aClass8Array5 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(19) int local19 = arg3 >> 7;
			@Pc(23) int local23 = arg4 >> 7;
			if (arg2 < 0 || arg1 < 0 || arg2 > Static15.anInt287 - 1 || Static325.anInt6173 - 1 < arg1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static15.anInt287 - 1 && local23 <= Static325.anInt6173 - 1) {
				@Pc(86) boolean local86 = (Static92.aByteArrayArrayArray3[1][arg3 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(111) boolean local111;
				@Pc(127) boolean local127;
				if ((arg3 & 0x7F) == 0) {
					local111 = (Static92.aByteArrayArrayArray3[1][local19 - 1][arg4 >> 7] & 0x2) != 0;
					local127 = (Static92.aByteArrayArrayArray3[1][local19][arg4 >> 7] & 0x2) != 0;
					if (local127 != local111) {
						local86 = (Static92.aByteArrayArrayArray3[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local111 = (Static92.aByteArrayArrayArray3[1][arg3 >> 7][local23 - 1] & 0x2) != 0;
					local127 = (Static92.aByteArrayArrayArray3[1][arg3 >> 7][local23] & 0x2) != 0;
					if (local127 != local111) {
						local86 = (Static92.aByteArrayArrayArray3[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if (local86) {
					arg0++;
				}
				return Static331.aClass8Array5[arg0].method4169(arg3, arg4);
			} else {
				return 0;
			}
		} else {
			return Static331.aClass8Array5[arg0].method4169(arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)V")
	public static void method4300(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static74.anInt1848;
		@Pc(9) int local9 = Static318.anInt611;
		@Pc(17) int local17;
		@Pc(25) int local25;
		if (local7 != Static98.anInt1131) {
			local17 = local7 - Static98.anInt1131;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local25 < local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local25 > local17) {
				local25 = local17;
			}
			Static98.anInt1131 += local25;
		}
		if (!Static268.aBoolean393) {
			Static351.aFloat80 += (float) arg0 * Static290.aFloat73 / 40.0F * 8.0F;
			Static18.aFloat7 += Static321.aFloat76 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local9 != Static319.anInt6099) {
			local17 = local9 - Static319.anInt6099;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 > 0) {
				if (local25 == 0) {
					local25 = 1;
				} else if (local17 < local25) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = -1;
			} else if (local25 < local17) {
				local25 = local17;
			}
			Static319.anInt6099 += local25;
		}
		Static44.method977();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!om;)V")
	public static void method4301(@OriginalArg(1) Class7_Sub29 arg0) {
		if (Static229.aClass49ArrayArrayArray6 == null) {
			return;
		}
		@Pc(8) Interface1 local8 = null;
		if (arg0.anInt4641 == 0) {
			local8 = (Interface1) Static48.method4691(arg0.anInt4632, arg0.anInt4647, arg0.anInt4639);
		}
		if (arg0.anInt4641 == 1) {
			local8 = (Interface1) Static96.method1983(arg0.anInt4632, arg0.anInt4647, arg0.anInt4639);
		}
		if (arg0.anInt4641 == 2) {
			local8 = (Interface1) Static252.method5177(arg0.anInt4632, arg0.anInt4647, arg0.anInt4639, gd.class);
		}
		if (arg0.anInt4641 == 3) {
			local8 = (Interface1) Static44.method981(arg0.anInt4632, arg0.anInt4647, arg0.anInt4639);
		}
		if (local8 == null) {
			arg0.anInt4628 = 0;
			arg0.anInt4633 = 0;
			arg0.anInt4644 = -1;
		} else {
			arg0.anInt4644 = local8.method5362();
			arg0.anInt4628 = local8.method5361();
			arg0.anInt4633 = local8.method5360();
		}
	}
}
