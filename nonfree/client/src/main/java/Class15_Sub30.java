import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class15_Sub30 extends Class15 {

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub30(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.aClass3_Sub55_32.method8892()) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 < 0 && super.anInt11276 > 2) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 1;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z")
	public boolean method9424() {
		return !super.aClass3_Sub55_32.method8892();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub55_32.method8892()) {
			return 3;
		} else if (arg0 == 0 || super.aClass3_Sub55_32.aClass15_Sub16_1.method6384() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)I")
	public int method9427() {
		return super.anInt11276;
	}
}
