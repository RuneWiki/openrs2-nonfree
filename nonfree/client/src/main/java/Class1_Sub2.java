import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!ug;")
	protected Class102 aClass102_41;

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "Lclient!oh;")
	protected Class74 aClass74_41;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	public int anInt4714;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "[Lclient!pc;")
	public Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Z")
	public boolean aBoolean265;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub2Array42 = new Class1_Sub2[arg0];
		this.aBoolean265 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)[[I")
	protected final int[][] method3501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass1_Sub2Array42[arg1].aBoolean265) {
			return this.aClass1_Sub2Array42[arg1].method3512(arg0);
		}
		@Pc(17) int[][] local17 = new int[3][];
		@Pc(25) int[] local25 = this.aClass1_Sub2Array42[arg1].method3505(arg0);
		local17[0] = local25;
		local17[2] = local25;
		local17[1] = local25;
		return local17;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public void method3503() {
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I")
	public int method3504() {
		return -1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)[I")
	public int[] method3505(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)V")
	public final void method3508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4714 == 255 ? arg1 : this.anInt4714;
		if (this.aBoolean265) {
			this.aClass102_41 = new Class102(local12, arg1, arg0);
		} else {
			this.aClass74_41 = new Class74(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	public void method3509() {
		if (this.aBoolean265) {
			this.aClass102_41.method3132();
			this.aClass102_41 = null;
		} else {
			this.aClass74_41.method2452();
			this.aClass74_41 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)I")
	public int method3510() {
		return -1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I")
	public int[][] method3512(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!nc;ZI)V")
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)[I")
	protected final int[] method3514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub2Array42[arg1].aBoolean265 ? this.aClass1_Sub2Array42[arg1].method3505(arg0) : this.aClass1_Sub2Array42[arg1].method3512(arg0)[0];
	}
}
