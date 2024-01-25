import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
	public final int anInt4788;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
	public final int anInt4789;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(II)V")
	public Class2_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4788 = arg0;
		this.anInt4789 = arg1;
	}
}
