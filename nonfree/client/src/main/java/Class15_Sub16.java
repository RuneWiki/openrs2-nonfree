import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class15_Sub16 extends Class15 {

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub16(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 1;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)I")
	public int method6384() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Z")
	public boolean method6385() {
		if (super.aClass3_Sub55_32.method8892()) {
			return false;
		} else {
			return super.aClass3_Sub55_32.method8894() == Static615.aClass169_7;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub55_32.method8892()) {
			return 3;
		} else if (super.aClass3_Sub55_32.method8894() == Static615.aClass169_7) {
			if (arg0 == 0) {
				if (super.aClass3_Sub55_32.aClass15_Sub11_1.method4066() == 1) {
					return 2;
				}
				if (super.aClass3_Sub55_32.aClass15_Sub26_1.method8908() == 1) {
					return 2;
				}
				if (super.aClass3_Sub55_32.aClass15_Sub30_1.method9427() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.aClass3_Sub55_32.method8894() != Static615.aClass169_7) {
			super.anInt11276 = 1;
		} else if (super.aClass3_Sub55_32.method8892()) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 != 0 && super.anInt11276 != 1) {
			super.anInt11276 = this.method9419();
		}
	}
}
