import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
	public static final int[] anIntArray1 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
	public static boolean method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static584.method7945(arg0, arg1) | (arg1 & 0x70000) != 0 || Static230.method3739(arg0, arg1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(JBLclient!pca;IIIIILclient!ua;)V")
	public static void method43(@OriginalArg(0) long arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class53 arg7) {
		@Pc(11) int local11 = arg5 * arg5 + arg2 * arg2;
		if (arg0 < (long) local11) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg1.anInt7285 / 2, arg1.anInt7215 / 2);
		if (local11 <= local35 * local35) {
			Static297.method6895(arg7, arg5, arg4, arg3, arg1, arg2, Static148.aClass73Array6[arg6]);
			return;
		}
		local35 -= 10;
		@Pc(61) int local61;
		if (Static188.anInt4080 == 4) {
			local61 = (int) Static209.aFloat229 & 0x3FFF;
		} else {
			local61 = (int) Static209.aFloat229 + Static270.anInt5118 & 0x3FFF;
		}
		@Pc(75) int local75 = Class3_Sub28.anIntArray232[local61];
		@Pc(79) int local79 = Class3_Sub28.anIntArray231[local61];
		if (Static188.anInt4080 != 4) {
			local79 = local79 * 256 / (Static350.anInt6241 + 256);
			local75 = local75 * 256 / (Static350.anInt6241 + 256);
		}
		@Pc(108) int local108 = arg5 * local79 + arg2 * local75 >> 14;
		@Pc(119) int local119 = local79 * arg2 - local75 * arg5 >> 14;
		@Pc(125) double local125 = Math.atan2((double) local108, (double) local119);
		@Pc(132) int local132 = (int) ((double) local35 * Math.sin(local125));
		@Pc(139) int local139 = (int) ((double) local35 * Math.cos(local125));
		Static410.aClass73Array10[arg6].method7960((float) local132 + (float) arg1.anInt7285 / 2.0F + (float) arg4, (float) -local139 + (float) arg3 + (float) arg1.anInt7215 / 2.0F, 4096, (int) (-local125 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ie;B)Lclient!bl;")
	public static Class38_Sub1_Sub1 method46(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(7) Class38_Sub1 local7 = Static81.method1882(arg0);
		@Pc(11) int local11 = arg0.method6789();
		return new Class38_Sub1_Sub1(local7.aClass154_12, local7.aClass201_13, local7.anInt8021, local7.anInt8017, local7.anInt8020, local7.anInt8019, local7.anInt8022, local7.anInt8024, local7.anInt8023, local7.anInt1201, local7.anInt1204, local7.anInt1202, local7.anInt1207, local7.anInt1205, local7.anInt1199, local11);
	}
}
