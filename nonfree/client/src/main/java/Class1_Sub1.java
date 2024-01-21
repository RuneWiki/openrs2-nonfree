import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!hj;")
	protected Class43 aClass43_41;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
	public int anInt4474;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "Lclient!oi;")
	protected Class75 aClass75_41;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
	public boolean aBoolean241;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "[Lclient!tg;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean241 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	public void method3388() {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ka;BI)V")
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public void method3391() {
		if (this.aBoolean241) {
			this.aClass43_41.method1183();
			this.aClass43_41 = null;
		} else {
			this.aClass75_41.method2100();
			this.aClass75_41 = null;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBI)[I")
	protected final int[] method3393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean241 ? this.aClass1_Sub1Array42[arg1].method3394(arg0) : this.aClass1_Sub1Array42[arg1].method3398(arg0)[0];
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
	public int[] method3394(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
	public int method3395() {
		return -1;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)I")
	public int method3396() {
		return -1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)[[I")
	protected final int[][] method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub1Array42[arg0].aBoolean241) {
			@Pc(34) int[] local34 = this.aClass1_Sub1Array42[arg0].method3394(arg1);
			return new int[][] { local34, local34, local34 };
		} else {
			return this.aClass1_Sub1Array42[arg0].method3398(arg1);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)[[I")
	public int[][] method3398(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)V")
	public final void method3399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt4474 == 255 ? arg1 : this.anInt4474;
		if (this.aBoolean241) {
			this.aClass43_41 = new Class43(local16, arg1, arg0);
		} else {
			this.aClass75_41 = new Class75(local16, arg1, arg0);
		}
	}
}
