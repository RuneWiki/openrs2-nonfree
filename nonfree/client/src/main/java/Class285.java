import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class285 {

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public final int anInt8641;

	static {
		new Class88("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class285(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8641 = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
