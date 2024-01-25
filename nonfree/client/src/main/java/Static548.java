import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Lclient!qk;")
	public static Class3_Sub16_Sub3 aClass3_Sub16_Sub3_4;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "Lclient!wr;")
	public static final Class363 aClass363_7 = new Class363();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZIZ)I")
	public static int method7505(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class3_Sub44 local20 = Static470.method6424(arg1, arg0);
		if (local20 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local20.anIntArray446.length) {
			return local20.anIntArray446[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ie;Ljava/lang/String;I)I")
	public static int method7506(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) String arg1) {
		@Pc(11) int local11 = arg0.anInt8703;
		@Pc(17) byte[] local17 = Static138.method2726(arg1);
		arg0.method6810(local17.length);
		arg0.anInt8703 += Static417.aClass77_1.method2197(arg0.anInt8703, local17, 0, arg0.aByteArray213, local17.length);
		return arg0.anInt8703 - local11;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBILclient!r;II)Lclient!da;")
	public static Class52 method7508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(12) Class52 local12 = (Class52) Static32.aClass342_54.method7684(local6);
		if (local12 == null) {
			@Pc(27) Class332 local27 = Static326.method4807(arg1, Static396.aClass284_115);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt9539 < 13) {
				local27.method7503();
			}
			local12 = arg3.method8046(local27, 2055, Static198.anInt4276, 64, 768);
			Static32.aClass342_54.method7683(local12, local6);
		}
		local12 = local12.method7618((byte) 2, 2055, true);
		if (arg0 != 0) {
			local12.M(arg0);
		}
		if (arg5 != 0) {
			local12.MA(arg5);
		}
		if (arg4 != 0) {
			local12.W(arg4);
		}
		if (arg2 != 0) {
			local12.oa(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIII)V")
	public static void method7510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static181.anInt3975 = arg3;
		Static111.anInt2679 = arg1;
		Static290.anInt5404 = arg5;
		Static378.anInt6564 = arg4;
		Static337.anInt6075 = arg0;
		Static586.anInt10135 = arg2;
	}
}
