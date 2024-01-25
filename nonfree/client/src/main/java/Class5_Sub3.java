import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
	public int anInt10903;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Lclient!tba;")
	protected Class343 aClass343_41;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "Lclient!mf;")
	protected Class234 aClass234_41;

	@OriginalMember(owner = "client!nt", name = "F", descriptor = "Z")
	public boolean aBoolean769;

	@OriginalMember(owner = "client!nt", name = "C", descriptor = "[Lclient!nt;")
	public final Class5_Sub3[] aClass5_Sub3Array42;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean769 = arg1;
		this.aClass5_Sub3Array42 = new Class5_Sub3[arg0];
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)I")
	public int method9202() {
		return -1;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)V")
	public void method9203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt10903 == 255 ? arg0 : this.anInt10903;
		if (this.aBoolean769) {
			this.aClass234_41 = new Class234(local13, arg0, arg1);
		} else {
			this.aClass343_41 = new Class343(local13, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)[I")
	protected final int[] method9205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass5_Sub3Array42[arg1].aBoolean769 ? this.aClass5_Sub3Array42[arg1].method9208(arg0) : this.aClass5_Sub3Array42[arg1].method9206(arg0)[0];
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)[[I")
	public int[][] method9206(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method9207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_Sub3Array42[arg1].aBoolean769) {
			@Pc(25) int[] local25 = this.aClass5_Sub3Array42[arg1].method9208(arg0);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass5_Sub3Array42[arg1].method9206(arg0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)[I")
	public int[] method9208(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)V")
	public void method9209() {
		if (this.aBoolean769) {
			this.aClass234_41.method5228();
			this.aClass234_41 = null;
		} else {
			this.aClass343_41.method7659();
			this.aClass343_41 = null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public void method9210() {
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!wq;I)V")
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)I")
	public int method9212() {
		return -1;
	}
}
