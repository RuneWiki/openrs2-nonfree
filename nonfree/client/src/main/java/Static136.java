import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!jn", name = "G", descriptor = "Lclient!kc;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!jn", name = "O", descriptor = "Lclient!nk;")
	public static Class121 aClass121_66;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V")
	public static void method2364(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(21) int local21 = (arg1 + arg3) / 2;
		@Pc(23) int local23 = arg1;
		@Pc(27) long local27 = arg2[local21];
		arg2[local21] = arg2[arg3];
		arg2[arg3] = local27;
		@Pc(41) Object local41 = arg0[local21];
		arg0[local21] = arg0[arg3];
		arg0[arg3] = local41;
		for (@Pc(53) int local53 = arg1; local53 < arg3; local53++) {
			if ((long) (local53 & 0x1) + local27 > arg2[local53]) {
				@Pc(76) long local76 = arg2[local53];
				arg2[local53] = arg2[local23];
				arg2[local23] = local76;
				@Pc(90) Object local90 = arg0[local53];
				arg0[local53] = arg0[local23];
				arg0[local23++] = local90;
			}
		}
		arg2[arg3] = arg2[local23];
		arg2[local23] = local27;
		arg0[arg3] = arg0[local23];
		arg0[local23] = local41;
		method2364(arg0, arg1, arg2, local23 - 1);
		method2364(arg0, local23 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V")
	public static void method2365() {
		Static160.aClass187_85.method4534(5);
		Static285.aClass187_143.method4534(5);
		Static226.aClass187_114.method4534(5);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BII)V")
	public static void method2366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class35 local3 = Static247.method3903(arg0);
		@Pc(6) int local6 = local3.anInt961;
		@Pc(13) int local13 = local3.anInt964;
		@Pc(16) int local16 = local3.anInt967;
		@Pc(23) int local23 = Class1_Sub4_Sub18.anIntArray212[local16 - local13];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static27.method455(~local23 & Static107.anIntArray191[local6] | local23 & arg1 << local13, local6);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BZ)V")
	public static void method2367(@OriginalArg(1) boolean arg0) {
		@Pc(7) byte[][] local7;
		if (Static156.aBoolean211 && arg0) {
			local7 = Static306.aByteArrayArray17;
		} else {
			local7 = Static175.aByteArrayArray8;
		}
		@Pc(24) int local24 = Static54.aByteArrayArray2.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) byte[] local37 = local7[local26];
			if (local37 != null) {
				@Pc(50) int local50 = (Static224.anIntArray348[local26] >> 8) * 64 - Static199.anInt3817;
				@Pc(61) int local61 = (Static224.anIntArray348[local26] & 0xFF) * 64 - Static192.anInt3637;
				Static115.method2067();
				Static145.method2480(local61, arg0, local50, Static240.aClass118Array1, local37);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V")
	public static void method2370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub2_Sub11 local13 = Static5.method35(arg2, 10);
		local13.method2866();
		local13.anInt3323 = arg1;
		local13.anInt3320 = arg3;
		local13.anInt3315 = arg0;
	}
}
