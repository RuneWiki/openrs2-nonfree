import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class137 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public int anInt3799;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public int anInt3800;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public int anInt3801;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public int anInt3802;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public int anInt3804;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "J")
	public long aLong120;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public int anInt3805;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	private int anInt3808;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public int anInt3811;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	public int anInt3814;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "I")
	public int anInt3816;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public int anInt3807 = 0;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "I")
	public int anInt3810 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!co;)V")
	private void method3285(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt3808 = arg1.method4227();
		} else if (arg0 == 2) {
			arg1.method4220();
		} else if (arg0 == 3) {
			this.anInt3805 = arg1.method4230();
			this.anInt3811 = arg1.method4230();
			this.anInt3799 = arg1.method4230();
		} else if (arg0 == 4) {
			this.anInt3814 = arg1.method4220();
			this.anInt3802 = arg1.method4230();
		} else if (arg0 == 6) {
			this.anInt3800 = arg1.method4220();
		} else if (arg0 == 8) {
			this.anInt3810 = 1;
		} else if (arg0 == 9) {
			this.anInt3807 = 1;
		} else if (arg0 == 10) {
			this.aBoolean227 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!co;Z)V")
	public void method3286(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method3285(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public void method3287() {
		this.anInt3816 = Class5_Sub2_Sub16.anIntArray410[this.anInt3808 << 3];
		this.anInt3804 = (int) Math.sqrt((double) (this.anInt3799 * this.anInt3799 + this.anInt3805 * this.anInt3805 + this.anInt3811 * this.anInt3811));
		if (this.anInt3802 == 0) {
			this.anInt3802 = 1;
		}
		if (this.anInt3814 == 0) {
			this.aLong120 = 2147483647L;
		} else if (this.anInt3814 == 1) {
			this.aLong120 = this.anInt3804 * 8 / this.anInt3802;
			this.aLong120 *= this.aLong120;
		} else if (this.anInt3814 == 2) {
			this.aLong120 = this.anInt3804 * 8 / this.anInt3802;
		}
		if (this.aBoolean227) {
			this.anInt3804 *= -1;
		}
	}
}
