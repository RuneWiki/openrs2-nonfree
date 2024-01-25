import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public abstract class Class130 {

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
	public final int anInt11290;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
	protected final int anInt11294;

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
	public final int anInt11292;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(III)V")
	protected Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt11290 = arg0;
		this.anInt11294 = arg2;
		this.anInt11292 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
	public abstract void method9435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIB)V")
	public abstract void method9436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(III)V")
	public abstract void method9438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
