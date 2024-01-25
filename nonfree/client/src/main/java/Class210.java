import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class210 {

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
	public int anInt5633;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	public int anInt5634;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
	public int anInt5637;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
	public int anInt5639;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	public int anInt5640;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
	public int anInt5642;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
	public int anInt5644;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	public int anInt5645;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
	public int anInt5638 = 128;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
	public int anInt5636 = 128;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public int anInt5635;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
	public Class210(@OriginalArg(0) int arg0) {
		this.anInt5635 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(IIIIII)V")
	private Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5644 = arg5;
		this.anInt5638 = arg1;
		this.anInt5635 = arg0;
		this.anInt5636 = arg2;
		this.anInt5642 = arg4;
		this.anInt5634 = arg3;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLclient!kr;)V")
	public void method5097(@OriginalArg(1) Class210 arg0) {
		this.anInt5635 = arg0.anInt5635;
		this.anInt5634 = arg0.anInt5634;
		this.anInt5636 = arg0.anInt5636;
		this.anInt5644 = arg0.anInt5644;
		this.anInt5642 = arg0.anInt5642;
		this.anInt5638 = arg0.anInt5638;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Lclient!kr;")
	public Class210 method5098() {
		return new Class210(this.anInt5635, this.anInt5638, this.anInt5636, this.anInt5634, this.anInt5642, this.anInt5644);
	}
}
