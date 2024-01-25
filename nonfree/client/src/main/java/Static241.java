import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
	public static int anInt4869;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "[Lclient!ae;")
	public static Class6_Sub1[] aClass6_Sub1Array2 = new Class6_Sub1[0];

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lclient!ir;")
	public static Class97 aClass97_1 = new Class97(8);

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_110 = new Class85("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)I")
	public static int method4295(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local13 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local13 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local13 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local13 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local13++;
		}
		return arg0 + local13;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)Lclient!al;")
	public static Class4_Sub1 method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_2;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)V")
	public static void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass4_Sub3_2 != null) {
			local7.aClass4_Sub3_2 = null;
		}
		if (local7.aClass4_Sub3_1 != null) {
			local7.aClass4_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4300(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static346.anInt6667; local16++) {
			if (arg0.equalsIgnoreCase(Static253.aStringArray51[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static178.aStringArray42[local16])) {
				return true;
			}
		}
		return false;
	}
}
