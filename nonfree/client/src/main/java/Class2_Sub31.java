import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Ljava/lang/String;")
	public String aString50;

	static {
		new Class62("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	private Class2_Sub31() {
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub31(@OriginalArg(0) String arg0) {
		this.aString50 = arg0;
	}
}
