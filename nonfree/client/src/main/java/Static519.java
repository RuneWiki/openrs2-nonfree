import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Z")
	public static boolean aBoolean633;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!vn;)I")
	public static int method7488(@OriginalArg(1) Class12_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anInt2931 == 0) {
			return 0;
		}
		@Pc(66) int local66;
		@Pc(59) int local59;
		if (arg0.anInt2903 != -1) {
			@Pc(18) Class12_Sub2_Sub2_Sub1 local18 = null;
			if (arg0.anInt2903 < 32768) {
				@Pc(46) Class14_Sub44 local46 = (Class14_Sub44) Static579.aClass187_73.method4078((long) arg0.anInt2903);
				if (local46 != null) {
					local18 = local46.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				}
			} else if (arg0.anInt2903 >= 32768) {
				local18 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[arg0.anInt2903 - 32768];
			}
			if (local18 != null) {
				local59 = arg0.anInt10998 - local18.anInt10998;
				local66 = arg0.anInt11002 - local18.anInt11002;
				if (local59 != 0 || local66 != 0) {
					arg0.method2419((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class12_Sub2_Sub2_Sub1_Sub2) {
			@Pc(97) Class12_Sub2_Sub2_Sub1_Sub2 local97 = (Class12_Sub2_Sub2_Sub1_Sub2) arg0;
			if (local97.anInt2977 != -1 && (local97.anInt2964 == 0 || local97.anInt2967 > 0)) {
				local97.method2419(local97.anInt2977);
				local97.anInt2977 = -1;
			}
		} else if (arg0 instanceof Class12_Sub2_Sub2_Sub1_Sub1) {
			@Pc(128) Class12_Sub2_Sub2_Sub1_Sub1 local128 = (Class12_Sub2_Sub2_Sub1_Sub1) arg0;
			if (local128.anInt688 != -1 && (local128.anInt2964 == 0 || local128.anInt2967 > 0)) {
				local59 = local128.anInt10998 - (local128.anInt688 - Static329.anInt6225 - Static329.anInt6225) * 256;
				local66 = local128.anInt11002 - (local128.anInt694 - Static202.anInt3755 - Static202.anInt3755) * 256;
				if (local59 != 0 || local66 != 0) {
					local128.method2419((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
				local128.anInt688 = -1;
			}
		}
		return arg0.method2417();
	}
}
