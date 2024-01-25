import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gka", name = "g", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "[I")
	public static int[] anIntArray195 = new int[4];

	@OriginalMember(owner = "client!gka", name = "c", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!gka", name = "e", descriptor = "I")
	public static int anInt3872 = 0;

	@OriginalMember(owner = "client!gka", name = "f", descriptor = "Lclient!mw;")
	public static final Class239 aClass239_4 = new Class239();

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ZZ)I")
	public static int method3291(@OriginalArg(0) boolean arg0) {
		if (Static16.anIntArray14 == null) {
			return 0;
		} else if (arg0 || Static255.aClass88Array1 == null) {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < Static16.anIntArray14.length; local29++) {
				@Pc(35) int local35 = Static16.anIntArray14[local29];
				if (Static504.aClass390_97.method8905(local35)) {
					local27++;
				}
				if (Static519.aClass390_100.method8905(local35)) {
					local27++;
				}
			}
			return local27;
		} else {
			return Static16.anIntArray14.length * 2;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IZ)I")
	public static int method3293(@OriginalArg(0) int arg0) {
		@Pc(17) byte local17;
		if (arg0 > 12000) {
			local17 = 4;
			Static115.method2132();
		} else if (arg0 > 5000) {
			Static428.method6320();
			local17 = 3;
		} else if (arg0 > 2000) {
			Static274.method4251();
			local17 = 2;
		} else {
			Static418.method6228();
			local17 = 1;
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != 2) {
			Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
			Static428.method6321(2, false);
		}
		Static102.method1995();
		return local17;
	}
}
