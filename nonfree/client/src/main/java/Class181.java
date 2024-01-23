import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class181 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public int anInt5741;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	public int anInt5744;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	private int anInt5745;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	public int anInt5747;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	public int anInt5748;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	public int anInt5749;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "J")
	public long aLong226;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "I")
	public int anInt5756;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "I")
	public int anInt5757;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "I")
	public int anInt5758;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	public int anInt5759;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	public int anInt5750 = 0;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
	private boolean aBoolean410 = false;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "I")
	public int anInt5753 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ug;Z)V")
	public void method4734(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3915();
			if (local9 == 0) {
				return;
			}
			this.method4735(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ug;I)V")
	private void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt5745 = arg1.method3948();
		} else if (arg0 == 2) {
			arg1.method3915();
		} else if (arg0 == 3) {
			this.anInt5748 = arg1.method3896();
			this.anInt5749 = arg1.method3896();
			this.anInt5747 = arg1.method3896();
		} else if (arg0 == 4) {
			this.anInt5757 = arg1.method3915();
			this.anInt5758 = arg1.method3896();
		} else if (arg0 == 6) {
			this.anInt5756 = arg1.method3915();
		} else if (arg0 == 8) {
			this.anInt5750 = 1;
		} else if (arg0 == 9) {
			this.anInt5753 = 1;
		} else if (arg0 == 10) {
			this.aBoolean410 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public void method4739() {
		this.anInt5744 = Class11.anIntArray27[this.anInt5745];
		this.anInt5741 = (int) Math.sqrt((double) (this.anInt5747 * this.anInt5747 + this.anInt5748 * this.anInt5748 + this.anInt5749 * this.anInt5749));
		if (this.anInt5758 == 0) {
			this.anInt5758 = 1;
		}
		if (this.anInt5757 == 0) {
			this.aLong226 = 2147483647L;
		} else if (this.anInt5757 == 1) {
			this.aLong226 = this.anInt5741 * 8 / this.anInt5758;
			this.aLong226 *= this.aLong226;
		} else if (this.anInt5757 == 2) {
			this.aLong226 = this.anInt5741 * 8 / this.anInt5758;
		}
		if (this.aBoolean410) {
			this.anInt5741 *= -1;
		}
	}
}
