import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class68 {

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public int anInt6058;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public int anInt6056;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	protected int anInt6057;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V")
	protected Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6058 = arg1;
		this.anInt6056 = arg0;
		this.anInt6057 = arg2;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V")
	public abstract void method4686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V")
	public abstract void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public abstract void method4690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
