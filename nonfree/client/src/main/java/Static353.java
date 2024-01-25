import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
	public static int anInt5646 = 0;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lclient!sj;")
	public static Class7_Sub4_Sub14 method4544() {
		@Pc(12) Class7_Sub4_Sub14 local12 = (Class7_Sub4_Sub14) Static372.aClass24_10.method303();
		if (local12 != null) {
			local12.method5802();
			local12.method5661();
			return local12;
		}
		do {
			local12 = (Class7_Sub4_Sub14) Static315.aClass24_9.method303();
			if (local12 == null) {
				return null;
			}
			if (local12.method4709() > Static158.method2342()) {
				return null;
			}
			local12.method5802();
			local12.method5661();
		} while ((Long.MIN_VALUE & local12.aLong225) == 0L);
		return local12;
	}
}
