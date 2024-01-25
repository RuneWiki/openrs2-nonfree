import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class107 {

	@OriginalMember(owner = "client!en", name = "d", descriptor = "I")
	public int anInt2688;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	public int anInt2693;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "I")
	public int anInt2695;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "I")
	public int anInt2691 = 128;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public int anInt2689 = 128;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "I")
	public int anInt2696;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(I)V")
	public Class107(@OriginalArg(0) int arg0) {
		this.anInt2696 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIII)V")
	private Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2696 = arg0;
		this.anInt2695 = arg3;
		this.anInt2691 = arg2;
		this.anInt2688 = arg4;
		this.anInt2689 = arg1;
		this.anInt2693 = arg5;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Lclient!en;")
	public Class107 method2350() {
		return new Class107(this.anInt2696, this.anInt2689, this.anInt2691, this.anInt2695, this.anInt2688, this.anInt2693);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!en;)V")
	public void method2351(@OriginalArg(1) Class107 arg0) {
		this.anInt2695 = arg0.anInt2695;
		this.anInt2691 = arg0.anInt2691;
		this.anInt2693 = arg0.anInt2693;
		this.anInt2689 = arg0.anInt2689;
		this.anInt2688 = arg0.anInt2688;
		this.anInt2696 = arg0.anInt2696;
	}
}
