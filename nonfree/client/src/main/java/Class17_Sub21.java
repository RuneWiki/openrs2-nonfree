import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class17_Sub21 extends Class17 {

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub21(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)I")
	public int method6983() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub19_31.method2549() != Static82.aClass290_1) {
			return 3;
		} else if (super.aClass5_Sub19_31.method2551()) {
			return 3;
		} else if (arg0 == 0 || super.aClass5_Sub19_31.aClass17_Sub7_1.method1654() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)Z")
	public boolean method6984() {
		if (super.aClass5_Sub19_31.method2549() == Static82.aClass290_1) {
			return !super.aClass5_Sub19_31.method2551();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 1;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
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
}
