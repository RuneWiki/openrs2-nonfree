import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class5_Sub2_Sub11_Sub2 extends Class5_Sub2_Sub11 {

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject16;

	static {
		new Class40("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub11_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject16 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5022() {
		return this.anObject16;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5024() {
		return false;
	}
}
