import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class126 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Z")
	public boolean aBoolean215 = true;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public int anInt4885;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
	public int anInt4883;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public int anInt4884;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public int anInt4882;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
	public int anInt4887;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4885 = arg3;
		this.anInt4886 = arg5;
		this.anInt4883 = arg0;
		this.anInt4884 = arg1;
		this.aBoolean215 = arg6;
		this.anInt4882 = arg2;
		this.anInt4887 = arg4;
	}
}
