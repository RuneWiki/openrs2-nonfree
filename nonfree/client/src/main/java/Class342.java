import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class342 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	public int anInt9513;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!dl;")
	public Class77 aClass77_5;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public int anInt9516 = 512;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Z")
	public boolean aBoolean689 = true;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public int anInt9511 = 0;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Z")
	public boolean aBoolean690 = false;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public int anInt9512 = 64;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
	public int anInt9518 = 8;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public int anInt9514 = 1190717;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	public int anInt9520 = -1;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "Z")
	public boolean aBoolean691 = true;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public int anInt9515 = -1;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	public int anInt9521 = 127;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method8003() {
		this.anInt9518 = this.anInt9518 << 8 | this.anInt9513;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!ud;)V")
	private void method8004(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.anInt9511 = Static240.method3962(arg1.method6870());
		} else if (arg0 == 2) {
			this.anInt9515 = arg1.method6904();
		} else if (arg0 == 3) {
			this.anInt9515 = arg1.method6884();
			if (this.anInt9515 == 65535) {
				this.anInt9515 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean691 = false;
		} else if (arg0 == 7) {
			this.anInt9520 = Static240.method3962(arg1.method6870());
		} else if (arg0 == 8) {
			this.aClass77_5.anInt1920 = this.anInt9513;
		} else if (arg0 == 9) {
			this.anInt9516 = arg1.method6884() << 2;
		} else if (arg0 == 10) {
			this.aBoolean689 = false;
		} else if (arg0 == 11) {
			this.anInt9518 = arg1.method6904();
		} else if (arg0 == 12) {
			this.aBoolean690 = true;
		} else if (arg0 == 13) {
			this.anInt9514 = arg1.method6870();
		} else if (arg0 == 14) {
			this.anInt9512 = arg1.method6904() << 2;
		} else if (arg0 == 16) {
			this.anInt9521 = arg1.method6904();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!ud;)V")
	public void method8006(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6904();
			if (local9 == 0) {
				return;
			}
			this.method8004(local9, arg0);
		}
	}
}
