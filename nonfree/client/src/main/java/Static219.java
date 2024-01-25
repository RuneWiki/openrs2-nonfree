import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array14;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	public static int anInt4468;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method3782(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static575.anInt9539 < 1000) {
			Static202.aByteArrayArray16[Static575.anInt9539++] = arg0;
		} else if (arg0.length == 5000 && Static21.anInt415 < 250) {
			Static147.aByteArrayArray13[Static21.anInt415++] = arg0;
		} else if (arg0.length == 30000 && Static583.anInt9635 < 50) {
			Static230.aByteArrayArray19[Static583.anInt9635++] = arg0;
		} else if (Static371.aByteArrayArrayArray17 != null) {
			for (@Pc(70) int local70 = 0; local70 < Static412.anIntArray592.length; local70++) {
				if (arg0.length == Static412.anIntArray592[local70] && Static197.anIntArray390[local70] < Static371.aByteArrayArrayArray17[local70].length) {
					Static371.aByteArrayArrayArray17[local70][Static197.anIntArray390[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3783(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static575.anInt9539 > 0) {
			local16 = Static202.aByteArrayArray16[--Static575.anInt9539];
			Static202.aByteArrayArray16[Static575.anInt9539] = null;
			return local16;
		} else if (arg0 == 5000 && Static21.anInt415 > 0) {
			local16 = Static147.aByteArrayArray13[--Static21.anInt415];
			Static147.aByteArrayArray13[Static21.anInt415] = null;
			return local16;
		} else if (arg0 == 30000 && Static583.anInt9635 > 0) {
			local16 = Static230.aByteArrayArray19[--Static583.anInt9635];
			Static230.aByteArrayArray19[Static583.anInt9635] = null;
			return local16;
		} else {
			if (Static371.aByteArrayArrayArray17 != null) {
				for (@Pc(80) int local80 = 0; local80 < Static412.anIntArray592.length; local80++) {
					if (arg0 == Static412.anIntArray592[local80] && Static197.anIntArray390[local80] > 0) {
						@Pc(106) byte[] local106 = Static371.aByteArrayArrayArray17[local80][--Static197.anIntArray390[local80]];
						Static371.aByteArrayArrayArray17[local80][Static197.anIntArray390[local80]] = null;
						return local106;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZII)I")
	public static int method3784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - arg1;
		return (((arg0 & 0xFF00FF) * local30 & 0xFF00FF00 | local30 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local26;
	}
}
