import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class Class54 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
	public abstract void method1451(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method1454();
}
