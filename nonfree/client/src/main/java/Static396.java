import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lclient!pj;")
	public static Class248 aClass248_69;

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_113 = new Class98(48, -2);

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5734(@OriginalArg(1) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static501.anInt8709 > 0) {
			local23 = Static273.aByteArrayArray12[--Static501.anInt8709];
			Static273.aByteArrayArray12[Static501.anInt8709] = null;
			return local23;
		} else if (arg0 == 5000 && Static446.anInt7894 > 0) {
			local23 = Static58.aByteArrayArray1[--Static446.anInt7894];
			Static58.aByteArrayArray1[Static446.anInt7894] = null;
			return local23;
		} else if (arg0 == 30000 && Static383.anInt7012 > 0) {
			local23 = Static362.aByteArrayArray17[--Static383.anInt7012];
			Static362.aByteArrayArray17[Static383.anInt7012] = null;
			return local23;
		} else {
			if (Static142.aByteArrayArrayArray6 != null) {
				for (@Pc(78) int local78 = 0; local78 < Static303.anIntArray424.length; local78++) {
					if (Static303.anIntArray424[local78] == arg0 && Static90.anIntArray402[local78] > 0) {
						@Pc(104) byte[] local104 = Static142.aByteArrayArrayArray6[local78][--Static90.anIntArray402[local78]];
						Static142.aByteArrayArrayArray6[local78][Static90.anIntArray402[local78]] = null;
						return local104;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
