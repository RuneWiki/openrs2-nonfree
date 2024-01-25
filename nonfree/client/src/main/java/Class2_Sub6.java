import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!eia", name = "k", descriptor = "Lclient!wq;")
	protected Class377 aClass377_41;

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
	public int anInt10160;

	@OriginalMember(owner = "client!eia", name = "x", descriptor = "Lclient!cga;")
	protected Class52 aClass52_41;

	@OriginalMember(owner = "client!eia", name = "r", descriptor = "Z")
	public boolean aBoolean743;

	@OriginalMember(owner = "client!eia", name = "B", descriptor = "[Lclient!eia;")
	public final Class2_Sub6[] aClass2_Sub6Array42;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean743 = arg1;
		this.aClass2_Sub6Array42 = new Class2_Sub6[arg0];
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)V")
	public void method8460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt10160 == 255 ? arg0 : this.anInt10160;
		if (this.aBoolean743) {
			this.aClass377_41 = new Class377(local14, arg0, arg1);
		} else {
			this.aClass52_41 = new Class52(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IBI)[I")
	protected final int[] method8461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub6Array42[arg0].aBoolean743 ? this.aClass2_Sub6Array42[arg0].method8469(arg1) : this.aClass2_Sub6Array42[arg0].method8470(arg1)[0];
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)V")
	public void method8462() {
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(B)I")
	public int method8463() {
		return -1;
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub6Array42[arg0].aBoolean743) {
			@Pc(21) int[] local21 = this.aClass2_Sub6Array42[arg0].method8469(arg1);
			return new int[][] { local21, local21, local21 };
		} else {
			return this.aClass2_Sub6Array42[arg0].method8470(arg1);
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IZLclient!vj;)V")
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)[I")
	public int[] method8469(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(II)[[I")
	public int[][] method8470(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z)V")
	public void method8471() {
		if (this.aBoolean743) {
			this.aClass377_41.method8585();
			this.aClass377_41 = null;
		} else {
			this.aClass52_41.method961();
			this.aClass52_41 = null;
		}
	}

	@OriginalMember(owner = "client!eia", name = "f", descriptor = "(I)I")
	public int method8472() {
		return -1;
	}
}
