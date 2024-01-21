import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!pe;")
	protected Class66 aClass66_39;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public int anInt4154;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public int anInt4155;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "Lclient!uc;")
	protected Class81 aClass81_39;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "Z")
	public boolean aBoolean175;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "[Lclient!pf;")
	public final Class2_Sub1[] aClass2_Sub1Array40;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean175 = arg1;
		this.aClass2_Sub1Array40 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)I")
	public int method2788() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public void method2789() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
	public int[][] method2792(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZI)V")
	public final void method2793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt4155 == 255 ? arg0 : this.anInt4155;
		if (this.aBoolean175) {
			this.aClass81_39 = new Class81(local17, arg0, arg1);
		} else {
			this.aClass66_39 = new Class66(local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[[I")
	protected final int[][] method2794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass2_Sub1Array40[arg0].aBoolean175) {
			return this.aClass2_Sub1Array40[arg0].method2792(arg1);
		}
		@Pc(25) int[][] local25 = new int[3][];
		@Pc(33) int[] local33 = this.aClass2_Sub1Array40[arg0].method2801(arg1);
		local25[1] = local33;
		local25[0] = local33;
		local25[2] = local33;
		return local25;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)[I")
	protected final int[] method2796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub1Array40[arg0].aBoolean175 ? this.aClass2_Sub1Array40[arg0].method2801(arg1) : this.aClass2_Sub1Array40[arg0].method2792(arg1)[0];
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	public final void method2798() {
		if (this.aBoolean175) {
			this.aClass81_39.method2608();
			this.aClass81_39 = null;
		} else {
			this.aClass66_39.method1970();
			this.aClass66_39 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!me;IB)V")
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
	public int method2800() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)[I")
	public int[] method2801(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
