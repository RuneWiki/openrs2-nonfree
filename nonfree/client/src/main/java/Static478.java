import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_87 = new Class387(45, -1);

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
	public static void method6968(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static220.aByteArrayArrayArray14.length; local7++) {
			for (@Pc(13) int local13 = 0; local13 < Static220.aByteArrayArrayArray14[0].length; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static220.aByteArrayArrayArray14[0][0].length; local17++) {
					Static220.aByteArrayArrayArray14[local7][local13][local17] = 0;
				}
			}
		}
		if (arg0 != 28123) {
			method6968(88);
		}
	}

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "(I)V")
	public static void method6969() {
		Static116.anInt3318 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static526.aClass5_Sub23Array1[local9] = null;
			Static10.aByteArray1[local9] = 1;
			Static601.aClass136Array1[local9] = null;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(JII)Lclient!gaa;")
	public static Class5_Sub5_Sub6 method6972(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(22) Class5_Sub5_Sub6 local22 = (Class5_Sub5_Sub6) Static199.aClass291_36.method6993((long) arg1 << 56 | arg0, 1);
		if (local22 == null) {
			local22 = new Class5_Sub5_Sub6(arg1, arg0);
			Static199.aClass291_36.method6984(local22.aLong314, local22);
		}
		return local22;
	}
}
