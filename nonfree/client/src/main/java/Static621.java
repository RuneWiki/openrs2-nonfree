import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public static int anInt10458;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "[I")
	public static final int[] anIntArray557 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!gv;Lclient!vha;IIIIILclient!cea;)V")
	public static void method8510(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9_Sub4_Sub2_Sub1_Sub1 arg6) {
		@Pc(12) Class6_Sub45 local12 = new Class6_Sub45();
		local12.anInt8274 = arg5;
		local12.anInt8280 = arg4 << 9;
		local12.anInt8283 = arg2 << 9;
		if (arg1 != null) {
			local12.aClass356_1 = arg1;
			@Pc(174) int local174 = arg1.anInt10250;
			@Pc(177) int local177 = arg1.anInt10238;
			if (arg3 == 1 || arg3 == 3) {
				local177 = arg1.anInt10250;
				local174 = arg1.anInt10238;
			}
			local12.anInt8268 = arg1.anInt10233;
			local12.aBoolean663 = arg1.aBoolean795;
			local12.anInt8273 = arg1.anInt10220;
			local12.aBoolean661 = arg1.aBoolean802;
			local12.anInt8272 = arg1.anInt10232 << 9;
			local12.anInt8270 = local177 + arg4 << 9;
			local12.anInt8284 = arg1.anInt10246;
			local12.anInt8278 = local174 + arg2 << 9;
			local12.anInt8285 = arg1.anInt10221;
			local12.anIntArray428 = arg1.anIntArray544;
			local12.anInt8282 = arg1.anInt10240 << 9;
			local12.anInt8277 = arg1.anInt10258;
			local12.anInt8269 = arg1.anInt10251;
			if (arg1.anIntArray545 != null) {
				local12.aBoolean660 = true;
				local12.method6945();
			}
			if (local12.anIntArray428 != null) {
				local12.anInt8275 = (int) ((double) (local12.anInt8268 - local12.anInt8273) * Math.random()) + local12.anInt8273;
			}
			Static590.aClass163_60.method4967(local12);
			return;
		}
		if (arg6 != null) {
			local12.aClass9_Sub4_Sub2_Sub1_Sub1_2 = arg6;
			@Pc(35) Class158 local35 = arg6.aClass158_1;
			if (local35.anIntArray260 != null) {
				local12.aBoolean660 = true;
				local35 = local35.method4867(Static140.aClass157_1);
			}
			if (local35 != null) {
				local12.anInt8278 = arg2 + local35.anInt5826 << 9;
				local12.anInt8270 = arg4 + local35.anInt5826 << 9;
				local12.anInt8269 = Static490.method4316(arg6);
				local12.anInt8284 = local35.anInt5854;
				local12.aBoolean661 = local35.aBoolean451;
				local12.anInt8282 = local35.anInt5841 << 9;
				local12.anInt8277 = local35.anInt5820;
				local12.anInt8272 = local35.anInt5838 << 9;
				local12.anInt8285 = local35.anInt5812;
			}
			Static610.aClass163_61.method4967(local12);
			return;
		}
		if (arg0 == null) {
			return;
		}
		local12.aClass9_Sub4_Sub2_Sub1_Sub2_2 = arg0;
		local12.anInt8278 = arg2 + arg0.method3620() << 9;
		local12.anInt8270 = arg4 + arg0.method3620() << 9;
		local12.anInt8269 = Static501.method7250(arg0);
		local12.anInt8285 = 256;
		local12.anInt8282 = arg0.anInt4374 << 9;
		local12.anInt8272 = 0;
		local12.aBoolean661 = arg0.aBoolean355;
		local12.anInt8277 = 256;
		local12.anInt8284 = arg0.anInt4363;
		Static209.aClass380_14.method8753(local12, (long) arg0.anInt4299);
		return;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)Lclient!kw;")
	public static Class6_Sub5_Sub19 method8511() {
		@Pc(16) Class6_Sub5_Sub19 local16 = (Class6_Sub5_Sub19) Static625.aClass231_13.method6055();
		if (local16 != null) {
			local16.method8792();
			local16.method7748();
			return local16;
		}
		do {
			local16 = (Class6_Sub5_Sub19) Static537.aClass231_12.method6055();
			if (local16 == null) {
				return null;
			}
			if (local16.method5173() > Static582.method8056()) {
				return null;
			}
			local16.method8792();
			local16.method7748();
		} while ((Long.MIN_VALUE & local16.aLong254) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public static void method8513() {
		if (Static227.anIntArray214 != null && Static420.anIntArray408 != null) {
			return;
		}
		Static420.anIntArray408 = new int[256];
		Static227.anIntArray214 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static227.anIntArray214[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static420.anIntArray408[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)I")
	public static int method8517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static495.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static495.aByteArrayArrayArray17[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
