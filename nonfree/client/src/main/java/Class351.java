import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class351 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	private int anInt9690;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "J")
	public long aLong260;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public int anInt9693;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public int anInt9695;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public int anInt9696;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	public int anInt9697;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	public int anInt9700;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	public int anInt9701;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	public int anInt9703;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "I")
	public int anInt9704;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	public int anInt9707;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Z")
	private boolean aBoolean715 = false;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	public int anInt9694 = 0;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	public int anInt9699 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!ud;I)V")
	private void method8114(@OriginalArg(1) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9690 = arg0.method6884();
		} else if (arg1 == 2) {
			arg0.method6904();
		} else if (arg1 == 3) {
			this.anInt9700 = arg0.method6865();
			this.anInt9696 = arg0.method6865();
			this.anInt9695 = arg0.method6865();
		} else if (arg1 == 4) {
			this.anInt9707 = arg0.method6904();
			this.anInt9693 = arg0.method6865();
		} else if (arg1 == 6) {
			this.anInt9697 = arg0.method6904();
		} else if (arg1 == 8) {
			this.anInt9694 = 1;
		} else if (arg1 == 9) {
			this.anInt9699 = 1;
		} else if (arg1 == 10) {
			this.aBoolean715 = true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ud;B)V")
	public void method8116(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6904();
			if (local15 == 0) {
				return;
			}
			this.method8114(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public void method8117() {
		this.anInt9704 = Class353.anIntArray682[this.anInt9690 << 3];
		@Pc(15) long local15 = (long) this.anInt9700;
		@Pc(19) long local19 = (long) this.anInt9696;
		@Pc(23) long local23 = (long) this.anInt9695;
		this.anInt9703 = (int) Math.sqrt((double) (local23 * local23 + local15 * local15 + local19 * local19));
		if (this.anInt9693 == 0) {
			this.anInt9693 = 1;
		}
		if (this.anInt9707 == 0) {
			this.aLong260 = 2147483647L;
		} else if (this.anInt9707 == 1) {
			this.aLong260 = this.anInt9703 * 8 / this.anInt9693;
			this.aLong260 *= this.aLong260;
		} else if (this.anInt9707 == 2) {
			this.aLong260 = this.anInt9703 * 8 / this.anInt9693;
		}
		if (this.aBoolean715) {
			this.anInt9703 *= -1;
		}
	}
}
