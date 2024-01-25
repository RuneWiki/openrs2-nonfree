import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub28(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "(I)I")
	public int method8253() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 0;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = super.aClass5_Sub25_32.method3681().method7222();
		if (local12 < 96) {
			return 3;
		} else if (arg0 > 1 && local12 < 128) {
			return 3;
		} else if (arg0 > 3 && local12 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!uia", name = "f", descriptor = "(I)Z")
	public boolean method8256() {
		@Pc(15) int local15 = super.aClass5_Sub25_32.method3681().method7222();
		return local15 >= 96;
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		@Pc(14) int local14 = super.aClass5_Sub25_32.method3681().method7222();
		if (local14 < 96) {
			super.anInt9925 = 0;
		}
		if (super.anInt9925 > 1 && local14 < 128) {
			super.anInt9925 = 1;
		}
		if (super.anInt9925 > 2 && local14 < 192) {
			super.anInt9925 = 2;
		}
		if (super.anInt9925 < 0 || super.anInt9925 > 3) {
			super.anInt9925 = this.method8535();
		}
	}
}
