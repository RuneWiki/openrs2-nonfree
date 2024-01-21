import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!ia;")
	protected Class39 aClass39_41;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "I")
	public int anInt4114;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "I")
	public int anInt4117;

	@OriginalMember(owner = "client!je", name = "G", descriptor = "Lclient!oc;")
	protected Class64 aClass64_41;

	@OriginalMember(owner = "client!je", name = "E", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!je", name = "N", descriptor = "[Lclient!je;")
	public final Class4_Sub3[] aClass4_Sub3Array42;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean170 = arg1;
		this.aClass4_Sub3Array42 = new Class4_Sub3[arg0];
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V")
	public void method3148() {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)[I")
	protected final int[] method3149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub3Array42[arg1].aBoolean170 ? this.aClass4_Sub3Array42[arg1].method3161(arg0) : this.aClass4_Sub3Array42[arg1].method3158(arg0)[0];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)[[I")
	protected final int[][] method3150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub3Array42[arg0].aBoolean170) {
			@Pc(23) int[] local23 = this.aClass4_Sub3Array42[arg0].method3161(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass4_Sub3Array42[arg0].method3158(arg1);
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
	public final void method3151() {
		if (this.aBoolean170) {
			this.aClass64_41.method2209();
			this.aClass64_41 = null;
		} else {
			this.aClass39_41.method1505();
			this.aClass39_41 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
	public int method3152() {
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public final void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt4114 == 255 ? arg0 : this.anInt4114;
		if (this.aBoolean170) {
			this.aClass64_41 = new Class64(local8, arg0, arg1);
		} else {
			this.aClass39_41 = new Class39(local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!h;I)V")
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[[I")
	public int[][] method3158(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(B)I")
	public int method3159() {
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I")
	public int[] method3161(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
