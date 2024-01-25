import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "J")
	public long aLong64;

	static {
		new Class242("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	private Class4_Sub14() {
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(J)V")
	public Class4_Sub14(@OriginalArg(0) long arg0) {
		this.aLong64 = arg0;
	}
}
