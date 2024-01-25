import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class187 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public int anInt5473;

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
	public int anInt5474;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
	public int anInt5475;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public int anInt5476;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	public int anInt5478;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
	public int anInt5481;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
	private int anInt5484;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public int anInt5488;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "J")
	public long aLong185;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
	public int anInt5489;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
	public int anInt5491;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public int anInt5485 = 0;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
	public int anInt5490 = 0;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Z")
	private boolean aBoolean453 = false;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	public void method4643() {
		this.anInt5475 = Class3_Sub2_Sub21.anIntArray356[this.anInt5484 << 3];
		@Pc(17) long local17 = (long) this.anInt5478;
		@Pc(21) long local21 = (long) this.anInt5473;
		@Pc(25) long local25 = (long) this.anInt5481;
		this.anInt5488 = (int) Math.sqrt((double) (local25 * local25 + local17 * local17 + local21 * local21));
		if (this.anInt5491 == 0) {
			this.anInt5491 = 1;
		}
		if (this.anInt5489 == 0) {
			this.aLong185 = 2147483647L;
		} else if (this.anInt5489 == 1) {
			this.aLong185 = (long) (this.anInt5488 * 8 / this.anInt5491);
			this.aLong185 *= this.aLong185;
		} else if (this.anInt5489 == 2) {
			this.aLong185 = (long) (this.anInt5488 * 8 / this.anInt5491);
		}
		if (this.aBoolean453) {
			this.anInt5488 *= -1;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILclient!rba;)V")
	private void method4644(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt5484 = arg1.method5272();
		} else if (arg0 == 2) {
			arg1.method5322(-88);
		} else if (arg0 == 3) {
			this.anInt5478 = arg1.method5312();
			this.anInt5473 = arg1.method5312();
			this.anInt5481 = arg1.method5312();
		} else if (arg0 == 4) {
			this.anInt5489 = arg1.method5322(-29);
			this.anInt5491 = arg1.method5312();
		} else if (arg0 == 6) {
			this.anInt5474 = arg1.method5322(-32);
		} else if (arg0 == 8) {
			this.anInt5490 = 1;
		} else if (arg0 == 9) {
			this.anInt5485 = 1;
		} else if (arg0 == 10) {
			this.aBoolean453 = true;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method4646(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-41);
			if (local5 == 0) {
				return;
			}
			this.method4644(local5, arg0);
		}
	}
}
