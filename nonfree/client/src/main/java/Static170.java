import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gt", name = "D", descriptor = "Lclient!wca;")
	public static Class1_Sub50 aClass1_Sub50_2;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_56 = new Class6(32, 0);

	@OriginalMember(owner = "client!gt", name = "C", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public static void method3304() {
		Static205.anInt4329 = 0;
		Static41.aClass67Array1 = new Class67[50];
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[[BLclient!hf;)V")
	public static void method3308(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class118_Sub1 arg1) {
		@Pc(11) int local11 = Static397.aByteArrayArray25.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(18) byte[] local18 = arg0[local13];
			if (local18 != null) {
				@Pc(31) int local31 = (Static85.anIntArray178[local13] >> 8) * 64 - Static324.anInt6132;
				@Pc(42) int local42 = (Static85.anIntArray178[local13] & 0xFF) * 64 - Static517.anInt8716;
				Static443.method6413();
				arg1.method3447(Static478.aClass9_10, local31, Static70.aClass299Array1, local42, local18);
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBIIIIIIIIIIII)V")
	public static void method3310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static290.aClass10Array7 == null) {
			return;
		}
		@Pc(8) Class47_Sub2_Sub3 local8 = null;
		@Pc(15) int local15;
		if (arg0 < 0) {
			local15 = -arg0 - 1;
			if (Static150.anInt3353 == local15) {
				local8 = Static16.aClass47_Sub2_Sub3_Sub2_1;
			} else {
				local8 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local15];
			}
		} else {
			local15 = arg0 - 1;
			@Pc(37) Class1_Sub10 local37 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local15);
			if (local37 != null) {
				local8 = local37.aClass47_Sub2_Sub3_Sub1_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(50) Class288 local50 = Static365.aClass194_6.method5084(arg2);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg9 == 1 || arg9 == 3) {
			local61 = local50.anInt8343;
			local64 = local50.anInt8365;
		} else {
			local61 = local50.anInt8365;
			local64 = local50.anInt8343;
		}
		@Pc(77) int local77 = arg3 + (local61 >> 1);
		@Pc(85) int local85 = arg3 + (local61 + 1 >> 1);
		@Pc(91) int local91 = arg6 + (local64 >> 1);
		@Pc(99) int local99 = (local64 + 1 >> 1) + arg6;
		@Pc(103) Class10 local103 = Static290.aClass10Array7[arg5];
		@Pc(126) int local126 = local103.ba(local77, local91) + local103.ba(local85, local91) + local103.ba(local77, local99) + local103.ba(local85, local99) >> 2;
		@Pc(130) Class1_Sub47 local130 = new Class1_Sub47();
		local130.anInt8040 = arg3;
		local130.anInt8038 = arg9;
		local130.anInt8051 = Static416.anInt7252 + arg10;
		local130.anInt8045 = local8.aByte94;
		local130.anInt8047 = arg6;
		local130.anInt8043 = arg2;
		local130.anInt8052 = Static416.anInt7252 + arg11;
		local130.anInt8041 = arg8;
		@Pc(170) int local170;
		if (arg1 > arg12) {
			local170 = arg1;
			arg1 = arg12;
			arg12 = local170;
		}
		local130.anInt8035 = arg12 + arg3;
		local130.anInt8049 = arg3 + arg1;
		if (arg4 < arg7) {
			local170 = arg7;
			arg7 = arg4;
			arg4 = local170;
		}
		local130.anInt8046 = (local61 << 6) + (local130.anInt8040 << 7);
		local130.anInt8044 = arg7 + arg6;
		local130.anInt8042 = (local64 << 6) + (local130.anInt8047 << 7);
		local130.anInt8048 = local126;
		local130.anInt8037 = arg4 + arg6;
		Static227.aClass38_74.method1426(local130);
		local8.aClass1_Sub47_3 = local130;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIII)V")
	public static void method3312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(19) int local19 = arg1 << 3;
		Static443.aFloat151 = local19;
		if (Static464.anInt8003 == 2) {
			Static304.anInt5875 = 0;
			Static411.anInt7178 = local11;
			Static339.anInt6337 = local19;
		}
		Static362.aFloat128 = local11;
		Static15.method801();
		Static126.aBoolean196 = true;
	}
}
