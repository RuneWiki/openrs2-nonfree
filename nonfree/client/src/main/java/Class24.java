import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class Class24 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)[B")
	public abstract byte[] method677();

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([BI)V")
	public abstract void method681(@OriginalArg(0) byte[] arg0);
}
