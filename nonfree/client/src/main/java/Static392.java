import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "I")
	public static int anInt6961 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!ri;JBIII)V")
	public static void method5559(@OriginalArg(1) Class284 arg0, @OriginalArg(2) long arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static592.method5616(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!pba;)I")
	public static int method5562(@OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt7160;
		@Pc(17) Class122 local17 = arg0.method6683();
		if (arg0.anInt8516 == -1 || arg0.aBoolean579) {
			local13 = arg0.anInt7149;
		} else if (arg0.anInt8516 == local17.anInt4206 || local17.anInt4221 == arg0.anInt8516 || arg0.anInt8516 == local17.anInt4195 || local17.anInt4225 == arg0.anInt8516) {
			local13 = arg0.anInt7176;
		} else if (arg0.anInt8516 == local17.anInt4187 || arg0.anInt8516 == local17.anInt4205 || local17.anInt4211 == arg0.anInt8516 || local17.anInt4198 == arg0.anInt8516) {
			local13 = arg0.anInt7172;
		}
		return local13;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZI[BIILclient!er;I)Lclient!cea;")
	public static Class50_Sub1_Sub1 method5564(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class31_Sub2 arg3) {
		if (arg3.aBoolean206 || Static249.method6960(arg0) && Static249.method6960(arg2)) {
			return new Class50_Sub1_Sub1(arg3, 3553, 6406, arg0, arg2, false, arg1, 6406);
		} else if (arg3.aBoolean219) {
			return new Class50_Sub1_Sub1(arg3, 34037, 6406, arg0, arg2, false, arg1, 6406);
		} else {
			return new Class50_Sub1_Sub1(arg3, 6406, arg0, arg2, Static538.method7366(arg0), Static538.method7366(arg2), arg1, 6406);
		}
	}
}
