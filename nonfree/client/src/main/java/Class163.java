import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class163 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!il;")
	public Class163 aClass163_1;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!q;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "I")
	public int anInt3823;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "I")
	public int anInt3824;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public int anInt3825;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public final int anInt3821;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "I")
	public final int anInt3822;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(II)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3821 = arg1;
		this.anInt3822 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lclient!kq;")
	public Class198 method3310() {
		return Static26.method359(this.anInt3822);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Lclient!il;")
	public Class163 method3311(@OriginalArg(0) int arg0) {
		return new Class163(this.anInt3822, arg0);
	}
}
