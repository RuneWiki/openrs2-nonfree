import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class116 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	private int anInt3074;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public int anInt3077;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public void method2585() {
		this.anInt3077 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public void method2586(@OriginalArg(0) int arg0) {
		this.anInt3074 = 0;
		this.anInt3077 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z")
	public boolean method2587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3074;
		if (this.anInt3077 == arg1 && this.anInt3074 == 0) {
			return false;
		}
		@Pc(72) boolean local72;
		@Pc(58) int local58;
		if (this.anInt3074 == 0) {
			if (this.anInt3077 < arg1 && this.anInt3077 + arg2 >= arg1 || arg1 < this.anInt3077 && arg1 >= this.anInt3077 - arg2) {
				this.anInt3077 = arg1;
				return false;
			}
			local72 = true;
		} else {
			@Pc(63) int local63;
			if (this.anInt3074 > 0 && this.anInt3077 < arg1) {
				local58 = this.anInt3074 * this.anInt3074 / (arg2 * 2);
				local63 = local58 + this.anInt3077;
				if (local63 < arg1 && this.anInt3077 <= local63) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else if (this.anInt3074 < 0 && arg1 < this.anInt3077) {
				local58 = this.anInt3074 * this.anInt3074 / (arg2 * 2);
				local63 = this.anInt3077 - local58;
				if (local63 > arg1 && this.anInt3077 >= local63) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else {
				local72 = false;
			}
		}
		if (local72) {
			if (arg1 > this.anInt3077) {
				this.anInt3074 += arg2;
				if (arg0 != 0 && arg0 < this.anInt3074) {
					this.anInt3074 = arg0;
				}
			} else {
				this.anInt3074 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt3074) {
					this.anInt3074 = -arg0;
				}
			}
			if (local8 != this.anInt3074) {
				local58 = this.anInt3074 * this.anInt3074 / (arg2 * 2);
				if (this.anInt3077 < arg1) {
					if (this.anInt3077 + local58 > arg1) {
						this.anInt3074 = local8;
					}
				} else if (arg1 < this.anInt3077 && arg1 > this.anInt3077 - local58) {
					this.anInt3074 = local8;
				}
			}
		} else if (this.anInt3074 > 0) {
			this.anInt3074 -= arg2;
			if (this.anInt3074 < 0) {
				this.anInt3074 = 0;
			}
		} else {
			this.anInt3074 += arg2;
			if (this.anInt3074 > 0) {
				this.anInt3074 = 0;
			}
		}
		this.anInt3077 += this.anInt3074 + local8 >> 1;
		return local72;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)I")
	public int method2590() {
		return this.anInt3077 & 0x3FFF;
	}
}
