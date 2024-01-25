import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class Class46 {

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!laa;")
	public Class46 aClass46_25;

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "Lclient!laa;")
	public Class46 aClass46_26;

	static {
		new Class45(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
		new Class45("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V")
	public final void method8227() {
		if (this.aClass46_26 != null) {
			this.aClass46_26.aClass46_25 = this.aClass46_25;
			this.aClass46_25.aClass46_26 = this.aClass46_26;
			this.aClass46_25 = null;
			this.aClass46_26 = null;
		}
	}
}
