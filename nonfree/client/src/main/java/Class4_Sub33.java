import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Z")
	public final boolean aBoolean414;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public final int anInt5625;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public final int anInt5626;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
	public final int anInt5631;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
	public final int anInt5632;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	public final int anInt5633;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean414 = arg5;
		this.anInt5625 = arg3;
		this.anInt5626 = arg1;
		this.anInt5631 = arg4;
		this.anInt5632 = arg0;
		this.anInt5633 = arg2;
	}
}
