import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	public int anInt4861;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public int anInt4858;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	protected final int anInt4859;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
	public final int anInt4869;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public int anInt4866;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	public int anInt4871;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
	public final int anInt4870;

	static {
		new Class182("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4861 = arg0;
		this.anInt4858 = arg2;
		this.anInt4859 = arg1;
		this.anInt4869 = arg6;
		this.anInt4866 = arg5;
		this.anInt4871 = arg4;
		this.anInt4870 = arg3;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)I")
	public abstract int method3930();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public final void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	@Override
	public final void method5690() {
		throw new IllegalStateException();
	}
}
