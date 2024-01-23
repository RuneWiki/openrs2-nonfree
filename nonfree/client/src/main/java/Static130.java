import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt2593;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public static int anInt2594;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt2601;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!nk;")
	public static Class121 aClass121_61;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)I")
	public static int method2230(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!hi;I)Z")
	public static boolean method2231(@OriginalArg(0) Class66 arg0) {
		if (arg0.anInt2210 == 205) {
			Static57.anInt1090 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)V")
	public static void method2232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static55.anIntArray64[arg1] = arg0;
		@Pc(14) Class1_Sub9 local14 = (Class1_Sub9) Static86.aClass142_7.method3543((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub9(Static298.method4535() + 500L);
			Static86.aClass142_7.method3537(local14, (long) arg1);
		} else {
			local14.aLong37 = Static298.method4535() + 500L;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
	public static int method2233(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method2234() {
		Static70.aClass187_45.method4530();
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method2235() {
		for (@Pc(6) Class1_Sub25 local6 = (Class1_Sub25) Static302.aClass142_26.method3534(); local6 != null; local6 = (Class1_Sub25) Static302.aClass142_26.method3530()) {
			@Pc(12) int local12 = local6.anInt4289;
			if (Static85.method1597(local12)) {
				@Pc(18) boolean local18 = true;
				@Pc(22) Class66[] local22 = Static274.aClass66ArrayArray1[local12];
				@Pc(24) int local24;
				for (local24 = 0; local24 < local22.length; local24++) {
					if (local22[local24] != null) {
						local18 = local22[local24].aBoolean132;
						break;
					}
				}
				if (!local18) {
					local24 = (int) local6.aLong214;
					@Pc(56) Class66 local56 = Static53.method968(local24);
					if (local56 != null) {
						Static103.method1865(local56);
					}
				}
			}
		}
	}
}
