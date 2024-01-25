import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class102 {

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
	public int anInt3248;

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	private int anInt3251;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII)Z")
	public boolean method2897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3251;
		if (this.anInt3248 == arg0 && this.anInt3251 == 0) {
			return false;
		}
		@Pc(68) boolean local68;
		@Pc(53) int local53;
		if (this.anInt3251 == 0) {
			if (arg0 > this.anInt3248 && arg1 + this.anInt3248 >= arg0 || arg0 < this.anInt3248 && this.anInt3248 - arg1 <= arg0) {
				this.anInt3248 = arg0;
				return false;
			}
			local68 = true;
		} else {
			@Pc(59) int local59;
			if (this.anInt3251 > 0 && arg0 > this.anInt3248) {
				local53 = this.anInt3251 * this.anInt3251 / (arg1 * 2);
				local59 = this.anInt3248 + local53;
				if (local59 < arg0 && this.anInt3248 <= local59) {
					local68 = true;
				} else {
					local68 = false;
				}
			} else if (this.anInt3251 < 0 && arg0 < this.anInt3248) {
				local53 = this.anInt3251 * this.anInt3251 / (arg1 * 2);
				local59 = this.anInt3248 - local53;
				if (arg0 < local59 && local59 <= this.anInt3248) {
					local68 = true;
				} else {
					local68 = false;
				}
			} else {
				local68 = false;
			}
		}
		if (local68) {
			if (arg0 <= this.anInt3248) {
				this.anInt3251 -= arg1;
				if (arg2 != 0 && -arg2 > this.anInt3251) {
					this.anInt3251 = -arg2;
				}
			} else {
				this.anInt3251 += arg1;
				if (arg2 != 0 && arg2 < this.anInt3251) {
					this.anInt3251 = arg2;
				}
			}
			if (local8 != this.anInt3251) {
				local53 = this.anInt3251 * this.anInt3251 / (arg1 * 2);
				if (this.anInt3248 >= arg0) {
					if (this.anInt3248 > arg0 && this.anInt3248 - local53 < arg0) {
						this.anInt3251 = local8;
					}
				} else if (arg0 < this.anInt3248 + local53) {
					this.anInt3251 = local8;
				}
			}
		} else if (this.anInt3251 > 0) {
			this.anInt3251 -= arg1;
			if (this.anInt3251 < 0) {
				this.anInt3251 = 0;
			}
		} else {
			this.anInt3251 += arg1;
			if (this.anInt3251 > 0) {
				this.anInt3251 = 0;
			}
		}
		this.anInt3248 += this.anInt3251 + local8 >> 1;
		return local68;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V")
	public void method2898(@OriginalArg(0) int arg0) {
		this.anInt3248 = arg0;
		this.anInt3251 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)I")
	public int method2899() {
		return this.anInt3248 & 0x3FFF;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public void method2900() {
		this.anInt3248 &= 0x3FFF;
	}
}
