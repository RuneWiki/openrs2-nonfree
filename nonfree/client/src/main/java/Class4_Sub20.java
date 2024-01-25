import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "Z")
	public final boolean aBoolean204;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	public final int anInt2823;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	public final int anInt2825;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	public final int anInt2824;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	public final int anInt2822;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
	public final int anInt2827;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean204 = arg5;
		this.anInt2823 = arg4;
		this.anInt2825 = arg0;
		this.anInt2824 = arg3;
		this.anInt2822 = arg2;
		this.anInt2827 = arg1;
	}
}
