import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray88 = new int[128][128];

	@OriginalMember(owner = "client!u", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray46 = new boolean[8];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ud;I)Lclient!k;")
	public static Class8_Sub3 method7757(@OriginalArg(0) Class2_Sub34 arg0) {
		@Pc(7) Class8 local7 = Static140.method2667(arg0);
		@Pc(16) int local16 = arg0.method6865();
		@Pc(20) int local20 = arg0.method6865();
		return new Class8_Sub3(local7.aClass174_11, local7.aClass176_10, local7.anInt5338, local7.anInt5331, local7.anInt5334, local7.anInt5330, local7.anInt5340, local7.anInt5337, local7.anInt5341, local16, local20);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBI)V")
	public static void method7759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg1, 8);
		local8.method4393();
		local8.anInt5255 = arg0;
		local8.anInt5246 = arg3;
		local8.anInt5245 = arg2;
	}
}
