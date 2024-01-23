import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class110 {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Z")
	public boolean aBoolean280 = true;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public int anInt3712;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public int anInt3717;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	public int anInt3719;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public int anInt3721;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public int anInt3718;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public int anInt3713;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3712 = arg2;
		this.aBoolean280 = arg6;
		this.anInt3717 = arg0;
		this.anInt3719 = arg3;
		this.anInt3721 = arg5;
		this.anInt3718 = arg4;
		this.anInt3713 = arg1;
	}
}
