import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class Class30 {

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	protected Class30() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method573(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
	public abstract void method574(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I")
	public abstract int method577(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)Lclient!of;")
	public abstract Class238 method579();
}
