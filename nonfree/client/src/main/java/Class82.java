import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class Class82 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public final int anInt6513;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
	protected final int anInt6514;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public final int anInt6516;

	static {
		new Class114("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(III)V")
	protected Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6513 = arg0;
		this.anInt6514 = arg2;
		this.anInt6516 = arg1;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)V")
	public abstract void method5659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)V")
	public abstract void method5660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBI)V")
	public abstract void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
