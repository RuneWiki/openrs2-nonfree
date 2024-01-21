import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	public int anInt4541;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	public int anInt4547;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "Lclient!ab;")
	protected Class3 aClass3_39;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "Lclient!ce;")
	protected Class11 aClass11_39;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "[Lclient!h;")
	public final Class2_Sub1[] aClass2_Sub1Array40;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean183 = arg1;
		this.aClass2_Sub1Array40 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)I")
	public int method2979() {
		return -1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)[I")
	protected final int[] method2980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub1Array40[arg0].aBoolean183 ? this.aClass2_Sub1Array40[arg0].method2986(arg1) : this.aClass2_Sub1Array40[arg0].method2982(arg1)[0];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[[I")
	public int[][] method2982(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public final void method2983() {
		if (this.aBoolean183) {
			this.aClass3_39.method69();
			this.aClass3_39 = null;
		} else {
			this.aClass11_39.method512();
			this.aClass11_39 = null;
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)I")
	public int method2984() {
		return -1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[I")
	public int[] method2986(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!oa;I)V")
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method2991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array40[arg1].aBoolean183) {
			@Pc(39) int[] local39 = this.aClass2_Sub1Array40[arg1].method2986(arg0);
			return new int[][] { local39, local39, local39 };
		} else {
			return this.aClass2_Sub1Array40[arg1].method2982(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	public void method2992() {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(III)V")
	public final void method2993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4547 == 255 ? arg1 : this.anInt4547;
		if (this.aBoolean183) {
			this.aClass3_39 = new Class3(local12, arg1, arg0);
		} else {
			this.aClass11_39 = new Class11(local12, arg1, arg0);
		}
	}
}
