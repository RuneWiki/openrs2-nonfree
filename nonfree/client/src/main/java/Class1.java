import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[B)V")
	public abstract void method1456(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1457();
}
