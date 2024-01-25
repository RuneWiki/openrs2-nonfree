import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public int anInt3;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public int anInt6;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "J")
	public long aLong1;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
	public int anInt14;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	public int anInt19;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	public int anInt20;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public int anInt10 = 0;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	public int anInt11 = 0;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ap;)V")
	public void method10(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2772();
			if (local10 == 0) {
				return;
			}
			this.method14(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public void method11() {
		this.anInt5 = Class147.anIntArray603[this.anInt12 << 3];
		this.anInt20 = (int) Math.sqrt((double) (this.anInt8 * this.anInt8 + this.anInt19 * this.anInt19 + this.anInt1 * this.anInt1));
		if (this.anInt6 == 0) {
			this.anInt6 = 1;
		}
		if (this.anInt3 == 0) {
			this.aLong1 = 2147483647L;
		} else if (this.anInt3 == 1) {
			this.aLong1 = this.anInt20 * 8 / this.anInt6;
			this.aLong1 *= this.aLong1;
		} else if (this.anInt3 == 2) {
			this.aLong1 = this.anInt20 * 8 / this.anInt6;
		}
		if (this.aBoolean1) {
			this.anInt20 *= -1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILclient!ap;)V")
	private void method14(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt12 = arg1.method2764();
		} else if (arg0 == 2) {
			arg1.method2772();
		} else if (arg0 == 3) {
			this.anInt1 = arg1.method2767();
			this.anInt19 = arg1.method2767();
			this.anInt8 = arg1.method2767();
		} else if (arg0 == 4) {
			this.anInt3 = arg1.method2772();
			this.anInt6 = arg1.method2767();
		} else if (arg0 == 6) {
			this.anInt14 = arg1.method2772();
		} else if (arg0 == 8) {
			this.anInt11 = 1;
		} else if (arg0 == 9) {
			this.anInt10 = 1;
		} else if (arg0 == 10) {
			this.aBoolean1 = true;
		}
	}
}
