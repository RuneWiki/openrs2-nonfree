import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	protected int anInt7431;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	protected int anInt7430;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	public final int anInt7426;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
	protected final int anInt7432;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIII)V")
	protected Class47_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7431 = arg2;
		this.anInt7430 = arg0;
		this.anInt7426 = arg3;
		this.anInt7432 = arg1;
	}
}
