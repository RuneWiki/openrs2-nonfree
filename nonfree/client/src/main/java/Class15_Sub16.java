import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class15_Sub16 extends Class15 {

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub16(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I")
	public int method5372() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		return super.aClass6_Sub22_31.method3533() ? 3 : 1;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.aClass6_Sub22_31.method3533()) {
			super.anInt10701 = 2;
		}
		if (super.anInt10701 < 0 || super.anInt10701 > 2) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		if (super.aClass6_Sub22_31.method3533()) {
			return 2;
		} else if (super.aClass6_Sub22_31.aClass15_Sub22_2.method6680() && Static166.method3056(super.aClass6_Sub22_31.aClass15_Sub22_2.method6681())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)Z")
	public boolean method5377() {
		return !super.aClass6_Sub22_31.method3533();
	}
}
