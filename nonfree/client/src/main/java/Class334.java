import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class334 {

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
	private int anInt8423;

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
	public int anInt8424;

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
	public int anInt8425;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
	public int anInt8427;

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "I")
	public int anInt8429;

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
	public int anInt8431;

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "J")
	public long aLong246;

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
	public int anInt8436;

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
	public int anInt8437;

	@OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
	public int anInt8439;

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
	public int anInt8440;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
	public int anInt8426 = 0;

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "Z")
	private boolean aBoolean648 = false;

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
	public int anInt8435 = 0;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
	public void method7018() {
		this.anInt8440 = Class356.anIntArray598[this.anInt8423 << 3];
		@Pc(23) long local23 = (long) this.anInt8427;
		@Pc(27) long local27 = (long) this.anInt8437;
		@Pc(31) long local31 = (long) this.anInt8436;
		this.anInt8439 = (int) Math.sqrt((double) (local31 * local31 + local23 * local23 + local27 * local27));
		if (this.anInt8425 == 0) {
			this.anInt8425 = 1;
		}
		if (this.anInt8429 == 0) {
			this.aLong246 = 2147483647L;
		} else if (this.anInt8429 == 1) {
			this.aLong246 = this.anInt8439 * 8 / this.anInt8425;
			this.aLong246 *= this.aLong246;
		} else if (this.anInt8429 == 2) {
			this.aLong246 = this.anInt8439 * 8 / this.anInt8425;
		}
		if (this.aBoolean648) {
			this.anInt8439 *= -1;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!np;I)V")
	public void method7019(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method7022(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILclient!np;)V")
	private void method7022(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt8423 = arg1.method5198();
		} else if (arg0 == 2) {
			arg1.method5175();
		} else if (arg0 == 3) {
			this.anInt8427 = arg1.method5186();
			this.anInt8437 = arg1.method5186();
			this.anInt8436 = arg1.method5186();
		} else if (arg0 == 4) {
			this.anInt8429 = arg1.method5175();
			this.anInt8425 = arg1.method5186();
		} else if (arg0 == 6) {
			this.anInt8424 = arg1.method5175();
		} else if (arg0 == 8) {
			this.anInt8426 = 1;
		} else if (arg0 == 9) {
			this.anInt8435 = 1;
		} else if (arg0 == 10) {
			this.aBoolean648 = true;
		}
	}
}
