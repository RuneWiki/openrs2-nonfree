import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class106 {

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
	public int anInt3316;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	private int anInt3317;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public void method3011() {
		this.anInt3316 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public void method3013(@OriginalArg(1) int arg0) {
		this.anInt3317 = 0;
		this.anInt3316 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)Z")
	public boolean method3017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = this.anInt3317;
		if (this.anInt3316 == arg1 && this.anInt3317 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(52) int local52;
		if (this.anInt3317 == 0) {
			if (this.anInt3316 < arg1 && arg2 + this.anInt3316 >= arg1 || arg1 < this.anInt3316 && arg1 >= this.anInt3316 - arg2) {
				this.anInt3316 = arg1;
				return false;
			}
			local66 = true;
		} else {
			@Pc(57) int local57;
			if (this.anInt3317 > 0 && arg1 > this.anInt3316) {
				local52 = this.anInt3317 * this.anInt3317 / (arg2 * 2);
				local57 = this.anInt3316 + local52;
				if (local57 < arg1 && local57 >= this.anInt3316) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt3317 < 0 && arg1 < this.anInt3316) {
				local52 = this.anInt3317 * this.anInt3317 / (arg2 * 2);
				local57 = this.anInt3316 - local52;
				if (local57 > arg1 && local57 <= this.anInt3316) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (arg1 <= this.anInt3316) {
				this.anInt3317 -= arg2;
				if (arg0 != 0 && this.anInt3317 < -arg0) {
					this.anInt3317 = -arg0;
				}
			} else {
				this.anInt3317 += arg2;
				if (arg0 != 0 && arg0 < this.anInt3317) {
					this.anInt3317 = arg0;
				}
			}
			if (local13 != this.anInt3317) {
				local52 = this.anInt3317 * this.anInt3317 / (arg2 * 2);
				if (arg1 > this.anInt3316) {
					if (this.anInt3316 + local52 > arg1) {
						this.anInt3317 = local13;
					}
				} else if (arg1 < this.anInt3316 && this.anInt3316 - local52 < arg1) {
					this.anInt3317 = local13;
				}
			}
		} else if (this.anInt3317 > 0) {
			this.anInt3317 -= arg2;
			if (this.anInt3317 < 0) {
				this.anInt3317 = 0;
			}
		} else {
			this.anInt3317 += arg2;
			if (this.anInt3317 > 0) {
				this.anInt3317 = 0;
			}
		}
		this.anInt3316 += this.anInt3317 + local13 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)I")
	public int method3018() {
		return this.anInt3316 & 0x3FFF;
	}
}
