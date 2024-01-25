import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class17_Sub16 extends Class17 {

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub16(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)I")
	public int method5290() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 1;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)Z")
	public boolean method5292() {
		if (super.aClass5_Sub19_31.method2551()) {
			return false;
		} else {
			return super.aClass5_Sub19_31.method2549() == Static82.aClass290_1;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (super.aClass5_Sub19_31.method2549() != Static82.aClass290_1) {
			super.anInt10866 = 1;
		} else if (super.aClass5_Sub19_31.method2551()) {
			super.anInt10866 = 0;
		}
		if (super.anInt10866 != 0 && super.anInt10866 != 1) {
			super.anInt10866 = this.method9173();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub19_31.method2551()) {
			return 3;
		} else if (super.aClass5_Sub19_31.method2549() == Static82.aClass290_1) {
			return 1;
		} else {
			return 3;
		}
	}
}
