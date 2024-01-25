import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class151 {

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	public final int anInt3834;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public final int anInt3836;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	public final int anInt3835;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
	public final int anInt3833;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIII)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3834 = arg3;
		this.anInt3836 = arg2;
		this.anInt3835 = arg0;
		this.anInt3833 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)Lclient!gt;")
	public Class151 method3288(@OriginalArg(1) int arg0) {
		return new Class151(this.anInt3835, arg0, this.anInt3836, this.anInt3834);
	}
}
