import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!ff;")
	protected Class37 aClass37_41;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Lclient!lb;")
	protected Class71 aClass71_41;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	public int anInt4947;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "[Lclient!fb;")
	public Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "Z")
	public boolean aBoolean442;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
		this.aBoolean442 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[[I")
	public int[][] method3704(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[I")
	public int[] method3705(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)[I")
	protected final int[] method3706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean442 ? this.aClass1_Sub1Array42[arg1].method3705(arg0) : this.aClass1_Sub1Array42[arg1].method3704(arg0)[0];
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	public void method3709() {
		if (this.aBoolean442) {
			this.aClass37_41.method1162();
			this.aClass37_41 = null;
		} else {
			this.aClass71_41.method2051();
			this.aClass71_41 = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)V")
	public final void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4947 == 255 ? arg0 : this.anInt4947;
		if (this.aBoolean442) {
			this.aClass37_41 = new Class37(local10, arg0, arg1);
		} else {
			this.aClass71_41 = new Class71(local10, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!vf;II)V")
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aClass1_Sub1Array42[arg1].aBoolean442) {
			return this.aClass1_Sub1Array42[arg1].method3704(arg0);
		}
		@Pc(25) int[][] local25 = new int[3][];
		@Pc(33) int[] local33 = this.aClass1_Sub1Array42[arg1].method3705(arg0);
		local25[1] = local33;
		local25[2] = local33;
		local25[0] = local33;
		return local25;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)I")
	public int method3714() {
		return -1;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
	public void method3716() {
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)I")
	public int method3717() {
		return -1;
	}
}
