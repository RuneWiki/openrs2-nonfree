import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "Lclient!md;")
	protected Class116 aClass116_41;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!da;")
	protected Class35 aClass35_41;

	@OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
	public int anInt5836;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "[Lclient!jo;")
	public Class4_Sub1[] aClass4_Sub1Array42;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean398 = arg1;
		this.aClass4_Sub1Array42 = new Class4_Sub1[arg0];
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aClass4_Sub1Array42[arg0].aBoolean398) {
			return this.aClass4_Sub1Array42[arg0].method4732(arg1);
		}
		@Pc(27) int[][] local27 = new int[3][];
		@Pc(35) int[] local35 = this.aClass4_Sub1Array42[arg0].method4731(arg1);
		local27[0] = local35;
		local27[2] = local35;
		local27[1] = local35;
		return local27;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!fd;I)V")
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I")
	public int method4725() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)I")
	public int method4728() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I")
	public int[] method4731(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I")
	public int[][] method4732(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	public void method4733() {
		if (this.aBoolean398) {
			this.aClass35_41.method733();
			this.aClass35_41 = null;
		} else {
			this.aClass116_41.method2706();
			this.aClass116_41 = null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public final void method4734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt5836 == 255 ? arg0 : this.anInt5836;
		if (this.aBoolean398) {
			this.aClass35_41 = new Class35(local12, arg0, arg1);
		} else {
			this.aClass116_41 = new Class116(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)[I")
	protected final int[] method4736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub1Array42[arg1].aBoolean398 ? this.aClass4_Sub1Array42[arg1].method4731(arg0) : this.aClass4_Sub1Array42[arg1].method4732(arg0)[0];
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)V")
	public void method4737() {
	}
}
