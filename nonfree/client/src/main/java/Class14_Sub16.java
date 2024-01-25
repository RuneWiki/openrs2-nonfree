import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class14_Sub16 extends Class14 {

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub16(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		if (super.aClass6_Sub33_31.method5002()) {
			return 2;
		} else if (super.aClass6_Sub33_31.aClass14_Sub8_1.method2643() && Static342.method5687(super.aClass6_Sub33_31.aClass14_Sub8_1.method2640())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		return super.aClass6_Sub33_31.method5002() ? 3 : 1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z")
	public boolean method5718() {
		return !super.aClass6_Sub33_31.method5002();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)I")
	public int method5719() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (super.aClass6_Sub33_31.method5002()) {
			super.anInt10543 = 2;
		}
		if (super.anInt10543 < 0 || super.anInt10543 > 2) {
			super.anInt10543 = this.method8573();
		}
	}
}
