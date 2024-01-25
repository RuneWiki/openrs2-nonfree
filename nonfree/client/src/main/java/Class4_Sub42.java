import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class4_Sub42 extends Class4 {

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public final int anInt6782;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	public final int anInt6785;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V")
	public Class4_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6782 = arg1;
		this.anInt6785 = arg0;
	}
}
