import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
	public final int anInt3032;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	public final int anInt3030;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
	public Class2_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3032 = arg0;
		this.anInt3030 = arg1;
	}
}
