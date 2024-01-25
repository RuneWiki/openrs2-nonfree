import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class14_Sub28 extends Class14 {

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub28(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return 1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I")
	public int method8390() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Z")
	public boolean method8393() {
		return !super.aClass6_Sub33_31.method5002();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (super.aClass6_Sub33_31.method5002()) {
			super.anInt10543 = 0;
		}
		if (super.anInt10543 < 0 && super.anInt10543 > 2) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		if (super.aClass6_Sub33_31.method5002()) {
			return 3;
		} else if (arg0 == 0 || super.aClass6_Sub33_31.aClass14_Sub25_1.method8150() == 1) {
			return 1;
		} else {
			return 2;
		}
	}
}
