import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class259 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	public final int anInt7711;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public final int anInt7714;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public final int anInt7712;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public final int anInt7713;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIII)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7711 = arg2;
		this.anInt7714 = arg3;
		this.anInt7712 = arg0;
		this.anInt7713 = arg1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Lclient!ph;")
	public Class259 method6449(@OriginalArg(0) int arg0) {
		return new Class259(this.anInt7712, arg0, this.anInt7711, this.anInt7714);
	}
}
