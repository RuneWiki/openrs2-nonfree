import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	public static int anInt384;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "J")
	public static long aLong15;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
	public static int[] anIntArray36 = new int[8];

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public static int anInt388 = -1;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public static int anInt389 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method188(@OriginalArg(0) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(16) String local16 = arg1[arg2];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(28) int local28 = arg0 + arg2;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = arg2; local32 < local28; local32++) {
				@Pc(38) String local38 = arg1[local32];
				if (local38 == null) {
					local30 += 4;
				} else {
					local30 += local38.length();
				}
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local30);
			for (@Pc(59) int local59 = arg2; local59 < local28; local59++) {
				@Pc(65) String local65 = arg1[local59];
				if (local65 == null) {
					local57.append("null");
				} else {
					local57.append(local65);
				}
			}
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method189() {
		if (!Static25.method507() && Static137.anInt3321 != Static171.anInt3993) {
			Static46.method964(Static165.anInt3877, Static83.aClass9_Sub1_Sub1_1.anIntArray41[0], Static83.aClass9_Sub1_Sub1_1.anIntArray43[0], Static137.anInt3321, Static261.anInt5479, false, false);
		} else if (Static137.anInt3321 != Static160.anInt3795 && Static19.method363(Static137.anInt3321)) {
			Static160.anInt3795 = Static137.anInt3321;
			Static165.method2871();
		}
	}
}
