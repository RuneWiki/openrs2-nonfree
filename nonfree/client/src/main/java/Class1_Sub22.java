import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public int anInt6138;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public int anInt6140;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "[I")
	public int[] anIntArray455;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	public abstract void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public abstract void method5313(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method5315(@OriginalArg(0) Canvas arg0);
}
