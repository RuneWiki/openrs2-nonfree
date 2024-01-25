import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class264 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!vu;")
	public Class307 aClass307_6;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	public int anInt7718;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public int anInt7710 = 8;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public int anInt7715 = 128;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public int anInt7709 = 16;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public int anInt7713 = 127;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Z")
	public boolean aBoolean549 = false;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Z")
	public boolean aBoolean550 = true;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public int anInt7716 = -1;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Z")
	public boolean aBoolean548 = true;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	public int anInt7717 = -1;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public int anInt7712 = -1;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
	public int anInt7722 = 1190717;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public int anInt7714 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!co;)V")
	private void method6251(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt7714 = Static456.method6376(arg1.method4182());
		} else if (arg0 == 2) {
			this.anInt7717 = arg1.method4220();
		} else if (arg0 == 3) {
			this.anInt7717 = arg1.method4227();
			if (this.anInt7717 == 65535) {
				this.anInt7717 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean550 = false;
		} else if (arg0 == 7) {
			this.anInt7712 = Static456.method6376(arg1.method4182());
			return;
		} else if (arg0 == 8) {
			this.aClass307_6.anInt8864 = this.anInt7718;
			return;
		} else if (arg0 == 9) {
			this.anInt7715 = arg1.method4227() << 0;
			return;
		} else if (arg0 == 10) {
			this.aBoolean548 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt7710 = arg1.method4220();
			return;
		} else if (arg0 == 12) {
			this.aBoolean549 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt7722 = arg1.method4182();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt7709 = arg1.method4220() << 0;
			} else if (arg0 == 15) {
				this.anInt7716 = arg1.method4227();
				if (this.anInt7716 == 65535) {
					this.anInt7716 = -1;
					return;
				}
			} else if (arg0 == 16) {
				this.anInt7713 = arg1.method4220();
				return;
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public void method6253() {
		this.anInt7710 = this.anInt7710 << 8 | this.anInt7718;
		if (this.anInt7716 == -1) {
			this.anInt7716 = this.anInt7717;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!co;I)V")
	public void method6254(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method6251(local5, arg0);
		}
	}
}
