import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
	public final int anInt7404;

	static {
		new Class84("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub2_Sub17(@OriginalArg(0) int arg0) {
		this.anInt7404 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method5738();

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)Z")
	public abstract boolean method5741();
}
