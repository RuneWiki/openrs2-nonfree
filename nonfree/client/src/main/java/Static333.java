import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
	public static int anInt5654 = 0;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method5010(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static321.anInt5443 > 0) {
			local21 = Static595.aByteArrayArray25[--Static321.anInt5443];
			Static595.aByteArrayArray25[Static321.anInt5443] = null;
			return local21;
		} else if (arg0 == 5000 && Static341.anInt5759 > 0) {
			local21 = Static82.aByteArrayArray7[--Static341.anInt5759];
			Static82.aByteArrayArray7[Static341.anInt5759] = null;
			return local21;
		} else if (arg0 == 30000 && Static137.anInt2416 > 0) {
			local21 = Static189.aByteArrayArray30[--Static137.anInt2416];
			Static189.aByteArrayArray30[Static137.anInt2416] = null;
			return local21;
		} else {
			if (Static92.aByteArrayArrayArray2 != null) {
				for (@Pc(74) int local74 = 0; local74 < Static14.anIntArray6.length; local74++) {
					if (Static14.anIntArray6[local74] == arg0 && Static77.anIntArray114[local74] > 0) {
						@Pc(100) byte[] local100 = Static92.aByteArrayArrayArray2[local74][--Static77.anIntArray114[local74]];
						Static92.aByteArrayArrayArray2[local74][Static77.anIntArray114[local74]] = null;
						return local100;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIBII)V")
	public static void method5011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static33.anInt543 = arg1;
		Static385.anInt6364 = arg2;
		Static322.anInt5456 = arg0;
		Static557.anInt9404 = arg3;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method5012(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static321.anInt5443 < 1000) {
			Static595.aByteArrayArray25[Static321.anInt5443++] = arg0;
		} else if (arg0.length == 5000 && Static341.anInt5759 < 250) {
			Static82.aByteArrayArray7[Static341.anInt5759++] = arg0;
		} else if (arg0.length == 30000 && Static137.anInt2416 < 50) {
			Static189.aByteArrayArray30[Static137.anInt2416++] = arg0;
		} else if (Static92.aByteArrayArrayArray2 != null) {
			for (@Pc(65) int local65 = 0; local65 < Static14.anIntArray6.length; local65++) {
				if (Static14.anIntArray6[local65] == arg0.length && Static92.aByteArrayArrayArray2[local65].length > Static77.anIntArray114[local65]) {
					Static92.aByteArrayArrayArray2[local65][Static77.anIntArray114[local65]++] = arg0;
					return;
				}
			}
		}
	}
}
