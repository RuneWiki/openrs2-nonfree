import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "J")
	public long aLong15;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public int anInt143 = 0;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	public int anInt144 = 0;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!tq;BI)V")
	private void method209(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt149 = arg0.method2404();
		} else if (arg1 == 2) {
			arg0.method2380();
		} else if (arg1 == 3) {
			this.anInt142 = arg0.method2389();
			this.anInt147 = arg0.method2389();
			this.anInt146 = arg0.method2389();
		} else if (arg1 == 4) {
			this.anInt139 = arg0.method2380();
			this.anInt134 = arg0.method2389();
		} else if (arg1 == 6) {
			this.anInt140 = arg0.method2380();
		} else if (arg1 == 8) {
			this.anInt143 = 1;
		} else if (arg1 == 9) {
			this.anInt144 = 1;
		} else if (arg1 == 10) {
			this.aBoolean12 = true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method212(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2380();
			if (local9 == 0) {
				return;
			}
			this.method209(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
	public void method213() {
		this.anInt135 = Class4_Sub4_Sub25.anIntArray383[this.anInt149 << 3];
		this.anInt150 = (int) Math.sqrt((double) (this.anInt142 * this.anInt142 + this.anInt147 * this.anInt147 + this.anInt146 * this.anInt146));
		if (this.anInt134 == 0) {
			this.anInt134 = 1;
		}
		if (this.anInt139 == 0) {
			this.aLong15 = 2147483647L;
		} else if (this.anInt139 == 1) {
			this.aLong15 = this.anInt150 * 8 / this.anInt134;
			this.aLong15 *= this.aLong15;
		} else if (this.anInt139 == 2) {
			this.aLong15 = this.anInt150 * 8 / this.anInt134;
		}
		if (this.aBoolean12) {
			this.anInt150 *= -1;
		}
	}
}
