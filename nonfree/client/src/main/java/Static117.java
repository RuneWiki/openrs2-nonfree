import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public static int anInt5258;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray23 = new byte[1000][];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!al;")
	public static final Class11 aClass11_120 = new Class11(64);

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_32 = new Class18();

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	public static void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1010) {
			Static10.method226(10, arg2, arg0);
		} else if (arg1 == 1005) {
			Static10.method226(11, arg2, arg0);
		} else if (arg1 == 1007) {
			Static10.method226(12, arg2, arg0);
		} else if (arg1 == 1009) {
			Static10.method226(13, arg2, arg0);
		} else if (arg1 == 1006) {
			Static10.method226(14, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)V")
	public static void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static238.anIntArrayArray77 != null) {
			Static238.anIntArrayArray77[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!tm;IILclient!sd;Lclient!fa;II)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub3_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub3_Sub3_Sub1 arg4, @OriginalArg(5) Class59 arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class14_Sub28 local9 = new Class14_Sub28();
		local9.anInt5300 = arg2;
		local9.anInt5298 = arg6 * 128;
		local9.anInt5307 = arg0 * 128;
		if (arg5 != null) {
			local9.aClass59_1 = arg5;
			@Pc(30) int local30 = arg5.anInt1950;
			@Pc(33) int local33 = arg5.anInt1912;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg5.anInt1950;
				local30 = arg5.anInt1912;
			}
			local9.anInt5313 = arg5.anInt1915 * 128;
			local9.anInt5305 = arg5.anInt1957;
			local9.anIntArray480 = arg5.anIntArray173;
			local9.anInt5308 = arg5.anInt1953;
			local9.anInt5316 = (local33 + arg6) * 128;
			local9.anInt5309 = arg5.anInt1919;
			local9.anInt5304 = (arg0 + local30) * 128;
			local9.anInt5301 = arg5.anInt1914;
			if (arg5.anIntArray176 != null) {
				local9.aBoolean350 = true;
				local9.method4729();
			}
			if (local9.anIntArray480 != null) {
				local9.anInt5315 = (int) (Math.random() * (double) (local9.anInt5301 - local9.anInt5305)) + local9.anInt5305;
			}
			Static257.aClass18_24.method451(local9);
		} else if (arg4 != null) {
			local9.aClass10_Sub3_Sub3_Sub1_1 = arg4;
			@Pc(188) Class192 local188 = arg4.aClass192_1;
			if (local188.anIntArray525 != null) {
				local9.aBoolean350 = true;
				local188 = local188.method5281();
			}
			if (local188 != null) {
				local9.anInt5304 = (arg0 + local188.anInt5798) * 128;
				local9.anInt5316 = (local188.anInt5798 + arg6) * 128;
				local9.anInt5308 = Static158.method3092(arg4);
				local9.anInt5313 = local188.anInt5783 * 128;
				local9.anInt5309 = local188.anInt5786;
			}
			Static51.aClass18_3.method451(local9);
		} else if (arg1 != null) {
			local9.aClass10_Sub3_Sub3_Sub2_2 = arg1;
			local9.anInt5304 = (arg1.method5353() + arg0) * 128;
			local9.anInt5316 = (arg6 + arg1.method5353()) * 128;
			local9.anInt5308 = Static220.method3963(arg1);
			local9.anInt5313 = arg1.anInt6020 * 128;
			local9.anInt5309 = arg1.anInt6011;
			Static316.aClass25_16.method687((long) arg1.anInt5954, local9);
		}
	}
}
