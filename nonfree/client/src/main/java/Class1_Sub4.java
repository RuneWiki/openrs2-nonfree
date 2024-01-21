import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!jg;")
	protected Class35 aClass35_38;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	public int anInt4757;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public int anInt4761;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "Lclient!lc;")
	protected Class39 aClass39_38;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "[Lclient!fe;")
	public final Class1_Sub4[] aClass1_Sub4Array39;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Z")
	public boolean aBoolean210;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub4Array39 = new Class1_Sub4[arg0];
		this.aBoolean210 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!hc;IZ)V")
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public final void method3206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt4757 == 255 ? arg0 : this.anInt4757;
		if (this.aBoolean210) {
			this.aClass39_38 = new Class39(local12, arg0, arg1);
		} else {
			this.aClass35_38 = new Class35(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	public void method3207() {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public final void method3210() {
		if (this.aBoolean210) {
			this.aClass39_38.method1888();
			this.aClass39_38 = null;
		} else {
			this.aClass35_38.method1572();
			this.aClass35_38 = null;
		}
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)I")
	public int method3212() {
		return -1;
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)I")
	public int method3213() {
		return -1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)[[I")
	public int[][] method3214(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)[I")
	protected final int[] method3215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub4Array39[arg1].aBoolean210 ? this.aClass1_Sub4Array39[arg1].method3216(arg0) : this.aClass1_Sub4Array39[arg1].method3214(arg0)[0];
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
	public int[] method3216(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub4Array39[arg0].aBoolean210) {
			@Pc(22) int[] local22 = this.aClass1_Sub4Array39[arg0].method3216(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass1_Sub4Array39[arg0].method3214(arg1);
		}
	}
}
