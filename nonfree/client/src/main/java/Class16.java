import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class Class16 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)V")
	public abstract void method1726(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1729();
}
