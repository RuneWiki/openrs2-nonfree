import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public int anInt1892;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "Z")
	public boolean aBoolean139;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "I")
	public int anInt1894;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "I")
	public int anInt1897;

	static {
		new Class85("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
	@Override
	public final void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public final void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
