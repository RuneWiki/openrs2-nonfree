import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class23_Sub4 extends Class23 {

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub4(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 1;
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)I")
	public int method1180() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)Z")
	public boolean method1181() {
		if (super.aClass3_Sub48_31.method7829() == Static592.aClass62_13) {
			return !super.aClass3_Sub48_31.method7828();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.aClass3_Sub48_31.method7829() != Static592.aClass62_13) {
			super.anInt10359 = 1;
		} else if (super.aClass3_Sub48_31.method7828()) {
			super.anInt10359 = 0;
		}
		if (super.anInt10359 != 0 && super.anInt10359 != 1) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub48_31.method7829() != Static592.aClass62_13) {
			return 3;
		} else if (super.aClass3_Sub48_31.method7828()) {
			return 3;
		} else if (arg0 == 0 || super.aClass3_Sub48_31.aClass23_Sub16_1.method4881() == 1) {
			return 1;
		} else {
			return 2;
		}
	}
}
