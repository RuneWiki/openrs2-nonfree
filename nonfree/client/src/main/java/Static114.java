import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt2731;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_14 = new Class116();

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	public static int anInt2730 = 0;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_131 = new Class159("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)B")
	public static byte method2391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[BI)Z")
	public static boolean method2393(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub11 local12 = new Class4_Sub11(arg1);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(18) int local18 = local12.method3416();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(64) int local64;
				@Pc(101) Class18 local101;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method3457();
										if (local37 == 0) {
											continue label70;
										}
										local12.method3440();
									}
									local37 = local12.method3457();
									if (local37 == 0) {
										continue label70;
									}
									local29 += local37 - 1;
									@Pc(52) int local52 = local29 & 0x3F;
									@Pc(58) int local58 = local29 >> 6 & 0x3F;
									local64 = local12.method3440() >> 2;
									local68 = arg0 + local58;
									local72 = local52 + arg2;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (local68 >= Static350.anInt6637 - 1);
					} while (Static105.anInt2647 - 1 <= local72);
					local101 = Static113.method2380(local14);
				} while (local64 == 22 && !Static181.aBoolean302 && local101.anInt503 == 0 && local101.anInt526 != 1 && !local101.aBoolean51);
				if (!local101.method417()) {
					Static256.anInt5173++;
					local7 = false;
				}
				local31 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
	public static int method2394() {
		return 6;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIILclient!ni;IILclient!vq;II)Lclient!ni;")
	public static Class38 method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class38 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class47 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class38 local12 = (Class38) Static327.aClass198_230.method5210(local6);
		if (local12 == null) {
			@Pc(22) Class165 local22 = Static170.method3292(arg5, Static142.aClass193_53);
			if (local22 == null) {
				return null;
			}
			local12 = arg7.method2717(local22, 1031, Static261.anInt5266, 64, 768);
			Static327.aClass198_230.method5201(local12, local6);
		}
		local12 = local12.method1915((byte) 2, 1031, true);
		if (arg8 != 0) {
			local12.method1899(arg8);
		}
		if (arg0 != 0) {
			local12.method1913(arg0);
		}
		if (arg9 != 0) {
			local12.method1897(arg9);
		}
		if (arg6 != 0) {
			local12.method1883(0, arg6, 0);
		}
		return local12;
	}
}
