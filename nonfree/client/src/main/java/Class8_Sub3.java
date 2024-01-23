import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public abstract class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!ga;")
	protected Class59 aClass59_41;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!uj;")
	protected Class166 aClass166_41;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
	public int anInt5575;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Z")
	public boolean aBoolean469;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "[Lclient!ud;")
	public Class8_Sub3[] aClass8_Sub3Array42;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IZ)V")
	protected Class8_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean469 = arg1;
		this.aClass8_Sub3Array42 = new Class8_Sub3[arg0];
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[[I")
	public int[][] method4217(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public void method4219() {
		if (this.aBoolean469) {
			this.aClass59_41.method1364();
			this.aClass59_41 = null;
		} else {
			this.aClass166_41.method4038();
			this.aClass166_41 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public void method4220() {
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I")
	public int method4222() {
		return -1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!aj;)V")
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)[[I")
	protected final int[][] method4224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass8_Sub3Array42[arg1].aBoolean469) {
			@Pc(32) int[] local32 = this.aClass8_Sub3Array42[arg1].method4227(arg0);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass8_Sub3Array42[arg1].method4217(arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V")
	public final void method4225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt5575 == 255 ? arg1 : this.anInt5575;
		if (this.aBoolean469) {
			this.aClass59_41 = new Class59(local22, arg1, arg0);
		} else {
			this.aClass166_41 = new Class166(local22, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)I")
	public int method4226() {
		return -1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)[I")
	public int[] method4227(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)[I")
	protected final int[] method4230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass8_Sub3Array42[arg1].aBoolean469 ? this.aClass8_Sub3Array42[arg1].method4227(arg0) : this.aClass8_Sub3Array42[arg1].method4217(arg0)[0];
	}
}
