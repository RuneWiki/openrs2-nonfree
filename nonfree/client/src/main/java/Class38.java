import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public abstract class Class38 {

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
	public final int anInt6088;

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
	public final int anInt6087;

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
	protected final int anInt6090;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(III)V")
	protected Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6088 = arg1;
		this.anInt6087 = arg0;
		this.anInt6090 = arg2;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
	public abstract void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBI)V")
	public abstract void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(III)V")
	public abstract void method5175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
