import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class15_Sub8 extends Class15 {

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub8(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)I")
	public int method2888() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.anInt11276 < 0 && super.anInt11276 > 127) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 127;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}
}
