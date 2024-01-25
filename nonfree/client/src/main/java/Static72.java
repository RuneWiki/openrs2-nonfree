import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLclient!rq;)V")
	public static void method950(@OriginalArg(1) Class29_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt8507 - Static358.anInt6263;
		@Pc(20) int local20 = arg0.anInt8506 * 512 + arg0.method7008() * 256;
		@Pc(34) int local34 = arg0.anInt8547 * 512 + arg0.method7008() * 256;
		arg0.anInt9218 += (local34 - arg0.anInt9218) / local9;
		arg0.anInt9222 += (local20 - arg0.anInt9222) / local9;
		arg0.anInt8584 = 0;
		if (arg0.anInt8552 == 0) {
			arg0.method6998(8192);
		}
		if (arg0.anInt8552 == 1) {
			arg0.method6998(12288);
		}
		if (arg0.anInt8552 == 2) {
			arg0.method6998(0);
		}
		if (arg0.anInt8552 == 3) {
			arg0.method6998(4096);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!cr;IBLclient!dga;)V")
	public static void method952(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub14 arg2) {
		@Pc(9) Class6_Sub49 local9 = new Class6_Sub49();
		local9.anInt8987 = arg2.method6041();
		local9.anInt8989 = arg2.method6027();
		local9.anIntArray671 = new int[local9.anInt8987];
		local9.aClass278Array2 = new Class278[local9.anInt8987];
		local9.aByteArrayArrayArray18 = new byte[local9.anInt8987][][];
		local9.anIntArray672 = new int[local9.anInt8987];
		local9.aClass278Array1 = new Class278[local9.anInt8987];
		local9.anIntArray673 = new int[local9.anInt8987];
		for (@Pc(57) int local57 = 0; local57 < local9.anInt8987; local57++) {
			try {
				@Pc(63) int local63 = arg2.method6041();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local78 = arg2.method5991();
					local82 = arg2.method5991();
					local84 = 0;
					if (local63 == 1) {
						local84 = arg2.method6027();
					}
					local9.anIntArray672[local57] = local63;
					local9.anIntArray673[local57] = local84;
					local9.aClass278Array1[local57] = arg0.method923(Static333.method5098(local78), local82);
				} else if (local63 == 3 || local63 == 4) {
					local78 = arg2.method5991();
					local82 = arg2.method5991();
					local84 = arg2.method6041();
					@Pc(135) String[] local135 = new String[local84];
					for (@Pc(137) int local137 = 0; local137 < local84; local137++) {
						local135[local137] = arg2.method5991();
					}
					@Pc(152) byte[][] local152 = new byte[local84][];
					@Pc(163) int local163;
					if (local63 == 3) {
						for (@Pc(157) int local157 = 0; local157 < local84; local157++) {
							local163 = arg2.method6027();
							local152[local157] = new byte[local163];
							arg2.method6018(local163, local152[local157]);
						}
					}
					local9.anIntArray672[local57] = local63;
					@Pc(192) Class[] local192 = new Class[local84];
					for (local163 = 0; local163 < local84; local163++) {
						local192[local163] = Static333.method5098(local135[local163]);
					}
					local9.aClass278Array2[local57] = arg0.method914(local82, local192, Static333.method5098(local78));
					local9.aByteArrayArrayArray18[local57] = local152;
				}
			} catch (@Pc(227) ClassNotFoundException local227) {
				local9.anIntArray671[local57] = -1;
			} catch (@Pc(234) SecurityException local234) {
				local9.anIntArray671[local57] = -2;
			} catch (@Pc(241) NullPointerException local241) {
				local9.anIntArray671[local57] = -3;
			} catch (@Pc(248) Exception local248) {
				local9.anIntArray671[local57] = -4;
			} catch (@Pc(255) Throwable local255) {
				local9.anIntArray671[local57] = -5;
			}
		}
		Static280.aClass275_93.method6370(local9);
	}
}
