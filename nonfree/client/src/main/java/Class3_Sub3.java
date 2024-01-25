import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
	public boolean aBoolean577;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Z")
	protected boolean aBoolean578;

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "Z")
	protected boolean aBoolean582;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "Z")
	public boolean aBoolean580 = false;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	protected int anInt7554 = 0;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	public int anInt7551 = 0;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
	public int anInt7561 = 127;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
	public int anInt7557 = 0;

	@OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
	public int anInt7562 = 2;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
	public int anInt7553 = 127;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public int anInt7552 = 3;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Z")
	public boolean aBoolean576 = true;

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "Z")
	public boolean aBoolean581 = true;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
	protected int anInt7566 = 2;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Z")
	public boolean aBoolean586 = true;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
	public int anInt7555 = 127;

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "Z")
	public boolean aBoolean587 = true;

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "Z")
	public boolean aBoolean585 = true;

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
	public int anInt7569 = 0;

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
	public int anInt7565 = 0;

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "Z")
	public boolean aBoolean583 = true;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "Z")
	public boolean aBoolean579 = false;

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
	public int anInt7568 = 2;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "Z")
	public boolean aBoolean589 = true;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
	public int anInt7571 = 0;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Z")
	public boolean aBoolean590 = true;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "Z")
	public boolean aBoolean591 = true;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
	public int anInt7570 = 2;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "Z")
	public boolean aBoolean588 = true;

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
	protected int anInt7575 = 0;

	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
	public int anInt7576 = 1;

	@OriginalMember(owner = "client!ag", name = "cb", descriptor = "Z")
	protected boolean aBoolean592 = true;

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "Z")
	public boolean aBoolean584 = true;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	public int anInt7560 = 0;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
	public int anInt7572 = 3;

	@OriginalMember(owner = "client!ag", name = "fb", descriptor = "Z")
	public boolean aBoolean594 = false;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
	public int anInt7559 = 127;

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
	public int anInt7574 = 0;

	@OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
	public int anInt7577 = 127;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	protected Class3_Sub3() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBZ)V")
	public final void method6295(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (Static436.method6101(arg0)) {
			this.aBoolean582 = arg1;
		} else {
			this.aBoolean578 = arg1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Z")
	public final boolean method6297(@OriginalArg(0) int arg0) {
		return Static436.method6101(arg0) ? this.aBoolean582 : this.aBoolean578;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBI)V")
	public final void method6298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static436.method6101(arg1)) {
			this.anInt7566 = arg0;
		} else {
			this.anInt7575 = arg0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
	public final int method6299(@OriginalArg(1) int arg0) {
		return Static436.method6101(arg0) ? this.anInt7566 : this.anInt7575;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!np;)V")
	public final void method6302(@OriginalArg(1) Class3_Sub11 arg0) {
		arg0.method5213(22);
		arg0.method5213(this.anInt7552);
		arg0.method5213(this.aBoolean592 ? 1 : 0);
		arg0.method5213(this.aBoolean585 ? 1 : 0);
		arg0.method5213(this.aBoolean591 ? 1 : 0);
		arg0.method5213(this.aBoolean581 ? 1 : 0);
		arg0.method5213(0);
		arg0.method5213(this.aBoolean583 ? 1 : 0);
		arg0.method5213(this.aBoolean590 ? 1 : 0);
		arg0.method5213(this.aBoolean576 ? 1 : 0);
		arg0.method5213(this.anInt7566);
		arg0.method5213(this.anInt7575);
		arg0.method5213(this.aBoolean582 ? 1 : 0);
		arg0.method5213(this.aBoolean578 ? 1 : 0);
		arg0.method5213(this.aBoolean589 ? 1 : 0);
		arg0.method5213(this.aBoolean584 ? 1 : 0);
		arg0.method5213(this.anInt7565);
		arg0.method5213(this.aBoolean586 ? 1 : 0);
		arg0.method5213(this.anInt7559);
		arg0.method5213(this.anInt7561);
		arg0.method5213(this.anInt7553);
		arg0.method5213(this.anInt7577);
		arg0.method5213(this.anInt7555);
		arg0.method5200(this.anInt7569);
		arg0.method5200(this.anInt7560);
		arg0.method5213(Static562.method7589());
		arg0.method5215(this.anInt7574);
		arg0.method5213(this.anInt7570);
		arg0.method5213(this.aBoolean594 ? 1 : 0);
		arg0.method5213(this.aBoolean577 ? 1 : 0);
		arg0.method5213(this.anInt7571);
		arg0.method5213(this.aBoolean580 ? 1 : 0);
		arg0.method5213(this.aBoolean587 ? 1 : 0);
		arg0.method5213(this.anInt7576);
		arg0.method5213(this.aBoolean588 ? 1 : 0);
		arg0.method5213(this.anInt7562);
		arg0.method5213(this.anInt7568);
		arg0.method5213(this.aBoolean579 ? 1 : 0);
		arg0.method5213(this.anInt7572);
		arg0.method5213(this.anInt7554);
		arg0.method5213(this.anInt7551);
	}
}
