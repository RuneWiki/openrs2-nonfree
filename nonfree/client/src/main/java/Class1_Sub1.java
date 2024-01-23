import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!el;")
	protected Class45 aClass45_41;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "I")
	public int anInt6242;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "Lclient!wk;")
	protected Class194 aClass194_41;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "[Lclient!a;")
	public Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
		this.aBoolean410 = arg1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	public final void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt6242 == 255 ? arg1 : this.anInt6242;
		if (this.aBoolean410) {
			this.aClass194_41 = new Class194(local22, arg1, arg0);
		} else {
			this.aClass45_41 = new Class45(local22, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qm;II)V")
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)[[I")
	public int[][] method4714(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(III)[[I")
	protected final int[][] method4715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass1_Sub1Array42[arg1].aBoolean410) {
			return this.aClass1_Sub1Array42[arg1].method4714(arg0);
		}
		@Pc(27) int[][] local27 = new int[3][];
		@Pc(37) int[] local37 = this.aClass1_Sub1Array42[arg1].method4717(arg0);
		local27[0] = local37;
		local27[2] = local37;
		local27[1] = local37;
		return local27;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)[I")
	protected final int[] method4716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub1Array42[arg0].aBoolean410 ? this.aClass1_Sub1Array42[arg0].method4717(arg1) : this.aClass1_Sub1Array42[arg0].method4714(arg1)[0];
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
	public int[] method4717(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
	public void method4720() {
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I")
	public int method4723() {
		return -1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	public int method4725() {
		return -1;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public void method4726() {
		if (this.aBoolean410) {
			this.aClass194_41.method4737();
			this.aClass194_41 = null;
		} else {
			this.aClass45_41.method1142();
			this.aClass45_41 = null;
		}
	}
}
