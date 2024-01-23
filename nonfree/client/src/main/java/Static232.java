import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!ii;")
	public static Class69 aClass69_11 = new Class69(64);

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public static int anInt4528 = 0;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString149 = null;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([II[III)V")
	public static void method3631(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(7) int local7 = arg2;
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(18) int local18 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local18;
		@Pc(32) int local32 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local32;
		for (@Pc(44) int local44 = arg2; local44 < arg3; local44++) {
			if ((local44 & 0x1) + local18 < arg0[local44]) {
				@Pc(68) int local68 = arg0[local44];
				arg0[local44] = arg0[local7];
				arg0[local7] = local68;
				@Pc(82) int local82 = arg1[local44];
				arg1[local44] = arg1[local7];
				arg1[local7++] = local82;
			}
		}
		arg0[arg3] = arg0[local7];
		arg0[local7] = local18;
		arg1[arg3] = arg1[local7];
		arg1[local7] = local32;
		method3631(arg0, arg1, arg2, local7 - 1);
		method3631(arg0, arg1, local7 + 1, arg3);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public static void method3632() {
		aString149 = null;
		aClass69_11 = null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!vi;)V")
	public static void method3633(@OriginalArg(1) Class4_Sub30 arg0) {
		@Pc(1) int local1 = -1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) long local15 = 0L;
		if (arg0.anInt5343 == 0) {
			local15 = Static215.method3428(arg0.anInt5342, arg0.anInt5329, arg0.anInt5331);
		}
		if (arg0.anInt5343 == 1) {
			local15 = Static217.method3493(arg0.anInt5342, arg0.anInt5329, arg0.anInt5331);
		}
		if (arg0.anInt5343 == 2) {
			local15 = Static154.method2467(arg0.anInt5342, arg0.anInt5329, arg0.anInt5331);
		}
		if (arg0.anInt5343 == 3) {
			local15 = Static65.method1011(arg0.anInt5342, arg0.anInt5329, arg0.anInt5331);
		}
		if (local15 != 0L) {
			local13 = (int) local15 >> 20 & 0x3;
			local11 = (int) local15 >> 14 & 0x1F;
			local1 = (int) (local15 >>> 32) & Integer.MAX_VALUE;
		}
		arg0.anInt5332 = local11;
		arg0.anInt5330 = local1;
		arg0.anInt5338 = local13;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method3634(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg1[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(31) int local31 = arg2 + arg0;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg0; local35 < local31; local35++) {
				@Pc(46) String local46 = arg1[local35];
				if (local46 == null) {
					local33 += 4;
				} else {
					local33 += local46.length();
				}
			}
			@Pc(70) StringBuffer local70 = new StringBuffer(local33);
			for (@Pc(72) int local72 = arg0; local72 < local31; local72++) {
				@Pc(83) String local83 = arg1[local72];
				if (local83 == null) {
					local70.append("null");
				} else {
					local70.append(local83);
				}
			}
			return local70.toString();
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public static void method3635() {
		if (Static298.aBoolean356) {
			return;
		}
		Static114.aBoolean167 = true;
		if (Static74.aBoolean115) {
			Static96.aFloat16 = (int) Static96.aFloat16 + 47 & 0xFFFFFFF0;
		} else {
			Static86.aFloat13 += (12.0F - Static86.aFloat13) / 2.0F;
		}
		Static298.aBoolean356 = true;
	}
}
