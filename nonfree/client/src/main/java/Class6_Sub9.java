import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class6_Sub9(@OriginalArg(0) Class2_Sub5 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(ILclient!ah;)V")
	public Class6_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
	@Override
	public void method8576() {
		@Pc(17) int local17 = super.aClass2_Sub5_50.method180().method454();
		if (local17 < 96) {
			super.anInt10283 = 0;
		}
		if (super.anInt10283 > 1 && local17 < 128) {
			super.anInt10283 = 1;
		}
		if (super.anInt10283 > 2 && local17 < 192) {
			super.anInt10283 = 2;
		}
		if (super.anInt10283 < 0 || super.anInt10283 > 3) {
			super.anInt10283 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)I")
	public int method3047() {
		return super.anInt10283;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 0;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(Z)Z")
	public boolean method3049() {
		@Pc(10) int local10 = super.aClass2_Sub5_50.method180().method454();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(II)V")
	@Override
	protected void method8577(@OriginalArg(0) int arg0) {
		super.anInt10283 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass2_Sub5_50.method180().method454();
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
}
