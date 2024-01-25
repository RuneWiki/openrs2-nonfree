import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class Class30_Sub4 extends Class30 {

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
	protected final int anInt9553;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public int anInt9545;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
	public final int anInt9549;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
	public int anInt9546;

	@OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
	public int anInt9551;

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
	public final int anInt9547;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	public int anInt9550;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class30_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9553 = arg1;
		this.anInt9545 = arg4;
		this.anInt9549 = arg3;
		this.anInt9546 = arg0;
		this.anInt9551 = arg5;
		this.anInt9547 = arg6;
		this.anInt9550 = arg2;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public final void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)I")
	public abstract int method7910();

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
	@Override
	public final void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7901() {
		return false;
	}
}
