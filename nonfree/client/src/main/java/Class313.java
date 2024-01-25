import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class313 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	public int anInt8608;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	public int anInt8612;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public int anInt8613;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	private int anInt8614;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "J")
	public long aLong229;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public int anInt8617;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt8618;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public int anInt8619;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public int anInt8620;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public int anInt8623;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public int anInt8624;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public int anInt8611 = 0;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Z")
	private boolean aBoolean708 = false;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	public int anInt8622 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ee;I)V")
	public void method7418(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8645();
			if (local15 == 0) {
				return;
			}
			this.method7422(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public void method7419() {
		this.anInt8619 = Class5_Sub12_Sub1.anIntArray749[this.anInt8614 << 3];
		@Pc(17) long local17 = (long) this.anInt8617;
		@Pc(21) long local21 = (long) this.anInt8612;
		@Pc(25) long local25 = (long) this.anInt8620;
		this.anInt8613 = (int) Math.sqrt((double) (local17 * local17 + local21 * local21 + local25 * local25));
		if (this.anInt8624 == 0) {
			this.anInt8624 = 1;
		}
		if (this.anInt8608 == 0) {
			this.aLong229 = 2147483647L;
		} else if (this.anInt8608 == 1) {
			this.aLong229 = (long) (this.anInt8613 * 8 / this.anInt8624);
			this.aLong229 *= this.aLong229;
		} else if (this.anInt8608 == 2) {
			this.aLong229 = (long) (this.anInt8613 * 8 / this.anInt8624);
		}
		if (this.aBoolean708) {
			this.anInt8613 *= -1;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!ee;)V")
	private void method7422(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt8614 = arg1.method8631();
		} else if (arg0 == 2) {
			arg1.method8645();
		} else if (arg0 == 3) {
			this.anInt8617 = arg1.method8623();
			this.anInt8612 = arg1.method8623();
			this.anInt8620 = arg1.method8623();
		} else if (arg0 == 4) {
			this.anInt8608 = arg1.method8645();
			this.anInt8624 = arg1.method8623();
		} else if (arg0 == 6) {
			this.anInt8618 = arg1.method8645();
		} else if (arg0 == 8) {
			this.anInt8622 = 1;
		} else if (arg0 == 9) {
			this.anInt8611 = 1;
		} else if (arg0 == 10) {
			this.aBoolean708 = true;
		}
	}
}
