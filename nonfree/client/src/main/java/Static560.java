import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!st", name = "i", descriptor = "Lclient!jl;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_36 = new Class268("", 12);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!lc;)[Lclient!nga;")
	public static Class249[] method7429(@OriginalArg(1) Class207 arg0) {
		if (!arg0.method4573()) {
			return new Class249[0];
		}
		@Pc(16) Class281 local16 = arg0.method4585();
		while (local16.anInt7338 == 0) {
			Static491.method6679(10L);
		}
		if (local16.anInt7338 == 2) {
			return new Class249[0];
		}
		@Pc(42) int[] local42 = (int[]) local16.anObject17;
		@Pc(48) Class249[] local48 = new Class249[local42.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(56) Class249 local56 = new Class249();
			local48[local50] = local56;
			local56.anInt5845 = local42[local50 << 2];
			local56.anInt5848 = local42[(local50 << 2) + 1];
			local56.anInt5847 = local42[(local50 << 2) + 2];
			local56.anInt5850 = local42[(local50 << 2) + 3];
		}
		return local48;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B[B)[B")
	public static byte[] method7430(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static685.method6464(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIII)I")
	public static int method7431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V")
	public static void method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg1, 12);
		local9.method3955();
		local9.anInt4427 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)Z")
	public static boolean method7433(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
