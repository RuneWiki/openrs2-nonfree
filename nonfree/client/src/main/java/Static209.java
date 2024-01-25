import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!nl", name = "eb", descriptor = "[S")
	public static final short[] aShortArray95 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!nl", name = "hb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[250][];

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(III)Lclient!aq;")
	public static Class12 method3975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class12 local7 = Static9.method319(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass12Array3 == null || local7.aClass12Array3.length <= arg0) {
			return null;
		} else {
			return local7.aClass12Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
	public static void method3977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static231.anInt4758 = arg1 - Static79.anInt4162;
		Static68.anInt1821 = arg0 - Static79.anInt4157;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ml;B)V")
	public static void method3978(@OriginalArg(0) Class8_Sub7 arg0) {
		arg0.aClass17_Sub1_Sub1_1 = null;
		if (Static313.anInt6076 < 20) {
			Static344.aClass217_9.method5678(arg0);
			Static313.anInt6076++;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!be;BLclient!nd;Lclient!pi;III)V")
	public static void method3980(@OriginalArg(0) int arg0, @OriginalArg(1) Class17_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) Class141 arg2, @OriginalArg(4) Class17_Sub1_Sub1_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class1_Sub22 local11 = new Class1_Sub22();
		local11.anInt3052 = arg5 * 128;
		local11.anInt3050 = arg6 * 128;
		local11.anInt3058 = arg4;
		if (arg2 != null) {
			local11.aClass141_1 = arg2;
			@Pc(32) int local32 = arg2.anInt4297;
			@Pc(35) int local35 = arg2.anInt4256;
			if (arg0 == 1 || arg0 == 3) {
				local35 = arg2.anInt4297;
				local32 = arg2.anInt4256;
			}
			local11.anInt3057 = (local32 + arg5) * 128;
			local11.anInt3054 = arg2.anInt4271;
			local11.anIntArray267 = arg2.anIntArray386;
			local11.anInt3048 = arg2.anInt4293;
			local11.anInt3055 = arg2.anInt4276 * 128;
			local11.anInt3059 = (local35 + arg6) * 128;
			local11.anInt3060 = arg2.anInt4259;
			local11.anInt3056 = arg2.anInt4282;
			if (arg2.anIntArray391 != null) {
				local11.aBoolean291 = true;
				local11.method2812();
			}
			if (local11.anIntArray267 != null) {
				local11.anInt3047 = local11.anInt3054 + (int) (Math.random() * (double) (local11.anInt3056 - local11.anInt3054));
			}
			Static148.aClass16_14.method416(local11);
		} else if (arg3 != null) {
			local11.aClass17_Sub1_Sub1_Sub2_1 = arg3;
			@Pc(128) Class213 local128 = arg3.aClass213_1;
			if (local128.anIntArray517 != null) {
				local11.aBoolean291 = true;
				local128 = local128.method5480();
			}
			if (local128 != null) {
				local11.anInt3059 = (local128.anInt6509 + arg6) * 128;
				local11.anInt3057 = (arg5 + local128.anInt6509) * 128;
				local11.anInt3060 = Static353.method5618(arg3);
				local11.anInt3055 = local128.anInt6550 * 128;
				local11.anInt3048 = local128.anInt6518;
			}
			Static150.aClass16_15.method416(local11);
		} else if (arg1 != null) {
			local11.aClass17_Sub1_Sub1_Sub1_4 = arg1;
			local11.anInt3057 = (arg5 + arg1.method4318()) * 128;
			local11.anInt3059 = (arg1.method4318() + arg6) * 128;
			local11.anInt3060 = Static322.method5249(arg1);
			local11.anInt3055 = arg1.anInt804 * 128;
			local11.anInt3048 = arg1.anInt806;
			Static248.aClass197_24.method5166(local11, (long) arg1.anInt4867);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
	public static void method3981(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 8);
		local8.method1868();
	}
}
