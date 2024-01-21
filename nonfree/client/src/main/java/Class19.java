import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class Class19 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1316();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[B)V")
	public abstract void method1317(@OriginalArg(1) byte[] arg0);
}
