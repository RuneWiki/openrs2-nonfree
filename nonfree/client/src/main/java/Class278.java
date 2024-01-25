import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class278 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	private int anInt8286;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
	public int anInt8287;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public void method7146() {
		this.anInt8287 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)I")
	public int method7147() {
		return this.anInt8287 & 0x3FFF;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)Z")
	public boolean method7149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt8286;
		if (this.anInt8287 == arg2 && this.anInt8286 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(102) int local102;
		if (this.anInt8286 == 0) {
			if (this.anInt8287 < arg2 && arg0 + this.anInt8287 >= arg2 || this.anInt8287 > arg2 && this.anInt8287 - arg0 <= arg2) {
				this.anInt8287 = arg2;
				return false;
			}
			local69 = true;
		} else {
			@Pc(107) int local107;
			if (this.anInt8286 > 0 && arg2 > this.anInt8287) {
				local102 = this.anInt8286 * this.anInt8286 / (arg0 * 2);
				local107 = local102 + this.anInt8287;
				if (local107 < arg2 && this.anInt8287 <= local107) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt8286 < 0 && arg2 < this.anInt8287) {
				local102 = this.anInt8286 * this.anInt8286 / (arg0 * 2);
				local107 = this.anInt8287 - local102;
				if (local107 > arg2 && this.anInt8287 >= local107) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (this.anInt8287 < arg2) {
				this.anInt8286 += arg0;
				if (arg1 != 0 && this.anInt8286 > arg1) {
					this.anInt8286 = arg1;
				}
			} else {
				this.anInt8286 -= arg0;
				if (arg1 != 0 && -arg1 > this.anInt8286) {
					this.anInt8286 = -arg1;
				}
			}
			if (local8 != this.anInt8286) {
				local102 = this.anInt8286 * this.anInt8286 / (arg0 * 2);
				if (arg2 > this.anInt8287) {
					if (arg2 < this.anInt8287 + local102) {
						this.anInt8286 = local8;
					}
				} else if (this.anInt8287 > arg2 && this.anInt8287 - local102 < arg2) {
					this.anInt8286 = local8;
				}
			}
		} else if (this.anInt8286 <= 0) {
			this.anInt8286 += arg0;
			if (this.anInt8286 > 0) {
				this.anInt8286 = 0;
			}
		} else {
			this.anInt8286 -= arg0;
			if (this.anInt8286 < 0) {
				this.anInt8286 = 0;
			}
		}
		this.anInt8287 += this.anInt8286 + local8 >> 1;
		return local69;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V")
	public void method7151(@OriginalArg(1) int arg0) {
		this.anInt8286 = 0;
		this.anInt8287 = arg0;
	}
}
