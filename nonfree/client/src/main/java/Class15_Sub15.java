import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class15_Sub15 extends Class15 {

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub15(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)Z")
	public boolean method5046() {
		return Static237.method4126(super.anInt10701);
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I")
	public int method5047() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		if (Static237.method4126(arg0)) {
			if (super.aClass6_Sub22_31.aClass15_Sub22_2.method6680() && !Static132.method2133(super.aClass6_Sub22_31.aClass15_Sub22_2.method6681())) {
				return 3;
			}
			if (super.aClass6_Sub22_31.aClass15_Sub17_2.method5501() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static237.method4126(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 0;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (this.method5046()) {
			if (super.aClass6_Sub22_31.aClass15_Sub22_2.method6680() && !Static132.method2133(super.aClass6_Sub22_31.aClass15_Sub22_2.method6681())) {
				super.anInt10701 = 1;
			}
			if (super.aClass6_Sub22_31.aClass15_Sub17_2.method5501() == 1) {
				super.anInt10701 = 1;
			}
		}
		if (super.anInt10701 == 3) {
			super.anInt10701 = 2;
		}
		if (super.anInt10701 < 0 || super.anInt10701 > 3) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Z")
	public boolean method5049() {
		return true;
	}
}
