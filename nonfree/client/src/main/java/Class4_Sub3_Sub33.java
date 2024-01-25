import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class4_Sub3_Sub33 extends Class4_Sub3 {

	static {
		new Class21("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		return Static231.anIntArray368;
	}
}
