import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!gh;")
	protected Class28 aClass28_39;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Lclient!kb;")
	protected Class46 aClass46_39;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
	public int anInt3955;

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
	public int anInt3960;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "[Lclient!gd;")
	public final Class3_Sub2[] aClass3_Sub2Array40;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub2Array40 = new Class3_Sub2[arg0];
		this.aBoolean271 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)[[I")
	protected final int[][] method2785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_Sub2Array40[arg1].aBoolean271) {
			@Pc(22) int[] local22 = this.aClass3_Sub2Array40[arg1].method2797(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass3_Sub2Array40[arg1].method2796(arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public void method2786() {
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)[I")
	protected final int[] method2787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub2Array40[arg1].aBoolean271 ? this.aClass3_Sub2Array40[arg1].method2797(arg0) : this.aClass3_Sub2Array40[arg1].method2796(arg0)[0];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ff;BI)V")
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
	public int method2790() {
		return -1;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)V")
	public final void method2792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt3955 == 255 ? arg0 : this.anInt3955;
		if (this.aBoolean271) {
			this.aClass46_39 = new Class46(local20, arg0, arg1);
		} else {
			this.aClass28_39 = new Class28(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
	public int method2794() {
		return -1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public final void method2795() {
		if (this.aBoolean271) {
			this.aClass46_39.method1412();
			this.aClass46_39 = null;
		} else {
			this.aClass28_39.method999();
			this.aClass28_39 = null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)[[I")
	public int[][] method2796(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)[I")
	public int[] method2797(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
