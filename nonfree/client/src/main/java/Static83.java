import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "Lclient!os;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "Lclient!m;")
	public static Class127 aClass127_3 = new Class127();

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "Ljava/lang/String;")
	public static final String aString54 = "glow1:";

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLclient!ie;)V")
	public static void method1299(@OriginalArg(1) Class3_Sub26 arg0) {
		if (!Static168.aBoolean192) {
			arg0.method5717();
			Static170.anInt6279--;
		}
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(II)I")
	public static int method1300(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(Z)V")
	public static void method1302() {
		if (Static312.aBoolean428) {
			Static312.aBoolean428 = false;
			Static164.aClass57_23 = null;
			Static237.aClass57_15 = null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!w;Lclient!bd;Lclient!tj;B)V")
	public static void method1303(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class3_Sub5 arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(10) Class57 local10 = arg0.method5568(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5440();
		if (local10.method5447() > local16) {
			local16 = local10.method5447();
		}
		@Pc(28) int local28 = arg1.anInt541;
		@Pc(31) int local31 = arg1.anInt551;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg0.aString250 != null) {
			local33 = Static82.aClass209_1.method5505(null, arg0.aString250, Static290.aStringArray39, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static290.aStringArray39[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static163.aClass201_8.method5260(local57);
				if (local74 > local35) {
					local35 = local74;
				}
			}
			local37 = Static163.aClass201_8.method5263() * local33 + Static163.aClass201_8.method5259() / 2;
		}
		local51 = local16 / 2 + arg1.anInt541;
		if (local28 < Static193.anInt2350 + local16) {
			local28 = Static193.anInt2350;
			local51 = local35 / 2 + Static193.anInt2350 + local16 / 2 + 5 + 10;
		} else if (local28 > Static193.anInt2355 - local16) {
			local28 = Static193.anInt2355 - local16;
			local51 = Static193.anInt2355 - local35 / 2 - local16 / 2 - 10 - 5;
		}
		@Pc(160) int local160 = arg1.anInt551;
		if (local31 < Static193.anInt2356 + local16) {
			local160 = local16 / 2 + Static193.anInt2356 + 10;
			local31 = Static193.anInt2356;
		} else if (Static193.anInt2353 - local16 < local31) {
			local31 = Static193.anInt2353 - local16;
			local160 = Static193.anInt2353 - local16 / 2 - local37 - 10;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg1.anInt541), (double) (local31 - arg1.anInt551)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5435((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(244) int local244 = -2;
		@Pc(246) int local246 = -2;
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		if (arg0.aString250 != null) {
			local244 = local51 - local35 / 2 - 5;
			local246 = local160;
			local248 = local244 + local35 + 10;
			local250 = Static163.aClass201_8.method5263() * local33 + local160 + 3;
			if (arg0.anInt6595 != 0) {
				arg2.method4801(local250 - local160, local244, local160, local248 - local244, arg0.anInt6595);
			}
			if (arg0.anInt6609 != 0) {
				arg2.method4719(local160, arg0.anInt6609, local244, local248 - local244, local250 + -local160);
			}
			for (@Pc(317) int local317 = 0; local317 < local33; local317++) {
				@Pc(323) String local323 = Static290.aStringArray39[local317];
				if (local317 < local33 - 1) {
					local323 = local323.substring(0, local323.length() - 4);
				}
				Static163.aClass201_8.method5264(arg2, local323, local51, local160, arg0.anInt6588);
				local160 += Static163.aClass201_8.method5263();
			}
		}
		local16 >>= 0x1;
		if ((Static192.anInt4000 <= local28 - local16 || local28 + local16 <= Static192.anInt4000 || Static221.anInt4562 <= local31 - local16 || Static221.anInt4562 >= local31 + local16) && (local244 >= Static192.anInt4000 || Static192.anInt4000 >= local248 || Static221.anInt4562 <= local246 || local250 <= Static221.anInt4562)) {
			return;
		}
		if (arg0.aStringArray41[4] != null) {
			Static271.method4580(0, arg0.aStringArray41[4], arg0.aString252, -1, (long) arg1.anInt544, 0, 1006);
		}
		if (arg0.aStringArray41[3] != null) {
			Static271.method4580(0, arg0.aStringArray41[3], arg0.aString252, -1, (long) arg1.anInt544, 0, 1004);
		}
		if (arg0.aStringArray41[2] != null) {
			Static271.method4580(0, arg0.aStringArray41[2], arg0.aString252, -1, (long) arg1.anInt544, 0, 1012);
		}
		if (arg0.aStringArray41[1] != null) {
			Static271.method4580(0, arg0.aStringArray41[1], arg0.aString252, -1, (long) arg1.anInt544, 0, 1007);
		}
		if (arg0.aStringArray41[0] != null) {
			Static271.method4580(0, arg0.aStringArray41[0], arg0.aString252, -1, (long) arg1.anInt544, 0, 1001);
		}
	}
}
