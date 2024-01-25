import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_52 = new Class254(105, 3);

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_28 = new Class181(77, 3);

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
	public static final int[] anIntArray203 = new int[5];

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
	public static int method2330() {
		if ((double) Static461.aFloat4 == 3.0D) {
			return 37;
		} else if ((double) Static461.aFloat4 == 4.0D) {
			return 50;
		} else if ((double) Static461.aFloat4 == 6.0D) {
			return 75;
		} else if ((double) Static461.aFloat4 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method2331(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.length();
		if (local12 == 0) {
			return new byte[0];
		}
		@Pc(23) int local23 = local12 + 3 & 0xFFFFFFFC;
		@Pc(29) int local29 = local23 / 4 * 3;
		if (local23 - 2 >= local12 || Static200.method3766(arg0.charAt(local23 - 2)) == -1) {
			local29 -= 2;
		} else if (local23 - 1 >= local12 || Static200.method3766(arg0.charAt(local23 - 1)) == -1) {
			local29--;
		}
		@Pc(65) byte[] local65 = new byte[local29];
		Static114.method2313(0, local65, arg0);
		return local65;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII[I)V")
	public static void method2332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(12) int local12 = arg1 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (local16 > arg0) {
			@Pc(20) int local20 = arg0 + 1;
			arg3[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg3[local50] = arg2;
			arg0 = local50 + 1;
			arg3[arg0] = arg2;
		}
		while (arg0 < local12) {
			arg0++;
			arg3[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)Z")
	public static boolean method2333(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static323.aClass9_8.method5398();
		if (arg0 == local13) {
			return true;
		}
		if (!arg0) {
			Static323.aClass9_8.method5406();
		} else if (!Static323.aClass9_8.method5453()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static104.aClass6_Sub6_Sub1_4.aBoolean126 = arg0;
			Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
	public static int method2334(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}
}
