import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!an;")
	public static Class16 aClass16_104;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
	public static int method6720() {
		return 6;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z")
	public static boolean method6723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static389.aBoolean533) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static71.aClass198ArrayArray1[local13] == null || Static71.aClass198ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class198 local40 = Static71.aClass198ArrayArray1[local13][local17];
		@Pc(52) Class12_Sub20 local52;
		if (arg0 == -1 && local40.anInt5776 == 0) {
			for (local52 = (Class12_Sub20) Static192.aClass73_33.method2005(); local52 != null; local52 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
				if (local52.anInt4329 == 51 || local52.anInt4329 == 1009 || local52.anInt4329 == 3 || local52.anInt4329 == 25 || local52.anInt4329 == 47) {
					for (@Pc(81) Class198 local81 = Static104.method2137(local52.anInt4325); local81 != null; local81 = Static116.method2393(local81)) {
						if (local40.anInt5739 == local81.anInt5739) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class12_Sub20) Static192.aClass73_33.method2005(); local52 != null; local52 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
				if (local52.anInt4327 == arg0 && local52.anInt4325 == local40.anInt5739 && (local52.anInt4329 == 51 || local52.anInt4329 == 1009 || local52.anInt4329 == 3 || local52.anInt4329 == 25 || local52.anInt4329 == 47)) {
					return true;
				}
			}
		}
		return false;
	}
}
