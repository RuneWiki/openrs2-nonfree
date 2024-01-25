import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Lclient!waa;")
	protected Class370 aClass370_41;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
	public int anInt10385;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "Lclient!nr;")
	protected Class246 aClass246_41;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "[Lclient!gl;")
	public final Class5_Sub2[] aClass5_Sub2Array42;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "Z")
	public boolean aBoolean834;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass5_Sub2Array42 = new Class5_Sub2[arg0];
		this.aBoolean834 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method8819() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)[I")
	public int[] method8820(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BII)[I")
	protected final int[] method8821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass5_Sub2Array42[arg1].aBoolean834 ? this.aClass5_Sub2Array42[arg1].method8820(arg0) : this.aClass5_Sub2Array42[arg1].method8827(arg0)[0];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)[[I")
	protected final int[][] method8823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass5_Sub2Array42[arg1].aBoolean834) {
			@Pc(31) int[] local31 = this.aClass5_Sub2Array42[arg1].method8820(arg0);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass5_Sub2Array42[arg1].method8827(arg0);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)V")
	public void method8824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10385 == 255 ? arg1 : this.anInt10385;
		if (this.aBoolean834) {
			this.aClass246_41 = new Class246(local14, arg1, arg0);
		} else {
			this.aClass370_41 = new Class370(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ee;BI)V")
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IZ)[[I")
	public int[][] method8827(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
	public int method8828() {
		return -1;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Z)V")
	public void method8829() {
		if (this.aBoolean834) {
			this.aClass246_41.method5951();
			this.aClass246_41 = null;
		} else {
			this.aClass370_41.method8549();
			this.aClass370_41 = null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I")
	public int method8830() {
		return -1;
	}
}
