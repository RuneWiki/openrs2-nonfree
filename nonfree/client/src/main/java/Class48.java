import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class48 {

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	private final int anInt1138;

	static {
		new Class169("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(II)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1138 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
	public int method895() {
		return this.anInt1138;
	}

	@OriginalMember(owner = "client!ct", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
