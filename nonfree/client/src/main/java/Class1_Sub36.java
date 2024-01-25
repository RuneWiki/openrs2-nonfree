import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
	public final int anInt5638;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "Z")
	public final boolean aBoolean431;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
	public final int anInt5645;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
	public final int anInt5636;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	public final int anInt5639;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	public final int anInt5637;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5638 = arg1;
		this.aBoolean431 = arg5;
		this.anInt5645 = arg0;
		this.anInt5636 = arg4;
		this.anInt5639 = arg2;
		this.anInt5637 = arg3;
	}
}
