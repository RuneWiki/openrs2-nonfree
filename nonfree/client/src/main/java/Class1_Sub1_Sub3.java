import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "Lclient!mb;")
	public final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	public final int anInt2771;

	static {
		new Class158("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!mb;I)V")
	protected Class1_Sub1_Sub3(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		this.anInterface8_3 = arg0;
		this.anInt2771 = arg1;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)Z")
	public abstract boolean method2044();

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2045();
}
