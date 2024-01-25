import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray5 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!ct;)I")
	public static int method7361(@OriginalArg(1) Class61 arg0) {
		if (arg0 == Static411.aClass61_5) {
			return 5890;
		} else if (arg0 == Static308.aClass61_4) {
			return 34167;
		} else if (Static410.aClass61_6 == arg0) {
			return 34168;
		} else if (arg0 == Static18.aClass61_1) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V")
	public static void method7370() {
		Static384.anInt7556 = 0;
		Static593.aClass22_65.method886();
		Static117.aBoolean207 = false;
	}
}
