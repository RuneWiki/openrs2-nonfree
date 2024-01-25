import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public abstract class Class125 {

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
	public final int anInt9674;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
	public final int anInt9675;

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
	protected final int anInt9673;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(III)V")
	protected Class125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9674 = arg0;
		this.anInt9675 = arg1;
		this.anInt9673 = arg2;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZII)V")
	public abstract void method8244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIB)V")
	public abstract void method8245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
	public abstract void method8246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
