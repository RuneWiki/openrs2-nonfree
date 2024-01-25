import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class103 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	private final int anInt2625;

	static {
		new Class119("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(II)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2625 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)I")
	public int method2274() {
		return this.anInt2625;
	}
}
