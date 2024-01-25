import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class Class28 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)V")
	public abstract void method2606(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)[B")
	public abstract byte[] method2607();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method2609(@OriginalArg(2) int arg0);
}
