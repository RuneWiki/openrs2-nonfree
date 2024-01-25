import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Lclient!sc;")
	protected Class225 aClass225_41;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	public int anInt7804;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Lclient!ji;")
	protected Class130 aClass130_41;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "Z")
	public boolean aBoolean508;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "[Lclient!pj;")
	public final Class1_Sub8[] aClass1_Sub8Array42;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean508 = arg1;
		this.aClass1_Sub8Array42 = new Class1_Sub8[arg0];
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)[[I")
	public int[][] method6030(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[I")
	public int[] method6031(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
	public int method6032() {
		return -1;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	public void method6033() {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)V")
	public void method6034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7804 == 255 ? arg1 : this.anInt7804;
		if (this.aBoolean508) {
			this.aClass225_41 = new Class225(local14, arg1, arg0);
		} else {
			this.aClass130_41 = new Class130(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)[[I")
	protected final int[][] method6035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub8Array42[arg1].aBoolean508) {
			@Pc(30) int[] local30 = this.aClass1_Sub8Array42[arg1].method6031(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub8Array42[arg1].method6030(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	public void method6036() {
		if (this.aBoolean508) {
			this.aClass225_41.method5083();
			this.aClass225_41 = null;
		} else {
			this.aClass130_41.method3107();
			this.aClass130_41 = null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)[I")
	protected final int[] method6037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub8Array42[arg0].aBoolean508 ? this.aClass1_Sub8Array42[arg0].method6031(arg1) : this.aClass1_Sub8Array42[arg0].method6030(arg1)[0];
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZILclient!ia;)V")
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)I")
	public int method6039() {
		return -1;
	}
}
