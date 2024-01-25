import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class23_Sub26 extends Class23 {

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub26(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 1;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)Z")
	public boolean method7095() {
		return !super.aClass3_Sub48_31.method7828();
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.aClass3_Sub48_31.method7828()) {
			super.anInt10359 = 0;
		}
		if (super.anInt10359 < 0 && super.anInt10359 > 2) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)I")
	public int method7099() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub48_31.method7828()) {
			return 3;
		} else if (arg0 == 0 || super.aClass3_Sub48_31.aClass23_Sub16_1.method4881() == 1) {
			return 1;
		} else {
			return 2;
		}
	}
}
