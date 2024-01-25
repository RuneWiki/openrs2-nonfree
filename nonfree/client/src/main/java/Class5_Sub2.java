import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!af", name = "q", descriptor = "S")
	public short aShort1;

	static {
		new Class85("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	private Class5_Sub2() {
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(S)V")
	public Class5_Sub2(@OriginalArg(0) short arg0) {
		this.aShort1 = arg0;
	}
}
