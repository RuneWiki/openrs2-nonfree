import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class374 {

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public int anInt10473;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "Lclient!pe;")
	public Class258 aClass258_6;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public int anInt10469 = 8;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	public int anInt10468 = 512;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Z")
	public boolean aBoolean882 = true;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
	public int anInt10471 = 127;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public int anInt10470 = 64;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "Z")
	public boolean aBoolean884 = true;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public int anInt10477 = 0;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
	public int anInt10472 = -1;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Z")
	public boolean aBoolean883 = false;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public int anInt10467 = 1190717;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
	public int anInt10478 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILclient!tn;)V")
	private void method8613(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt10477 = Static530.method7542(arg1.method8421());
		} else if (arg0 == 2) {
			this.anInt10478 = arg1.method8401();
		} else if (arg0 == 3) {
			this.anInt10478 = arg1.method8414();
			if (this.anInt10478 == 65535) {
				this.anInt10478 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean882 = false;
		} else if (arg0 == 7) {
			this.anInt10472 = Static530.method7542(arg1.method8421());
		} else if (arg0 == 8) {
			this.aClass258_6.anInt7836 = this.anInt10473;
		} else if (arg0 == 9) {
			this.anInt10468 = arg1.method8414() << 2;
		} else if (arg0 == 10) {
			this.aBoolean884 = false;
		} else if (arg0 == 11) {
			this.anInt10469 = arg1.method8401();
		} else if (arg0 == 12) {
			this.aBoolean883 = true;
		} else if (arg0 == 13) {
			this.anInt10467 = arg1.method8421();
		} else if (arg0 == 14) {
			this.anInt10470 = arg1.method8401() << 2;
		} else if (arg0 == 16) {
			this.anInt10471 = arg1.method8401();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!tn;)V")
	public void method8615(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8401();
			if (local15 == 0) {
				return;
			}
			this.method8613(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public void method8616() {
		this.anInt10469 = this.anInt10469 << 8 | this.anInt10473;
	}
}
