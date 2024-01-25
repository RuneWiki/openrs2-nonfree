import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class36_Sub23 extends Class36 {

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub23(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)I")
	public int method7382() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 0;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)Z")
	public boolean method7384() {
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Z")
	public boolean method7385() {
		return Static379.method6034(super.anInt10496);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		if (Static379.method6034(arg0)) {
			if (super.aClass8_Sub25_31.aClass36_Sub19_2.method6361() && !Static542.method7658(super.aClass8_Sub25_31.aClass36_Sub19_2.method6358())) {
				return 3;
			}
			if (super.aClass8_Sub25_31.aClass36_Sub5_2.method3307() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static379.method6034(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (this.method7385()) {
			if (super.aClass8_Sub25_31.aClass36_Sub19_2.method6361() && !Static542.method7658(super.aClass8_Sub25_31.aClass36_Sub19_2.method6358())) {
				super.anInt10496 = 1;
			}
			if (super.aClass8_Sub25_31.aClass36_Sub5_2.method3307() == 1) {
				super.anInt10496 = 1;
			}
		}
		if (super.anInt10496 == 3) {
			super.anInt10496 = 2;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 3) {
			super.anInt10496 = this.method8464();
		}
	}
}
