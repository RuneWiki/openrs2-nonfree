import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!ui;")
	public Class2_Sub9 aClass2_Sub9_61;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "Lclient!ui;")
	public Class2_Sub9 aClass2_Sub9_62;

	static {
		new Class140("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
	public final void method5600() {
		if (this.aClass2_Sub9_62 != null) {
			this.aClass2_Sub9_62.aClass2_Sub9_61 = this.aClass2_Sub9_61;
			this.aClass2_Sub9_61.aClass2_Sub9_62 = this.aClass2_Sub9_62;
			this.aClass2_Sub9_62 = null;
			this.aClass2_Sub9_61 = null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)Z")
	public final boolean method5601() {
		return this.aClass2_Sub9_62 != null;
	}
}
