import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "Lclient!xa;")
	public static Class4 aClass4_20;

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_147 = new Class40(66, -1);

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIII)I")
	public static int method5297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg1 & 0xFF00) * arg2 & 0xFF0000 | arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg2;
		return local26 + (((arg0 & 0xFF00FF) * local31 & 0xFF00FF00 | local31 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static303.aByteArrayArrayArray13[0][arg1][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static303.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x10) == 0) {
			return arg3 == Static245.method3527(arg0, arg1, arg2);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "([BB)V")
	public static void method5299(@OriginalArg(0) byte[] arg0) {
		@Pc(20) Class6_Sub14 local20 = new Class6_Sub14(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(24) int local24 = local20.method6041();
					if (local24 == 0) {
						return;
					}
					if (local24 == 1) {
						@Pc(115) int[] local115 = Static195.anIntArray389 = new int[6];
						local115[0] = local20.method6006();
						local115[1] = local20.method6006();
						local115[2] = local20.method6006();
						local115[3] = local20.method6006();
						local115[4] = local20.method6006();
						local115[5] = local20.method6006();
					} else {
						@Pc(46) int local46;
						@Pc(41) int local41;
						if (local24 == 4) {
							local41 = local20.method6041();
							Static300.anIntArray467 = new int[local41];
							for (local46 = 0; local46 < local41; local46++) {
								Static300.anIntArray467[local46] = local20.method6006();
								if (Static300.anIntArray467[local46] == 65535) {
									Static300.anIntArray467[local46] = -1;
								}
							}
						} else if (local24 == 5) {
							local41 = local20.method6041();
							Static536.anIntArray685 = new int[local41];
							for (local46 = 0; local46 < local41; local46++) {
								Static536.anIntArray685[local46] = local20.method6006();
								if (Static536.anIntArray685[local46] == 65535) {
									Static536.anIntArray685[local46] = -1;
								}
							}
						}
					}
				}
			}
		}
	}
}
