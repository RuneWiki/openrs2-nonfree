import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class274 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	public int anInt8361;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public int anInt8366;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public int anInt8367;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "I")
	public int anInt8368;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "I")
	public int anInt8369;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public int anInt8370;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	public int anInt8372;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "I")
	public int anInt8373;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	private int anInt8375;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "I")
	public int anInt8378;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	public int anInt8363 = 0;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	public int anInt8362 = 0;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V")
	public void method7005() {
		this.anInt8372 = Class125.anIntArray382[this.anInt8375 << 3];
		this.anInt8373 = (int) Math.sqrt((double) (this.anInt8361 * this.anInt8361 + this.anInt8369 * this.anInt8369 + this.anInt8366 * this.anInt8366));
		if (this.anInt8368 == 0) {
			this.anInt8368 = 1;
		}
		if (this.anInt8370 == 0) {
			this.aLong208 = 2147483647L;
		} else if (this.anInt8370 == 1) {
			this.aLong208 = this.anInt8373 * 8 / this.anInt8368;
			this.aLong208 *= this.aLong208;
		} else if (this.anInt8370 == 2) {
			this.aLong208 = this.anInt8373 * 8 / this.anInt8368;
		}
		if (this.aBoolean604) {
			this.anInt8373 *= -1;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZLclient!ps;)V")
	private void method7006(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt8375 = arg1.method5229();
		} else if (arg0 == 2) {
			arg1.method5170();
		} else if (arg0 == 3) {
			this.anInt8369 = arg1.method5198();
			this.anInt8366 = arg1.method5198();
			this.anInt8361 = arg1.method5198();
		} else if (arg0 == 4) {
			this.anInt8370 = arg1.method5170();
			this.anInt8368 = arg1.method5198();
		} else if (arg0 == 6) {
			this.anInt8378 = arg1.method5170();
		} else if (arg0 == 8) {
			this.anInt8363 = 1;
			return;
		} else if (arg0 == 9) {
			this.anInt8362 = 1;
			return;
		} else if (arg0 == 10) {
			this.aBoolean604 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLclient!ps;)V")
	public void method7007(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5170();
			if (local10 == 0) {
				return;
			}
			this.method7006(local10, arg0);
		}
	}
}
