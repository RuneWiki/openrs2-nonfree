import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public final int anInt1544;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public final int anInt1546;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public final int anInt1542;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Z")
	public final boolean aBoolean151;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public final int anInt1539;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public final int anInt1545;

	static {
		new Class34("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1544 = arg0;
		this.anInt1546 = arg3;
		this.anInt1542 = arg4;
		this.aBoolean151 = arg5;
		this.anInt1539 = arg2;
		this.anInt1545 = arg1;
	}
}
