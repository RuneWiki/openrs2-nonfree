import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class Class44 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)[B")
	public abstract byte[] method6728(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method6730();

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[B)V")
	public abstract void method6732(@OriginalArg(1) byte[] arg0);
}
