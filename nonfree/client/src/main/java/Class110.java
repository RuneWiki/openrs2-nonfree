import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class110 {

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
	private int anInt3227;

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "J")
	public long aLong93;

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
	public int anInt3228;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
	public int anInt3230;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
	public int anInt3232;

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	public int anInt3234;

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
	public int anInt3235;

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
	public int anInt3236;

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
	public int anInt3237;

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
	public int anInt3238;

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
	public int anInt3240;

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
	public int anInt3239 = 0;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
	public int anInt3225 = 0;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	public void method2875() {
		this.anInt3238 = Class3_Sub17.anIntArray177[this.anInt3227 << 3];
		@Pc(17) long local17 = (long) this.anInt3232;
		@Pc(21) long local21 = (long) this.anInt3237;
		@Pc(25) long local25 = (long) this.anInt3228;
		this.anInt3234 = (int) Math.sqrt((double) (local25 * local25 + local17 * local17 + local21 * local21));
		if (this.anInt3235 == 0) {
			this.anInt3235 = 1;
		}
		if (this.anInt3230 == 0) {
			this.aLong93 = 2147483647L;
		} else if (this.anInt3230 == 1) {
			this.aLong93 = this.anInt3234 * 8 / this.anInt3235;
			this.aLong93 *= this.aLong93;
		} else if (this.anInt3230 == 2) {
			this.aLong93 = this.anInt3234 * 8 / this.anInt3235;
		}
		if (this.aBoolean265) {
			this.anInt3234 *= -1;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLclient!qh;)V")
	public void method2876(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3118();
			if (local13 == 0) {
				return;
			}
			this.method2880(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILclient!qh;)V")
	private void method2880(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3227 = arg1.method3109();
		} else if (arg0 == 2) {
			arg1.method3118();
		} else if (arg0 == 3) {
			this.anInt3232 = arg1.method3116();
			this.anInt3237 = arg1.method3116();
			this.anInt3228 = arg1.method3116();
		} else if (arg0 == 4) {
			this.anInt3230 = arg1.method3118();
			this.anInt3235 = arg1.method3116();
		} else if (arg0 == 6) {
			this.anInt3240 = arg1.method3118();
		} else if (arg0 == 8) {
			this.anInt3225 = 1;
		} else if (arg0 == 9) {
			this.anInt3239 = 1;
		} else if (arg0 == 10) {
			this.aBoolean265 = true;
			return;
		}
	}
}
