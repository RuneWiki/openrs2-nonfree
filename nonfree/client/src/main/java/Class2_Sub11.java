import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
	public int anInt7512;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	public int anInt7514;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "[I")
	public int[] anIntArray501;

	static {
		new Class256("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method5822(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method5825(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method5826(@OriginalArg(3) Graphics arg0);
}
