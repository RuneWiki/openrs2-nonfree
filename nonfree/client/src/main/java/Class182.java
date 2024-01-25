import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class182 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public final int anInt4769;

	static {
		new Class96("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class182(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4769 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)I")
	public int method3908() {
		return this.anInt4769;
	}

	@OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
