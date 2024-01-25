import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Lclient!pn;")
	public Class11_Sub4 aClass11_Sub4_61;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Lclient!pn;")
	public Class11_Sub4 aClass11_Sub4_62;

	static {
		new Class117(null, "Dieses System darf nicht missbraucht werden!", null, null);
		new Class117("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Z")
	public final boolean method5577() {
		return this.aClass11_Sub4_61 != null;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V")
	public final void method5580() {
		if (this.aClass11_Sub4_61 != null) {
			this.aClass11_Sub4_61.aClass11_Sub4_62 = this.aClass11_Sub4_62;
			this.aClass11_Sub4_62.aClass11_Sub4_61 = this.aClass11_Sub4_61;
			this.aClass11_Sub4_62 = null;
			this.aClass11_Sub4_61 = null;
		}
	}
}
