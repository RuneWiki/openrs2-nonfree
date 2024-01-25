import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class17_Sub20 extends Class17 {

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub20(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		@Pc(12) int local12 = super.aClass5_Sub19_31.method2556().method1518();
		if (local12 < 96) {
			super.anInt10866 = 0;
		}
		if (super.anInt10866 > 1 && local12 < 128) {
			super.anInt10866 = 1;
		}
		if (super.anInt10866 > 2 && local12 < 192) {
			super.anInt10866 = 2;
		}
		if (super.anInt10866 < 0 || super.anInt10866 > 3) {
			super.anInt10866 = this.method9173();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)I")
	public int method6783() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = super.aClass5_Sub19_31.method2556().method1518();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 0;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)Z")
	public boolean method6784() {
		@Pc(18) int local18 = super.aClass5_Sub19_31.method2556().method1518();
		return local18 >= 96;
	}
}
