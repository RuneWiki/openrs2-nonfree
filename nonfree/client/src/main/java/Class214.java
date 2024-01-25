import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class214 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public int anInt5681;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public int anInt5682;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public int anInt5683;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt5684;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public int anInt5685;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public int anInt5686;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	public int anInt5693;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public int anInt5694 = 128;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	public int anInt5691 = 128;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	public int anInt5695;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt5695 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIII)V")
	private Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5695 = arg0;
		this.anInt5684 = arg4;
		this.anInt5694 = arg2;
		this.anInt5691 = arg1;
		this.anInt5693 = arg3;
		this.anInt5683 = arg5;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Lclient!ra;")
	public Class214 method4787() {
		return new Class214(this.anInt5695, this.anInt5691, this.anInt5694, this.anInt5693, this.anInt5684, this.anInt5683);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!ra;)V")
	public void method4789(@OriginalArg(1) Class214 arg0) {
		this.anInt5683 = arg0.anInt5683;
		this.anInt5691 = arg0.anInt5691;
		this.anInt5694 = arg0.anInt5694;
		this.anInt5695 = arg0.anInt5695;
		this.anInt5684 = arg0.anInt5684;
		this.anInt5693 = arg0.anInt5693;
	}
}
