import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public int anInt10522;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Lclient!hca;")
	protected Class135 aClass135_41;

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "Lclient!cw;")
	protected Class64 aClass64_41;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "Z")
	public boolean aBoolean713;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "[Lclient!ai;")
	public final Class4_Sub2[] aClass4_Sub2Array42;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean713 = arg1;
		this.aClass4_Sub2Array42 = new Class4_Sub2[arg0];
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[[I")
	public int[][] method8201(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)[[I")
	protected final int[][] method8202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub2Array42[arg1].aBoolean713) {
			@Pc(25) int[] local25 = this.aClass4_Sub2Array42[arg1].method8203(arg0);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass4_Sub2Array42[arg1].method8201(arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)[I")
	public int[] method8203(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)I")
	public int method8205() {
		return -1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ek;IB)V")
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
	public int method8207() {
		return -1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)[I")
	protected final int[] method8208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub2Array42[arg0].aBoolean713 ? this.aClass4_Sub2Array42[arg0].method8203(arg1) : this.aClass4_Sub2Array42[arg0].method8201(arg1)[0];
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public void method8209() {
		if (this.aBoolean713) {
			this.aClass135_41.method3006();
			this.aClass135_41 = null;
		} else {
			this.aClass64_41.method1616();
			this.aClass64_41 = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	public void method8210() {
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V")
	public void method8211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = this.anInt10522 == 255 ? arg1 : this.anInt10522;
		if (this.aBoolean713) {
			this.aClass135_41 = new Class135(local21, arg1, arg0);
		} else {
			this.aClass64_41 = new Class64(local21, arg1, arg0);
		}
	}
}
