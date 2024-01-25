import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub3(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)I")
	public int method430() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Z")
	public boolean method431() {
		if (super.aClass5_Sub19_31.method2551()) {
			return false;
		} else {
			return super.aClass5_Sub19_31.aClass17_Sub21_1.method6983() != 0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub19_31.method2551()) {
			return 3;
		} else if (super.aClass5_Sub19_31.aClass17_Sub21_1.method6983() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 2;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (super.aClass5_Sub19_31.method2551()) {
			super.anInt10866 = 0;
		}
		if (super.aClass5_Sub19_31.aClass17_Sub21_1.method6983() == 0) {
			super.anInt10866 = 0;
		}
		if (super.anInt10866 < 0 || super.anInt10866 > 2) {
			super.anInt10866 = this.method9173();
		}
	}
}
