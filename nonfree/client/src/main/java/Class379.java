import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class379 {

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	private int anInt10432;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public int anInt10433;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public int anInt10436;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt10437;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public int anInt10438;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
	public int anInt10440;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public int anInt10442;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	public int anInt10443;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public int anInt10445;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt10447;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "J")
	public long aLong328;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Z")
	private boolean aBoolean903 = false;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public int anInt10441 = 0;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	public int anInt10431 = 0;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public void method9141() {
		this.anInt10447 = Class145_Sub1.anIntArray760[this.anInt10432 << 3];
		@Pc(17) long local17 = (long) this.anInt10442;
		@Pc(21) long local21 = (long) this.anInt10433;
		@Pc(25) long local25 = (long) this.anInt10443;
		this.anInt10438 = (int) Math.sqrt((double) (local17 * local17 + local21 * local21 + local25 * local25));
		if (this.anInt10440 == 0) {
			this.anInt10440 = 1;
		}
		if (this.anInt10437 == 0) {
			this.aLong328 = 2147483647L;
		} else if (this.anInt10437 == 1) {
			this.aLong328 = (long) (this.anInt10438 * 8 / this.anInt10440);
			this.aLong328 *= this.aLong328;
		} else if (this.anInt10437 == 2) {
			this.aLong328 = (long) (this.anInt10438 * 8 / this.anInt10440);
		}
		if (this.aBoolean903) {
			this.anInt10438 *= -1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!et;)V")
	public void method9142(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8581(-17416);
			if (local9 == 0) {
				return;
			}
			this.method9145(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!et;B)V")
	private void method9145(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt10432 = arg1.method8575();
		} else if (arg0 == 2) {
			arg1.method8581(-17416);
		} else if (arg0 == 3) {
			this.anInt10442 = arg1.method8555(-9372);
			this.anInt10433 = arg1.method8555(-9372);
			this.anInt10443 = arg1.method8555(-9372);
		} else if (arg0 == 4) {
			this.anInt10437 = arg1.method8581(-17416);
			this.anInt10440 = arg1.method8555(-9372);
		} else if (arg0 == 6) {
			this.anInt10445 = arg1.method8581(-17416);
		} else if (arg0 == 8) {
			this.anInt10431 = 1;
		} else if (arg0 == 9) {
			this.anInt10441 = 1;
		} else if (arg0 == 10) {
			this.aBoolean903 = true;
		}
	}
}
