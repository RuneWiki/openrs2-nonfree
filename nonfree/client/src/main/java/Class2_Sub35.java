import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
	protected boolean aBoolean626;

	@OriginalMember(owner = "client!on", name = "N", descriptor = "Z")
	protected boolean aBoolean636;

	@OriginalMember(owner = "client!on", name = "Q", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	public int anInt7492 = 2;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Z")
	public boolean aBoolean625 = true;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	public int anInt7491 = 2;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Z")
	public boolean aBoolean629 = true;

	@OriginalMember(owner = "client!on", name = "y", descriptor = "Z")
	public boolean aBoolean631 = true;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "Z")
	protected boolean aBoolean627 = true;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Z")
	public boolean aBoolean628 = false;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "Z")
	public boolean aBoolean632 = true;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "Z")
	public boolean aBoolean630 = true;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "I")
	public int anInt7487 = 3;

	@OriginalMember(owner = "client!on", name = "H", descriptor = "I")
	public int anInt7502 = 0;

	@OriginalMember(owner = "client!on", name = "E", descriptor = "Z")
	public boolean aBoolean633 = true;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	public int anInt7494 = 0;

	@OriginalMember(owner = "client!on", name = "D", descriptor = "I")
	public int anInt7499 = 127;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
	public boolean aBoolean624 = false;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "I")
	public int anInt7490 = 127;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "I")
	public int anInt7496 = 0;

	@OriginalMember(owner = "client!on", name = "K", descriptor = "I")
	protected int anInt7504 = 2;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public int anInt7495 = 127;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "Z")
	public boolean aBoolean637 = true;

	@OriginalMember(owner = "client!on", name = "G", descriptor = "I")
	protected int anInt7501 = 0;

	@OriginalMember(owner = "client!on", name = "P", descriptor = "I")
	public int anInt7506 = 0;

	@OriginalMember(owner = "client!on", name = "M", descriptor = "I")
	public int anInt7505 = 127;

	@OriginalMember(owner = "client!on", name = "J", descriptor = "I")
	protected int anInt7503 = 0;

	@OriginalMember(owner = "client!on", name = "U", descriptor = "I")
	public int anInt7510 = 1;

	@OriginalMember(owner = "client!on", name = "S", descriptor = "I")
	public int anInt7508 = 3;

	@OriginalMember(owner = "client!on", name = "T", descriptor = "I")
	public int anInt7509 = 0;

	@OriginalMember(owner = "client!on", name = "W", descriptor = "I")
	public int anInt7511 = 0;

	@OriginalMember(owner = "client!on", name = "L", descriptor = "Z")
	public boolean aBoolean635 = false;

	@OriginalMember(owner = "client!on", name = "Y", descriptor = "I")
	public int anInt7512 = 127;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "Z")
	public boolean aBoolean634 = true;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	public int anInt7497 = 2;

	@OriginalMember(owner = "client!on", name = "V", descriptor = "Z")
	public boolean aBoolean639 = true;

	@OriginalMember(owner = "client!on", name = "Z", descriptor = "Z")
	public boolean aBoolean641 = true;

	@OriginalMember(owner = "client!on", name = "X", descriptor = "Z")
	public boolean aBoolean640 = true;

	@OriginalMember(owner = "client!on", name = "B", descriptor = "I")
	public int anInt7498 = 0;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	protected Class2_Sub35() {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IBI)V")
	public final void method6033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static530.method6928(arg0)) {
			this.anInt7504 = arg1;
		} else {
			this.anInt7503 = arg1;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IZI)V")
	public final void method6034(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (Static530.method6928(arg1)) {
			this.aBoolean626 = arg0;
		} else {
			this.aBoolean636 = arg0;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
	public final boolean method6036(@OriginalArg(0) int arg0) {
		return Static530.method6928(arg0) ? this.aBoolean626 : this.aBoolean636;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IZ)I")
	public final int method6037(@OriginalArg(0) int arg0) {
		return Static530.method6928(arg0) ? this.anInt7504 : this.anInt7503;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!gk;)V")
	public final void method6038(@OriginalArg(1) Class2_Sub7 arg0) {
		arg0.method4459(22);
		arg0.method4459(this.anInt7508);
		arg0.method4459(this.aBoolean627 ? 1 : 0);
		arg0.method4459(this.aBoolean631 ? 1 : 0);
		arg0.method4459(this.aBoolean630 ? 1 : 0);
		arg0.method4459(this.aBoolean632 ? 1 : 0);
		arg0.method4459(0);
		arg0.method4459(this.aBoolean625 ? 1 : 0);
		arg0.method4459(this.aBoolean637 ? 1 : 0);
		arg0.method4459(this.aBoolean640 ? 1 : 0);
		arg0.method4459(this.anInt7504);
		arg0.method4459(this.anInt7503);
		arg0.method4459(this.aBoolean626 ? 1 : 0);
		arg0.method4459(this.aBoolean636 ? 1 : 0);
		arg0.method4459(this.aBoolean634 ? 1 : 0);
		arg0.method4459(this.aBoolean633 ? 1 : 0);
		arg0.method4459(this.anInt7494);
		arg0.method4459(this.aBoolean639 ? 1 : 0);
		arg0.method4459(this.anInt7505);
		arg0.method4459(this.anInt7495);
		arg0.method4459(this.anInt7490);
		arg0.method4459(this.anInt7512);
		arg0.method4459(this.anInt7499);
		arg0.method4511(this.anInt7511);
		arg0.method4511(this.anInt7502);
		arg0.method4459(Static426.method5674());
		arg0.method4495(this.anInt7506);
		arg0.method4459(this.anInt7491);
		arg0.method4459(this.aBoolean635 ? 1 : 0);
		arg0.method4459(this.aBoolean638 ? 1 : 0);
		arg0.method4459(this.anInt7496);
		arg0.method4459(this.aBoolean628 ? 1 : 0);
		arg0.method4459(this.aBoolean641 ? 1 : 0);
		arg0.method4459(this.anInt7510);
		arg0.method4459(this.aBoolean629 ? 1 : 0);
		arg0.method4459(this.anInt7497);
		arg0.method4459(this.anInt7492);
		arg0.method4459(this.aBoolean624 ? 1 : 0);
		arg0.method4459(this.anInt7487);
		arg0.method4459(this.anInt7501);
		arg0.method4459(this.anInt7509);
	}
}
