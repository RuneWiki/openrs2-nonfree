import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class Class35 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)[B")
	public abstract byte[] method973();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B)V")
	public abstract void method976(@OriginalArg(1) byte[] arg0);
}
