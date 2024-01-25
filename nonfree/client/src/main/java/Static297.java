import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[2048];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4710(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static1.anInt3 > 0) {
			local19 = Static477.aByteArrayArray26[--Static1.anInt3];
			Static477.aByteArrayArray26[Static1.anInt3] = null;
			return local19;
		} else if (arg0 == 5000 && Static14.anInt209 > 0) {
			local19 = Static55.aByteArrayArray2[--Static14.anInt209];
			Static55.aByteArrayArray2[Static14.anInt209] = null;
			return local19;
		} else if (arg0 == 30000 && Static6.anInt101 > 0) {
			local19 = Static37.aByteArrayArray1[--Static6.anInt101];
			Static37.aByteArrayArray1[Static6.anInt101] = null;
			return local19;
		} else {
			if (Static564.aByteArrayArrayArray18 != null) {
				for (@Pc(71) int local71 = 0; local71 < Static247.anIntArray367.length; local71++) {
					if (arg0 == Static247.anIntArray367[local71] && Static321.anIntArray448[local71] > 0) {
						@Pc(98) byte[] local98 = Static564.aByteArrayArrayArray18[local71][--Static321.anIntArray448[local71]];
						Static564.aByteArrayArrayArray18[local71][Static321.anIntArray448[local71]] = null;
						return local98;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B[B)V")
	public static synchronized void method4711(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static1.anInt3 < 1000) {
			Static477.aByteArrayArray26[Static1.anInt3++] = arg0;
		} else if (arg0.length == 5000 && Static14.anInt209 < 250) {
			Static55.aByteArrayArray2[Static14.anInt209++] = arg0;
		} else if (arg0.length == 30000 && Static6.anInt101 < 50) {
			Static37.aByteArrayArray1[Static6.anInt101++] = arg0;
		} else if (Static564.aByteArrayArrayArray18 != null) {
			for (@Pc(71) int local71 = 0; local71 < Static247.anIntArray367.length; local71++) {
				if (Static247.anIntArray367[local71] == arg0.length && Static564.aByteArrayArrayArray18[local71].length > Static321.anIntArray448[local71]) {
					Static564.aByteArrayArrayArray18[local71][Static321.anIntArray448[local71]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([BI)[B")
	public static byte[] method4713(@OriginalArg(0) byte[] arg0) {
		@Pc(12) int local12 = arg0.length;
		@Pc(15) byte[] local15 = new byte[local12];
		Static604.method5910(arg0, 0, local15, 0, local12);
		return local15;
	}
}
