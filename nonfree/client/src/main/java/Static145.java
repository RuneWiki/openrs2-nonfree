import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
	public static int anInt3113;

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray8 = new int[2][][];

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "[I")
	public static final int[] anIntArray144 = new int[1000];

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!oh;Lclient!qp;IIIILclient!wn;I)V")
	public static void method2803(@OriginalArg(0) Class41_Sub2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class41_Sub2_Sub1_Sub4_Sub2 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class3_Sub18 local11 = new Class3_Sub18();
		local11.anInt3370 = arg3 << 9;
		local11.anInt3368 = arg4;
		local11.anInt3359 = arg6 << 9;
		if (arg1 != null) {
			local11.aClass280_1 = arg1;
			@Pc(146) int local146 = arg1.anInt7391;
			@Pc(149) int local149 = arg1.anInt7396;
			if (arg2 == 1 || arg2 == 3) {
				local146 = arg1.anInt7396;
				local149 = arg1.anInt7391;
			}
			local11.anInt3361 = arg1.anInt7345 << 9;
			local11.anIntArray172 = arg1.anIntArray458;
			local11.aBoolean264 = arg1.aBoolean551;
			local11.anInt3358 = arg1.anInt7362;
			local11.anInt3357 = local146 + arg3 << 9;
			local11.anInt3362 = arg1.anInt7363;
			local11.anInt3373 = arg1.anInt7401;
			local11.aBoolean263 = arg1.aBoolean550;
			local11.anInt3371 = arg6 + local149 << 9;
			local11.anInt3372 = arg1.anInt7370;
			if (arg1.anIntArray457 != null) {
				local11.aBoolean265 = true;
				local11.method3023();
			}
			if (local11.anIntArray172 != null) {
				local11.anInt3364 = local11.anInt3362 + (int) ((double) (local11.anInt3373 - local11.anInt3362) * Math.random());
			}
			Static220.aClass112_25.method3079(local11);
		} else if (arg0 != null) {
			local11.aClass41_Sub2_Sub1_Sub4_Sub1_1 = arg0;
			@Pc(87) Class264 local87 = arg0.aClass264_1;
			if (local87.anIntArray443 != null) {
				local11.aBoolean265 = true;
				local87 = local87.method5994(Static491.aClass318_1);
			}
			if (local87 != null) {
				local11.anInt3357 = local87.anInt7163 + arg3 << 9;
				local11.anInt3371 = arg6 + local87.anInt7163 << 9;
				local11.anInt3372 = Static270.method4111(arg0);
				local11.aBoolean264 = local87.aBoolean532;
				local11.anInt3361 = local87.anInt7168 << 9;
				local11.anInt3358 = local87.anInt7160;
			}
			Static350.aClass112_47.method3079(local11);
		} else if (arg5 != null) {
			local11.aClass41_Sub2_Sub1_Sub4_Sub2_1 = arg5;
			local11.anInt3357 = arg5.method7858() + arg3 << 9;
			local11.anInt3371 = arg6 + arg5.method7858() << 9;
			local11.anInt3372 = Static252.method3888(arg5);
			local11.anInt3361 = arg5.anInt9570 << 9;
			local11.aBoolean264 = arg5.aBoolean744;
			local11.anInt3358 = arg5.anInt9576;
			Static173.aClass354_14.method7691(local11, (long) arg5.anInt9472);
			return;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
	public static boolean method2804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static9.method3872(arg0, arg1) | (arg0 & 0x70000) != 0 || Static321.method4673(arg1, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2806(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(41) int local41 = arg0.indexOf(" ", "directlogin ".length());
			if (local41 >= 0) {
				@Pc(49) int local49 = arg0.length();
				arg0 = arg0.substring(0, local41) + " ";
				for (@Pc(65) int local65 = local41 + 1; local65 < local49; local65++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
