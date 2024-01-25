import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public final class Class15_Sub24 extends Class15 {

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub24(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.aClass3_Sub55_32.method8892()) {
			super.anInt11276 = 2;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 2) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		if (super.aClass3_Sub55_32.method8892()) {
			return 2;
		} else if (super.aClass3_Sub55_32.aClass15_Sub4_1.method1073() && Static514.method7351(super.aClass3_Sub55_32.aClass15_Sub4_1.method1071())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub55_32.method8892() ? 3 : 1;
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)Z")
	public boolean method8062() {
		return !super.aClass3_Sub55_32.method8892();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "(B)I")
	public int method8063() {
		return super.anInt11276;
	}
}
