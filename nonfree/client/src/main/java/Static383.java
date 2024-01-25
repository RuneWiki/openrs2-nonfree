import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!naa", name = "E", descriptor = "Lclient!da;")
	public static Class72 aClass72_10;

	@OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
	public static int anInt6668;

	@OriginalMember(owner = "client!naa", name = "C", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)V")
	public static void method5625() {
		@Pc(10) Class5_Sub47 local10;
		for (local10 = (Class5_Sub47) Static59.aClass124_60.method2572(); local10 != null; local10 = (Class5_Sub47) Static59.aClass124_60.method2569()) {
			if (local10.aBoolean651) {
				local10.method8829();
			} else {
				local10.aBoolean650 = true;
				if (local10.anInt9036 >= 0 && local10.anInt9031 >= 0 && Static124.anInt2150 > local10.anInt9036 && Static64.anInt1015 > local10.anInt9031) {
					Static402.method5885(local10);
				}
			}
		}
		for (local10 = (Class5_Sub47) Static227.aClass124_36.method2572(); local10 != null; local10 = (Class5_Sub47) Static227.aClass124_36.method2569()) {
			if (local10.aBoolean651) {
				local10.method8829();
			} else {
				local10.aBoolean650 = true;
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V")
	public static void method5626() {
		if (Static255.anInt4085 < 0) {
			Static158.anInt2662 = -1;
			Static255.anInt4085 = 0;
			Static195.anInt3145 = -1;
		}
		if (Static407.anInt6541 < Static255.anInt4085) {
			Static195.anInt3145 = -1;
			Static158.anInt2662 = -1;
			Static255.anInt4085 = Static407.anInt6541;
		}
		if (Static361.anInt6318 < 0) {
			Static361.anInt6318 = 0;
			Static195.anInt3145 = -1;
			Static158.anInt2662 = -1;
		}
		if (Static407.anInt6536 < Static361.anInt6318) {
			Static158.anInt2662 = -1;
			Static195.anInt3145 = -1;
			Static361.anInt6318 = Static407.anInt6536;
		}
	}

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)V")
	public static void method5627() {
		if (!Static479.aBoolean593) {
			Static550.aBoolean649 = true;
			Static147.aFloat198 += (-12.0F - Static147.aFloat198) / 2.0F;
			Static479.aBoolean593 = true;
		}
	}
}
