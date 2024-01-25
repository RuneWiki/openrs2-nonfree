import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/lang/String;")
	public String aString47;

	static {
		new Class96("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	private Class1_Sub18() {
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub18(@OriginalArg(0) String arg0) {
		this.aString47 = arg0;
	}
}
