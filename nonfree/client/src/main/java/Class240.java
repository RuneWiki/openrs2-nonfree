import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class Class240 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	protected Class240() {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
	public abstract int method5487(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)[B")
	public abstract byte[] method5488(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Lclient!pq;")
	public abstract Class267 method5489();

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(II)V")
	public abstract void method5490(@OriginalArg(1) int arg0);
}
