import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dla")
public final class Class74 {

	@OriginalMember(owner = "client!dla", name = "h", descriptor = "I")
	public final int anInt2326;

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "I")
	public final int anInt2330;

	@OriginalMember(owner = "client!dla", name = "g", descriptor = "I")
	public final int anInt2328;

	@OriginalMember(owner = "client!dla", name = "d", descriptor = "I")
	public final int anInt2331;

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(IIII)V")
	public Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2326 = arg0;
		this.anInt2330 = arg2;
		this.anInt2328 = arg1;
		this.anInt2331 = arg3;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(II)Lclient!dla;")
	public Class74 method2067(@OriginalArg(0) int arg0) {
		return new Class74(this.anInt2326, arg0, this.anInt2330, this.anInt2331);
	}
}
