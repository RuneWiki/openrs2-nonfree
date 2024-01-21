import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class24 {

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public final int anInt4288;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public final int anInt4287;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	protected final int anInt4280;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
	protected Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4288 = arg0;
		this.anInt4287 = arg1;
		this.anInt4280 = arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZI)V")
	public abstract void method2999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public abstract void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)V")
	public abstract void method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
