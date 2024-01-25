import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class7 {

	static {
		new Class159("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	protected Class7() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public abstract void method2579(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)Lclient!r;")
	public abstract Class171 method2580();

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[B")
	public abstract byte[] method2582(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)I")
	public abstract int method2584(@OriginalArg(1) int arg0);
}
