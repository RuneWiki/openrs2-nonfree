import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array19;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "F")
	public static float aFloat227;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Lclient!kf;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!rf;")
	public static final Class288 aClass288_6 = new Class288();

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!hq;")
	public static final Class145 aClass145_11 = new Class145("LIVE", 0);

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "[I")
	public static final int[] anIntArray531 = new int[1000];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!n;Lclient!n;)V")
	public static void method8094(@OriginalArg(1) Class225 arg0, @OriginalArg(2) Class225 arg1) {
		@Pc(12) Class4_Sub14 local12 = Static196.method3380(Static17.aClass159_1, Static279.aClass173_82);
		local12.aClass4_Sub11_Sub1_3.method4909(arg0.anInt6555);
		local12.aClass4_Sub11_Sub1_3.method4937(arg1.anInt6527);
		local12.aClass4_Sub11_Sub1_3.method4937(arg1.anInt6565);
		local12.aClass4_Sub11_Sub1_3.method4932(arg0.anInt6565);
		local12.aClass4_Sub11_Sub1_3.method4898(arg0.anInt6527);
		local12.aClass4_Sub11_Sub1_3.method4943(arg1.anInt6555);
		Static353.method5712(local12);
	}
}
