import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
	public int anInt7959;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
	public int anInt7960;

	static {
		new Class40("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public abstract void method6470(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method6471(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);
}
