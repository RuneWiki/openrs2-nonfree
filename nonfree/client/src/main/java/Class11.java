import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class Class11 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[B")
	public abstract byte[] method125();

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z[B)V")
	public abstract void method128(@OriginalArg(1) byte[] arg0);
}
