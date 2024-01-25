import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class145 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	public final int anInt3835;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public final int anInt3834;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public final int anInt3837;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public final int anInt3833;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIII)V")
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3835 = arg0;
		this.anInt3834 = arg1;
		this.anInt3837 = arg2;
		this.anInt3833 = arg3;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!he;")
	public Class145 method3270(@OriginalArg(1) int arg0) {
		return new Class145(this.anInt3835, arg0, this.anInt3837, this.anInt3833);
	}
}
