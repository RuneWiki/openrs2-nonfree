import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!c", name = "x", descriptor = "I")
	public int anInt4630;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Lclient!va;")
	protected Class99 aClass99_41;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!oh;")
	protected Class73 aClass73_41;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "Z")
	public boolean aBoolean286;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "[Lclient!c;")
	public Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean286 = arg1;
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
	public int[] method3201(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZI)[I")
	protected final int[] method3203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean286 ? this.aClass2_Sub1Array42[arg1].method3201(arg0) : this.aClass2_Sub1Array42[arg1].method3211(arg0)[0];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ea;II)V")
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method3205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array42[arg0].aBoolean286) {
			@Pc(25) int[] local25 = this.aClass2_Sub1Array42[arg0].method3201(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass2_Sub1Array42[arg0].method3211(arg1);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public void method3207() {
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
	public int method3208() {
		return -1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)[[I")
	public int[][] method3211(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public void method3212() {
		if (this.aBoolean286) {
			this.aClass73_41.method2252();
			this.aClass73_41 = null;
		} else {
			this.aClass99_41.method3144();
			this.aClass99_41 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
	public final void method3213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4630 == 255 ? arg1 : this.anInt4630;
		if (this.aBoolean286) {
			this.aClass73_41 = new Class73(local18, arg1, arg0);
		} else {
			this.aClass99_41 = new Class99(local18, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
	public int method3214() {
		return -1;
	}
}
