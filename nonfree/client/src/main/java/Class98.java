import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class98 {

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	protected Class98() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	public abstract int method4610(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	public abstract void method4611(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!it;")
	public abstract Class151 method4613();

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZI)[B")
	public abstract byte[] method4617(@OriginalArg(1) int arg0);
}
