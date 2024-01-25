import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
	public final int anInt4053;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public int anInt4051;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V")
	public Class4_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4053 = arg0;
		this.anInt4051 = arg1;
	}
}
