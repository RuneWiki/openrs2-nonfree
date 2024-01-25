import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class23_Sub6 extends Class23 {

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub6(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		if (super.aClass3_Sub48_31.method7828()) {
			return 2;
		} else if (super.aClass3_Sub48_31.aClass23_Sub18_2.method5154() && Static140.method3139(super.aClass3_Sub48_31.aClass23_Sub18_2.method5152())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub48_31.method7828() ? 3 : 1;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.aClass3_Sub48_31.method7828()) {
			super.anInt10359 = 2;
		}
		if (super.anInt10359 < 0 || super.anInt10359 > 2) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)Z")
	public boolean method2790() {
		return !super.aClass3_Sub48_31.method7828();
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)I")
	public int method2793() {
		return super.anInt10359;
	}
}
