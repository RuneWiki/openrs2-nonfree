import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
	public final int anInt3810;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	public final int anInt3811;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(II)V")
	public Class2_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3810 = arg1;
		this.anInt3811 = arg0;
	}
}
