import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
	public int anInt4920;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V")
	public Class2_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4920 = arg0;
		this.anInt4916 = arg1;
	}
}
