import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class102 {

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	private final int anInt2659;

	static {
		new Class134("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2659 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I")
	public int method2188() {
		return this.anInt2659;
	}
}
