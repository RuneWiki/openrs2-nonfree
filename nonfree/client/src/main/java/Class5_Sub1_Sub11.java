import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class5_Sub1_Sub11 extends Class5_Sub1 {

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Lclient!m;")
	public final Interface7 anInterface7_3;

	static {
		new Class85("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!m;)V")
	protected Class5_Sub1_Sub11(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_3 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5569();

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)Z")
	public abstract boolean method5571();
}
