import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class145 {

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	private int anInt4146;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public int anInt4147;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BIII)Z")
	public boolean method3300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4146;
		if (arg2 == this.anInt4147 && this.anInt4146 == 0) {
			return false;
		}
		@Pc(85) boolean local85;
		@Pc(63) int local63;
		if (this.anInt4146 == 0) {
			if (this.anInt4147 < arg2 && arg2 <= this.anInt4147 + arg1 || this.anInt4147 > arg2 && arg2 >= this.anInt4147 - arg1) {
				this.anInt4147 = arg2;
				return false;
			}
			local85 = true;
		} else {
			@Pc(68) int local68;
			if (this.anInt4146 > 0 && arg2 > this.anInt4147) {
				local63 = this.anInt4146 * this.anInt4146 / (arg1 * 2);
				local68 = this.anInt4147 + local63;
				if (local68 < arg2 && this.anInt4147 <= local68) {
					local85 = true;
				} else {
					local85 = false;
				}
			} else if (this.anInt4146 < 0 && arg2 < this.anInt4147) {
				local63 = this.anInt4146 * this.anInt4146 / (arg1 * 2);
				local68 = this.anInt4147 - local63;
				if (arg2 < local68 && local68 <= this.anInt4147) {
					local85 = true;
				} else {
					local85 = false;
				}
			} else {
				local85 = false;
			}
		}
		if (local85) {
			if (arg2 <= this.anInt4147) {
				this.anInt4146 -= arg1;
				if (arg0 != 0 && this.anInt4146 < -arg0) {
					this.anInt4146 = -arg0;
				}
			} else {
				this.anInt4146 += arg1;
				if (arg0 != 0 && this.anInt4146 > arg0) {
					this.anInt4146 = arg0;
				}
			}
			if (local8 != this.anInt4146) {
				local63 = this.anInt4146 * this.anInt4146 / (arg1 * 2);
				if (arg2 <= this.anInt4147) {
					if (this.anInt4147 > arg2 && arg2 > this.anInt4147 - local63) {
						this.anInt4146 = local8;
					}
				} else if (arg2 < this.anInt4147 + local63) {
					this.anInt4146 = local8;
				}
			}
		} else if (this.anInt4146 <= 0) {
			this.anInt4146 += arg1;
			if (this.anInt4146 > 0) {
				this.anInt4146 = 0;
			}
		} else {
			this.anInt4146 -= arg1;
			if (this.anInt4146 < 0) {
				this.anInt4146 = 0;
			}
		}
		this.anInt4147 += local8 + this.anInt4146 >> 1;
		return local85;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public void method3303() {
		this.anInt4147 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
	public int method3304() {
		return this.anInt4147 & 0x3FFF;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
	public void method3306(@OriginalArg(1) int arg0) {
		this.anInt4146 = 0;
		this.anInt4147 = arg0;
	}
}
