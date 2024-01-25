import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class114 {

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public final int anInt3858;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	public final int anInt3857;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
	public final int anInt3854;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	public final int anInt3856;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIII)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3858 = arg3;
		this.anInt3857 = arg1;
		this.anInt3854 = arg0;
		this.anInt3856 = arg2;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)Lclient!gt;")
	public Class114 method3211(@OriginalArg(0) int arg0) {
		return new Class114(this.anInt3854, arg0, this.anInt3856, this.anInt3858);
	}
}
