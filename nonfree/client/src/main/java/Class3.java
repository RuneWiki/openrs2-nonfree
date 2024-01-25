import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	private int anInt36;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "J")
	public long aLong10;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public int anInt41 = 0;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public int anInt47 = 0;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public void method29() {
		this.anInt43 = Class229.anIntArray536[this.anInt36 << 3];
		this.anInt52 = (int) Math.sqrt((double) (this.anInt39 * this.anInt39 + this.anInt35 * this.anInt35 + this.anInt50 * this.anInt50));
		if (this.anInt40 == 0) {
			this.anInt40 = 1;
		}
		if (this.anInt45 == 0) {
			this.aLong10 = 2147483647L;
		} else if (this.anInt45 == 1) {
			this.aLong10 = this.anInt52 * 8 / this.anInt40;
			this.aLong10 *= this.aLong10;
		} else if (this.anInt45 == 2) {
			this.aLong10 = this.anInt52 * 8 / this.anInt40;
		}
		if (this.aBoolean1) {
			this.anInt52 *= -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZLclient!hw;)V")
	private void method30(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt36 = arg1.method6148();
		} else if (arg0 == 2) {
			arg1.method6138();
		} else if (arg0 == 3) {
			this.anInt39 = arg1.method6129();
			this.anInt35 = arg1.method6129();
			this.anInt50 = arg1.method6129();
		} else if (arg0 == 4) {
			this.anInt45 = arg1.method6138();
			this.anInt40 = arg1.method6129();
		} else if (arg0 == 6) {
			this.anInt37 = arg1.method6138();
		} else if (arg0 == 8) {
			this.anInt41 = 1;
			return;
		} else if (arg0 == 9) {
			this.anInt47 = 1;
			return;
		} else if (arg0 == 10) {
			this.aBoolean1 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!hw;)V")
	public void method33(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6138();
			if (local15 == 0) {
				return;
			}
			this.method30(local15, arg0);
		}
	}
}
