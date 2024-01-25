import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	public int anInt6118;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public int anInt6119;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
	public int[] anIntArray512;

	static {
		new Class231("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method4868(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method4869(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);
}
