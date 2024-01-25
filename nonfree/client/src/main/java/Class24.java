import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class24 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	public int anInt570;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public int anInt571;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public int anInt573;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "J")
	public long aLong24;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	private int anInt581;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
	public int anInt574 = 0;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	public int anInt585 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BILclient!lk;)V")
	private void method648(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt581 = arg1.method4245();
		} else if (arg0 == 2) {
			arg1.method4240();
		} else if (arg0 == 3) {
			this.anInt578 = arg1.method4239();
			this.anInt571 = arg1.method4239();
			this.anInt579 = arg1.method4239();
		} else if (arg0 == 4) {
			this.anInt576 = arg1.method4240();
			this.anInt570 = arg1.method4239();
		} else if (arg0 == 6) {
			this.anInt575 = arg1.method4240();
		} else if (arg0 == 8) {
			this.anInt574 = 1;
		} else if (arg0 == 9) {
			this.anInt585 = 1;
		} else if (arg0 == 10) {
			this.aBoolean40 = true;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public void method649() {
		this.anInt573 = Class104.anIntArray706[this.anInt581 << 3];
		this.anInt572 = (int) Math.sqrt((double) (this.anInt578 * this.anInt578 + this.anInt571 * this.anInt571 + this.anInt579 * this.anInt579));
		if (this.anInt570 == 0) {
			this.anInt570 = 1;
		}
		if (this.anInt576 == 0) {
			this.aLong24 = 2147483647L;
		} else if (this.anInt576 == 1) {
			this.aLong24 = this.anInt572 * 8 / this.anInt570;
			this.aLong24 *= this.aLong24;
		} else if (this.anInt576 == 2) {
			this.aLong24 = this.anInt572 * 8 / this.anInt570;
		}
		if (this.aBoolean40) {
			this.anInt572 *= -1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!lk;B)V")
	public void method650(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4240();
			if (local15 == 0) {
				return;
			}
			this.method648(local15, arg0);
		}
	}
}
