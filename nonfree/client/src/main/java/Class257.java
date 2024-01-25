import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class257 {

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
	public int anInt7533;

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "I")
	public int anInt7535;

	@OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
	public int anInt7536;

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
	public int anInt7537;

	@OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
	public int anInt7538;

	@OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
	private int anInt7539;

	@OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
	public int anInt7540;

	@OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
	public int anInt7541;

	@OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
	public int anInt7544;

	@OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
	public int anInt7547;

	@OriginalMember(owner = "client!oha", name = "s", descriptor = "J")
	public long aLong225;

	@OriginalMember(owner = "client!oha", name = "n", descriptor = "Z")
	private boolean aBoolean550 = false;

	@OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
	public int anInt7543 = 0;

	@OriginalMember(owner = "client!oha", name = "q", descriptor = "I")
	public int anInt7546 = 0;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	public void method6427() {
		this.anInt7540 = Class242.anIntArray383[this.anInt7539 << 3];
		@Pc(15) long local15 = (long) this.anInt7537;
		@Pc(19) long local19 = (long) this.anInt7533;
		@Pc(23) long local23 = (long) this.anInt7547;
		this.anInt7535 = (int) Math.sqrt((double) (local23 * local23 + local15 * local15 + local19 * local19));
		if (this.anInt7544 == 0) {
			this.anInt7544 = 1;
		}
		if (this.anInt7541 == 0) {
			this.aLong225 = 2147483647L;
		} else if (this.anInt7541 == 1) {
			this.aLong225 = (long) (this.anInt7535 * 8 / this.anInt7544);
			this.aLong225 *= this.aLong225;
		} else if (this.anInt7541 == 2) {
			this.aLong225 = (long) (this.anInt7535 * 8 / this.anInt7544);
		}
		if (this.aBoolean550) {
			this.anInt7535 *= -1;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ILclient!rv;Z)V")
	private void method6428(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt7539 = arg1.method3698();
		} else if (arg0 == 2) {
			arg1.method3642();
		} else if (arg0 == 3) {
			this.anInt7537 = arg1.method3671();
			this.anInt7533 = arg1.method3671();
			this.anInt7547 = arg1.method3671();
		} else if (arg0 == 4) {
			this.anInt7541 = arg1.method3642();
			this.anInt7544 = arg1.method3671();
		} else if (arg0 == 6) {
			this.anInt7538 = arg1.method3642();
		} else if (arg0 == 8) {
			this.anInt7543 = 1;
		} else if (arg0 == 9) {
			this.anInt7546 = 1;
		} else if (arg0 == 10) {
			this.aBoolean550 = true;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method6429(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3642();
			if (local9 == 0) {
				return;
			}
			this.method6428(local9, arg0);
		}
	}
}
