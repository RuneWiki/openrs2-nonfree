import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class21_Sub17 extends Class21 {

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub17(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		if (super.aClass3_Sub27_31.method3241()) {
			super.anInt10079 = 2;
		}
		if (super.anInt10079 < 0 || super.anInt10079 > 2) {
			super.anInt10079 = this.method8636();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		if (super.aClass3_Sub27_31.method3241()) {
			return 2;
		} else if (super.aClass3_Sub27_31.aClass21_Sub1_1.method1023() && Static634.method8681(super.aClass3_Sub27_31.aClass21_Sub1_1.method1025())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		return super.aClass3_Sub27_31.method3241() ? 3 : 1;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)I")
	public int method6184() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Z")
	public boolean method6185() {
		return !super.aClass3_Sub27_31.method3241();
	}
}
