import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Lclient!uha;")
	public static Class177 aClass177_3;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "Lclient!cw;")
	public static Class61 aClass61_3;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
	public static int anInt1494;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public static void method1183(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub2_Sub19 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class76 local8 = Static462.aClass76Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Class13_Sub1_Sub4_Sub1.lb; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static322.anInt5120; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static609.anInt9827;
							@Pc(32) int local32 = local12 << Static609.anInt9827;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class76 local41 = Static462.aClass76Array3[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7396(local12, local15) - local41.method7396(local12, local15);
									@Pc(71) int local71 = local8.method7396(local12, local15 + 1) - local41.method7396(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7396(local12 + 1, local15 + 1) - local41.method7396(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7396(local12 + 1, local15) - local41.method7396(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZZII)V")
	public static void method1184(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static221.method3025(arg2)) {
			Static257.method3532(arg3, arg0, Static559.aClass261ArrayArray2[arg2], -1, arg1);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!paa;)Lclient!paa;")
	public static Class261 method1185(@OriginalArg(1) Class261 arg0) {
		if (arg0.anInt6631 != -1) {
			return Static357.method4826(arg0.anInt6631);
		}
		@Pc(19) int local19 = arg0.anInt6614 >>> 16;
		@Pc(24) Class50 local24 = new Class50(Static606.aClass118_47);
		for (@Pc(29) Class2_Sub9 local29 = (Class2_Sub9) local24.method952(); local29 != null; local29 = (Class2_Sub9) local24.method953()) {
			if (local19 == local29.anInt2171) {
				return Static357.method4826((int) local29.aLong280);
			}
		}
		return null;
	}
}
