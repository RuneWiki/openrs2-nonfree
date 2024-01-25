import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public final class Class15_Sub20 extends Class15 {

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub20(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.aClass3_Sub55_32.aClass15_Sub4_1.method1073() && !Static352.method5097(super.aClass3_Sub55_32.aClass15_Sub4_1.method1071())) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 2) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return Static352.method5097(super.aClass3_Sub55_32.aClass15_Sub4_1.method1071()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 0;
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(B)I")
	public int method7387() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)Z")
	public boolean method7388() {
		return Static352.method5097(super.aClass3_Sub55_32.aClass15_Sub4_1.method1071());
	}
}
