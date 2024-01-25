import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Ljava/lang/String;")
	public String aString54;

	static {
		new Class231("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	private Class2_Sub33() {
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub33(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString54 = arg0;
	}
}
