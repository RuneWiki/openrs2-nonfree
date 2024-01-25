import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class14_Sub22 extends Class14 {

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub22(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)I")
	public int method6221() {
		return super.anInt10805;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		@Pc(10) int local10 = super.aClass3_Sub41_31.method6699().method8234();
		if (local10 < 96) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 > 1 && local10 < 128) {
			super.anInt10805 = 1;
		}
		if (super.anInt10805 > 2 && local10 < 192) {
			super.anInt10805 = 2;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 3) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 0;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = super.aClass3_Sub41_31.method6699().method8234();
		if (local17 < 96) {
			return 3;
		} else if (arg0 > 1 && local17 < 128) {
			return 3;
		} else if (arg0 > 3 && local17 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z")
	public boolean method6222() {
		@Pc(17) int local17 = super.aClass3_Sub41_31.method6699().method8234();
		return local17 >= 96;
	}
}
