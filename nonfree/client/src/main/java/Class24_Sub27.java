import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class24_Sub27 extends Class24 {

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub27(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (super.aClass5_Sub20_30.method3195()) {
			super.anInt10335 = 2;
		}
		if (super.anInt10335 < 0 || super.anInt10335 > 2) {
			super.anInt10335 = this.method8881();
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		return super.aClass5_Sub20_30.method3195() ? 3 : 1;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)I")
	public int method8302() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Z")
	public boolean method8303() {
		return !super.aClass5_Sub20_30.method3195();
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		if (super.aClass5_Sub20_30.method3195()) {
			return 2;
		} else if (super.aClass5_Sub20_30.aClass24_Sub10_1.method3155() && Static120.method1677(super.aClass5_Sub20_30.aClass24_Sub10_1.method3153())) {
			return 1;
		} else {
			return 0;
		}
	}
}
