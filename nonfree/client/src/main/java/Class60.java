import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class60 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	public final int anInt2028;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public final int anInt2033;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public final int anInt2032;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public final int anInt2027;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIII)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2028 = arg2;
		this.anInt2033 = arg3;
		this.anInt2032 = arg0;
		this.anInt2027 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)Lclient!cm;")
	public Class60 method1880(@OriginalArg(0) int arg0) {
		return new Class60(this.anInt2032, arg0, this.anInt2028, this.anInt2033);
	}
}
