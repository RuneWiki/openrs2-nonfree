import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class24_Sub10 extends Class24 {

	@OriginalMember(owner = "client!hga", name = "y", descriptor = "Z")
	public boolean aBoolean286 = false;

	@OriginalMember(owner = "client!hga", name = "u", descriptor = "Z")
	private boolean aBoolean285 = true;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub10(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		this.aBoolean286 = true;
		return super.aClass5_Sub20_30.method3201().method7448() ? 2 : 0;
	}

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "(I)Z")
	public boolean method3150() {
		return super.aClass5_Sub20_30.method3201().method7448();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (!super.aClass5_Sub20_30.method3201().method7448()) {
			super.anInt10335 = 0;
		}
		if (super.anInt10335 < 0 || super.anInt10335 > 5) {
			super.anInt10335 = this.method8881();
		}
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		if (super.aClass5_Sub20_30.method3201().method7448()) {
			return arg0 == 3 && !Static584.method8415("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZ)V")
	public void method3151(@OriginalArg(1) boolean arg0) {
		this.aBoolean285 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(Z)I")
	public int method3153() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "(Z)Z")
	public boolean method3155() {
		return this.aBoolean285;
	}
}
