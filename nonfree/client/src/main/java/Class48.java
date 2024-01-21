import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class48 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public final int anInt1780;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public final int anInt1777;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public final int anInt1776;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public final int anInt1774;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public final int anInt1771;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	public final int anInt1772;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1780 = arg0;
		this.anInt1777 = arg5;
		this.anInt1776 = arg2;
		this.anInt1774 = arg1;
		this.anInt1771 = arg4;
		this.anInt1772 = arg3;
		this.aBoolean66 = arg6;
	}
}
