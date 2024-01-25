import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
	public volatile int anInt7106 = -1;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString65;

	static {
		new Class175("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub43(@OriginalArg(0) String arg0) {
		this.aString65 = arg0;
	}
}
