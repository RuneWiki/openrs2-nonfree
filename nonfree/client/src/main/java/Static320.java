import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	public static int anInt1179;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString12 = null;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	public static int anInt1178 = 0;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_37 = new Class163(55, 3);

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!pl;")
	public static final Class40 aClass40_2 = Static271.method3763();

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
	public static final int[] anIntArray60 = new int[13];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)Z")
	public static boolean method1164(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static425.anInt2154; local1 < Static174.anInt3263; local1++) {
			@Pc(6) Class227[][] local6 = Static389.aClass227ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static24.anInt2908; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static366.anInt6203 + local9;
				@Pc(18) int local18 = Static366.anInt6203 - local9;
				if (local14 >= Static266.anInt4437 || local18 < Static33.anInt605) {
					for (@Pc(27) int local27 = -Static24.anInt2908; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static465.anInt3909 + local27;
						@Pc(36) int local36 = Static465.anInt3909 - local27;
						@Pc(48) Class227 local48;
						if (local14 >= Static266.anInt4437) {
							if (local32 >= Static423.anInt7132) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean433) {
									Static232.aBoolean291 = arg0;
									Static316.aClass12_1.method3101(local48);
									Static316.aClass12_1.method3111();
								}
							}
							if (local36 < Static439.anInt7312) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean433) {
									Static232.aBoolean291 = arg0;
									Static316.aClass12_1.method3101(local48);
									Static316.aClass12_1.method3111();
								}
							}
						}
						if (local18 < Static33.anInt605) {
							if (local32 >= Static423.anInt7132) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean433) {
									Static232.aBoolean291 = arg0;
									Static316.aClass12_1.method3101(local48);
									Static316.aClass12_1.method3111();
								}
							}
							if (local36 < Static439.anInt7312) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean433) {
									Static232.aBoolean291 = arg0;
									Static316.aClass12_1.method3101(local48);
									Static316.aClass12_1.method3111();
								}
							}
						}
						if (Static146.anInt2678 == 0) {
							if (Static30.aBoolean29) {
								Static316.aClass12_1.method3103(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
