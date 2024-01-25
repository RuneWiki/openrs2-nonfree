import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "[S")
	public static short[] aShortArray122;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
	public static int anInt6909;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "J")
	public static long aLong181 = -1L;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5972(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static45.anInt1395 > 0) {
			local24 = Static293.aByteArrayArray14[--Static45.anInt1395];
			Static293.aByteArrayArray14[Static45.anInt1395] = null;
			return local24;
		} else if (arg0 == 5000 && Static3.anInt54 > 0) {
			local24 = Static401.aByteArrayArray26[--Static3.anInt54];
			Static401.aByteArrayArray26[Static3.anInt54] = null;
			return local24;
		} else if (arg0 == 30000 && Static470.anInt6518 > 0) {
			local24 = Static4.aByteArrayArray1[--Static470.anInt6518];
			Static4.aByteArrayArray1[Static470.anInt6518] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ica;B)I")
	public static int method5973(@OriginalArg(0) Class47_Sub2_Sub3_Sub1 arg0) {
		@Pc(6) Class238 local6 = arg0.aClass238_1;
		if (local6.anIntArray511 != null) {
			local6 = local6.method5866(Static343.aClass286_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(26) int local26 = local6.anInt6773;
		@Pc(30) Class255 local30 = arg0.method4356();
		if (arg0.aBoolean343) {
			local26 = local6.anInt6774;
		} else if (local30.anInt7262 == arg0.anInt5039 || local30.anInt7278 == arg0.anInt5039 || arg0.anInt5039 == local30.anInt7259 || local30.anInt7300 == arg0.anInt5039) {
			local26 = local6.anInt6777;
		} else if (arg0.anInt5039 == local30.anInt7288 || local30.anInt7270 == arg0.anInt5039 || arg0.anInt5039 == local30.anInt7287 || arg0.anInt5039 == local30.anInt7268) {
			local26 = local6.anInt6792;
		}
		return local26;
	}
}
