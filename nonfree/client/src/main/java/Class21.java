import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class21 {

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
	public final int anInt536;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	public final int anInt534;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
	public final int anInt531;

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
	public final int anInt535;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(IIII)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt536 = arg1;
		this.anInt534 = arg2;
		this.anInt531 = arg3;
		this.anInt535 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)Lclient!baa;")
	public Class21 method670(@OriginalArg(0) int arg0) {
		return new Class21(this.anInt535, arg0, this.anInt534, this.anInt531);
	}
}
