import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
	public volatile int anInt3209 = -1;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString33;

	static {
		new Class169("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub21(@OriginalArg(0) String arg0) {
		this.aString33 = arg0;
	}
}
