import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class221 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public final int anInt6664;

	static {
		new Class67("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class221(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6664 = arg1;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I")
	public int method5574() {
		return this.anInt6664;
	}

	@OriginalMember(owner = "client!oo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
