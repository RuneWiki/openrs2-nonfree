import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class Class104 {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	protected final int anInt6742;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public final int anInt6745;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
	public final int anInt6746;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(III)V")
	protected Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6742 = arg2;
		this.anInt6745 = arg0;
		this.anInt6746 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI)V")
	public abstract void method5332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)V")
	public abstract void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)V")
	public abstract void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
