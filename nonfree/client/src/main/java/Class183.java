import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class183 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public int anInt5428;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public int anInt5431;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public int anInt5432;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public int anInt5435;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	public int anInt5436;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	public int anInt5438;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	private int anInt5441;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "J")
	public long aLong176;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
	public int anInt5443;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public int anInt5444;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public int anInt5437 = 0;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
	private boolean aBoolean466 = false;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	public int anInt5442 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public void method4823() {
		this.anInt5432 = Class1_Sub1_Sub16.anIntArray586[this.anInt5441 << 3];
		this.anInt5435 = (int) Math.sqrt((double) (this.anInt5438 * this.anInt5438 + this.anInt5443 * this.anInt5443 + this.anInt5431 * this.anInt5431));
		if (this.anInt5428 == 0) {
			this.anInt5428 = 1;
		}
		if (this.anInt5446 == 0) {
			this.aLong176 = 2147483647L;
		} else if (this.anInt5446 == 1) {
			this.aLong176 = this.anInt5435 * 8 / this.anInt5428;
			this.aLong176 *= this.aLong176;
		} else if (this.anInt5446 == 2) {
			this.aLong176 = this.anInt5435 * 8 / this.anInt5428;
		}
		if (this.aBoolean466) {
			this.anInt5435 *= -1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!eb;)V")
	public void method4826(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3141();
			if (local16 == 0) {
				return;
			}
			this.method4829(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!eb;IB)V")
	private void method4829(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5441 = arg0.method3115();
		} else if (arg1 == 2) {
			arg0.method3141();
		} else if (arg1 == 3) {
			this.anInt5443 = arg0.method3125();
			this.anInt5431 = arg0.method3125();
			this.anInt5438 = arg0.method3125();
		} else if (arg1 == 4) {
			this.anInt5446 = arg0.method3141();
			this.anInt5428 = arg0.method3125();
		} else if (arg1 == 6) {
			this.anInt5436 = arg0.method3141();
		} else if (arg1 == 8) {
			this.anInt5442 = 1;
		} else if (arg1 == 9) {
			this.anInt5437 = 1;
		} else if (arg1 == 10) {
			this.aBoolean466 = true;
		}
	}
}
