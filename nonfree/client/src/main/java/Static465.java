import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)V")
	public static void method7166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class348 local13 = Static192.aClass348ArrayArray1[arg1][arg0];
		if (local13 != null) {
			Static428.anInt8599 = local13.anInt9713;
			Static500.anInt8908 = local13.anInt9716;
			Static4.anInt137 = local13.anInt9719;
		}
		Static41.method1126();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIILclient!bfa;)V")
	public static void method7167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3) {
		for (@Pc(18) Class6_Sub2 local18 = (Class6_Sub2) Static284.aClass211_39.method5183(); local18 != null; local18 = (Class6_Sub2) Static284.aClass211_39.method5177()) {
			if (local18.anInt564 == arg0 && arg2 << 9 == local18.anInt566 && local18.anInt561 == arg1 << 9 && arg3.anInt1060 == local18.aClass31_1.anInt1060) {
				if (local18.aClass6_Sub10_Sub2_1 != null) {
					Static35.aClass6_Sub10_Sub3_1.method4742(local18.aClass6_Sub10_Sub2_1);
					local18.aClass6_Sub10_Sub2_1 = null;
				}
				if (local18.aClass6_Sub10_Sub2_2 != null) {
					Static35.aClass6_Sub10_Sub3_1.method4742(local18.aClass6_Sub10_Sub2_2);
					local18.aClass6_Sub10_Sub2_2 = null;
				}
				local18.method8151();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public static void method7168(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static87.aBooleanArray7[arg0]) {
			Static313.aClass168_109.method4426(arg0);
			Static336.aClass93ArrayArray2[arg0] = null;
			Static279.aClass93ArrayArray1[arg0] = null;
			Static87.aBooleanArray7[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!pe;)[Lclient!bi;")
	public static Class34[] method7169(@OriginalArg(1) Class246 arg0) {
		if (!arg0.method6135()) {
			return new Class34[0];
		}
		@Pc(16) Class280 local16 = arg0.method6143();
		while (local16.anInt8467 == 0) {
			Static566.method8004(10L);
		}
		if (local16.anInt8467 == 2) {
			return new Class34[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject16;
		@Pc(43) Class34[] local43 = new Class34[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class34 local51 = new Class34();
			local43[local45] = local51;
			local51.anInt1205 = local37[local45 << 2];
			local51.anInt1207 = local37[(local45 << 2) + 1];
			local51.anInt1203 = local37[(local45 << 2) + 2];
			local51.anInt1209 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
