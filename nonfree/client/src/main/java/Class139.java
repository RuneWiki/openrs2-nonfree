import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class139 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public int anInt3812;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	private int anInt3816;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)Z")
	public boolean method3203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = this.anInt3816;
		if (this.anInt3812 == arg2 && this.anInt3816 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(102) int local102;
		if (this.anInt3816 == 0) {
			if (arg2 > this.anInt3812 && arg2 <= this.anInt3812 + arg1 || arg2 < this.anInt3812 && this.anInt3812 - arg1 <= arg2) {
				this.anInt3812 = arg2;
				return false;
			}
			local69 = true;
		} else {
			@Pc(108) int local108;
			if (this.anInt3816 > 0 && arg2 > this.anInt3812) {
				local102 = this.anInt3816 * this.anInt3816 / (arg1 * 2);
				local108 = local102 + this.anInt3812;
				if (arg2 > local108 && local108 >= this.anInt3812) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt3816 < 0 && arg2 < this.anInt3812) {
				local102 = this.anInt3816 * this.anInt3816 / (arg1 * 2);
				local108 = this.anInt3812 - local102;
				if (arg2 < local108 && local108 <= this.anInt3812) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (arg2 <= this.anInt3812) {
				this.anInt3816 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt3816) {
					this.anInt3816 = -arg0;
				}
			} else {
				this.anInt3816 += arg1;
				if (arg0 != 0 && arg0 < this.anInt3816) {
					this.anInt3816 = arg0;
				}
			}
			if (this.anInt3816 != local15) {
				local102 = this.anInt3816 * this.anInt3816 / (arg1 * 2);
				if (arg2 > this.anInt3812) {
					if (arg2 < local102 + this.anInt3812) {
						this.anInt3816 = local15;
					}
				} else if (arg2 < this.anInt3812 && arg2 > this.anInt3812 - local102) {
					this.anInt3816 = local15;
				}
			}
		} else if (this.anInt3816 <= 0) {
			this.anInt3816 += arg1;
			if (this.anInt3816 > 0) {
				this.anInt3816 = 0;
			}
		} else {
			this.anInt3816 -= arg1;
			if (this.anInt3816 < 0) {
				this.anInt3816 = 0;
			}
		}
		this.anInt3812 += this.anInt3816 + local15 >> 1;
		return local69;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
	public int method3204() {
		return this.anInt3812 & 0x3FFF;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public void method3205(@OriginalArg(1) int arg0) {
		this.anInt3816 = 0;
		this.anInt3812 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public void method3206() {
		this.anInt3812 &= 0x3FFF;
	}
}
