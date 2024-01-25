import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!mg;")
	public static final Class222 aClass222_4 = new Class222();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method7302() {
		@Pc(14) Class2_Sub31 local14 = Static275.method4480(Static640.aClass314_2, Static245.aClass145_72);
		local14.aClass2_Sub17_Sub1_2.method2837(Static402.method6006());
		local14.aClass2_Sub17_Sub1_2.method2879(Class16_Sub1_Sub5_Sub1.lb);
		local14.aClass2_Sub17_Sub1_2.method2879(Static71.anInt1925);
		local14.aClass2_Sub17_Sub1_2.method2837(Static305.aClass2_Sub49_15.aClass33_Sub7_2.method2924());
		Static526.method7309(local14);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method7304(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg1.indexOf(arg2); local11 != -1; local11 = arg1.indexOf(arg2, arg0.length() + local11)) {
			arg1 = arg1.substring(0, local11) + arg0 + arg1.substring(arg2.length() + local11);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lclient!wf;")
	public static Class362_Sub1 method7305() {
		return Static339.anInt5965 < Static537.aClass362_Sub1Array1.length ? Static537.aClass362_Sub1Array1[Static339.anInt5965++] : null;
	}
}
