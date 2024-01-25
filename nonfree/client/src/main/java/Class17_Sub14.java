import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class17_Sub14 extends Class17 {

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub14(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass3_Sub15_31.method2426().method5831();
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

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Z")
	public boolean method4651() {
		@Pc(10) int local10 = super.aClass3_Sub15_31.method2426().method5831();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		@Pc(16) int local16 = super.aClass3_Sub15_31.method2426().method5831();
		if (local16 < 96) {
			super.anInt10323 = 0;
		}
		if (super.anInt10323 > 1 && local16 < 128) {
			super.anInt10323 = 1;
		}
		if (super.anInt10323 > 2 && local16 < 192) {
			super.anInt10323 = 2;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 3) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(B)I")
	public int method4653() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return 0;
	}
}
