import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	public final int anInt5579;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
	public int anInt5588;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	public int anInt5586;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
	public final int anInt5577;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	public int anInt5587;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	protected final int anInt5583;

	static {
		new Class34("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class17_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5581 = arg5;
		this.anInt5579 = arg6;
		this.anInt5588 = arg2;
		this.anInt5586 = arg0;
		this.anInt5577 = arg3;
		this.anInt5587 = arg4;
		this.anInt5583 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)V")
	@Override
	public final void method4789() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public final void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)I")
	public abstract int method4792();
}
