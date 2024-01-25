import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_2 = new Class8(2, 2);

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString9 = null;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method611(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static79.anInt1413 < 1000) {
			Static74.aByteArrayArray3[Static79.anInt1413++] = arg0;
		} else if (arg0.length == 5000 && Static409.anInt6365 < 250) {
			Static282.aByteArrayArray24[Static409.anInt6365++] = arg0;
		} else if (arg0.length == 30000 && Static369.anInt5835 < 50) {
			Static14.aByteArrayArray2[Static369.anInt5835++] = arg0;
		} else if (Static158.aByteArrayArrayArray5 != null) {
			for (@Pc(63) int local63 = 0; local63 < Static570.anIntArray636.length; local63++) {
				if (arg0.length == Static570.anIntArray636[local63] && Static244.anIntArray670[local63] < Static158.aByteArrayArrayArray5[local63].length) {
					Static158.aByteArrayArrayArray5[local63][Static244.anIntArray670[local63]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method613(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static79.anInt1413 > 0) {
			local21 = Static74.aByteArrayArray3[--Static79.anInt1413];
			Static74.aByteArrayArray3[Static79.anInt1413] = null;
			return local21;
		} else if (arg0 == 5000 && Static409.anInt6365 > 0) {
			local21 = Static282.aByteArrayArray24[--Static409.anInt6365];
			Static282.aByteArrayArray24[Static409.anInt6365] = null;
			return local21;
		} else if (arg0 == 30000 && Static369.anInt5835 > 0) {
			local21 = Static14.aByteArrayArray2[--Static369.anInt5835];
			Static14.aByteArrayArray2[Static369.anInt5835] = null;
			return local21;
		} else {
			if (Static158.aByteArrayArrayArray5 != null) {
				for (@Pc(76) int local76 = 0; local76 < Static570.anIntArray636.length; local76++) {
					if (Static570.anIntArray636[local76] == arg0 && Static244.anIntArray670[local76] > 0) {
						@Pc(103) byte[] local103 = Static158.aByteArrayArrayArray5[local76][--Static244.anIntArray670[local76]];
						Static158.aByteArrayArrayArray5[local76][Static244.anIntArray670[local76]] = null;
						return local103;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
