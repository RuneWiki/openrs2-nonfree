import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class37 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
	public boolean aBoolean92 = true;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	public final int anInt1723;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public final int anInt1720;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	public final int anInt1724;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public final int anInt1722;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public final int anInt1715;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public final int anInt1718;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean92 = arg6;
		this.anInt1723 = arg2;
		this.anInt1720 = arg3;
		this.anInt1724 = arg0;
		this.anInt1722 = arg1;
		this.anInt1715 = arg5;
		this.anInt1718 = arg4;
	}
}
