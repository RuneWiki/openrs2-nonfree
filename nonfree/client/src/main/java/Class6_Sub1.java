import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "Lclient!ck;")
	protected Class54 aClass54_41;

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "Lclient!hca;")
	protected Class135 aClass135_41;

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
	public int anInt10563;

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "[Lclient!uba;")
	public final Class6_Sub1[] aClass6_Sub1Array42;

	@OriginalMember(owner = "client!uba", name = "y", descriptor = "Z")
	public boolean aBoolean736;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass6_Sub1Array42 = new Class6_Sub1[arg0];
		this.aBoolean736 = arg1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
	public void method8952() {
		if (this.aBoolean736) {
			this.aClass135_41.method3059();
			this.aClass135_41 = null;
		} else {
			this.aClass54_41.method1385();
			this.aClass54_41 = null;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZ)[I")
	public int[] method8954(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZII)V")
	public void method8955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt10563 == 255 ? arg0 : this.anInt10563;
		if (this.aBoolean736) {
			this.aClass135_41 = new Class135(local12, arg0, arg1);
		} else {
			this.aClass54_41 = new Class54(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)I")
	public int method8956() {
		return -1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)[[I")
	public int[][] method8957(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass6_Sub1Array42[arg1].aBoolean736) {
			@Pc(25) int[] local25 = this.aClass6_Sub1Array42[arg1].method8954(arg0);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass6_Sub1Array42[arg1].method8957(arg0);
		}
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)I")
	public int method8961() {
		return -1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!gga;IB)V")
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIB)[I")
	protected final int[] method8963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass6_Sub1Array42[arg0].aBoolean736 ? this.aClass6_Sub1Array42[arg0].method8954(arg1) : this.aClass6_Sub1Array42[arg0].method8957(arg1)[0];
	}

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "(B)V")
	public void method8964() {
	}
}
