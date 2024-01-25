import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class214 {

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
	public final int anInt5954;

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
	public final int anInt5956;

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
	public final int anInt5959;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	public final int anInt5958;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIII)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5954 = arg3;
		this.anInt5956 = arg1;
		this.anInt5959 = arg2;
		this.anInt5958 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Lclient!lw;")
	public Class214 method4950(@OriginalArg(1) int arg0) {
		return new Class214(this.anInt5958, arg0, this.anInt5959, this.anInt5954);
	}
}
