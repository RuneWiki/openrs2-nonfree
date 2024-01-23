import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!lc;")
	public static Class98 aClass98_10;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!hi;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
	public static int anInt425;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString5 = "Prepared sound engine";

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)Z")
	public static boolean method366(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < Static231.aBooleanArray22.length ? Static231.aBooleanArray22[arg0] : false;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lclient!bi;")
	public static Class4_Sub2_Sub1 method367() {
		@Pc(13) int local13 = Static46.anIntArray120[0] * Static159.anIntArray285[0];
		@Pc(17) byte[] local17 = Static274.aByteArrayArray20[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(27) int local27 = 0; local27 < local13; local27++) {
			local20[local27] = Static6.anIntArray14[local17[local27] & 0xFF];
		}
		@Pc(64) Class4_Sub2_Sub1 local64;
		if (Static178.aBoolean216) {
			local64 = new Class4_Sub2_Sub1_Sub2(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], local20);
		} else {
			local64 = new Class4_Sub2_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], local20);
		}
		Static268.method4006();
		return local64;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	public static void method368() {
		anIntArray43 = null;
		aClass98_10 = null;
		aString5 = null;
		anIntArray42 = null;
		aClass59_1 = null;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)I")
	public static int method369() {
		return Static53.anInt1062;
	}
}
