import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!ve;")
	protected Class90 aClass90_41;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!nd;")
	protected Class57 aClass57_41;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
	public int anInt4649;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "[Lclient!af;")
	public final Class2_Sub2[] aClass2_Sub2Array42;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub2Array42 = new Class2_Sub2[arg0];
		this.aBoolean183 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(III)[[I")
	protected final int[][] method3557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub2Array42[arg1].aBoolean183) {
			@Pc(25) int[] local25 = this.aClass2_Sub2Array42[arg1].method3562(arg0);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass2_Sub2Array42[arg1].method3568(arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)I")
	public int method3559() {
		return -1;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)I")
	public int method3560() {
		return -1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
	public int[] method3562(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	public void method3563() {
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!og;)V")
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V")
	public final void method3566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4649 == 255 ? arg0 : this.anInt4649;
		if (this.aBoolean183) {
			this.aClass57_41 = new Class57(local12, arg0, arg1);
		} else {
			this.aClass90_41 = new Class90(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
	public void method3567() {
		if (this.aBoolean183) {
			this.aClass57_41.method2570();
			this.aClass57_41 = null;
		} else {
			this.aClass90_41.method3440();
			this.aClass90_41 = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[[I")
	public int[][] method3568(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(III)[I")
	protected final int[] method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub2Array42[arg1].aBoolean183 ? this.aClass2_Sub2Array42[arg1].method3562(arg0) : this.aClass2_Sub2Array42[arg1].method3568(arg0)[0];
	}
}
