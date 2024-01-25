import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "Z")
	public boolean aBoolean515 = false;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	protected int anInt7456;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
	protected int anInt7454;

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
	protected final int anInt7453;

	static {
		new Class175("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7456 = arg0;
		this.anInt7454 = arg2;
		this.aBoolean515 = arg4;
		this.anInt7453 = arg1;
		this.aBoolean514 = arg3;
	}
}
