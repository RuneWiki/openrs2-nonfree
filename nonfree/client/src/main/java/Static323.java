import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZBILclient!oa;)Lclient!ta;")
	public static Class82 method4983(@OriginalArg(2) int arg0, @OriginalArg(3) Class90 arg1) {
		@Pc(9) Class118 local9 = Static85.method1185(arg0, arg1);
		return local9 == null ? null : local9.aClass82_2;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLclient!jr;)V")
	public static void method4984(@OriginalArg(1) Class6_Sub12 arg0) {
		if (arg0.aByteArray97.length - arg0.anInt7556 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method6019();
		if (local22 < 0 || local22 > 1 || arg0.aByteArray97.length - arg0.anInt7556 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method6044();
		if (arg0.aByteArray97.length - arg0.anInt7556 < local49 * 6) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local49; local63++) {
			@Pc(69) int local69 = arg0.method6044();
			@Pc(73) int local73 = arg0.method6015();
			if (Static2.anIntArray4.length > local69 && Static224.aBooleanArray14[local69] && (Static506.aClass174_2.method4091(local69).aChar3 != '1' || local73 >= -1 && local73 <= 1)) {
				Static2.anIntArray4[local69] = local73;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public static void method4986() {
		Static120.aBoolean137 = true;
	}
}
