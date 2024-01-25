import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class Class57 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!mn;")
	public Class57 aClass57_23;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Lclient!mn;")
	public Class57 aClass57_24;

	static {
		new Class267("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public final void method5359() {
		if (this.aClass57_24 != null) {
			this.aClass57_24.aClass57_23 = this.aClass57_23;
			this.aClass57_23.aClass57_24 = this.aClass57_24;
			this.aClass57_23 = null;
			this.aClass57_24 = null;
		}
	}
}
