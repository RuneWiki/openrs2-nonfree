import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class168 {

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
	public final int anInt4626;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	public final int anInt4622;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
	public final int anInt4620;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	public final int anInt4625;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(IIII)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4626 = arg2;
		this.anInt4622 = arg0;
		this.anInt4620 = arg1;
		this.anInt4625 = arg3;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)Lclient!jv;")
	public Class168 method4021(@OriginalArg(0) int arg0) {
		return new Class168(this.anInt4622, arg0, this.anInt4626, this.anInt4625);
	}
}
