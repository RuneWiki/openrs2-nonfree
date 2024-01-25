import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class168 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public int anInt4147;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public int anInt4148;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	public int anInt4150;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	public int anInt4151;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "J")
	public long aLong133;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
	public int anInt4153;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	public int anInt4155;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	public int anInt4156;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	private int anInt4157;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
	public int anInt4161;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
	public int anInt4162;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	public int anInt4152 = 0;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
	private boolean aBoolean272 = false;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public int anInt4158 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method3781(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method3785(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLclient!ha;)V")
	private void method3785(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt4157 = arg1.method3108();
		} else if (arg0 == 2) {
			arg1.method3111();
		} else if (arg0 == 3) {
			this.anInt4162 = arg1.method3109();
			this.anInt4161 = arg1.method3109();
			this.anInt4147 = arg1.method3109();
		} else if (arg0 == 4) {
			this.anInt4150 = arg1.method3111();
			this.anInt4153 = arg1.method3109();
		} else if (arg0 == 6) {
			this.anInt4156 = arg1.method3111();
		} else if (arg0 == 8) {
			this.anInt4152 = 1;
		} else if (arg0 == 9) {
			this.anInt4158 = 1;
		} else if (arg0 == 10) {
			this.aBoolean272 = true;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public void method3787() {
		this.anInt4148 = Class6_Sub1_Sub18.anIntArray643[this.anInt4157 << 3];
		this.anInt4151 = (int) Math.sqrt((double) (this.anInt4147 * this.anInt4147 + this.anInt4161 * this.anInt4161 + this.anInt4162 * this.anInt4162));
		if (this.anInt4153 == 0) {
			this.anInt4153 = 1;
		}
		if (this.anInt4150 == 0) {
			this.aLong133 = 2147483647L;
		} else if (this.anInt4150 == 1) {
			this.aLong133 = this.anInt4151 * 8 / this.anInt4153;
			this.aLong133 *= this.aLong133;
		} else if (this.anInt4150 == 2) {
			this.aLong133 = this.anInt4151 * 8 / this.anInt4153;
		}
		if (this.aBoolean272) {
			this.anInt4151 *= -1;
		}
	}
}
