import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Lclient!bi;")
	protected Class16 aClass16_41;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	public int anInt4864;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "Lclient!jc;")
	protected Class51 aClass51_41;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "Z")
	public boolean aBoolean212;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "[Lclient!bc;")
	public Class2_Sub2[] aClass2_Sub2Array42;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean212 = arg1;
		this.aClass2_Sub2Array42 = new Class2_Sub2[arg0];
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IBI)[[I")
	protected final int[][] method3952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub2Array42[arg0].aBoolean212) {
			@Pc(22) int[] local22 = this.aClass2_Sub2Array42[arg0].method3961(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass2_Sub2Array42[arg0].method3960(arg1);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	public final void method3954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt4864 == 255 ? arg1 : this.anInt4864;
		if (this.aBoolean212) {
			this.aClass16_41 = new Class16(local16, arg1, arg0);
		} else {
			this.aClass51_41 = new Class51(local16, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)[I")
	protected final int[] method3955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub2Array42[arg0].aBoolean212 ? this.aClass2_Sub2Array42[arg0].method3961(arg1) : this.aClass2_Sub2Array42[arg0].method3960(arg1)[0];
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!nh;I)V")
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	public void method3958() {
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)[[I")
	public int[][] method3960(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[I")
	public int[] method3961(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I")
	public int method3962() {
		return -1;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	public void method3964() {
		if (this.aBoolean212) {
			this.aClass16_41.method301();
			this.aClass16_41 = null;
		} else {
			this.aClass51_41.method1693();
			this.aClass51_41 = null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)I")
	public int method3965() {
		return -1;
	}
}
