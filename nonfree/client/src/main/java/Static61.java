import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public static int anInt1162;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!fl;")
	public static Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString13 = "";

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method909() {
		if (Static40.anInt794 < 0) {
			Static40.anInt794 = 0;
			Static160.anInt2883 = -1;
			Static27.anInt643 = -1;
		}
		if (Static40.anInt794 > Static193.anInt1544) {
			Static40.anInt794 = Static193.anInt1544;
			Static160.anInt2883 = -1;
			Static27.anInt643 = -1;
		}
		if (Static347.anInt5452 < 0) {
			Static27.anInt643 = -1;
			Static160.anInt2883 = -1;
			Static347.anInt5452 = 0;
		}
		if (Static193.anInt1550 < Static347.anInt5452) {
			Static160.anInt2883 = -1;
			Static27.anInt643 = -1;
			Static347.anInt5452 = Static193.anInt1550;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Lclient!hg;")
	public static Class13_Sub1_Sub1_Sub1 method911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class53 local20 = Static28.aClass53ArrayArrayArray1[arg2][arg1][arg0];
		if (local20 == null) {
			return null;
		}
		@Pc(26) Class13_Sub1_Sub1_Sub1 local26 = null;
		@Pc(28) int local28 = -1;
		for (@Pc(31) Class325 local31 = local20.aClass325_1; local31 != null; local31 = local31.aClass325_3) {
			@Pc(35) Class13_Sub1_Sub1 local35 = local31.aClass13_Sub1_Sub1_1;
			if (local35 instanceof Class13_Sub1_Sub1_Sub1) {
				@Pc(41) Class13_Sub1_Sub1_Sub1 local41 = (Class13_Sub1_Sub1_Sub1) local35;
				@Pc(51) int local51 = local41.method3950() * 256 - 4;
				@Pc(59) int local59 = local41.anInt10090 - local51 >> 9;
				@Pc(67) int local67 = local41.anInt10089 - local51 >> 9;
				@Pc(74) int local74 = local51 + local41.anInt10090 >> 9;
				@Pc(81) int local81 = local41.anInt10089 + local51 >> 9;
				if (arg1 >= local59 && local67 <= arg0 && arg1 <= local74 && local81 >= arg0) {
					@Pc(115) int local115 = (local74 + 1 - arg1) * (local81 + 1 + -arg0);
					if (local115 > local28) {
						local26 = local41;
						local28 = local115;
					}
				}
			}
		}
		return local26;
	}
}
