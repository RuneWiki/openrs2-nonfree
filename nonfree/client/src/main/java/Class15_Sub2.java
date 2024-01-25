import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub2(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Z")
	public boolean method851() {
		return Static537.method7558(super.anInt11276);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		if (Static537.method7558(arg0)) {
			if (super.aClass3_Sub55_32.aClass15_Sub4_1.method1073() && !Static345.method5032(super.aClass3_Sub55_32.aClass15_Sub4_1.method1071())) {
				return 3;
			}
			if (super.aClass3_Sub55_32.aClass15_Sub23_2.method7900() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static537.method7558(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Z")
	public boolean method853() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (this.method851()) {
			if (super.aClass3_Sub55_32.aClass15_Sub4_1.method1073() && !Static345.method5032(super.aClass3_Sub55_32.aClass15_Sub4_1.method1071())) {
				super.anInt11276 = 1;
			}
			if (super.aClass3_Sub55_32.aClass15_Sub23_2.method7900() == 1) {
				super.anInt11276 = 1;
			}
		}
		if (super.anInt11276 == 3) {
			super.anInt11276 = 2;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 3) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)I")
	public int method857() {
		return super.anInt11276;
	}
}
