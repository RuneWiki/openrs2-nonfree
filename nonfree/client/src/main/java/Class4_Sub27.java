import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public final int anInt4360;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	public final int anInt4361;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(II)V")
	public Class4_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4360 = arg0;
		this.anInt4361 = arg1;
	}
}
