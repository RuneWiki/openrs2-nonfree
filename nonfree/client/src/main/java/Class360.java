import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class360 {

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
	private int anInt10070;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
	public int anInt10072;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public void method8506() {
		this.anInt10072 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)I")
	public int method8507() {
		return this.anInt10072 & 0x3FFF;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V")
	public void method8508(@OriginalArg(1) int arg0) {
		this.anInt10072 = arg0;
		this.anInt10070 = 0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)Z")
	public boolean method8509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt10070;
		if (this.anInt10072 == arg0 && this.anInt10070 == 0) {
			return false;
		}
		@Pc(63) boolean local63;
		@Pc(40) int local40;
		if (this.anInt10070 == 0) {
			if (this.anInt10072 < arg0 && arg0 <= arg2 + this.anInt10072 || this.anInt10072 > arg0 && arg0 >= this.anInt10072 - arg2) {
				this.anInt10072 = arg0;
				return false;
			}
			local63 = true;
		} else {
			@Pc(46) int local46;
			if (this.anInt10070 > 0 && this.anInt10072 < arg0) {
				local40 = this.anInt10070 * this.anInt10070 / (arg2 * 2);
				local46 = this.anInt10072 + local40;
				if (local46 < arg0 && this.anInt10072 <= local46) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else if (this.anInt10070 < 0 && arg0 < this.anInt10072) {
				local40 = this.anInt10070 * this.anInt10070 / (arg2 * 2);
				local46 = this.anInt10072 - local40;
				if (arg0 < local46 && local46 <= this.anInt10072) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else {
				local63 = false;
			}
		}
		if (local63) {
			if (arg0 > this.anInt10072) {
				this.anInt10070 += arg2;
				if (arg1 != 0 && arg1 < this.anInt10070) {
					this.anInt10070 = arg1;
				}
			} else {
				this.anInt10070 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt10070) {
					this.anInt10070 = -arg1;
				}
			}
			if (this.anInt10070 != local8) {
				local40 = this.anInt10070 * this.anInt10070 / (arg2 * 2);
				if (this.anInt10072 >= arg0) {
					if (this.anInt10072 > arg0 && this.anInt10072 - local40 < arg0) {
						this.anInt10070 = local8;
					}
				} else if (this.anInt10072 + local40 > arg0) {
					this.anInt10070 = local8;
				}
			}
		} else if (this.anInt10070 <= 0) {
			this.anInt10070 += arg2;
			if (this.anInt10070 > 0) {
				this.anInt10070 = 0;
			}
		} else {
			this.anInt10070 -= arg2;
			if (this.anInt10070 < 0) {
				this.anInt10070 = 0;
			}
		}
		this.anInt10072 += local8 + this.anInt10070 >> 1;
		return local63;
	}
}
