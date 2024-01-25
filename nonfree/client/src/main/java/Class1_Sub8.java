import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
	public final int anInt933;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public final int anInt932;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	public final int anInt931;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	public final int anInt930;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
	public final boolean aBoolean82;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public final int anInt926;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt933 = arg1;
		this.anInt932 = arg3;
		this.anInt931 = arg0;
		this.anInt930 = arg2;
		this.aBoolean82 = arg5;
		this.anInt926 = arg4;
	}
}
