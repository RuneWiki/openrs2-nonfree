import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public abstract class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
	public final int anInt6684;

	static {
		new Class45(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub2_Sub3(@OriginalArg(0) int arg0) {
		this.anInt6684 = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5995();

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "(B)Z")
	public abstract boolean method5996();
}
