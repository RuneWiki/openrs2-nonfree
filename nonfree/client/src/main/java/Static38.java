import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "Z")
	public static boolean aBoolean94;

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "Lclient!ps;")
	public static Class262 aClass262_1;

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
	public static void method1056() {
		Static516.aBoolean592 = true;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1057(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static357.anInt6348 > 0) {
			local16 = Static118.aByteArrayArray12[--Static357.anInt6348];
			Static118.aByteArrayArray12[Static357.anInt6348] = null;
			return local16;
		} else if (arg0 == 5000 && Static119.anInt2793 > 0) {
			local16 = Static496.aByteArrayArray41[--Static119.anInt2793];
			Static496.aByteArrayArray41[Static119.anInt2793] = null;
			return local16;
		} else if (arg0 == 30000 && Static567.anInt5470 > 0) {
			local16 = Static233.aByteArrayArray23[--Static567.anInt5470];
			Static233.aByteArrayArray23[Static567.anInt5470] = null;
			return local16;
		} else {
			if (Static81.aByteArrayArrayArray1 != null) {
				for (@Pc(70) int local70 = 0; local70 < Static205.anIntArray198.length; local70++) {
					if (arg0 == Static205.anIntArray198[local70] && Static192.anIntArray177[local70] > 0) {
						@Pc(100) byte[] local100 = Static81.aByteArrayArrayArray1[local70][--Static192.anIntArray177[local70]];
						Static81.aByteArrayArrayArray1[local70][Static192.anIntArray177[local70]] = null;
						return local100;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method1058(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static357.anInt6348 < 1000) {
			Static118.aByteArrayArray12[Static357.anInt6348++] = arg0;
		} else if (arg0.length == 5000 && Static119.anInt2793 < 250) {
			Static496.aByteArrayArray41[Static119.anInt2793++] = arg0;
		} else if (arg0.length == 30000 && Static567.anInt5470 < 50) {
			Static233.aByteArrayArray23[Static567.anInt5470++] = arg0;
		} else if (Static81.aByteArrayArrayArray1 != null) {
			for (@Pc(69) int local69 = 0; local69 < Static205.anIntArray198.length; local69++) {
				if (arg0.length == Static205.anIntArray198[local69] && Static81.aByteArrayArrayArray1[local69].length > Static192.anIntArray177[local69]) {
					Static81.aByteArrayArrayArray1[local69][Static192.anIntArray177[local69]++] = arg0;
					return;
				}
			}
		}
	}
}
