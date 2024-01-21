import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class60 {

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	public final int anInt1769;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public final int anInt1758;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	public final int anInt1761;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public final int anInt1763;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	public final int anInt1764;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public final int anInt1759;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1769 = arg0;
		this.anInt1758 = arg2;
		this.anInt1761 = arg4;
		this.anInt1763 = arg5;
		this.anInt1764 = arg3;
		this.anInt1759 = arg1;
		this.aBoolean68 = arg6;
	}
}
