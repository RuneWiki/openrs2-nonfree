import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public int anInt132;

	static {
		new Class209("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public abstract void method151(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method152(@OriginalArg(1) Canvas arg0);
}
