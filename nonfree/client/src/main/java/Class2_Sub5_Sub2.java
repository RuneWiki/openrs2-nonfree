import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!jo;")
	public final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	public final int anInt3676;

	static {
		new Class134("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!jo;I)V")
	protected Class2_Sub5_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1) {
		this.anInterface7_3 = arg0;
		this.anInt3676 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2955();

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Z")
	public abstract boolean method2956();
}
