import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub2(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I")
	public int method1626() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z")
	public boolean method1627() {
		return !super.aClass8_Sub25_31.method3471();
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		if (super.aClass8_Sub25_31.method3471()) {
			return 3;
		} else if (arg0 == 0 || super.aClass8_Sub25_31.aClass36_Sub20_1.method6729() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.aClass8_Sub25_31.method3471()) {
			super.anInt10496 = 0;
		}
		if (super.anInt10496 < 0 && super.anInt10496 > 2) {
			super.anInt10496 = this.method8464();
		}
	}
}
