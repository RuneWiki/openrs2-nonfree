import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class29_Sub14 extends Class29 {

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub14(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return 0;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Z")
	public boolean method5230() {
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		if (Static132.method2025(arg0)) {
			if (super.aClass6_Sub22_31.aClass29_Sub16_2.method5740() && !Static593.method8155(super.aClass6_Sub22_31.aClass29_Sub16_2.method5742())) {
				return 3;
			}
			if (super.aClass6_Sub22_31.aClass29_Sub18_1.method6277() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static132.method2025(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)I")
	public int method5231() {
		return super.anInt10604;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z")
	public boolean method5232() {
		return Static132.method2025(super.anInt10604);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		if (this.method5232()) {
			if (super.aClass6_Sub22_31.aClass29_Sub16_2.method5740() && !Static593.method8155(super.aClass6_Sub22_31.aClass29_Sub16_2.method5742())) {
				super.anInt10604 = 1;
			}
			if (super.aClass6_Sub22_31.aClass29_Sub18_1.method6277() == 1) {
				super.anInt10604 = 1;
			}
		}
		if (super.anInt10604 == 3) {
			super.anInt10604 = 2;
		}
		if (super.anInt10604 < 0 || super.anInt10604 > 3) {
			super.anInt10604 = this.method8997();
		}
	}
}
