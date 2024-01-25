import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public static int anInt3706;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!l", name = "T", descriptor = "I")
	public static int anInt3730;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString122 = "Face here";

	@OriginalMember(owner = "client!l", name = "I", descriptor = "S")
	public static short aShort53 = 205;

	@OriginalMember(owner = "client!l", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[200];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public static void method3162(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 10);
		local8.method2034();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method3165(@OriginalArg(0) Class4_Sub7 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static21.anInt401; local3++) {
			@Pc(9) int local9 = arg0.method2413();
			@Pc(13) int local13 = arg0.method2404();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static340.aClass83_Sub1Array2[local9] != null) {
				Static340.aClass83_Sub1Array2[local9].anInt3243 = local13;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public static void method3168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static155.aClass154_56 = new Class154(arg0);
		Static60.aClass154_18 = new Class154(arg1);
	}
}
