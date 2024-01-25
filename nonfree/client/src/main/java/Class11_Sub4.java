import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public final int anInt6827;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	protected final int anInt6828;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	public int anInt6835;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	public int anInt6832;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	public int anInt6829;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public int anInt6833;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	public final int anInt6834;

	static {
		new Class106("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6827 = arg3;
		this.anInt6828 = arg1;
		this.anInt6835 = arg0;
		this.anInt6832 = arg2;
		this.anInt6829 = arg4;
		this.anInt6833 = arg5;
		this.anInt6834 = arg6;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)I")
	public abstract int method5916();

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
	@Override
	public final void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public final void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method5913() {
		return false;
	}
}
