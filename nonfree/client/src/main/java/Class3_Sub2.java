import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "Lclient!eb;")
	protected Class84 aClass84_41;

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Lclient!ri;")
	protected Class296 aClass296_41;

	@OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
	public int anInt10284;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "[Lclient!gs;")
	public final Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "Z")
	public boolean aBoolean778;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub2Array42 = new Class3_Sub2[arg0];
		this.aBoolean778 = arg1;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)I")
	public int method8662() {
		return -1;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!dc;II)V")
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
	public int[] method8664(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[[I")
	public int[][] method8665(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public void method8666() {
		if (this.aBoolean778) {
			this.aClass84_41.method2127();
			this.aClass84_41 = null;
		} else {
			this.aClass296_41.method7237();
			this.aClass296_41 = null;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)I")
	public int method8668() {
		return -1;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)[I")
	protected final int[] method8669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub2Array42[arg1].aBoolean778 ? this.aClass3_Sub2Array42[arg1].method8664(arg0) : this.aClass3_Sub2Array42[arg1].method8665(arg0)[0];
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIB)V")
	public void method8670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt10284 == 255 ? arg0 : this.anInt10284;
		if (this.aBoolean778) {
			this.aClass84_41 = new Class84(local20, arg0, arg1);
		} else {
			this.aClass296_41 = new Class296(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array42[arg0].aBoolean778) {
			@Pc(33) int[] local33 = this.aClass3_Sub2Array42[arg0].method8664(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass3_Sub2Array42[arg0].method8665(arg1);
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public void method8673() {
	}
}
