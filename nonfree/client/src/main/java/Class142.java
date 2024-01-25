import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class142 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public int anInt4112;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public int anInt4113;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	public int anInt4116;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "J")
	public long aLong116;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
	public int anInt4117;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
	public int anInt4118;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	public int anInt4120;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	public int anInt4123;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	private int anInt4124;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
	public int anInt4125;

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
	public int anInt4126;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	public int anInt4121 = 0;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	public int anInt4122 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!sl;)V")
	public void method3656(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4225();
			if (local12 == 0) {
				return;
			}
			this.method3659(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method3658() {
		this.anInt4123 = Class21.anIntArray655[this.anInt4124 << 3];
		@Pc(17) long local17 = (long) this.anInt4117;
		@Pc(21) long local21 = (long) this.anInt4113;
		@Pc(25) long local25 = (long) this.anInt4120;
		this.anInt4118 = (int) Math.sqrt((double) (local17 * local17 + local21 * local21 + local25 * local25));
		if (this.anInt4125 == 0) {
			this.anInt4125 = 1;
		}
		if (this.anInt4116 == 0) {
			this.aLong116 = 2147483647L;
		} else if (this.anInt4116 == 1) {
			this.aLong116 = this.anInt4118 * 8 / this.anInt4125;
			this.aLong116 *= this.aLong116;
		} else if (this.anInt4116 == 2) {
			this.aLong116 = this.anInt4118 * 8 / this.anInt4125;
		}
		if (this.aBoolean283) {
			this.anInt4118 *= -1;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method3659(@OriginalArg(1) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4124 = arg0.method4221();
		} else if (arg1 == 2) {
			arg0.method4225();
		} else if (arg1 == 3) {
			this.anInt4117 = arg0.method4207();
			this.anInt4113 = arg0.method4207();
			this.anInt4120 = arg0.method4207();
		} else if (arg1 == 4) {
			this.anInt4116 = arg0.method4225();
			this.anInt4125 = arg0.method4207();
		} else if (arg1 == 6) {
			this.anInt4112 = arg0.method4225();
		} else if (arg1 == 8) {
			this.anInt4122 = 1;
		} else if (arg1 == 9) {
			this.anInt4121 = 1;
		} else if (arg1 == 10) {
			this.aBoolean283 = true;
		}
	}
}
