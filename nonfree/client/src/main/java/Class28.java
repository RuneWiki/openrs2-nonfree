import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class Class28 {

	static {
		new Class62("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([BZ)V")
	public abstract void method2332(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2336();
}
