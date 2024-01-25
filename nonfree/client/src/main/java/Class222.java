import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class Class222 {

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	protected Class222() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Lclient!ia;")
	public abstract Class162 method7703();

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method7704(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I")
	public abstract int method7707(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
	public abstract void method7708(@OriginalArg(0) int arg0);
}
