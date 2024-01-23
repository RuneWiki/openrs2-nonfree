import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jh", name = "sc", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!jh", name = "Bc", descriptor = "Ljava/lang/String;")
	public static String aString178;

	@OriginalMember(owner = "client!jh", name = "Qc", descriptor = "Lclient!th;")
	public static Class168 aClass168_99;

	@OriginalMember(owner = "client!jh", name = "Tc", descriptor = "I")
	public static int anInt2879;

	@OriginalMember(owner = "client!jh", name = "ad", descriptor = "Lclient!pd;")
	public static Class1_Sub3_Sub5_Sub1 aClass1_Sub3_Sub5_Sub1_2;

	@OriginalMember(owner = "client!jh", name = "wc", descriptor = "I")
	public static int anInt2862 = 1;

	@OriginalMember(owner = "client!jh", name = "Kc", descriptor = "Ljava/lang/String;")
	public static String aString179 = "flash3:";

	@OriginalMember(owner = "client!jh", name = "Sc", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Connected to update server";

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(CILjava/lang/StringBuffer;B)Ljava/lang/StringBuffer;")
	public static StringBuffer method2105(@OriginalArg(2) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(13) int local13 = local8; local13 < 0; local13++) {
			arg0.setCharAt(local13, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)I")
	public static int method2109() {
		return 2;
	}
}
