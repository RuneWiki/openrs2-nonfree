import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class46 {

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	protected Class46() {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method969(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
	public abstract int method970(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lclient!se;")
	public abstract Class152 method971();

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public abstract void method972(@OriginalArg(1) int arg0);
}
