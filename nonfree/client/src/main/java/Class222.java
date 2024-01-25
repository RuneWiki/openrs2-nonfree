import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class222 {

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public int anInt6336;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
	public int anInt6337;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	public int anInt6338;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	public int anInt6339;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "J")
	public long aLong160;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	public int anInt6344;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
	private int anInt6345;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
	public int anInt6349;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
	public int anInt6346 = 0;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public int anInt6342 = 0;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!un;Z)V")
	public void method5384(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4905();
			if (local10 == 0) {
				return;
			}
			this.method5385(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLclient!un;I)V")
	private void method5385(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6345 = arg0.method4936();
		} else if (arg1 == 2) {
			arg0.method4905();
		} else if (arg1 == 3) {
			this.anInt6338 = arg0.method4931();
			this.anInt6337 = arg0.method4931();
			this.anInt6339 = arg0.method4931();
		} else if (arg1 == 4) {
			this.anInt6349 = arg0.method4905();
			this.anInt6343 = arg0.method4931();
		} else if (arg1 == 6) {
			this.anInt6340 = arg0.method4905();
		} else if (arg1 == 8) {
			this.anInt6346 = 1;
		} else if (arg1 == 9) {
			this.anInt6342 = 1;
		} else if (arg1 == 10) {
			this.aBoolean462 = true;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)V")
	public void method5386() {
		this.anInt6344 = Class4_Sub27.anIntArray297[this.anInt6345 << 3];
		@Pc(21) long local21 = (long) this.anInt6338;
		@Pc(25) long local25 = (long) this.anInt6337;
		@Pc(29) long local29 = (long) this.anInt6339;
		this.anInt6347 = (int) Math.sqrt((double) (local29 * local29 + local21 * local21 + local25 * local25));
		if (this.anInt6343 == 0) {
			this.anInt6343 = 1;
		}
		if (this.anInt6349 == 0) {
			this.aLong160 = 2147483647L;
		} else if (this.anInt6349 == 1) {
			this.aLong160 = this.anInt6347 * 8 / this.anInt6343;
			this.aLong160 *= this.aLong160;
		} else if (this.anInt6349 == 2) {
			this.aLong160 = this.anInt6347 * 8 / this.anInt6343;
		}
		if (this.aBoolean462) {
			this.anInt6347 *= -1;
		}
	}
}
