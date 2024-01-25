import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fea", name = "R", descriptor = "F")
	public static float aFloat127 = 0.25F;

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(III)V")
	public static void method3248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static637.method8381(local7.aClass2_Sub3_Sub3_1);
		Static637.method8381(local7.aClass2_Sub3_Sub3_2);
		if (local7.aClass2_Sub3_Sub3_1 != null) {
			local7.aClass2_Sub3_Sub3_1 = null;
		}
		if (local7.aClass2_Sub3_Sub3_2 != null) {
			local7.aClass2_Sub3_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZZZ)V")
	public static void method3249(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static569.anInt9670++;
			Static507.method7379();
		}
		if (arg1) {
			Static206.anInt6644++;
			Static114.method2751();
		}
	}
}
