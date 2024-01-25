import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class142 implements Interface4 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public final int anInt3879;

	static {
		new Class40("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class142(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3879 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
