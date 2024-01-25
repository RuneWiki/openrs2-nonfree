import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub1(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		if (!super.aClass3_Sub27_31.method3236().method7989()) {
			super.anInt10079 = 0;
		}
		if (super.anInt10079 < 0 || super.anInt10079 > 5) {
			super.anInt10079 = this.method8636();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZ)V")
	public void method1022(@OriginalArg(1) boolean arg0) {
		this.aBoolean70 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)Z")
	public boolean method1023() {
		return this.aBoolean70;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		return super.aClass3_Sub27_31.method3236().method7989() ? 2 : 3;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return super.aClass3_Sub27_31.method3236().method7989() ? 2 : 0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(Z)I")
	public int method1025() {
		return super.anInt10079;
	}
}
