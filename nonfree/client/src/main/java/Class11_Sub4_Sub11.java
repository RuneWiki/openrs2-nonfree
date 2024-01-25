import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class Class11_Sub4_Sub11 extends Class11_Sub4 {

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "Lclient!t;")
	public final Interface8 anInterface8_3;

	static {
		new Class117("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!t;)V")
	protected Class11_Sub4_Sub11(@OriginalArg(0) Interface8 arg0) {
		this.anInterface8_3 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5351();

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method5352();
}
