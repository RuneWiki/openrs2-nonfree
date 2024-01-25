import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!id", name = "I", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!id", name = "L", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "[Lclient!mg;")
	public static Class216[] aClass216Array1;

	@OriginalMember(owner = "client!id", name = "P", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZILclient!is;I)V")
	public static void method3437(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) int arg2) {
		Static397.aClass155_11 = arg1;
		Static332.anInt6460 = arg2;
		Static313.anInt6278 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIB)V")
	public static void method3439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 8);
		local8.method2303();
		local8.anInt2865 = arg2;
		local8.anInt2872 = arg1;
		local8.anInt2871 = arg3;
	}
}
