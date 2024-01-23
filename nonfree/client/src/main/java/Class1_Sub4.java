import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!jm;")
	protected Class85 aClass85_41;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Lclient!ag;")
	protected Class7 aClass7_41;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
	public int anInt5686;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "[Lclient!rf;")
	public Class1_Sub4[] aClass1_Sub4Array42;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Z")
	public boolean aBoolean383;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub4Array42 = new Class1_Sub4[arg0];
		this.aBoolean383 = arg1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)V")
	public final void method4743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt5686 == 255 ? arg0 : this.anInt5686;
		if (this.aBoolean383) {
			this.aClass7_41 = new Class7(local18, arg0, arg1);
		} else {
			this.aClass85_41 = new Class85(local18, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
	public int[] method4746(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!lf;I)V")
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IBI)[[I")
	protected final int[][] method4749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub4Array42[arg0].aBoolean383) {
			@Pc(25) int[] local25 = this.aClass1_Sub4Array42[arg0].method4746(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass1_Sub4Array42[arg0].method4756(arg1);
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(IBI)[I")
	protected final int[] method4750(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub4Array42[arg1].aBoolean383 ? this.aClass1_Sub4Array42[arg1].method4746(arg0) : this.aClass1_Sub4Array42[arg1].method4756(arg0)[0];
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	public void method4751() {
		if (this.aBoolean383) {
			this.aClass7_41.method115();
			this.aClass7_41 = null;
		} else {
			this.aClass85_41.method2340();
			this.aClass85_41 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)I")
	public int method4753() {
		return -1;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
	public int method4754() {
		return -1;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V")
	public void method4755() {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[[I")
	public int[][] method4756(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
