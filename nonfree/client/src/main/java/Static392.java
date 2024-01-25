import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!oaa", name = "P", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
	public static int anInt6183;

	@OriginalMember(owner = "client!oaa", name = "N", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_10 = new Class168(6, 7);

	@OriginalMember(owner = "client!oaa", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString84 = null;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(III)Z")
	public static boolean method5361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBILclient!fha;Lclient!ha;)V")
	public static void method5363(@OriginalArg(3) Class109 arg0, @OriginalArg(4) Class95 arg1) {
		Static372.aClass109_37.method2329();
		if (Static230.aBoolean265) {
			return;
		}
		for (@Pc(24) Class2_Sub14 local24 = (Class2_Sub14) arg0.method2325(); local24 != null; local24 = (Class2_Sub14) arg0.method2318()) {
			@Pc(32) Class172 local32 = Static193.aClass197_2.method4161(local24.anInt3128);
			if (Static373.method5030(local32)) {
				@Pc(44) boolean local44 = Static219.method3019(local32, arg1, local24);
				if (local44) {
					Static366.method4956(local24, local32, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II)V")
	public static void method5364(@OriginalArg(0) int arg0) {
		Static560.anIntArray627 = new int[arg0];
		Static100.anIntArray132 = new int[arg0];
		Static236.anIntArray267 = new int[arg0];
		Static410.anIntArray471 = new int[arg0];
		Static179.anIntArray228 = new int[arg0];
	}
}
