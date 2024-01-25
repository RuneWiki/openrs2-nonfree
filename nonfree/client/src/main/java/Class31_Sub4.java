import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class Class31_Sub4 extends Class31 {

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
	public final int anInt6191;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
	public final int anInt6197;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
	public int anInt6200;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
	protected final int anInt6192;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
	public int anInt6193;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	public int anInt6198;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
	public int anInt6195;

	static {
		new Class7("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class31_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6191 = arg6;
		this.anInt6197 = arg3;
		this.anInt6200 = arg5;
		this.anInt6192 = arg1;
		this.anInt6193 = arg0;
		this.anInt6198 = arg4;
		this.anInt6195 = arg2;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public final void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)I")
	public abstract int method5164();

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method5971() {
		return false;
	}
}
