import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public final int anInt2244;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public final int anInt2247;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
	public Class4_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2244 = arg0;
		this.anInt2247 = arg1;
	}
}
