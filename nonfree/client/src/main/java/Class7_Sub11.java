import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class7_Sub11 extends Class7 {

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub11(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 0;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I")
	public int method5159() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		@Pc(18) int local18 = super.aClass3_Sub41_31.method6771().method7216();
		if (local18 < 96) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 > 1 && local18 < 128) {
			super.anInt10115 = 1;
		}
		if (super.anInt10115 > 2 && local18 < 192) {
			super.anInt10115 = 2;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 3) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = super.aClass3_Sub41_31.method6771().method7216();
		if (local19 < 96) {
			return 3;
		} else if (arg0 > 1 && local19 < 128) {
			return 3;
		} else if (arg0 > 3 && local19 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Z")
	public boolean method5160() {
		@Pc(15) int local15 = super.aClass3_Sub41_31.method6771().method7216();
		return local15 >= 96;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}
}
