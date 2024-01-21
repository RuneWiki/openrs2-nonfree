import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!vg;")
	protected Class85 aClass85_41;

	@OriginalMember(owner = "client!p", name = "G", descriptor = "I")
	public int anInt4422;

	@OriginalMember(owner = "client!p", name = "L", descriptor = "Lclient!eb;")
	protected Class19 aClass19_41;

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
	public int anInt4429;

	@OriginalMember(owner = "client!p", name = "R", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!p", name = "P", descriptor = "[Lclient!p;")
	public final Class1_Sub2[] aClass1_Sub2Array41;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean173 = arg1;
		this.aClass1_Sub2Array41 = new Class1_Sub2[arg0];
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
	public void method3389() {
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method3390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub2Array41[arg1].aBoolean173) {
			@Pc(30) int[] local30 = this.aClass1_Sub2Array41[arg1].method3398(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub2Array41[arg1].method3391(arg0);
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)[[I")
	public int[][] method3391(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!fa;)V")
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII)V")
	public final void method3395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4422 == 255 ? arg0 : this.anInt4422;
		if (this.aBoolean173) {
			this.aClass85_41 = new Class85(local18, arg0, arg1);
		} else {
			this.aClass19_41 = new Class19(local18, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(II)[I")
	public int[] method3398(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
	public int method3399() {
		return -1;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
	public final void method3400() {
		if (this.aBoolean173) {
			this.aClass85_41.method3435();
			this.aClass85_41 = null;
		} else {
			this.aClass19_41.method1029();
			this.aClass19_41 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZ)[I")
	protected final int[] method3401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub2Array41[arg1].aBoolean173 ? this.aClass1_Sub2Array41[arg1].method3398(arg0) : this.aClass1_Sub2Array41[arg1].method3391(arg0)[0];
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)I")
	public int method3403() {
		return -1;
	}
}
