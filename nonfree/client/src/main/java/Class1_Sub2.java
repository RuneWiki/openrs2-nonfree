import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!af;")
	protected Class5 aClass5_39;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!sh;")
	protected Class77 aClass77_39;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
	public int anInt4328;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
	public int anInt4331;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "[Lclient!fc;")
	public final Class1_Sub2[] aClass1_Sub2Array40;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub2Array40 = new Class1_Sub2[arg0];
		this.aBoolean215 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)[[I")
	protected final int[][] method3118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass1_Sub2Array40[arg1].aBoolean215) {
			return this.aClass1_Sub2Array40[arg1].method3129(arg0);
		}
		@Pc(24) int[][] local24 = new int[3][];
		@Pc(32) int[] local32 = this.aClass1_Sub2Array40[arg1].method3126(arg0);
		local24[1] = local32;
		local24[0] = local32;
		local24[2] = local32;
		return local24;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
	public int method3119() {
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!jg;II)V")
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
	public int method3122() {
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	public void method3125() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
	public int[] method3126(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
	public final void method3127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt4331 == 255 ? arg1 : this.anInt4331;
		if (this.aBoolean215) {
			this.aClass5_39 = new Class5(local16, arg1, arg0);
		} else {
			this.aClass77_39 = new Class77(local16, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public final void method3128() {
		if (this.aBoolean215) {
			this.aClass5_39.method169();
			this.aClass5_39 = null;
		} else {
			this.aClass77_39.method2618();
			this.aClass77_39 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[[I")
	public int[][] method3129(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)[I")
	protected final int[] method3130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub2Array40[arg0].aBoolean215 ? this.aClass1_Sub2Array40[arg0].method3126(arg1) : this.aClass1_Sub2Array40[arg0].method3129(arg1)[0];
	}
}
