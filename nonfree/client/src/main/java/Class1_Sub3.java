import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "Lclient!pu;")
	protected Class233 aClass233_41;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "Lclient!pe;")
	protected Class227 aClass227_41;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
	public int anInt9370;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "[Lclient!pv;")
	public final Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "Z")
	public boolean aBoolean652;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
		this.aBoolean652 = arg1;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!gw;II)V")
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZI)V")
	public void method7902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt9370 == 255 ? arg1 : this.anInt9370;
		if (this.aBoolean652) {
			this.aClass227_41 = new Class227(local18, arg1, arg0);
		} else {
			this.aClass233_41 = new Class233(local18, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I")
	public int method7903() {
		return -1;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I")
	public int method7905() {
		return -1;
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(II)[I")
	public int[] method7906(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
	public void method7908() {
		if (this.aBoolean652) {
			this.aClass227_41.method5676();
			this.aClass227_41 = null;
		} else {
			this.aClass233_41.method5785();
			this.aClass233_41 = null;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method7910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub3Array42[arg0].aBoolean652) {
			@Pc(24) int[] local24 = this.aClass1_Sub3Array42[arg0].method7906(arg1);
			return new int[][] { local24, local24, local24 };
		} else {
			return this.aClass1_Sub3Array42[arg0].method7913(arg1);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIB)[I")
	protected final int[] method7911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub3Array42[arg1].aBoolean652 ? this.aClass1_Sub3Array42[arg1].method7906(arg0) : this.aClass1_Sub3Array42[arg1].method7913(arg0)[0];
	}

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "(I)V")
	public void method7912() {
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IB)[[I")
	public int[][] method7913(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
