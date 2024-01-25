import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public abstract class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	public int anInt7106;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!ms;")
	protected Class153 aClass153_41;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!gi;")
	protected Class82 aClass82_41;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "Z")
	public boolean aBoolean665;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[Lclient!oc;")
	public final Class4_Sub6[] aClass4_Sub6Array42;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean665 = arg1;
		this.aClass4_Sub6Array42 = new Class4_Sub6[arg0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)[I")
	protected final int[] method5508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass4_Sub6Array42[arg1].aBoolean665 ? this.aClass4_Sub6Array42[arg1].method5510(arg0) : this.aClass4_Sub6Array42[arg1].method5514(arg0)[0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public void method5509() {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
	public int[] method5510(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public int method5511() {
		return -1;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)I")
	public int method5512() {
		return -1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
	public void method5513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt7106 == 255 ? arg0 : this.anInt7106;
		if (this.aBoolean665) {
			this.aClass82_41 = new Class82(local20, arg0, arg1);
		} else {
			this.aClass153_41 = new Class153(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)[[I")
	public int[][] method5514(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub6Array42[arg0].aBoolean665) {
			@Pc(30) int[] local30 = this.aClass4_Sub6Array42[arg0].method5510(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass4_Sub6Array42[arg0].method5514(arg1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
	public void method5517() {
		if (this.aBoolean665) {
			this.aClass82_41.method2259();
			this.aClass82_41 = null;
		} else {
			this.aClass153_41.method3683();
			this.aClass153_41 = null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!iv;)V")
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
	}
}
