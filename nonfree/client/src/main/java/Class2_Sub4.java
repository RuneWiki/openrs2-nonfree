import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!as", name = "q", descriptor = "I")
	public final int anInt313;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	public final int anInt315;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(II)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt313 = arg0;
		this.anInt315 = arg1;
	}
}
