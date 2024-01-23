import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public static int anInt5303;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!th;")
	public static Class168 aClass168_179;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt5301 = 0;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString378 = " ";

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt5302 = 0;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt5304 = 0;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Z")
	public static boolean aBoolean330 = false;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	public static int anInt5305 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lclient!an;")
	public static Class10 method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class10 local14 = local7.aClass10_1;
			local7.aClass10_1 = null;
			return local14;
		}
	}
}
