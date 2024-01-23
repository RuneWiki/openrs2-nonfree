import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public int anInt5596;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!gl;")
	protected Class56 aClass56_41;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "Lclient!oj;")
	protected Class122 aClass122_41;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "[Lclient!lf;")
	public Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Z")
	public boolean aBoolean451;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
		this.aBoolean451 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I")
	public int method4446() {
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public void method4447() {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
	public final void method4448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt5596 == 255 ? arg1 : this.anInt5596;
		if (this.aBoolean451) {
			this.aClass122_41 = new Class122(local14, arg1, arg0);
		} else {
			this.aClass56_41 = new Class56(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!cg;II)V")
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)[I")
	protected final int[] method4450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub3Array42[arg0].aBoolean451 ? this.aClass1_Sub3Array42[arg0].method4453(arg1) : this.aClass1_Sub3Array42[arg0].method4452(arg1)[0];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I")
	public int[][] method4452(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I")
	public int[] method4453(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
	public int method4454() {
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)[[I")
	protected final int[][] method4455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass1_Sub3Array42[arg0].aBoolean451) {
			return this.aClass1_Sub3Array42[arg0].method4452(arg1);
		}
		@Pc(17) int[][] local17 = new int[3][];
		@Pc(25) int[] local25 = this.aClass1_Sub3Array42[arg0].method4453(arg1);
		local17[2] = local25;
		local17[0] = local25;
		local17[1] = local25;
		return local17;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public void method4456() {
		if (this.aBoolean451) {
			this.aClass122_41.method3149();
			this.aClass122_41 = null;
		} else {
			this.aClass56_41.method1597();
			this.aClass56_41 = null;
		}
	}
}
