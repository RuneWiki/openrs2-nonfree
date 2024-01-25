import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	public static int anInt6175;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[128][128];

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
	public static int anInt6182 = 0;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!oca;)V")
	public static void method5404(@OriginalArg(1) Class3_Sub40 arg0) {
		if (Static330.aClass77ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface2 local8 = null;
		if (arg0.anInt7270 == 0) {
			local8 = (Interface2) Static126.method2496(arg0.anInt7263, arg0.anInt7269, arg0.anInt7265);
		}
		if (arg0.anInt7270 == 1) {
			local8 = (Interface2) Static610.method8465(arg0.anInt7263, arg0.anInt7269, arg0.anInt7265);
		}
		if (arg0.anInt7270 == 2) {
			local8 = (Interface2) Static572.method8142(arg0.anInt7263, arg0.anInt7269, arg0.anInt7265, as.class);
		}
		if (arg0.anInt7270 == 3) {
			local8 = (Interface2) Static625.method8735(arg0.anInt7263, arg0.anInt7269, arg0.anInt7265);
		}
		if (local8 == null) {
			arg0.anInt7274 = 0;
			arg0.anInt7271 = -1;
			arg0.anInt7267 = 0;
		} else {
			arg0.anInt7271 = local8.method7381();
			arg0.anInt7274 = local8.method7382();
			arg0.anInt7267 = local8.method7379();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[BIB)[B")
	public static byte[] method5406(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(13) byte[] local13;
		if (arg2 > 0) {
			local13 = new byte[arg0];
			for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
				local13[local15] = arg1[arg2 + local15];
			}
		} else {
			local13 = arg1;
		}
		@Pc(49) Class379 local49 = new Class379();
		local49.method8749();
		local49.method8752((long) (arg0 * 8), local13);
		@Pc(63) byte[] local63 = new byte[64];
		local49.method8748(local63);
		return local63;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIBILclient!ha;)Lclient!ka;")
	public static Class17 method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(14) Class17 local14 = (Class17) Static279.aClass102_30.method2677(local6);
		if (local14 == null) {
			@Pc(24) Class118 local24 = Static330.method5390(Static68.aClass196_18, arg4);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt3246 < 13) {
				local24.method2926();
			}
			local14 = arg5.method7490(local24, 2055, Static460.anInt8092, 64, 768);
			Static279.aClass102_30.method2674(local6, local14);
		}
		local14 = local14.method5409((byte) 2, 2055, true);
		if (arg0 != 0) {
			local14.a(arg0);
		}
		if (arg1 != 0) {
			local14.FA(arg1);
		}
		if (arg2 != 0) {
			local14.VA(arg2);
		}
		if (arg3 != 0) {
			local14.H(0, arg3, 0);
		}
		return local14;
	}
}
