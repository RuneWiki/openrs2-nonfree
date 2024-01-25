import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class Class5_Sub17 extends Class5 {

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	public int anInt5324;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	public int anInt5326;

	static {
		new Class198("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	public abstract void method4119(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public abstract void method4121(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILjava/awt/Graphics;ZII)V")
	public abstract void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
