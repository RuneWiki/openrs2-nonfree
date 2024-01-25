import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class179 {

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	public int anInt5326;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public int anInt5328;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	public int anInt5329;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
	private int anInt5331;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	public int anInt5332;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	public int anInt5333;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
	public int anInt5335;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
	public int anInt5336;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
	public int anInt5339;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
	public int anInt5342;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public int anInt5330 = 0;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
	public int anInt5334 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILclient!ec;)V")
	private void method4846(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt5331 = arg1.method4021();
		} else if (arg0 == 2) {
			arg1.method3972();
		} else if (arg0 == 3) {
			this.anInt5342 = arg1.method3979();
			this.anInt5335 = arg1.method3979();
			this.anInt5336 = arg1.method3979();
		} else if (arg0 == 4) {
			this.anInt5339 = arg1.method3972();
			this.anInt5328 = arg1.method3979();
		} else if (arg0 == 6) {
			this.anInt5333 = arg1.method3972();
		} else if (arg0 == 8) {
			this.anInt5330 = 1;
		} else if (arg0 == 9) {
			this.anInt5334 = 1;
		} else if (arg0 == 10) {
			this.aBoolean370 = true;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!ec;)V")
	public void method4848(@OriginalArg(1) Class6_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3972();
			if (local5 == 0) {
				return;
			}
			this.method4846(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
	public void method4851() {
		this.anInt5326 = Class207.anIntArray698[this.anInt5331 << 3];
		this.anInt5329 = (int) Math.sqrt((double) (this.anInt5342 * this.anInt5342 + this.anInt5335 * this.anInt5335 + this.anInt5336 * this.anInt5336));
		if (this.anInt5328 == 0) {
			this.anInt5328 = 1;
		}
		if (this.anInt5339 == 0) {
			this.aLong175 = 2147483647L;
		} else if (this.anInt5339 == 1) {
			this.aLong175 = this.anInt5329 * 8 / this.anInt5328;
			this.aLong175 *= this.aLong175;
		} else if (this.anInt5339 == 2) {
			this.aLong175 = this.anInt5329 * 8 / this.anInt5328;
		}
		if (this.aBoolean370) {
			this.anInt5329 *= -1;
		}
	}
}
