import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public static int anInt3992;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3467(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static275.anInt5094 > 0) {
			local21 = Static40.aByteArrayArray1[--Static275.anInt5094];
			Static40.aByteArrayArray1[Static275.anInt5094] = null;
			return local21;
		} else if (arg0 == 5000 && Static235.anInt4286 > 0) {
			local21 = Static551.aByteArrayArray25[--Static235.anInt4286];
			Static551.aByteArrayArray25[Static235.anInt4286] = null;
			return local21;
		} else if (arg0 == 30000 && Static2.anInt38 > 0) {
			local21 = Static55.aByteArrayArray3[--Static2.anInt38];
			Static55.aByteArrayArray3[Static2.anInt38] = null;
			return local21;
		} else {
			if (Static613.aByteArrayArrayArray18 != null) {
				for (@Pc(81) int local81 = 0; local81 < Static353.anIntArray400.length; local81++) {
					if (Static353.anIntArray400[local81] == arg0 && Static460.anIntArray513[local81] > 0) {
						@Pc(108) byte[] local108 = Static613.aByteArrayArrayArray18[local81][--Static460.anIntArray513[local81]];
						Static613.aByteArrayArrayArray18[local81][Static460.anIntArray513[local81]] = null;
						return local108;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
	public static boolean method3468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BB)V")
	public static synchronized void method3469(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static275.anInt5094 < 1000) {
			Static40.aByteArrayArray1[Static275.anInt5094++] = arg0;
		} else if (arg0.length == 5000 && Static235.anInt4286 < 250) {
			Static551.aByteArrayArray25[Static235.anInt4286++] = arg0;
		} else if (arg0.length == 30000 && Static2.anInt38 < 50) {
			Static55.aByteArrayArray3[Static2.anInt38++] = arg0;
		} else if (Static613.aByteArrayArrayArray18 != null) {
			for (@Pc(66) int local66 = 0; local66 < Static353.anIntArray400.length; local66++) {
				if (arg0.length == Static353.anIntArray400[local66] && Static460.anIntArray513[local66] < Static613.aByteArrayArrayArray18[local66].length) {
					Static613.aByteArrayArrayArray18[local66][Static460.anIntArray513[local66]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!cea;)Lclient!cea;")
	public static Class2_Sub11_Sub1 method3470(@OriginalArg(1) Class2_Sub11_Sub1 arg0) {
		@Pc(14) Class2_Sub11_Sub1 local14 = arg0 == null ? new Class2_Sub11_Sub1() : new Class2_Sub11_Sub1(arg0);
		local14.method1531();
		return local14;
	}
}
