import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class129 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	public int anInt3762;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public int anInt3764;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	private int anInt3766;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public int anInt3767;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	public int anInt3770;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	public int anInt3771;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public int anInt3772;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	public int anInt3777;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "J")
	public long aLong117;

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
	public int anInt3781 = 0;

	@OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
	public int anInt3783 = 0;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public void method3509() {
		this.anInt3777 = Class14_Sub3_Sub34.anIntArray546[this.anInt3766 << 3];
		this.anInt3764 = (int) Math.sqrt((double) (this.anInt3772 * this.anInt3772 + this.anInt3770 * this.anInt3770 + this.anInt3762 * this.anInt3762));
		if (this.anInt3767 == 0) {
			this.anInt3767 = 1;
		}
		if (this.anInt3782 == 0) {
			this.aLong117 = 2147483647L;
		} else if (this.anInt3782 == 1) {
			this.aLong117 = this.anInt3764 * 8 / this.anInt3767;
			this.aLong117 *= this.aLong117;
		} else if (this.anInt3782 == 2) {
			this.aLong117 = this.anInt3764 * 8 / this.anInt3767;
		}
		if (this.aBoolean240) {
			this.anInt3764 *= -1;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!jg;)V")
	public void method3511(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2548();
			if (local9 == 0) {
				return;
			}
			this.method3515(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!jg;I)V")
	private void method3515(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3766 = arg0.method2498();
		} else if (arg1 == 2) {
			arg0.method2548();
		} else if (arg1 == 3) {
			this.anInt3770 = arg0.method2510();
			this.anInt3772 = arg0.method2510();
			this.anInt3762 = arg0.method2510();
		} else if (arg1 == 4) {
			this.anInt3782 = arg0.method2548();
			this.anInt3767 = arg0.method2510();
		} else if (arg1 == 6) {
			this.anInt3771 = arg0.method2548();
		} else if (arg1 == 8) {
			this.anInt3783 = 1;
		} else if (arg1 == 9) {
			this.anInt3781 = 1;
			return;
		} else if (arg1 == 10) {
			this.aBoolean240 = true;
			return;
		}
	}
}
