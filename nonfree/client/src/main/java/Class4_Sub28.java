import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public final int anInt4995;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public final int anInt4993;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
	public Class4_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4995 = arg0;
		this.anInt4993 = arg1;
	}
}
