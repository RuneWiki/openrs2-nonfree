import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class55 {

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	public final int anInt1458;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	public final int anInt1462;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	public final int anInt1461;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public final int anInt1456;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIII)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1458 = arg0;
		this.anInt1462 = arg1;
		this.anInt1461 = arg2;
		this.anInt1456 = arg3;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Lclient!dl;")
	public Class55 method1137(@OriginalArg(0) int arg0) {
		return new Class55(this.anInt1458, arg0, this.anInt1461, this.anInt1456);
	}
}
