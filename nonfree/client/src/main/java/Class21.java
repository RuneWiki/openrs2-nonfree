import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class21 {

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public int anInt747;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public int anInt745;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean48 = arg6;
		this.anInt747 = arg5;
		this.anInt750 = arg4;
		this.anInt739 = arg0;
		this.anInt742 = arg1;
		this.anInt745 = arg2;
		this.anInt749 = arg3;
	}
}
