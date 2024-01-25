import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class173 {

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	public int anInt5572;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	private int anInt5573;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public void method4691() {
		this.anInt5572 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Z")
	public boolean method4693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.anInt5573;
		if (arg0 == this.anInt5572 && this.anInt5573 == 0) {
			return false;
		}
		@Pc(63) boolean local63;
		@Pc(49) int local49;
		if (this.anInt5573 == 0) {
			if (arg0 > this.anInt5572 && this.anInt5572 + arg2 >= arg0 || arg0 < this.anInt5572 && this.anInt5572 - arg2 <= arg0) {
				this.anInt5572 = arg0;
				return false;
			}
			local63 = true;
		} else {
			@Pc(54) int local54;
			if (this.anInt5573 > 0 && arg0 > this.anInt5572) {
				local49 = this.anInt5573 * this.anInt5573 / (arg2 * 2);
				local54 = local49 + this.anInt5572;
				if (local54 < arg0 && this.anInt5572 <= local54) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else if (this.anInt5573 < 0 && arg0 < this.anInt5572) {
				local49 = this.anInt5573 * this.anInt5573 / (arg2 * 2);
				local54 = this.anInt5572 - local49;
				if (local54 > arg0 && local54 <= this.anInt5572) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else {
				local63 = false;
			}
		}
		if (local63) {
			if (arg0 <= this.anInt5572) {
				this.anInt5573 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt5573) {
					this.anInt5573 = -arg1;
				}
			} else {
				this.anInt5573 += arg2;
				if (arg1 != 0 && arg1 < this.anInt5573) {
					this.anInt5573 = arg1;
				}
			}
			if (this.anInt5573 != local16) {
				local49 = this.anInt5573 * this.anInt5573 / (arg2 * 2);
				if (arg0 > this.anInt5572) {
					if (this.anInt5572 + local49 > arg0) {
						this.anInt5573 = local16;
					}
				} else if (this.anInt5572 > arg0 && this.anInt5572 - local49 < arg0) {
					this.anInt5573 = local16;
				}
			}
		} else if (this.anInt5573 <= 0) {
			this.anInt5573 += arg2;
			if (this.anInt5573 > 0) {
				this.anInt5573 = 0;
			}
		} else {
			this.anInt5573 -= arg2;
			if (this.anInt5573 < 0) {
				this.anInt5573 = 0;
			}
		}
		this.anInt5572 += this.anInt5573 + local16 >> 1;
		return local63;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
	public int method4694() {
		return this.anInt5572 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
	public void method4695(@OriginalArg(1) int arg0) {
		this.anInt5573 = 0;
		this.anInt5572 = arg0;
	}
}
