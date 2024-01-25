import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class354 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public int anInt9527;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	private int anInt9531;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
	public void method7775(@OriginalArg(0) int arg0) {
		this.anInt9527 = arg0;
		this.anInt9531 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
	public int method7776() {
		return this.anInt9527 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	public void method7779() {
		this.anInt9527 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIII)Z")
	public boolean method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt9531;
		if (arg1 == this.anInt9527 && this.anInt9531 == 0) {
			return false;
		}
		@Pc(64) boolean local64;
		@Pc(87) int local87;
		if (this.anInt9531 == 0) {
			if (this.anInt9527 < arg1 && this.anInt9527 + arg0 >= arg1 || arg1 < this.anInt9527 && arg1 >= this.anInt9527 - arg0) {
				this.anInt9527 = arg1;
				return false;
			}
			local64 = true;
		} else {
			@Pc(92) int local92;
			if (this.anInt9531 > 0 && arg1 > this.anInt9527) {
				local87 = this.anInt9531 * this.anInt9531 / (arg0 * 2);
				local92 = local87 + this.anInt9527;
				if (local92 < arg1 && this.anInt9527 <= local92) {
					local64 = true;
				} else {
					local64 = false;
				}
			} else if (this.anInt9531 < 0 && arg1 < this.anInt9527) {
				local87 = this.anInt9531 * this.anInt9531 / (arg0 * 2);
				local92 = this.anInt9527 - local87;
				if (local92 > arg1 && local92 <= this.anInt9527) {
					local64 = true;
				} else {
					local64 = false;
				}
			} else {
				local64 = false;
			}
		}
		if (local64) {
			if (arg1 > this.anInt9527) {
				this.anInt9531 += arg0;
				if (arg2 != 0 && arg2 < this.anInt9531) {
					this.anInt9531 = arg2;
				}
			} else {
				this.anInt9531 -= arg0;
				if (arg2 != 0 && this.anInt9531 < -arg2) {
					this.anInt9531 = -arg2;
				}
			}
			if (this.anInt9531 != local8) {
				local87 = this.anInt9531 * this.anInt9531 / (arg0 * 2);
				if (arg1 > this.anInt9527) {
					if (arg1 < this.anInt9527 + local87) {
						this.anInt9531 = local8;
					}
				} else if (this.anInt9527 > arg1 && this.anInt9527 - local87 < arg1) {
					this.anInt9531 = local8;
				}
			}
		} else if (this.anInt9531 <= 0) {
			this.anInt9531 += arg0;
			if (this.anInt9531 > 0) {
				this.anInt9531 = 0;
			}
		} else {
			this.anInt9531 -= arg0;
			if (this.anInt9531 < 0) {
				this.anInt9531 = 0;
			}
		}
		this.anInt9527 += this.anInt9531 + local8 >> 1;
		return local64;
	}
}
