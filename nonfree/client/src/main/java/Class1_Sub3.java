import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	public int anInt8686;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "Lclient!ao;")
	protected Class12 aClass12_41;

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "Lclient!ou;")
	protected Class225 aClass225_41;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "[Lclient!ar;")
	public final Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "Z")
	public boolean aBoolean614;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
		this.aBoolean614 = arg1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BII)V")
	public void method7119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt8686 == 255 ? arg1 : this.anInt8686;
		if (this.aBoolean614) {
			this.aClass12_41 = new Class12(local12, arg1, arg0);
		} else {
			this.aClass225_41 = new Class225(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ge;I)V")
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	public void method7122() {
		if (this.aBoolean614) {
			this.aClass12_41.method507();
			this.aClass12_41 = null;
		} else {
			this.aClass225_41.method5320();
			this.aClass225_41 = null;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)[I")
	public int[] method7123(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)I")
	public int method7124() {
		return -1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)[[I")
	public int[][] method7125(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
	public void method7126() {
	}

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)I")
	public int method7127() {
		return -1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)[I")
	protected final int[] method7128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub3Array42[arg0].aBoolean614 ? this.aClass1_Sub3Array42[arg0].method7123(arg1) : this.aClass1_Sub3Array42[arg0].method7125(arg1)[0];
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method7130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub3Array42[arg1].aBoolean614) {
			@Pc(23) int[] local23 = this.aClass1_Sub3Array42[arg1].method7123(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass1_Sub3Array42[arg1].method7125(arg0);
		}
	}
}
