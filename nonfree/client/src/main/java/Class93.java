import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class93 {

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "Z")
	public boolean aBoolean169 = true;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public final int anInt4262;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public final int anInt4260;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
	public final int anInt4263;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
	public final int anInt4267;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	public final int anInt4259;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	public final int anInt4266;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4262 = arg3;
		this.aBoolean169 = arg6;
		this.anInt4260 = arg4;
		this.anInt4263 = arg5;
		this.anInt4267 = arg2;
		this.anInt4259 = arg1;
		this.anInt4266 = arg0;
	}
}
