import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
	public final int anInt74;

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
	public final int anInt71;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(II)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt74 = arg0;
		this.anInt71 = arg1;
	}
}
