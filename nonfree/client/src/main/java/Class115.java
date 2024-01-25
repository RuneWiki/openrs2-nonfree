import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class115 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	public int anInt3679;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "I")
	private int anInt3680;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public int anInt3681;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "I")
	public int anInt3686;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	public int anInt3691;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "I")
	public int anInt3694;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	public int anInt3695;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "I")
	public int anInt3697;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "J")
	public long aLong114;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "I")
	public int anInt3699;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public int anInt3683 = 0;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "I")
	public int anInt3690 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public void method3062() {
		this.anInt3697 = Applet_Sub1.anIntArray87[this.anInt3680 << 3];
		this.anInt3681 = (int) Math.sqrt((double) (this.anInt3686 * this.anInt3686 + this.anInt3695 * this.anInt3695 + this.anInt3679 * this.anInt3679));
		if (this.anInt3691 == 0) {
			this.anInt3691 = 1;
		}
		if (this.anInt3694 == 0) {
			this.aLong114 = 2147483647L;
		} else if (this.anInt3694 == 1) {
			this.aLong114 = this.anInt3681 * 8 / this.anInt3691;
			this.aLong114 *= this.aLong114;
		} else if (this.anInt3694 == 2) {
			this.aLong114 = this.anInt3681 * 8 / this.anInt3691;
		}
		if (this.aBoolean287) {
			this.anInt3681 *= -1;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BLclient!bt;)V")
	public void method3064(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6053();
			if (local13 == 0) {
				return;
			}
			this.method3069(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IILclient!bt;)V")
	private void method3069(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt3680 = arg1.method6004();
		} else if (arg0 == 2) {
			arg1.method6053();
		} else if (arg0 == 3) {
			this.anInt3686 = arg1.method6014();
			this.anInt3695 = arg1.method6014();
			this.anInt3679 = arg1.method6014();
		} else if (arg0 == 4) {
			this.anInt3694 = arg1.method6053();
			this.anInt3691 = arg1.method6014();
		} else if (arg0 == 6) {
			this.anInt3689 = arg1.method6053();
		} else if (arg0 == 8) {
			this.anInt3683 = 1;
		} else if (arg0 == 9) {
			this.anInt3690 = 1;
		} else if (arg0 == 10) {
			this.aBoolean287 = true;
		}
	}
}
