import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_100 = new Class56(97, 8);

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public static int anInt5105 = 0;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4432(@OriginalArg(0) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static329.anInt7877 > 0) {
			local24 = Static546.aByteArrayArray21[--Static329.anInt7877];
			Static546.aByteArrayArray21[Static329.anInt7877] = null;
			return local24;
		} else if (arg0 == 5000 && Static33.anInt612 > 0) {
			local24 = Static117.aByteArrayArray7[--Static33.anInt612];
			Static117.aByteArrayArray7[Static33.anInt612] = null;
			return local24;
		} else if (arg0 == 30000 && Static152.anInt3206 > 0) {
			local24 = Static564.aByteArrayArray23[--Static152.anInt3206];
			Static564.aByteArrayArray23[Static152.anInt3206] = null;
			return local24;
		} else {
			if (Static106.aByteArrayArrayArray9 != null) {
				for (@Pc(79) int local79 = 0; local79 < Static288.anIntArray271.length; local79++) {
					if (Static288.anIntArray271[local79] == arg0 && Static128.anIntArray131[local79] > 0) {
						@Pc(102) byte[] local102 = Static106.aByteArrayArrayArray9[local79][--Static128.anIntArray131[local79]];
						Static106.aByteArrayArrayArray9[local79][Static128.anIntArray131[local79]] = null;
						return local102;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "([BI)V")
	public static synchronized void method4434(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static329.anInt7877 < 1000) {
			Static546.aByteArrayArray21[Static329.anInt7877++] = arg0;
		} else if (arg0.length == 5000 && Static33.anInt612 < 250) {
			Static117.aByteArrayArray7[Static33.anInt612++] = arg0;
		} else if (arg0.length == 30000 && Static152.anInt3206 < 50) {
			Static564.aByteArrayArray23[Static152.anInt3206++] = arg0;
		} else if (Static106.aByteArrayArrayArray9 != null) {
			for (@Pc(66) int local66 = 0; local66 < Static288.anIntArray271.length; local66++) {
				if (arg0.length == Static288.anIntArray271[local66] && Static106.aByteArrayArrayArray9[local66].length > Static128.anIntArray131[local66]) {
					Static106.aByteArrayArrayArray9[local66][Static128.anIntArray131[local66]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BII)Z")
	public static boolean method4435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static150.aBoolean254) {
			return false;
		}
		@Pc(21) int local21 = arg1 >> 16;
		@Pc(25) int local25 = arg1 & 0xFFFF;
		if (Static380.aClass361ArrayArray2[local21] == null || Static380.aClass361ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class361 local43 = Static380.aClass361ArrayArray2[local21][local25];
		@Pc(55) Class3_Sub43 local55;
		if (arg0 == -1 && local43.anInt9665 == 0) {
			for (local55 = (Class3_Sub43) Static133.aClass112_20.method3088(); local55 != null; local55 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
				if (local55.anInt7753 == 3 || local55.anInt7753 == 1007 || local55.anInt7753 == 8 || local55.anInt7753 == 10 || local55.anInt7753 == 59) {
					for (@Pc(86) Class361 local86 = Static265.method4040(local55.anInt7750); local86 != null; local86 = Static418.method5948(local86)) {
						if (local43.anInt9594 == local86.anInt9594) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class3_Sub43) Static133.aClass112_20.method3088(); local55 != null; local55 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
				if (local55.anInt7752 == arg0 && local43.anInt9594 == local55.anInt7750 && (local55.anInt7753 == 3 || local55.anInt7753 == 1007 || local55.anInt7753 == 8 || local55.anInt7753 == 10 || local55.anInt7753 == 59)) {
					return true;
				}
			}
		}
		return false;
	}
}
