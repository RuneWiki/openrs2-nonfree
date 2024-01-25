import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class362 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public final int anInt9629;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public final int anInt9630;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	public final int anInt9626;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public final int anInt9627;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIII)V")
	public Class362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9629 = arg3;
		this.anInt9630 = arg2;
		this.anInt9626 = arg0;
		this.anInt9627 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)Lclient!wj;")
	public Class362 method7817(@OriginalArg(1) int arg0) {
		return new Class362(this.anInt9626, arg0, this.anInt9630, this.anInt9629);
	}
}
