import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public abstract class Class74 {

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	public final int anInt9644;

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
	protected final int anInt9646;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
	public final int anInt9645;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(III)V")
	protected Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9644 = arg0;
		this.anInt9646 = arg2;
		this.anInt9645 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IBI)V")
	public abstract void method8218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(IBI)V")
	public abstract void method8219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
	public abstract void method8221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
