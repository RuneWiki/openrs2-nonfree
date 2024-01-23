import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class143 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public int anInt4267;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public int anInt4268;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	private int anInt4272;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
	public int anInt4277;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	public int anInt4280;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
	public int anInt4283;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
	public int anInt4285;

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
	public int anInt4286;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
	public int anInt4287;

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "J")
	public long aLong164;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "Z")
	private boolean aBoolean384 = false;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public int anInt4269 = 0;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
	public int anInt4284 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method3654(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1853();
			if (local9 == 0) {
				return;
			}
			this.method3659(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BILclient!fh;)V")
	private void method3659(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt4272 = arg1.method1879();
		} else if (arg0 == 2) {
			arg1.method1853();
		} else if (arg0 == 3) {
			this.anInt4267 = arg1.method1860();
			this.anInt4286 = arg1.method1860();
			this.anInt4283 = arg1.method1860();
		} else if (arg0 == 4) {
			this.anInt4285 = arg1.method1853();
			this.anInt4278 = arg1.method1860();
		} else if (arg0 == 6) {
			this.anInt4280 = arg1.method1853();
		} else if (arg0 == 8) {
			this.anInt4269 = 1;
		} else if (arg0 == 9) {
			this.anInt4284 = 1;
		} else if (arg0 == 10) {
			this.aBoolean384 = true;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public void method3661() {
		this.anInt4268 = Class87.anIntArray177[this.anInt4272];
		this.anInt4287 = (int) Math.sqrt((double) (this.anInt4283 * this.anInt4283 + this.anInt4286 * this.anInt4286 + this.anInt4267 * this.anInt4267));
		if (this.anInt4278 == 0) {
			this.anInt4278 = 1;
		}
		if (this.anInt4285 == 0) {
			this.aLong164 = 2147483647L;
		} else if (this.anInt4285 == 1) {
			this.aLong164 = this.anInt4287 * 8 / this.anInt4278;
			this.aLong164 *= this.aLong164;
		} else if (this.anInt4285 == 2) {
			this.aLong164 = this.anInt4287 * 8 / this.anInt4278;
		}
		if (this.aBoolean384) {
			this.anInt4287 *= -1;
		}
	}
}
