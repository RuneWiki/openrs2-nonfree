import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class152 {

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	protected Class152() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lclient!vm;")
	public abstract Class208 method3962();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method3963(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[B")
	public abstract byte[] method3964(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)V")
	public abstract void method3965(@OriginalArg(0) int arg0);
}
