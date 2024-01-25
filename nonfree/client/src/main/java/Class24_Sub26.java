import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class24_Sub26 extends Class24 {

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub26(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Z)I")
	public int method8058() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)Z")
	public boolean method8060() {
		@Pc(10) int local10 = super.aClass5_Sub20_30.method3201().method7445();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return 0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass5_Sub20_30.method3201().method7445();
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

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		@Pc(10) int local10 = super.aClass5_Sub20_30.method3201().method7445();
		if (local10 < 96) {
			super.anInt10335 = 0;
		}
		if (super.anInt10335 > 1 && local10 < 128) {
			super.anInt10335 = 1;
		}
		if (super.anInt10335 > 2 && local10 < 192) {
			super.anInt10335 = 2;
		}
		if (super.anInt10335 < 0 || super.anInt10335 > 3) {
			super.anInt10335 = this.method8881();
		}
	}
}
