import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class Class65 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZII)[B")
	public abstract byte[] method1542(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[B)V")
	public abstract void method1543(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1546();
}
