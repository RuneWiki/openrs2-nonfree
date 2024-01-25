import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class5_Sub36 extends Class5 {

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
	public final int anInt5029;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II)V")
	public Class5_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5028 = arg1;
		this.anInt5029 = arg0;
	}
}
