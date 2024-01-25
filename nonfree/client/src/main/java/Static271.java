import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
	public static int anInt4721;

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "Lclient!o;")
	public static final Class169 aClass169_254 = new Class169("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "Lclient!at;")
	public static Class17 aClass17_53 = new Class17();

	@OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
	public static int anInt4720 = 0;

	@OriginalMember(owner = "client!pl", name = "N", descriptor = "Lclient!tb;")
	public static final Class219 aClass219_4 = new Class219(64);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!tq;ILclient!an;)I")
	public static int method4164(@OriginalArg(0) Class164 arg0, @OriginalArg(2) Class13 arg1) {
		if (arg1.anInt197 != -1) {
			return arg1.anInt197;
		}
		if (arg1.anInt192 != -1) {
			@Pc(33) Class98 local33 = arg0.anInterface2_7.method4741(arg0.method5369() ? arg1.anInt192 : arg1.anInt191);
			if (!local33.aBoolean194) {
				return local33.aShort49;
			}
		}
		return arg1.anInt202;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!je;)Lclient!je;")
	public static Class117 method4166(@OriginalArg(1) Class117 arg0) {
		@Pc(11) Class117 local11 = Static50.method805(arg0);
		if (local11 == null) {
			local11 = arg0.aClass117_3;
		}
		return local11;
	}
}
