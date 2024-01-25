import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public final class Class15_Sub29 extends Class15 {

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub29(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 1;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub55_32.method8892()) {
			return 3;
		} else if (super.aClass3_Sub55_32.method8894() == Static615.aClass169_7) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
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

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "(B)I")
	public int method9292() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)Z")
	public boolean method9294() {
		if (super.aClass3_Sub55_32.method8892()) {
			return false;
		} else {
			return super.aClass3_Sub55_32.method8894() == Static615.aClass169_7;
		}
	}
}
