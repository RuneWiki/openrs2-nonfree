import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class153 {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	protected Class153() {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
	public abstract int method3904(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[B")
	public abstract byte[] method3905(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
	public abstract void method3907(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Lclient!bd;")
	public abstract Class13 method3910();
}
