import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "Lclient!ps;")
	protected Class293 aClass293_41;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!bq;")
	protected Class36 aClass36_41;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	public int anInt11031;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "[Lclient!wf;")
	public final Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "Z")
	public boolean aBoolean794;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub2Array42 = new Class3_Sub2[arg0];
		this.aBoolean794 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[[I")
	public int[][] method9203(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)[I")
	protected final int[] method9204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub2Array42[arg1].aBoolean794 ? this.aClass3_Sub2Array42[arg1].method9209(arg0) : this.aClass3_Sub2Array42[arg1].method9203(arg0)[0];
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method9205() {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public void method9206() {
		if (this.aBoolean794) {
			this.aClass293_41.method7198();
			this.aClass293_41 = null;
		} else {
			this.aClass36_41.method730();
			this.aClass36_41 = null;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I")
	public int method9207() {
		return -1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I")
	public int[] method9209(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(III)V")
	public void method9210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt11031 == 255 ? arg1 : this.anInt11031;
		if (this.aBoolean794) {
			this.aClass293_41 = new Class293(local15, arg1, arg0);
		} else {
			this.aClass36_41 = new Class36(local15, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)[[I")
	protected final int[][] method9212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array42[arg0].aBoolean794) {
			@Pc(25) int[] local25 = this.aClass3_Sub2Array42[arg0].method9209(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass3_Sub2Array42[arg0].method9203(arg1);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I")
	public int method9213() {
		return -1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!rba;I)V")
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
	}
}
