import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	public final int anInt4186;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V")
	public Class2_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4186 = arg1;
		this.anInt4189 = arg0;
	}
}
