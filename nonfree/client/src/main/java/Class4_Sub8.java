import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	public final int anInt1145;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	public final int anInt1147;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
	public Class4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1145 = arg0;
		this.anInt1147 = arg1;
	}
}
