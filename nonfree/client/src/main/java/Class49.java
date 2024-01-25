import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class49 {

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public int anInt965;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I")
	public int method978() {
		return this.anInt965 & 0x3FFF;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
	public void method979(@OriginalArg(0) int arg0) {
		this.anInt965 = arg0;
		this.anInt967 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public void method980() {
		this.anInt965 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)Z")
	public boolean method981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt967;
		if (this.anInt965 == arg2 && this.anInt967 == 0) {
			return false;
		}
		@Pc(79) boolean local79;
		@Pc(58) int local58;
		if (this.anInt967 == 0) {
			if (arg2 > this.anInt965 && arg2 <= this.anInt965 + arg1 || this.anInt965 > arg2 && arg2 >= this.anInt965 - arg1) {
				this.anInt965 = arg2;
				return false;
			}
			local79 = true;
		} else {
			@Pc(64) int local64;
			if (this.anInt967 > 0 && this.anInt965 < arg2) {
				local58 = this.anInt967 * this.anInt967 / (arg1 * 2);
				local64 = this.anInt965 + local58;
				if (local64 < arg2 && local64 >= this.anInt965) {
					local79 = true;
				} else {
					local79 = false;
				}
			} else if (this.anInt967 < 0 && this.anInt965 > arg2) {
				local58 = this.anInt967 * this.anInt967 / (arg1 * 2);
				local64 = this.anInt965 - local58;
				if (local64 > arg2 && local64 <= this.anInt965) {
					local79 = true;
				} else {
					local79 = false;
				}
			} else {
				local79 = false;
			}
		}
		if (local79) {
			if (this.anInt965 >= arg2) {
				this.anInt967 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt967) {
					this.anInt967 = -arg0;
				}
			} else {
				this.anInt967 += arg1;
				if (arg0 != 0 && arg0 < this.anInt967) {
					this.anInt967 = arg0;
				}
			}
			if (this.anInt967 != local8) {
				local58 = this.anInt967 * this.anInt967 / (arg1 * 2);
				if (arg2 > this.anInt965) {
					if (arg2 < this.anInt965 + local58) {
						this.anInt967 = local8;
					}
				} else if (this.anInt965 > arg2 && arg2 > this.anInt965 - local58) {
					this.anInt967 = local8;
				}
			}
		} else if (this.anInt967 <= 0) {
			this.anInt967 += arg1;
			if (this.anInt967 > 0) {
				this.anInt967 = 0;
			}
		} else {
			this.anInt967 -= arg1;
			if (this.anInt967 < 0) {
				this.anInt967 = 0;
			}
		}
		this.anInt965 += this.anInt967 + local8 >> 1;
		return local79;
	}
}
