import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
	public int anInt6584;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Lclient!ob;")
	protected Class166 aClass166_41;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "Lclient!si;")
	protected Class208 aClass208_41;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "[Lclient!cl;")
	public final Class2_Sub6[] aClass2_Sub6Array42;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "Z")
	public boolean aBoolean491;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub6Array42 = new Class2_Sub6[arg0];
		this.aBoolean491 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public void method5633() {
		if (this.aBoolean491) {
			this.aClass166_41.method3992();
			this.aClass166_41 = null;
		} else {
			this.aClass208_41.method4984();
			this.aClass208_41 = null;
		}
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)I")
	public int method5634() {
		return -1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)[I")
	protected final int[] method5635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub6Array42[arg1].aBoolean491 ? this.aClass2_Sub6Array42[arg1].method5642(arg0) : this.aClass2_Sub6Array42[arg1].method5641(arg0)[0];
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V")
	public void method5636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt6584 == 255 ? arg1 : this.anInt6584;
		if (this.aBoolean491) {
			this.aClass166_41 = new Class166(local12, arg1, arg0);
		} else {
			this.aClass208_41 = new Class208(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!lk;II)V")
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)I")
	public int method5638() {
		return -1;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	public void method5639() {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass2_Sub6Array42[arg0].aBoolean491) {
			@Pc(23) int[] local23 = this.aClass2_Sub6Array42[arg0].method5642(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass2_Sub6Array42[arg0].method5641(arg1);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)[[I")
	public int[][] method5641(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[I")
	public int[] method5642(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
