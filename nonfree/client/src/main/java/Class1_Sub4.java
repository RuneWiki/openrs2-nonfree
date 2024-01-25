import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "Lclient!sq;")
	public Class1_Sub4 aClass1_Sub4_61;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "Lclient!sq;")
	public Class1_Sub4 aClass1_Sub4_62;

	static {
		new Class106("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
		new Class106("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)Z")
	public final boolean method5709() {
		return this.aClass1_Sub4_62 != null;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
	public final void method5714() {
		if (this.aClass1_Sub4_62 != null) {
			this.aClass1_Sub4_62.aClass1_Sub4_61 = this.aClass1_Sub4_61;
			this.aClass1_Sub4_61.aClass1_Sub4_62 = this.aClass1_Sub4_62;
			this.aClass1_Sub4_62 = null;
			this.aClass1_Sub4_61 = null;
		}
	}
}
