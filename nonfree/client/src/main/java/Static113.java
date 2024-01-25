import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_11 = new Class226(1, 16);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!wq;)Lclient!uea;")
	public static Class125_Sub4 method3799(@OriginalArg(1) Class5_Sub36 arg0) {
		return new Class125_Sub4(arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7331(), arg0.method7291());
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lclient!fi;")
	public static Class114 method3802(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static339.aClass114Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)Lclient!dja;")
	public static Class83 method3805() {
		return Static131.method1935();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
	public static boolean method3806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method3808() {
		@Pc(10) Class389 local10 = Static120.method1769(false);
		@Pc(16) Class5_Sub41 local16 = Static647.method8905(Static456.aClass381_196, local10.aClass393_2);
		local16.aClass5_Sub36_Sub2_1.method7324(0);
		local10.method9079(local16);
	}
}
