import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class13 {

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Z")
	public boolean aBoolean22 = true;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public final int anInt754;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public final int anInt751;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "I")
	public final int anInt756;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "I")
	public final int anInt757;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public final int anInt752;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public final int anInt758;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt754 = arg5;
		this.anInt751 = arg3;
		this.aBoolean22 = arg6;
		this.anInt756 = arg4;
		this.anInt757 = arg1;
		this.anInt752 = arg2;
		this.anInt758 = arg0;
	}
}
