import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class247 {

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!da;")
	private Class2 aClass2_230;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!wl;")
	private Class265 aClass265_49;

	static {
		new Class256("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class247() {
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!wl;)V")
	public Class247(@OriginalArg(0) Class265 arg0) {
		this.aClass265_49 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Lclient!da;")
	public Class2 method5528() {
		@Pc(14) Class2 local14 = this.aClass2_230;
		if (this.aClass265_49.aClass2_257 == local14) {
			this.aClass2_230 = null;
			return null;
		} else {
			this.aClass2_230 = local14.aClass2_261;
			return local14;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!wl;)V")
	public void method5531(@OriginalArg(1) Class265 arg0) {
		this.aClass265_49 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Lclient!da;")
	public Class2 method5532() {
		@Pc(8) Class2 local8 = this.aClass265_49.aClass2_257.aClass2_261;
		if (local8 == this.aClass265_49.aClass2_257) {
			this.aClass2_230 = null;
			return null;
		} else {
			this.aClass2_230 = local8.aClass2_261;
			return local8;
		}
	}
}
