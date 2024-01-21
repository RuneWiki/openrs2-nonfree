import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "Lclient!nf;")
	protected Class67 aClass67_41;

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "Lclient!aa;")
	protected Class2 aClass2_41;

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "Z")
	public boolean aBoolean190;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "[Lclient!eg;")
	public final Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean190 = arg1;
		this.aClass3_Sub2Array42 = new Class3_Sub2[arg0];
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[[I")
	public int[][] method3326(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BII)[I")
	protected final int[] method3328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub2Array42[arg0].aBoolean190 ? this.aClass3_Sub2Array42[arg0].method3334(arg1) : this.aClass3_Sub2Array42[arg0].method3326(arg1)[0];
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	public void method3329() {
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V")
	public void method3331() {
		if (this.aBoolean190) {
			this.aClass2_41.method7();
			this.aClass2_41 = null;
		} else {
			this.aClass67_41.method1944();
			this.aClass67_41 = null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)[[I")
	protected final int[][] method3332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array42[arg0].aBoolean190) {
			@Pc(22) int[] local22 = this.aClass3_Sub2Array42[arg0].method3334(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass3_Sub2Array42[arg0].method3326(arg1);
		}
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)I")
	public int method3333() {
		return -1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
	public int[] method3334(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
	public final void method3335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = this.anInt4272 == 255 ? arg0 : this.anInt4272;
		if (this.aBoolean190) {
			this.aClass2_41 = new Class2(local19, arg0, arg1);
		} else {
			this.aClass67_41 = new Class67(local19, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(B)I")
	public int method3336() {
		return -1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ce;II)V")
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
	}
}
