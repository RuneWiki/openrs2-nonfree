import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "[I")
	public static int[] anIntArray431;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public static int anInt3690 = 0;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Z")
	public static boolean aBoolean310 = false;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
	public static int anInt3693 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public static void method3488(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = Static42.method1000(4, arg0);
		local10.method167();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!rg;)Z")
	public static boolean method3489(@OriginalArg(1) Class177 arg0) {
		if (arg0.anIntArray660 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray660.length; local20++) {
			@Pc(27) int local27 = Static211.method3872(local20, arg0);
			@Pc(32) int local32 = arg0.anIntArray662[local20];
			if (arg0.anIntArray660[local20] == 2) {
				if (local32 <= local27) {
					return false;
				}
			} else if (arg0.anIntArray660[local20] == 3) {
				if (local27 <= local32) {
					return false;
				}
			} else if (arg0.anIntArray660[local20] == 4) {
				if (local32 == local27) {
					return false;
				}
			} else if (local32 != local27) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method3490() {
		for (@Pc(15) Class1_Sub1_Sub14 local15 = (Class1_Sub1_Sub14) Static294.aClass195_46.method5029(); local15 != null; local15 = (Class1_Sub1_Sub14) Static294.aClass195_46.method5021()) {
			@Pc(20) Class5_Sub3_Sub4 local20 = local15.aClass5_Sub3_Sub4_1;
			if (Static285.anInt5511 != local20.aByte53 || local20.aBoolean374) {
				local15.method5710();
				local20.method4085();
			} else if (local20.anInt4415 <= Static215.anInt4246) {
				local20.method4079(Static78.anInt1579);
				if (local20.aBoolean374) {
					local15.method5710();
				} else {
					Static313.method5285(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!qj;IZI)Lclient!di;")
	public static Class38 method3492(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4508(0, arg1);
		return local13 == null ? null : new Class38(local13);
	}
}
