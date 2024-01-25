import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class10 {

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	public final int anInt89;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public final int anInt88;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public final int anInt86;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public final int anInt85;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIII)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt89 = arg0;
		this.anInt88 = arg1;
		this.anInt86 = arg3;
		this.anInt85 = arg2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Lclient!af;")
	public Class10 method93(@OriginalArg(0) int arg0) {
		return new Class10(this.anInt89, arg0, this.anInt85, this.anInt86);
	}
}
