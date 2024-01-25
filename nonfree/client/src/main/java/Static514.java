import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	public static int anInt9447 = 0;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
	public static final int anInt9449 = 1400;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!lc;")
	public static Class193 method7667(@OriginalArg(1) Component arg0) {
		return new Class193_Sub1(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([[IB)V")
	public static void method7668(@OriginalArg(0) int[][] arg0) {
		Static333.anIntArrayArray56 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public static void method7669() {
		Static455.anInt8611 = 0;
		for (@Pc(7) int local7 = 0; local7 < 2048; local7++) {
			Static1.aClass3_Sub7Array1[local7] = null;
			Static113.aByteArray38[local7] = 1;
			Static102.aClass90Array1[local7] = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "()V")
	public static void method7670() {
		Static421.method6750(Static264.anInt8587);
	}
}
