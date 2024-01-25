import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public final int anInt1719;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Z")
	public final boolean aBoolean121;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public final int anInt1712;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public final int anInt1715;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public final int anInt1717;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public final int anInt1714;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1719 = arg3;
		this.aBoolean121 = arg5;
		this.anInt1712 = arg1;
		this.anInt1715 = arg0;
		this.anInt1717 = arg4;
		this.anInt1714 = arg2;
	}
}
