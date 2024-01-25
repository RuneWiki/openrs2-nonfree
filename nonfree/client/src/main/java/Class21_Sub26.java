import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class21_Sub26 extends Class21 {

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub26(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		return Static171.method3004(super.aClass3_Sub27_31.aClass21_Sub1_1.method1025()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Z")
	public boolean method8161() {
		return Static171.method3004(super.aClass3_Sub27_31.aClass21_Sub1_1.method1025());
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return 0;
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(Z)I")
	public int method8162() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		if (super.aClass3_Sub27_31.aClass21_Sub1_1.method1023() && !Static171.method3004(super.aClass3_Sub27_31.aClass21_Sub1_1.method1025())) {
			super.anInt10079 = 0;
		}
		if (super.anInt10079 < 0 || super.anInt10079 > 2) {
			super.anInt10079 = this.method8636();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}
}
