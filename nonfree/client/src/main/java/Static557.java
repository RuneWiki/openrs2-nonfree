import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static int anInt9312;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_17 = new Class188(0, 2, 2, 1);

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public static int anInt9311 = -2;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!dk;")
	public static final Class68 aClass68_7 = new Class68();

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Z")
	public static boolean method7618(@OriginalArg(0) int arg0) {
		if (arg0 == 2 || arg0 == 59 || arg0 == 3 || arg0 == 23 || arg0 == 6) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7620(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg1, 3);
		local8.method776();
		local8.aString10 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZB)Z")
	public static boolean method7621(@OriginalArg(1) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			return false;
		} else {
			return local14 < 128 || local14 >= 160 || Static486.aCharArray9[local14 - 128] != '\u0000';
		}
	}
}
