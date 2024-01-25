import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
	public static final int[] anIntArray633 = new int[64];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBLclient!tl;)V")
	public static void method5531(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (Static442.aClass162_5 == null) {
			return;
		}
		try {
			Static442.aClass162_5.method3598(0L);
			Static442.aClass162_5.method3599(arg0, arg1.aByteArray79, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Lclient!bq;")
	public static Class26 method5539() {
		try {
			return (Class26) Class.forName("Class26_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
