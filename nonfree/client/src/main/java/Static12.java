import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public static int anInt170;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	public static void method158() {
		for (@Pc(12) int local12 = 0; local12 < Static411.aClass159ArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static411.aClass159ArrayArray1[local12].length; local16++) {
				Static411.aClass159ArrayArray1[local12][local16] = Static61.aClass159_1;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method159(@OriginalArg(1) String arg0) {
		Static166.method2340("", 0, 0, arg0, "");
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!at;)V")
	public static void method160(@OriginalArg(1) Class16 arg0) {
		@Pc(14) Class16 local14 = Static399.method5069(arg0);
		@Pc(20) int local20;
		@Pc(18) int local18;
		if (local14 == null) {
			local18 = Static314.anInt5426;
			local20 = Static141.anInt2513;
		} else {
			local20 = local14.anInt294;
			local18 = local14.anInt285;
		}
		Static221.method2940(local18, false, arg0, local20);
		Static204.method2718(local18, arg0, local20);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public static void method161() {
		Static137.aClass13_22 = null;
		Static445.anInt7140 = -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
	public static void method162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static49.anInt857 = arg1 - Static282.anInt3477;
		Static435.anInt7039 = arg0 - Static282.anInt3479;
	}
}
