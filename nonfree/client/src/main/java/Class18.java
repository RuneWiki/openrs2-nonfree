import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class18 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
	public int anInt306;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "J")
	public long aLong16;

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
	public int anInt319;

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
	public int anInt309 = 0;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
	public int anInt316 = 0;

	@OriginalMember(owner = "client!aw", name = "u", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILclient!ti;)V")
	private void method257(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt310 = arg1.method4498();
		} else if (arg0 == 2) {
			arg1.method4548();
		} else if (arg0 == 3) {
			this.anInt322 = arg1.method4500();
			this.anInt319 = arg1.method4500();
			this.anInt306 = arg1.method4500();
		} else if (arg0 == 4) {
			this.anInt315 = arg1.method4548();
			this.anInt320 = arg1.method4500();
		} else if (arg0 == 6) {
			this.anInt314 = arg1.method4548();
		} else if (arg0 == 8) {
			this.anInt309 = 1;
		} else if (arg0 == 9) {
			this.anInt316 = 1;
		} else if (arg0 == 10) {
			this.aBoolean19 = true;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method258(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4548();
			if (local9 == 0) {
				return;
			}
			this.method257(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public void method260() {
		this.anInt311 = Class262.anIntArray576[this.anInt310 << 3];
		this.anInt312 = (int) Math.sqrt((double) (this.anInt306 * this.anInt306 + this.anInt319 * this.anInt319 + this.anInt322 * this.anInt322));
		if (this.anInt320 == 0) {
			this.anInt320 = 1;
		}
		if (this.anInt315 == 0) {
			this.aLong16 = 2147483647L;
		} else if (this.anInt315 == 1) {
			this.aLong16 = this.anInt312 * 8 / this.anInt320;
			this.aLong16 *= this.aLong16;
		} else if (this.anInt315 == 2) {
			this.aLong16 = this.anInt312 * 8 / this.anInt320;
		}
		if (this.aBoolean19) {
			this.anInt312 *= -1;
		}
	}
}
