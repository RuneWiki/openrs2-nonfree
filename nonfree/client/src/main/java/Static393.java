import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!h;")
	public static Class131 aClass131_5;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!uga;")
	public static Class3_Sub14_Sub4 aClass3_Sub14_Sub4_1;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!ts;")
	public static Class8 aClass8_2;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_99 = new Class276(83, 0);

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public static int anInt7567 = 0;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	public static int anInt7568 = 0;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
	public static final int[] anIntArray482 = new int[32];

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	private static int anInt7569 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
	public static boolean method6278(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method6279(@OriginalArg(0) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static236.anInt4897 > 0) {
			local26 = Static598.aByteArrayArray36[--Static236.anInt4897];
			Static598.aByteArrayArray36[Static236.anInt4897] = null;
			return local26;
		} else if (arg0 == 5000 && Static90.anInt2257 > 0) {
			local26 = Static282.aByteArrayArray20[--Static90.anInt2257];
			Static282.aByteArrayArray20[Static90.anInt2257] = null;
			return local26;
		} else if (arg0 == 30000 && anInt7569 > 0) {
			local26 = Static83.aByteArrayArray8[--anInt7569];
			Static83.aByteArrayArray8[anInt7569] = null;
			return local26;
		} else {
			if (Static135.aByteArrayArrayArray5 != null) {
				for (@Pc(77) int local77 = 0; local77 < Static411.anIntArray499.length; local77++) {
					if (arg0 == Static411.anIntArray499[local77] && Static293.anIntArray368[local77] > 0) {
						@Pc(104) byte[] local104 = Static135.aByteArrayArrayArray5[local77][--Static293.anIntArray368[local77]];
						Static135.aByteArrayArrayArray5[local77][Static293.anIntArray368[local77]] = null;
						return local104;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method6281() {
		@Pc(5) Class211 local5 = Static232.aClass211_34;
		synchronized (Static232.aClass211_34) {
			Static232.aClass211_34.method5537();
		}
		local5 = Static204.aClass211_30;
		synchronized (Static204.aClass211_30) {
			Static204.aClass211_30.method5537();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
	public static void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg4 >= Static535.anInt9696 && Static35.anInt993 >= arg4 + arg3 && Static55.anInt1303 <= arg1 - arg4 && Static208.anInt4309 >= arg1 + arg4) {
			Static591.method8341(arg3, arg0, arg2, arg1, arg4, arg5);
		} else {
			Static215.method5022(arg2, arg3, arg1, arg0, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)V")
	public static synchronized void method6283(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static236.anInt4897 < 1000) {
			Static598.aByteArrayArray36[Static236.anInt4897++] = arg0;
		} else if (arg0.length == 5000 && Static90.anInt2257 < 250) {
			Static282.aByteArrayArray20[Static90.anInt2257++] = arg0;
		} else if (arg0.length == 30000 && anInt7569 < 50) {
			Static83.aByteArrayArray8[anInt7569++] = arg0;
		} else if (Static135.aByteArrayArrayArray5 != null) {
			for (@Pc(60) int local60 = 0; local60 < Static411.anIntArray499.length; local60++) {
				if (Static411.anIntArray499[local60] == arg0.length && Static135.aByteArrayArrayArray5[local60].length > Static293.anIntArray368[local60]) {
					Static135.aByteArrayArrayArray5[local60][Static293.anIntArray368[local60]++] = arg0;
					return;
				}
			}
		}
	}
}
