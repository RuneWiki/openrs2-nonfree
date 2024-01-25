import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class15_Sub11 extends Class15 {

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub11(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return arg0 == 0 || super.aClass3_Sub55_32.aClass15_Sub16_1.method6384() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)I")
	public int method4066() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Z")
	public boolean method4070() {
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.anInt11276 != 0 && super.aClass3_Sub55_32.aClass15_Sub16_1.method6384() != 1) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 1) {
			super.anInt11276 = this.method9419();
		}
	}
}
