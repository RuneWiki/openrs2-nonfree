import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class10_Sub39 extends Class10 {

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "Z")
	public final boolean aBoolean366;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
	public final int anInt5663;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	public final int anInt5659;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	public final int anInt5664;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
	public final int anInt5665;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	public final int anInt5661;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class10_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean366 = arg5;
		this.anInt5663 = arg3;
		this.anInt5659 = arg1;
		this.anInt5664 = arg2;
		this.anInt5665 = arg0;
		this.anInt5661 = arg4;
	}
}
