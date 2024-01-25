import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class Class7 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	protected final int anInt6831;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public final int anInt6834;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public final int anInt6830;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(III)V")
	protected Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6831 = arg2;
		this.anInt6834 = arg0;
		this.anInt6830 = arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
	public abstract void method6051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public abstract void method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	public abstract void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
