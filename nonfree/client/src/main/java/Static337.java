import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public static int anInt6315;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[F")
	public static final float[] aFloatArray45 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_88 = new Class200(68, -2);

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public static int anInt6314 = 0;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public static int anInt6317 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5474(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static455.anInt8040 > 0) {
			local24 = Static421.aByteArrayArray27[--Static455.anInt8040];
			Static421.aByteArrayArray27[Static455.anInt8040] = null;
			return local24;
		} else if (arg0 == 5000 && Static180.anInt3463 > 0) {
			local24 = Static463.aByteArrayArray23[--Static180.anInt3463];
			Static463.aByteArrayArray23[Static180.anInt3463] = null;
			return local24;
		} else if (arg0 == 30000 && Static509.anInt8808 > 0) {
			local24 = Static590.aByteArrayArray32[--Static509.anInt8808];
			Static590.aByteArrayArray32[Static509.anInt8808] = null;
			return local24;
		} else {
			if (Static325.aByteArrayArrayArray17 != null) {
				for (@Pc(77) int local77 = 0; local77 < Static513.anIntArray549.length; local77++) {
					if (arg0 == Static513.anIntArray549[local77] && Static409.anIntArray457[local77] > 0) {
						@Pc(100) byte[] local100 = Static325.aByteArrayArrayArray17[local77][--Static409.anIntArray457[local77]];
						Static325.aByteArrayArrayArray17[local77][Static409.anIntArray457[local77]] = null;
						return local100;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
	public static boolean method5475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static481.method7184(arg1, arg0) | (arg0 & 0x40000) != 0 || Static603.method8432(arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[B)V")
	public static synchronized void method5476(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static455.anInt8040 < 1000) {
			Static421.aByteArrayArray27[Static455.anInt8040++] = arg0;
		} else if (arg0.length == 5000 && Static180.anInt3463 < 250) {
			Static463.aByteArrayArray23[Static180.anInt3463++] = arg0;
		} else if (arg0.length == 30000 && Static509.anInt8808 < 50) {
			Static590.aByteArrayArray32[Static509.anInt8808++] = arg0;
		} else if (Static325.aByteArrayArrayArray17 != null) {
			for (@Pc(68) int local68 = 0; local68 < Static513.anIntArray549.length; local68++) {
				if (Static513.anIntArray549[local68] == arg0.length && Static409.anIntArray457[local68] < Static325.aByteArrayArrayArray17[local68].length) {
					Static325.aByteArrayArrayArray17[local68][Static409.anIntArray457[local68]++] = arg0;
					return;
				}
			}
		}
	}
}
