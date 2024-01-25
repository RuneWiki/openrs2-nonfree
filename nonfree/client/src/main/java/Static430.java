import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vl", name = "K", descriptor = "Lclient!mq;")
	public static Class162 aClass162_2;

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_155 = new Class253(89, 8);

	@OriginalMember(owner = "client!vl", name = "Q", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[128][128];

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "(B)V")
	public static void method5562() {
		if (Static203.anInt3590 < 0) {
			Static203.anInt3590 = 0;
			Static5.anInt16 = -1;
			Static168.anInt3036 = -1;
		}
		if (Static203.anInt3590 > Static93.anInt4332) {
			Static168.anInt3036 = -1;
			Static203.anInt3590 = Static93.anInt4332;
			Static5.anInt16 = -1;
		}
		if (Static21.anInt321 < 0) {
			Static5.anInt16 = -1;
			Static168.anInt3036 = -1;
			Static21.anInt321 = 0;
		}
		if (Static93.anInt4330 < Static21.anInt321) {
			Static21.anInt321 = Static93.anInt4330;
			Static5.anInt16 = -1;
			Static168.anInt3036 = -1;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIILclient!ya;)Lclient!t;")
	public static Class163 method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class51 arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class163 local12 = (Class163) Static47.aClass126_7.method2822(local6);
		if (local12 == null) {
			@Pc(22) Class117 local22 = Static49.method625(Static80.aClass178_22, arg0);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt3204 < 13) {
				local22.method2587();
			}
			local12 = arg5.method5346(local22, 2055, Static83.anInt7543, 64, 768);
			Static47.aClass126_7.method2824(local6, local12);
		}
		local12 = local12.method4654((byte) 2, 2055, true);
		if (arg2 != 0) {
			local12.Q(arg2);
		}
		if (arg4 != 0) {
			local12.Z(arg4);
		}
		if (arg1 != 0) {
			local12.R(arg1);
		}
		if (arg3 != 0) {
			local12.JA(0, arg3, 0);
		}
		return local12;
	}
}
