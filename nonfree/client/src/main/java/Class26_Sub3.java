import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt5765;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public int anInt5760;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public int anInt5755;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public final int anInt5759;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	public int anInt5768;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	protected final int anInt5758;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public final int anInt5763;

	static {
		new Class84("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class26_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5765 = arg5;
		this.anInt5760 = arg2;
		this.anInt5755 = arg4;
		this.anInt5759 = arg3;
		this.anInt5768 = arg0;
		this.anInt5758 = arg1;
		this.anInt5763 = arg6;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
	@Override
	public final void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)I")
	public abstract int method4627();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public final void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}
}
