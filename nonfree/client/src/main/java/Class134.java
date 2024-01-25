import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class134 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public int anInt3780;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	public int anInt3783;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "J")
	public long aLong125;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public int anInt3784;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public int anInt3785;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	public int anInt3787;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	private int anInt3788;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	public int anInt3792;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
	public int anInt3794;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
	public int anInt3789 = 0;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	public int anInt3793 = 0;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method3037(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt3788 = arg1.method3943();
		} else if (arg0 == 2) {
			arg1.method3981();
		} else if (arg0 == 3) {
			this.anInt3790 = arg1.method3938();
			this.anInt3780 = arg1.method3938();
			this.anInt3785 = arg1.method3938();
		} else if (arg0 == 4) {
			this.anInt3792 = arg1.method3981();
			this.anInt3779 = arg1.method3938();
		} else if (arg0 == 6) {
			this.anInt3787 = arg1.method3981();
		} else if (arg0 == 8) {
			this.anInt3793 = 1;
		} else if (arg0 == 9) {
			this.anInt3789 = 1;
			return;
		} else if (arg0 == 10) {
			this.aBoolean227 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public void method3039() {
		this.anInt3783 = Class22_Sub7.anIntArray410[this.anInt3788 << 3];
		this.anInt3794 = (int) Math.sqrt((double) (this.anInt3785 * this.anInt3785 + this.anInt3790 * this.anInt3790 + this.anInt3780 * this.anInt3780));
		if (this.anInt3779 == 0) {
			this.anInt3779 = 1;
		}
		if (this.anInt3792 == 0) {
			this.aLong125 = 2147483647L;
		} else if (this.anInt3792 == 1) {
			this.aLong125 = this.anInt3794 * 8 / this.anInt3779;
			this.aLong125 *= this.aLong125;
		} else if (this.anInt3792 == 2) {
			this.aLong125 = this.anInt3794 * 8 / this.anInt3779;
		}
		if (this.aBoolean227) {
			this.anInt3794 *= -1;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!gk;)V")
	public void method3040(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3981();
			if (local13 == 0) {
				return;
			}
			this.method3037(local13, arg0);
		}
	}
}
