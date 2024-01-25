import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class182 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
	public int anInt4801;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
	public int anInt4803;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
	public int anInt4806;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
	public int anInt4807 = 128;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	public int anInt4804 = 128;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
	public int anInt4808;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(I)V")
	public Class182(@OriginalArg(0) int arg0) {
		this.anInt4808 = arg0;
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIII)V")
	private Class182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4804 = arg2;
		this.anInt4808 = arg0;
		this.anInt4807 = arg1;
		this.anInt4801 = arg3;
		this.anInt4803 = arg5;
		this.anInt4806 = arg4;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Lclient!oq;")
	public Class182 method3894() {
		return new Class182(this.anInt4808, this.anInt4807, this.anInt4804, this.anInt4801, this.anInt4806, this.anInt4803);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!oq;I)V")
	public void method3896(@OriginalArg(0) Class182 arg0) {
		this.anInt4804 = arg0.anInt4804;
		this.anInt4807 = arg0.anInt4807;
		this.anInt4801 = arg0.anInt4801;
		this.anInt4803 = arg0.anInt4803;
		this.anInt4806 = arg0.anInt4806;
		this.anInt4808 = arg0.anInt4808;
	}
}
