import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "[[Lclient!vj;")
	public static Class21_Sub1[][] aClass21_Sub1ArrayArray3;

	@OriginalMember(owner = "client!ofa", name = "j", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_11 = new Class277(14, -1);

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "Lclient!is;")
	public static Class155 aClass155_8 = null;

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_103 = new Class90(87, 12);

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "Lclient!sca;")
	public static final Class41 aClass41_1 = Static282.method4489();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Lclient!nea;")
	public static Class232 method5817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class232 local7 = new Class232();
		local7.anInt6654 = -1;
		local7.anInt6663 = arg0 + 5 + 1;
		local7.anInt6659 = arg1 + 1 + 5;
		local7.anInt6640 = -1;
		local7.anIntArrayArray31 = new int[local7.anInt6663][local7.anInt6659];
		local7.method5276();
		return local7;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!ufa;B)V")
	public static void method5818(@OriginalArg(0) Class21_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4242 - Static306.anInt6122;
		@Pc(19) int local19 = arg0.anInt4239 * 512 + arg0.method3339() * 256;
		@Pc(31) int local31 = arg0.anInt4274 * 512 + arg0.method3339() * 256;
		arg0.anInt10551 += (local19 - arg0.anInt10551) / local8;
		arg0.anInt10550 += (local31 - arg0.anInt10550) / local8;
		arg0.anInt4279 = 0;
		if (arg0.anInt4215 == 0) {
			arg0.method3325(8192);
		}
		if (arg0.anInt4215 == 1) {
			arg0.method3325(12288);
		}
		if (arg0.anInt4215 == 2) {
			arg0.method3325(0);
		}
		if (arg0.anInt4215 == 3) {
			arg0.method3325(4096);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IJ)V")
	public static void method5819(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static277.anInt5777;
		@Pc(14) int local14 = Static27.anInt4151;
		@Pc(26) int local26;
		@Pc(34) int local34;
		if (Static148.anInt3159 != local7) {
			local26 = local7 - Static148.anInt3159;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local26 > local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local26 < local34) {
				local34 = local26;
			}
			Static148.anInt3159 += local34;
		}
		if (!Static455.aClass4_Sub35_Sub1_1.aBoolean674) {
			Static155.aFloat73 += Static1.aFloat107 * (float) arg0 / 40.0F * 8.0F;
			Static189.aFloat83 += Static15.aFloat37 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local14 != Static222.anInt4655) {
			local26 = local14 - Static222.anInt4655;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local34 < local26) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local26 < local34) {
				local34 = local26;
			}
			Static222.anInt4655 += local34;
		}
		Static424.method6349();
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!vo;III)Lclient!ll;")
	public static Class198 method5821(@OriginalArg(0) Class348 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method7964(0, arg1);
		return local9 == null ? null : new Class198(local9);
	}
}
