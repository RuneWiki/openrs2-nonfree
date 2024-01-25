import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class21_Sub21 extends Class21 {

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "Z")
	public boolean aBoolean640 = false;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Z")
	private boolean aBoolean639 = true;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub21(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		if (super.aClass14_Sub22_31.method3015().method8446()) {
			return arg0 == 3 && !Static204.method7945("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)I")
	public int method7541() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)V")
	public void method7543(@OriginalArg(0) boolean arg0) {
		this.aBoolean639 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)Z")
	public boolean method7544() {
		return this.aBoolean639;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		this.aBoolean640 = false;
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "(I)Z")
	public boolean method7545() {
		return super.aClass14_Sub22_31.method3015().method8446();
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		this.aBoolean640 = true;
		return super.aClass14_Sub22_31.method3015().method8446() ? 2 : 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (!super.aClass14_Sub22_31.method3015().method8446()) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 < 0 || super.anInt11183 > 5) {
			super.anInt11183 = this.method9292();
		}
	}
}
