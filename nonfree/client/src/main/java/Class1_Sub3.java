import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!nf;")
	protected Class79 aClass79_41;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!jf;")
	protected Class56 aClass56_41;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	public int anInt4405;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "[Lclient!j;")
	public Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean213 = arg1;
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)I")
	public int method3464() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(III)[[I")
	protected final int[][] method3465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass1_Sub3Array42[arg1].aBoolean213) {
			return this.aClass1_Sub3Array42[arg1].method3467(arg0);
		}
		@Pc(20) int[][] local20 = new int[3][];
		@Pc(28) int[] local28 = this.aClass1_Sub3Array42[arg1].method3475(arg0);
		local20[0] = local28;
		local20[2] = local28;
		local20[1] = local28;
		return local20;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!pg;)V")
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)[[I")
	public int[][] method3467(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZI)[I")
	protected final int[] method3468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub3Array42[arg1].aBoolean213 ? this.aClass1_Sub3Array42[arg1].method3475(arg0) : this.aClass1_Sub3Array42[arg1].method3467(arg0)[0];
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	public void method3470() {
		if (this.aBoolean213) {
			this.aClass79_41.method2349();
			this.aClass79_41 = null;
		} else {
			this.aClass56_41.method1554();
			this.aClass56_41 = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)I")
	public int method3471() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)V")
	public final void method3472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt4405 == 255 ? arg0 : this.anInt4405;
		if (this.aBoolean213) {
			this.aClass79_41 = new Class79(local12, arg0, arg1);
		} else {
			this.aClass56_41 = new Class56(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
	public void method3474() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I")
	public int[] method3475(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
