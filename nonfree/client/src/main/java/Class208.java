import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class Class208 {

	static {
		new Class88("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)[B")
	public abstract byte[] method5035(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "([BI)V")
	public abstract void method5036(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5037();
}
