import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class208 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "J")
	public long aLong209;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	public int anInt6369;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	private int anInt6371;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	public int anInt6372;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	public int anInt6373;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	public int anInt6374;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	public int anInt6376;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public int anInt6378;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	public int anInt6379;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public int anInt6380;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public int anInt6383;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	public int anInt6370 = 0;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
	public int anInt6375 = 0;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
	private boolean aBoolean466 = false;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!lf;Z)V")
	private void method5387(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt6371 = arg1.method3401();
		} else if (arg0 == 2) {
			arg1.method3440();
		} else if (arg0 == 3) {
			this.anInt6373 = arg1.method3418();
			this.anInt6376 = arg1.method3418();
			this.anInt6372 = arg1.method3418();
		} else if (arg0 == 4) {
			this.anInt6380 = arg1.method3440();
			this.anInt6379 = arg1.method3418();
		} else if (arg0 == 6) {
			this.anInt6383 = arg1.method3440();
		} else if (arg0 == 8) {
			this.anInt6375 = 1;
		} else if (arg0 == 9) {
			this.anInt6370 = 1;
		} else if (arg0 == 10) {
			this.aBoolean466 = true;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!lf;B)V")
	public void method5388(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3440();
			if (local11 == 0) {
				return;
			}
			this.method5387(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public void method5391() {
		this.anInt6378 = Class118_Sub1.anIntArray317[this.anInt6371 << 3];
		this.anInt6374 = (int) Math.sqrt((double) (this.anInt6372 * this.anInt6372 + this.anInt6373 * this.anInt6373 + this.anInt6376 * this.anInt6376));
		if (this.anInt6379 == 0) {
			this.anInt6379 = 1;
		}
		if (this.anInt6380 == 0) {
			this.aLong209 = 2147483647L;
		} else if (this.anInt6380 == 1) {
			this.aLong209 = this.anInt6374 * 8 / this.anInt6379;
			this.aLong209 *= this.aLong209;
		} else if (this.anInt6380 == 2) {
			this.aLong209 = this.anInt6374 * 8 / this.anInt6379;
		}
		if (this.aBoolean466) {
			this.anInt6374 *= -1;
		}
	}
}
