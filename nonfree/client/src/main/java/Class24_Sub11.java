import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class24_Sub11 extends Class24 {

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub11(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)I")
	public int method3217() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		return Static617.method8747(super.aClass5_Sub20_30.aClass24_Sub10_1.method3153()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return 0;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Z")
	public boolean method3218() {
		return Static617.method8747(super.aClass5_Sub20_30.aClass24_Sub10_1.method3153());
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (super.aClass5_Sub20_30.aClass24_Sub10_1.method3155() && !Static617.method8747(super.aClass5_Sub20_30.aClass24_Sub10_1.method3153())) {
			super.anInt10335 = 0;
		}
		if (super.anInt10335 < 0 || super.anInt10335 > 2) {
			super.anInt10335 = this.method8881();
		}
	}
}
