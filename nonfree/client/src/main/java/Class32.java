import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class32 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "J")
	public long aLong21;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public int anInt772 = 0;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	public int anInt785 = 0;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	public void method937() {
		this.anInt779 = Class24.anIntArray36[this.anInt789 << 3];
		this.anInt774 = (int) Math.sqrt((double) (this.anInt783 * this.anInt783 + this.anInt775 * this.anInt775 + this.anInt781 * this.anInt781));
		if (this.anInt776 == 0) {
			this.anInt776 = 1;
		}
		if (this.anInt777 == 0) {
			this.aLong21 = 2147483647L;
		} else if (this.anInt777 == 1) {
			this.aLong21 = this.anInt774 * 8 / this.anInt776;
			this.aLong21 *= this.aLong21;
		} else if (this.anInt777 == 2) {
			this.aLong21 = this.anInt774 * 8 / this.anInt776;
		}
		if (this.aBoolean78) {
			this.anInt774 *= -1;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!dg;)V")
	public void method940(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4421();
			if (local11 == 0) {
				return;
			}
			this.method941(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!dg;)V")
	private void method941(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt789 = arg1.method4464();
		} else if (arg0 == 2) {
			arg1.method4421();
		} else if (arg0 == 3) {
			this.anInt783 = arg1.method4444();
			this.anInt775 = arg1.method4444();
			this.anInt781 = arg1.method4444();
		} else if (arg0 == 4) {
			this.anInt777 = arg1.method4421();
			this.anInt776 = arg1.method4444();
		} else if (arg0 == 6) {
			this.anInt782 = arg1.method4421();
		} else if (arg0 == 8) {
			this.anInt772 = 1;
		} else if (arg0 == 9) {
			this.anInt785 = 1;
		} else if (arg0 == 10) {
			this.aBoolean78 = true;
		}
	}
}
