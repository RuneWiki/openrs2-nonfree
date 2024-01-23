import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!i", name = "R", descriptor = "I")
	public static int anInt2256;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "I")
	public static int anInt2258;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "Z")
	public static boolean aBoolean162 = true;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "Lclient!lb;")
	public static Class97 aClass97_9 = new Class97(32);

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "Lclient!dh;")
	public static Class33 aClass33_17 = new Class33(64);

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	public static int anInt2257 = 0;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString67 = " has logged in.";

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)V")
	public static void method1724() {
		aClass97_9 = null;
		aClass33_17 = null;
		aString67 = null;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(III)V")
	public static void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class4_Sub2_Sub21 local15 = Static39.method4121(arg1, 1);
		local15.method4360();
		local15.anInt5492 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
	public static void method1726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static211.anInt4200 <= arg3 - arg2 && arg3 + arg2 <= Static154.anInt3126 && Static171.anInt3392 <= arg1 - arg2 && Static141.anInt2889 >= arg2 + arg1) {
			Static216.method3444(arg0, arg3, arg2, arg1);
		} else {
			Static120.method2043(arg1, arg3, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
	public static void method1729() {
		for (@Pc(10) Class4_Sub2_Sub18 local10 = (Class4_Sub2_Sub18) Static241.aClass10_50.method190(); local10 != null; local10 = (Class4_Sub2_Sub18) Static241.aClass10_50.method191()) {
			@Pc(16) Class12_Sub5 local16 = local10.aClass12_Sub5_1;
			if (local16.anInt3939 != Static210.anInt4103 || Static104.anInt2226 > local16.anInt3936) {
				local10.method4391();
			} else if (local16.anInt3943 <= Static104.anInt2226) {
				if (local16.anInt3940 > 0) {
					@Pc(53) Class12_Sub3_Sub1 local53 = Static100.aClass12_Sub3_Sub1Array1[local16.anInt3940 - 1];
					if (local53 != null && local53.anInt4141 >= 0 && local53.anInt4141 < 13312 && local53.anInt4113 >= 0 && local53.anInt4113 < 13312) {
						local16.method3128(local53.anInt4113, local53.anInt4141, Static104.anInt2226, Static96.method1559(local16.anInt3939, local53.anInt4113, local53.anInt4141) - local16.anInt3938);
					}
				}
				if (local16.anInt3940 < 0) {
					@Pc(105) int local105 = -local16.anInt3940 - 1;
					@Pc(116) Class12_Sub3_Sub2 local116;
					if (Static238.anInt4597 == local105) {
						local116 = Static239.aClass12_Sub3_Sub2_2;
					} else {
						local116 = Static257.aClass12_Sub3_Sub2Array1[local105];
					}
					if (local116 != null && local116.anInt4141 >= 0 && local116.anInt4141 < 13312 && local116.anInt4113 >= 0 && local116.anInt4113 < 13312) {
						local16.method3128(local116.anInt4113, local116.anInt4141, Static104.anInt2226, Static96.method1559(local16.anInt3939, local116.anInt4113, local116.anInt4141) - local16.anInt3938);
					}
				}
				local16.method3126(Static16.anInt307);
				Static258.method3892(Static210.anInt4103, (int) local16.aDouble7, (int) local16.aDouble3, (int) local16.aDouble6, 60, local16, local16.anInt3953, -1L, false);
			}
		}
	}
}
