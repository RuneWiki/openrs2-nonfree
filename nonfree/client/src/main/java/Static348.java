import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public static int anInt5563;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[16];

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_16 = new Class320(60);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4919(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static673.anInt10809 > 0) {
			local21 = Static715.aByteArrayArray26[--Static673.anInt10809];
			Static715.aByteArrayArray26[Static673.anInt10809] = null;
			return local21;
		} else if (arg0 == 5000 && Static64.anInt1573 > 0) {
			local21 = Static698.aByteArrayArray22[--Static64.anInt1573];
			Static698.aByteArrayArray22[Static64.anInt1573] = null;
			return local21;
		} else if (arg0 == 30000 && Static295.anInt4519 > 0) {
			local21 = Static629.aByteArrayArray16[--Static295.anInt4519];
			Static629.aByteArrayArray16[Static295.anInt4519] = null;
			return local21;
		} else {
			if (Static591.aByteArrayArrayArray12 != null) {
				for (@Pc(85) int local85 = 0; local85 < Static574.anIntArray632.length; local85++) {
					if (arg0 == Static574.anIntArray632[local85] && Static77.anIntArray96[local85] > 0) {
						@Pc(114) byte[] local114 = Static591.aByteArrayArrayArray12[local85][--Static77.anIntArray96[local85]];
						Static591.aByteArrayArrayArray12[local85][Static77.anIntArray96[local85]] = null;
						return local114;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB[Ljava/awt/Rectangle;)V")
	public static void method4920(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static488.anInt7680 == 1) {
			Static536.aClass22_11.method9385(arg1, arg0, Static245.anInt3872, Static511.anInt8098);
		} else {
			Static536.aClass22_11.method9385(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([BI)V")
	public static synchronized void method4921(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static673.anInt10809 < 1000) {
			Static715.aByteArrayArray26[Static673.anInt10809++] = arg0;
		} else if (arg0.length == 5000 && Static64.anInt1573 < 250) {
			Static698.aByteArrayArray22[Static64.anInt1573++] = arg0;
		} else if (arg0.length == 30000 && Static295.anInt4519 < 50) {
			Static629.aByteArrayArray16[Static295.anInt4519++] = arg0;
		} else if (Static591.aByteArrayArrayArray12 != null) {
			for (@Pc(83) int local83 = 0; local83 < Static574.anIntArray632.length; local83++) {
				if (Static574.anIntArray632[local83] == arg0.length && Static77.anIntArray96[local83] < Static591.aByteArrayArrayArray12[local83].length) {
					Static591.aByteArrayArrayArray12[local83][Static77.anIntArray96[local83]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)Z")
	public static boolean method4922(@OriginalArg(1) int arg0) {
		return arg0 == 20 || arg0 == 48 || arg0 == 1002 || arg0 == 25 || arg0 == 23;
	}
}
