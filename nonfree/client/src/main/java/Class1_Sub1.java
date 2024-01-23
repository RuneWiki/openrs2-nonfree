import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!ca;")
	protected Class17 aClass17_41;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
	public int anInt4768;

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "Lclient!ne;")
	protected Class75 aClass75_41;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[Lclient!mg;")
	public Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
		this.aBoolean213 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
	public void method3727() {
		if (this.aBoolean213) {
			this.aClass17_41.method477();
			this.aClass17_41 = null;
		} else {
			this.aClass75_41.method2417();
			this.aClass75_41 = null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)[I")
	public int[] method3729(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)V")
	public final void method3731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt4768 == 255 ? arg1 : this.anInt4768;
		if (this.aBoolean213) {
			this.aClass17_41 = new Class17(local8, arg1, arg0);
		} else {
			this.aClass75_41 = new Class75(local8, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIB)[I")
	protected final int[] method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean213 ? this.aClass1_Sub1Array42[arg1].method3729(arg0) : this.aClass1_Sub1Array42[arg1].method3735(arg0)[0];
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)I")
	public int method3734() {
		return -1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[[I")
	public int[][] method3735(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)I")
	public int method3736() {
		return -1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method3737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass1_Sub1Array42[arg0].aBoolean213) {
			return this.aClass1_Sub1Array42[arg0].method3735(arg1);
		}
		@Pc(17) int[][] local17 = new int[3][];
		@Pc(25) int[] local25 = this.aClass1_Sub1Array42[arg0].method3729(arg1);
		local17[0] = local25;
		local17[2] = local25;
		local17[1] = local25;
		return local17;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!k;BI)V")
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	public void method3739() {
	}
}
