import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class36_Sub19 extends Class36 {

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Z")
	public boolean aBoolean554 = false;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Z")
	private boolean aBoolean555 = true;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub19(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(IZ)V")
	public void method6356(@OriginalArg(1) boolean arg0) {
		this.aBoolean555 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
	public int method6358() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (!super.aClass8_Sub25_31.method3469().method4886()) {
			super.anInt10496 = 0;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 5) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		if (super.aClass8_Sub25_31.method3469().method4886()) {
			return arg0 == 3 && Static462.method6957("jagdx") == null ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		this.aBoolean554 = false;
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Z")
	public boolean method6361() {
		return this.aBoolean555;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		this.aBoolean554 = true;
		return super.aClass8_Sub25_31.method3469().method4886() ? 2 : 0;
	}
}
