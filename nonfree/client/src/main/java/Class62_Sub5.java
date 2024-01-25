import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class62_Sub5 extends Class62 {

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public int anInt5056;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	public final int anInt5055;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public int anInt5051;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	public final int anInt5046;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	protected final int anInt5048;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
	public int anInt5057;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	public int anInt5047;

	static {
		new Class93("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class62_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5056 = arg0;
		this.anInt5055 = arg3;
		this.anInt5051 = arg2;
		this.anInt5046 = arg6;
		this.anInt5048 = arg1;
		this.anInt5057 = arg5;
		this.anInt5047 = arg4;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public final void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)I")
	public abstract int method4631();

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V")
	@Override
	public final void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method5564() {
		return false;
	}
}
