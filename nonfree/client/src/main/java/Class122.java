import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class122 {

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
	public final int anInt2553;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
	public final int anInt2554;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
	public final int anInt2550;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
	public final int anInt2551;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIII)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2553 = arg0;
		this.anInt2554 = arg3;
		this.anInt2550 = arg2;
		this.anInt2551 = arg1;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)Lclient!gda;")
	public Class122 method2189(@OriginalArg(0) int arg0) {
		return new Class122(this.anInt2553, arg0, this.anInt2550, this.anInt2554);
	}
}
