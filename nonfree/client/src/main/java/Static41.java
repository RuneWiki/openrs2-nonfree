import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_12 = new Class66(200);

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString60 = "glow2:";

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "[S")
	public static final short[] aShortArray6 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public static void method896(@OriginalArg(1) int arg0) {
		Static221.anInt4370 = arg0;
		@Pc(7) Class66 local7 = Static237.aClass66_81;
		synchronized (Static237.aClass66_81) {
			Static237.aClass66_81.method1933();
		}
	}
}
