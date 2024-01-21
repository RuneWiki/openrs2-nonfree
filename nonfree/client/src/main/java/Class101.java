import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class101 {

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Z")
	public boolean aBoolean229 = true;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public final int anInt4644;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public final int anInt4646;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	public final int anInt4645;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	public final int anInt4652;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public final int anInt4651;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public final int anInt4643;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4644 = arg4;
		this.anInt4646 = arg5;
		this.anInt4645 = arg2;
		this.anInt4652 = arg0;
		this.aBoolean229 = arg6;
		this.anInt4651 = arg3;
		this.anInt4643 = arg1;
	}
}
