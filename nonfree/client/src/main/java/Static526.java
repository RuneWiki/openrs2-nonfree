import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!xa;")
	public static Class71 aClass71_57;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public static int anInt9112 = -1;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public static void method7221() {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(17) Class224 local17 = Static174.aClass313_24.method6994("3", false);
			while (local17.anInt6632 == 0) {
				Static183.method3079(1L);
			}
			if (local17.anInt6632 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class108) local17.anObject14;
			@Pc(44) byte[] local44 = new byte[(int) local7.method2449()];
			if (local44.length == 0) {
				Static277.aString39 = "";
				Static535.aString84 = "";
			} else {
				@Pc(70) int local70;
				for (@Pc(58) int local58 = 0; local58 < local44.length; local58 += local70) {
					local70 = local7.method2451(local58, local44.length - local58, local44);
					if (local70 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(96) Class6_Sub12 local96 = new Class6_Sub12(local44);
				@Pc(100) int local100 = local96.method6019();
				if (local100 > 60) {
					throw new RuntimeException("Bad length");
				}
				local96.anInt7556 = local100 + 1;
				if (!local96.method6018()) {
					throw new RuntimeException("Invalid CRC");
				}
				local96.anInt7556 = 1;
				@Pc(129) int local129 = local96.method6019();
				if (local129 > 2) {
					throw new RuntimeException("Invalid version " + local129);
				}
				Static277.aString39 = local96.method6012();
				Static535.aString84 = local96.method6012();
				if (local129 < 1) {
					Static308.anInt5672 = Static543.anInt9322;
				} else {
					Static308.anInt5672 = local96.method6044();
				}
				if (local129 < 2) {
					Static352.aLong165 = Static184.aLong78;
				} else {
					Static352.aLong165 = local96.method6016();
				}
			}
		} catch (@Pc(175) Exception local175) {
			Static277.aString39 = "";
			Static535.aString84 = "";
		}
		try {
			if (local7 != null) {
				local7.method2453();
			}
		} catch (@Pc(186) Exception local186) {
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!jr;)Lclient!os;")
	public static Class240 method7222(@OriginalArg(1) Class6_Sub12 arg0) {
		@Pc(14) int local14 = arg0.method6044();
		return new Class240(local14);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!oa;Lclient!gfa;III)V")
	public static void method7224(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class133 local12;
		if (arg3 < Static547.anInt9363) {
			local12 = Static113.aClass133ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass15_Sub3_2 != null && local12.aClass15_Sub3_2.method7162()) {
				arg1.method7163(0, Static113.anInt1928, local12.aClass15_Sub3_2, 0, true, arg0);
			}
		}
		if (arg4 < Static547.anInt9363) {
			local12 = Static113.aClass133ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass15_Sub3_2 != null && local12.aClass15_Sub3_2.method7162()) {
				arg1.method7163(Static113.anInt1928, 0, local12.aClass15_Sub3_2, 0, true, arg0);
			}
		}
		if (arg3 < Static547.anInt9363 && arg4 < Static20.anInt358) {
			local12 = Static113.aClass133ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass15_Sub3_2 != null && local12.aClass15_Sub3_2.method7162()) {
				arg1.method7163(Static113.anInt1928, Static113.anInt1928, local12.aClass15_Sub3_2, 0, true, arg0);
			}
		}
		if (arg3 < Static547.anInt9363 && arg4 > 0) {
			local12 = Static113.aClass133ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass15_Sub3_2 != null && local12.aClass15_Sub3_2.method7162()) {
				arg1.method7163(-Static113.anInt1928, Static113.anInt1928, local12.aClass15_Sub3_2, 0, true, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
	public static int method7225(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(23) int local23 = (arg0 & 0x7F) * 96 >> 7;
		if (local23 < 2) {
			local23 = 2;
		} else if (local23 > 126) {
			local23 = 126;
		}
		return local23 + (arg0 & 0xFF80);
	}
}
