import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Lclient!rt;")
	public static Class226 aClass226_2;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Lclient!ab;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_70 = new Class142("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!am;")
	public static final Class14 aClass14_29 = new Class14();

	@OriginalMember(owner = "client!np", name = "k", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_171 = new Class67(59, 6);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3786(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static73.aClass142_16.method3118(Static63.anInt981) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static451.aClass142_117.method3118(Static63.anInt981) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
	public static void method3788(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub3_Sub1 local16 = Static427.method5426(arg0, 4);
		local16.method385();
	}
}
