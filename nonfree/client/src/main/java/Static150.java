import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!sa;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!lo;")
	public static Class139 aClass139_3;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!of;")
	public static final Class174 aClass174_86 = new Class174("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_73 = new Class163(58, -1);

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Lclient!la;")
	public static final Class136 aClass136_73 = new Class136(93, 4);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZII)Z")
	public static boolean method2339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class31 local8 = Static9.aClass149_1.method3573(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method866(arg0);
	}
}
