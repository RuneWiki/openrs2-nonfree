import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class219 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public int anInt6305;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	private int anInt6312;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	public int method5750() {
		return this.anInt6305 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public void method5751(@OriginalArg(0) int arg0) {
		this.anInt6305 = arg0;
		this.anInt6312 = 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	public void method5752() {
		this.anInt6305 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)Z")
	public boolean method5754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt6312;
		if (arg2 == this.anInt6305 && this.anInt6312 == 0) {
			return false;
		}
		@Pc(63) boolean local63;
		@Pc(41) int local41;
		if (this.anInt6312 == 0) {
			if (arg2 > this.anInt6305 && this.anInt6305 + arg1 >= arg2 || this.anInt6305 > arg2 && arg2 >= this.anInt6305 - arg1) {
				this.anInt6305 = arg2;
				return false;
			}
			local63 = true;
		} else {
			@Pc(46) int local46;
			if (this.anInt6312 > 0 && arg2 > this.anInt6305) {
				local41 = this.anInt6312 * this.anInt6312 / (arg1 * 2);
				local46 = this.anInt6305 + local41;
				if (arg2 > local46 && this.anInt6305 <= local46) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else if (this.anInt6312 < 0 && arg2 < this.anInt6305) {
				local41 = this.anInt6312 * this.anInt6312 / (arg1 * 2);
				local46 = this.anInt6305 - local41;
				if (local46 > arg2 && local46 <= this.anInt6305) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else {
				local63 = false;
			}
		}
		if (local63) {
			if (this.anInt6305 >= arg2) {
				this.anInt6312 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt6312) {
					this.anInt6312 = -arg0;
				}
			} else {
				this.anInt6312 += arg1;
				if (arg0 != 0 && arg0 < this.anInt6312) {
					this.anInt6312 = arg0;
				}
			}
			if (local8 != this.anInt6312) {
				local41 = this.anInt6312 * this.anInt6312 / (arg1 * 2);
				if (arg2 > this.anInt6305) {
					if (arg2 < local41 + this.anInt6305) {
						this.anInt6312 = local8;
					}
				} else if (this.anInt6305 > arg2 && this.anInt6305 - local41 < arg2) {
					this.anInt6312 = local8;
				}
			}
		} else if (this.anInt6312 > 0) {
			this.anInt6312 -= arg1;
			if (this.anInt6312 < 0) {
				this.anInt6312 = 0;
			}
		} else {
			this.anInt6312 += arg1;
			if (this.anInt6312 > 0) {
				this.anInt6312 = 0;
			}
		}
		this.anInt6305 += local8 + this.anInt6312 >> 1;
		return local63;
	}
}
