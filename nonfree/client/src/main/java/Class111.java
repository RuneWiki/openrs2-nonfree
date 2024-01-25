import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class111 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public final int anInt2665;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public final int anInt2669;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
	public final int anInt2666;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	public final int anInt2668;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIII)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2665 = arg2;
		this.anInt2669 = arg0;
		this.anInt2666 = arg1;
		this.anInt2668 = arg3;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lclient!hm;")
	public Class111 method2382(@OriginalArg(1) int arg0) {
		return new Class111(this.anInt2669, arg0, this.anInt2665, this.anInt2668);
	}
}
