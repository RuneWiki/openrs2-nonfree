import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class15_Sub18 extends Class15 {

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub18(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub55_32.method8892()) {
			return 3;
		} else if (super.aClass3_Sub55_32.aClass15_Sub26_1.method8908() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(B)I")
	public int method6987() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 2;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.aClass3_Sub55_32.method8892()) {
			super.anInt11276 = 0;
		}
		if (super.aClass3_Sub55_32.aClass15_Sub26_1.method8908() == 0) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 2) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)Z")
	public boolean method6990() {
		if (super.aClass3_Sub55_32.method8892()) {
			return false;
		} else {
			return super.aClass3_Sub55_32.aClass15_Sub26_1.method8908() != 0;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}
}
