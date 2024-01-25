import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class36_Sub9 extends Class36 {

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
		Static364.method5680(super.anInt10496);
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub9(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
		Static364.method5680(super.anInt10496);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return super.aClass8_Sub25_31.method3469().method4884() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	public int method4037() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
		Static364.method5680(super.anInt10496);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.aClass8_Sub25_31.method3469().method4884() < 96) {
			super.anInt10496 = 0;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 2) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Z")
	public boolean method4039() {
		return super.aClass8_Sub25_31.method3469().method4884() >= 96;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return super.aClass8_Sub25_31.method3469().method4884() < 96 ? 0 : 2;
	}
}
