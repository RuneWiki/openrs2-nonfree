import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class14_Sub7 extends Class14 {

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Z")
	public boolean aBoolean249 = false;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Z")
	private boolean aBoolean248 = true;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub7(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (!super.aClass3_Sub41_31.method6699().method8232()) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 5) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V")
	public void method2898(@OriginalArg(1) boolean arg0) {
		this.aBoolean248 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)I")
	public int method2899() {
		return super.anInt10805;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6699().method8232()) {
			return arg0 == 3 && !Static514.method6715("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		this.aBoolean249 = true;
		return super.aClass3_Sub41_31.method6699().method8232() ? 2 : 0;
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)Z")
	public boolean method2902() {
		return this.aBoolean248;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
		this.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Z")
	public boolean method2903() {
		return super.aClass3_Sub41_31.method6699().method8232();
	}
}
