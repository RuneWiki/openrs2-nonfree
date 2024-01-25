import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class140 {

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray33;

	static {
		new Class140("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class140(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray33 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!nn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method4155(@OriginalArg(1) int arg0) {
		return this.aStringArray33[arg0];
	}
}
