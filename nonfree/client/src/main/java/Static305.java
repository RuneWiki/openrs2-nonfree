import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Lclient!gda;")
	public static Class126 aClass126_149;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method4759(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static570.anInt8952 < 1000) {
			Static473.aByteArrayArray20[Static570.anInt8952++] = arg0;
		} else if (arg0.length == 5000 && Static361.anInt5885 < 250) {
			Static612.aByteArrayArray24[Static361.anInt5885++] = arg0;
		} else if (arg0.length == 30000 && Static54.anInt953 < 50) {
			Static493.aByteArrayArray21[Static54.anInt953++] = arg0;
		} else if (Static107.aByteArrayArrayArray6 != null) {
			for (@Pc(70) int local70 = 0; local70 < Static511.anIntArray546.length; local70++) {
				if (Static511.anIntArray546[local70] == arg0.length && Static447.anIntArray435[local70] < Static107.aByteArrayArrayArray6[local70].length) {
					Static107.aByteArrayArrayArray6[local70][Static447.anIntArray435[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4760(@OriginalArg(0) int arg0) {
		@Pc(20) byte[] local20;
		if (arg0 == 100 && Static570.anInt8952 > 0) {
			local20 = Static473.aByteArrayArray20[--Static570.anInt8952];
			Static473.aByteArrayArray20[Static570.anInt8952] = null;
			return local20;
		} else if (arg0 == 5000 && Static361.anInt5885 > 0) {
			local20 = Static612.aByteArrayArray24[--Static361.anInt5885];
			Static612.aByteArrayArray24[Static361.anInt5885] = null;
			return local20;
		} else if (arg0 == 30000 && Static54.anInt953 > 0) {
			local20 = Static493.aByteArrayArray21[--Static54.anInt953];
			Static493.aByteArrayArray21[Static54.anInt953] = null;
			return local20;
		} else {
			if (Static107.aByteArrayArrayArray6 != null) {
				for (@Pc(87) int local87 = 0; local87 < Static511.anIntArray546.length; local87++) {
					if (arg0 == Static511.anIntArray546[local87] && Static447.anIntArray435[local87] > 0) {
						@Pc(112) byte[] local112 = Static107.aByteArrayArrayArray6[local87][--Static447.anIntArray435[local87]];
						Static107.aByteArrayArrayArray6[local87][Static447.anIntArray435[local87]] = null;
						return local112;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)Lclient!mj;")
	public static Class238 method4761(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static397.aClass238ArrayArray2[local7] == null || Static397.aClass238ArrayArray2[local7][local22] == null) {
			@Pc(38) boolean local38 = Static20.method345(local7);
			if (!local38) {
				return null;
			}
		}
		return Static397.aClass238ArrayArray2[local7][local22];
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;I)V")
	public static void method4762(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static193.method3263(-1, arg0, arg1, true, arg3, arg2);
	}
}
