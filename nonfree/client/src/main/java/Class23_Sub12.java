import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class23_Sub12 extends Class23 {

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub12(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 1;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
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

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub48_31.method7828()) {
			return 3;
		} else if (super.aClass3_Sub48_31.method7829() == Static592.aClass62_13) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Z")
	public boolean method3748() {
		if (super.aClass3_Sub48_31.method7828()) {
			return false;
		} else {
			return super.aClass3_Sub48_31.method7829() == Static592.aClass62_13;
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)I")
	public int method3750() {
		return super.anInt10359;
	}
}
