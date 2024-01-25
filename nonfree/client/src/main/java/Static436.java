import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public static int anInt7615 = 0;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[2];

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public static void method6382() {
		if (Static12.aByteArray2 != null) {
			Static97.method1288(Static707.anInt11053);
		} else if (Static478.anInt8342 == -1) {
			Static177.method5466(Static321.aString95, Static715.aString107, Static707.anInt11053);
		} else {
			Static698.method9142(Static707.anInt11053);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIB)I")
	public static int method6383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 >>> 31;
		return (local14 + arg0) / arg1 - local14;
	}
}
