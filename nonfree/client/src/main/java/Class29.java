import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class29 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public final int anInt1786;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public final int anInt1789;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public final int anInt1788;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "I")
	public final int anInt1790;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public final int anInt1787;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public final int anInt1794;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1786 = arg0;
		this.anInt1789 = arg2;
		this.anInt1788 = arg4;
		this.anInt1790 = arg1;
		this.anInt1787 = arg3;
		this.aBoolean91 = arg6;
		this.anInt1794 = arg5;
	}
}
