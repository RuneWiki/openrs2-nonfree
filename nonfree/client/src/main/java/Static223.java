import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!fi;")
	public static Class65 aClass65_7;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "[I")
	public static final int[] anIntArray372 = new int[128];

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
	public static void method3897(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub43 local12 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray560.length; local17++) {
				local12.anIntArray560[local17] = -1;
				local12.anIntArray559[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!ir;)V")
	public static void method3898(@OriginalArg(1) Class100 arg0) {
		Static230.aClass100_125 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lclient!ss;")
	public static Class187 method3900() {
		try {
			return (Class187) Class.forName("Class187_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
