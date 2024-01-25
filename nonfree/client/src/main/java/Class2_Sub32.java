import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	public final int anInt4445;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public final int anInt4446;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(II)V")
	public Class2_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4445 = arg0;
		this.anInt4446 = arg1;
	}
}
