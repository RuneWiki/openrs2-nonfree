import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	public static int anInt5051;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	public static int anInt5050 = -1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4018(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static577.anInt9527 > 0) {
			local18 = Static8.aByteArrayArray16[--Static577.anInt9527];
			Static8.aByteArrayArray16[Static577.anInt9527] = null;
			return local18;
		} else if (arg0 == 5000 && Static529.anInt7348 > 0) {
			local18 = Static310.aByteArrayArray13[--Static529.anInt7348];
			Static310.aByteArrayArray13[Static529.anInt7348] = null;
			return local18;
		} else if (arg0 == 30000 && Static514.anInt8864 > 0) {
			local18 = Static386.aByteArrayArray20[--Static514.anInt8864];
			Static386.aByteArrayArray20[Static514.anInt8864] = null;
			return local18;
		} else {
			if (Static260.aByteArrayArrayArray5 != null) {
				for (@Pc(73) int local73 = 0; local73 < Static334.anIntArray360.length; local73++) {
					if (arg0 == Static334.anIntArray360[local73] && Static214.anIntArray193[local73] > 0) {
						@Pc(100) byte[] local100 = Static260.aByteArrayArrayArray5[local73][--Static214.anIntArray193[local73]];
						Static260.aByteArrayArrayArray5[local73][Static214.anIntArray193[local73]] = null;
						return local100;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z[B)V")
	public static synchronized void method4019(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static577.anInt9527 < 1000) {
			Static8.aByteArrayArray16[Static577.anInt9527++] = arg0;
		} else if (arg0.length == 5000 && Static529.anInt7348 < 250) {
			Static310.aByteArrayArray13[Static529.anInt7348++] = arg0;
		} else if (arg0.length == 30000 && Static514.anInt8864 < 50) {
			Static386.aByteArrayArray20[Static514.anInt8864++] = arg0;
		} else if (Static260.aByteArrayArrayArray5 != null) {
			for (@Pc(70) int local70 = 0; local70 < Static334.anIntArray360.length; local70++) {
				if (Static334.anIntArray360[local70] == arg0.length && Static260.aByteArrayArrayArray5[local70].length > Static214.anIntArray193[local70]) {
					Static260.aByteArrayArrayArray5[local70][Static214.anIntArray193[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI)I")
	public static int method4021(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!sea;II)Lclient!vk;")
	public static Class1_Sub48 method4022(@OriginalArg(0) Class308 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method6547(arg1);
		return local8 == null ? null : new Class1_Sub48(local8);
	}
}
