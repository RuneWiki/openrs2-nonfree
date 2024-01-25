import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	public final int anInt5144;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
	protected int anInt5140;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	protected final int anInt5142;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	protected int anInt5141;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIII)V")
	protected Class11_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5144 = arg3;
		this.anInt5140 = arg0;
		this.anInt5142 = arg1;
		this.anInt5141 = arg2;
	}
}
