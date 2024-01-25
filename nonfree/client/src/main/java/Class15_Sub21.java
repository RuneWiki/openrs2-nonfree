import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qja")
public final class Class15_Sub21 extends Class15 {

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub21(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 0;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		@Pc(10) int local10 = super.aClass3_Sub55_32.method8888().method4081();
		if (local10 < 96) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 > 1 && local10 < 128) {
			super.anInt11276 = 1;
		}
		if (super.anInt11276 > 2 && local10 < 192) {
			super.anInt11276 = 2;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 3) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!qja", name = "c", descriptor = "(B)I")
	public int method7460() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(I)Z")
	public boolean method7461() {
		@Pc(10) int local10 = super.aClass3_Sub55_32.method8888().method4081();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass3_Sub55_32.method8888().method4081();
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
