import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_12 = new Class306();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1734(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(21) Class5_Sub40 local21 = Static25.method507(Static98.aClass208_2, Static648.aClass181_100);
			local21.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(arg0));
			local21.aClass5_Sub12_Sub2_2.method8619(arg0);
			Static612.method8496(local21);
		}
	}
}
