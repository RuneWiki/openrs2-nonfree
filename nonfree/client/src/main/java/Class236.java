import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class236 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!ft;")
	private Class88 aClass88_43;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!ol;")
	private Class6 aClass6_218;

	static {
		new Class231("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class236() {
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!ft;)V")
	public Class236(@OriginalArg(0) Class88 arg0) {
		this.aClass88_43 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)Lclient!ol;")
	public Class6 method5315() {
		@Pc(6) Class6 local6 = this.aClass6_218;
		if (this.aClass88_43.aClass6_73 == local6) {
			this.aClass6_218 = null;
			return null;
		} else {
			this.aClass6_218 = local6.aClass6_252;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ft;I)V")
	public void method5316(@OriginalArg(0) Class88 arg0) {
		this.aClass88_43 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lclient!ol;")
	public Class6 method5317() {
		@Pc(13) Class6 local13 = this.aClass88_43.aClass6_73.aClass6_252;
		if (this.aClass88_43.aClass6_73 == local13) {
			this.aClass6_218 = null;
			return null;
		} else {
			this.aClass6_218 = local13.aClass6_252;
			return local13;
		}
	}
}
