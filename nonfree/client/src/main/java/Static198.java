import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "[S")
	public static short[] aShortArray43 = new short[256];

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!kn;Z)I")
	public static int method2807(@OriginalArg(0) Class206 arg0) {
		if (Static314.aClass206_9 == arg0) {
			return 5120;
		} else if (arg0 == Static314.aClass206_10) {
			return 5122;
		} else if (Static314.aClass206_11 == arg0) {
			return 5124;
		} else if (Static314.aClass206_12 == arg0) {
			return 5121;
		} else if (Static314.aClass206_13 == arg0) {
			return 5123;
		} else if (arg0 == Static314.aClass206_14) {
			return 5125;
		} else if (Static314.aClass206_15 == arg0) {
			return 5131;
		} else if (Static314.aClass206_16 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Lclient!ge;")
	public static Class41_Sub1_Sub4 method2808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null || local7.aClass41_Sub1_Sub4_1 == null ? null : local7.aClass41_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!aa;ILclient!wq;IIIIILclient!kf;Ljava/lang/String;Lclient!da;I)V")
	public static void method2809(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class394 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class198 arg7, @OriginalArg(9) String arg8, @OriginalArg(10) Class72 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static133.anInt2254 == 4) {
			local13 = (int) Static495.aFloat161 & 0x3FFF;
		} else {
			local13 = Static538.anInt8846 + (int) Static495.aFloat161 & 0x3FFF;
		}
		@Pc(31) int local31 = Math.max(arg2.anInt10536 / 2, arg2.anInt10532 / 2) + 10;
		@Pc(39) int local39 = arg6 * arg6 + arg1 * arg1;
		if (local39 > local31 * local31) {
			return;
		}
		@Pc(60) int local60 = Class242.anIntArray384[local13];
		@Pc(64) int local64 = Class242.anIntArray383[local13];
		if (Static133.anInt2254 != 4) {
			local64 = local64 * 256 / (Static342.anInt6178 + 256);
			local60 = local60 * 256 / (Static342.anInt6178 + 256);
		}
		@Pc(93) int local93 = arg1 * local64 + local60 * arg6 >> 14;
		@Pc(103) int local103 = arg6 * local64 - arg1 * local60 >> 14;
		@Pc(112) int local112 = arg7.method4084(100, (Class59[]) null, arg8);
		@Pc(118) int local118 = local93 - local112 / 2;
		@Pc(126) int local126 = arg7.method4082(100, 0, arg8, (Class59[]) null);
		if (local118 >= -arg2.anInt10536 && arg2.anInt10536 >= local118 && local103 >= -arg2.anInt10532 && local103 <= arg2.anInt10532) {
			arg9.method6912(arg10 + arg2.anInt10532 / 2 - arg4 - local103 - local126, 50, arg8, arg10, arg3, 0, local112, 0, arg5, local118 + arg3 + arg2.anInt10536 / 2, 1, arg0, (Class59[]) null, (int[]) null, 0);
		}
	}
}
