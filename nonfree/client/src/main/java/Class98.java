import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class Class98 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2918();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z[B)V")
	public abstract void method2919(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIB)[B")
	public abstract byte[] method2921(@OriginalArg(0) int arg0);
}
