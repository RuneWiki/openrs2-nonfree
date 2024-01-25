import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!at", name = "n", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_92 = new Class73(103, 2);

	@OriginalMember(owner = "client!at", name = "y", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[16];

	@OriginalMember(owner = "client!at", name = "z", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_67 = new Class47(31, 3);

	@OriginalMember(owner = "client!at", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString33 = null;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V")
	public static void method4013() {
		for (@Pc(7) int local7 = 0; local7 < Static464.anInt7995; local7++) {
			@Pc(13) int local13 = Static291.anIntArray405[local7];
			@Pc(20) Class6_Sub34 local20 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local13);
			if (local20 != null) {
				@Pc(25) Class4_Sub1_Sub1_Sub1 local25 = local20.aClass4_Sub1_Sub1_Sub1_2;
				Static259.method4374(local25.aClass273_1.anInt7439, local25);
			}
		}
	}
}
