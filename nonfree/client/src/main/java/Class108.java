import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class108 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt3425;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt3431;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public void method2972() {
		this.anInt3431 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)I")
	public int method2976() {
		return this.anInt3431 & 0x3FFF;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)Z")
	public boolean method2978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3425;
		if (this.anInt3431 == arg2 && this.anInt3425 == 0) {
			return false;
		}
		@Pc(56) boolean local56;
		@Pc(85) int local85;
		if (this.anInt3425 == 0) {
			if (arg2 > this.anInt3431 && arg2 <= this.anInt3431 + arg1 || this.anInt3431 > arg2 && arg2 >= this.anInt3431 - arg1) {
				this.anInt3431 = arg2;
				return false;
			}
			local56 = true;
		} else {
			@Pc(91) int local91;
			if (this.anInt3425 > 0 && this.anInt3431 < arg2) {
				local85 = this.anInt3425 * this.anInt3425 / (arg1 * 2);
				local91 = local85 + this.anInt3431;
				if (local91 < arg2 && local91 >= this.anInt3431) {
					local56 = true;
				} else {
					local56 = false;
				}
			} else if (this.anInt3425 < 0 && arg2 < this.anInt3431) {
				local85 = this.anInt3425 * this.anInt3425 / (arg1 * 2);
				local91 = this.anInt3431 - local85;
				if (local91 > arg2 && local91 <= this.anInt3431) {
					local56 = true;
				} else {
					local56 = false;
				}
			} else {
				local56 = false;
			}
		}
		if (local56) {
			if (arg2 <= this.anInt3431) {
				this.anInt3425 -= arg1;
				if (arg0 != 0 && this.anInt3425 < -arg0) {
					this.anInt3425 = -arg0;
				}
			} else {
				this.anInt3425 += arg1;
				if (arg0 != 0 && arg0 < this.anInt3425) {
					this.anInt3425 = arg0;
				}
			}
			if (this.anInt3425 != local8) {
				local85 = this.anInt3425 * this.anInt3425 / (arg1 * 2);
				if (arg2 > this.anInt3431) {
					if (this.anInt3431 + local85 > arg2) {
						this.anInt3425 = local8;
					}
				} else if (arg2 < this.anInt3431 && this.anInt3431 - local85 < arg2) {
					this.anInt3425 = local8;
				}
			}
		} else if (this.anInt3425 <= 0) {
			this.anInt3425 += arg1;
			if (this.anInt3425 > 0) {
				this.anInt3425 = 0;
			}
		} else {
			this.anInt3425 -= arg1;
			if (this.anInt3425 < 0) {
				this.anInt3425 = 0;
			}
		}
		this.anInt3431 += local8 + this.anInt3425 >> 1;
		return local56;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public void method2980(@OriginalArg(0) int arg0) {
		this.anInt3425 = 0;
		this.anInt3431 = arg0;
	}
}
