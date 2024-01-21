import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	public int anInt4683;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Lclient!hb;")
	protected Class40 aClass40_41;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "Lclient!gd;")
	protected Class33 aClass33_41;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "[Lclient!he;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
		this.aBoolean231 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public void method3569() {
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[I")
	public int[] method3571(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
	public int method3572() {
		return -1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!fj;IB)V")
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	public void method3574() {
		if (this.aBoolean231) {
			this.aClass40_41.method1366();
			this.aClass40_41 = null;
		} else {
			this.aClass33_41.method1283();
			this.aClass33_41 = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)I")
	public int method3575() {
		return -1;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)[[I")
	public int[][] method3576(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	public final void method3578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt4683 == 255 ? arg0 : this.anInt4683;
		if (this.aBoolean231) {
			this.aClass40_41 = new Class40(local14, arg0, arg1);
		} else {
			this.aClass33_41 = new Class33(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)[[I")
	protected final int[][] method3579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg1].aBoolean231) {
			@Pc(30) int[] local30 = this.aClass1_Sub1Array42[arg1].method3571(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub1Array42[arg1].method3576(arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)[I")
	protected final int[] method3580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean231 ? this.aClass1_Sub1Array42[arg1].method3571(arg0) : this.aClass1_Sub1Array42[arg1].method3576(arg0)[0];
	}
}
