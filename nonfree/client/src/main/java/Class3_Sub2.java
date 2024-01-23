import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "Lclient!tc;")
	protected Class168 aClass168_41;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Lclient!rf;")
	protected Class150 aClass150_41;

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
	public int anInt6064;

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "Z")
	public boolean aBoolean430;

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "[Lclient!ck;")
	public Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean430 = arg1;
		this.aClass3_Sub2Array42 = new Class3_Sub2[arg0];
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
	public void method4952() {
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)[I")
	protected final int[] method4954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub2Array42[arg1].aBoolean430 ? this.aClass3_Sub2Array42[arg1].method4961(arg0) : this.aClass3_Sub2Array42[arg1].method4955(arg0)[0];
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)[[I")
	public int[][] method4955(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)I")
	public int method4957() {
		return -1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZLclient!ug;)V")
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)I")
	public int method4960() {
		return -1;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I")
	public int[] method4961(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	public void method4962() {
		if (this.aBoolean430) {
			this.aClass168_41.method4368();
			this.aClass168_41 = null;
		} else {
			this.aClass150_41.method3998();
			this.aClass150_41 = null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)V")
	public final void method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt6064 == 255 ? arg0 : this.anInt6064;
		if (this.aBoolean430) {
			this.aClass168_41 = new Class168(local14, arg0, arg1);
		} else {
			this.aClass150_41 = new Class150(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(III)[[I")
	protected final int[][] method4965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array42[arg1].aBoolean430) {
			@Pc(23) int[] local23 = this.aClass3_Sub2Array42[arg1].method4961(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass3_Sub2Array42[arg1].method4955(arg0);
		}
	}
}
