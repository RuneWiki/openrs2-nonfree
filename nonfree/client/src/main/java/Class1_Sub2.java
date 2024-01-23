import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public int anInt5822;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!gl;")
	protected Class65 aClass65_41;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "Lclient!rf;")
	protected Class151 aClass151_41;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "[Lclient!qb;")
	public Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Z")
	public boolean aBoolean424;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub2Array42 = new Class1_Sub2[arg0];
		this.aBoolean424 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)[I")
	protected final int[] method4570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub2Array42[arg1].aBoolean424 ? this.aClass1_Sub2Array42[arg1].method4577(arg0) : this.aClass1_Sub2Array42[arg1].method4572(arg0)[0];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[[I")
	public int[][] method4572(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)[[I")
	protected final int[][] method4575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass1_Sub2Array42[arg0].aBoolean424) {
			return this.aClass1_Sub2Array42[arg0].method4572(arg1);
		}
		@Pc(28) int[][] local28 = new int[3][];
		@Pc(36) int[] local36 = this.aClass1_Sub2Array42[arg0].method4577(arg1);
		local28[1] = local36;
		local28[2] = local36;
		local28[0] = local36;
		return local28;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)I")
	public int method4576() {
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)[I")
	public int[] method4577(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public void method4578() {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V")
	public final void method4579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt5822 == 255 ? arg1 : this.anInt5822;
		if (this.aBoolean424) {
			this.aClass65_41 = new Class65(local8, arg1, arg0);
		} else {
			this.aClass151_41 = new Class151(local8, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public void method4580() {
		if (this.aBoolean424) {
			this.aClass65_41.method1364();
			this.aClass65_41 = null;
		} else {
			this.aClass151_41.method3753();
			this.aClass151_41 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)I")
	public int method4581() {
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!sb;I)V")
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
	}
}
