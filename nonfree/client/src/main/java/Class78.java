import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class Class78 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public final int anInt6427;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	protected final int anInt6429;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public final int anInt6428;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(III)V")
	protected Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6427 = arg1;
		this.anInt6429 = arg2;
		this.anInt6428 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)V")
	public abstract void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	public abstract void method5065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
	public abstract void method5067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
