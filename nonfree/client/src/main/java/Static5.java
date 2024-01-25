import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lclient!eg;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString3 = "wave2:";

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "Z")
	public static boolean aBoolean13 = true;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lclient!dm;")
	public static Class5_Sub2 method89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class5_Sub2 local14 = local7.aClass5_Sub2_1;
			local7.aClass5_Sub2_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!tj;Lclient!ir;I)V")
	public static void method90(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class100 arg1) {
		if (Static312.aBoolean428) {
			return;
		}
		arg0.method4751(0);
		Static164.aClass57_23 = arg0.method4757(Static366.method3887(arg1, Static334.anInt6502));
		Static164.aClass57_23.method5448((Static298.anInt5944 - Static164.aClass57_23.method5433()) / 2, (Static171.anInt3583 - Static164.aClass57_23.method5441()) / 2);
		Static237.aClass57_15 = arg0.method4757(Static366.method3887(arg1, Static113.anInt6409));
		Static237.aClass57_15.method5448((Static298.anInt5944 - Static237.aClass57_15.method5433()) / 2, 18);
		Static312.aBoolean428 = true;
	}
}
