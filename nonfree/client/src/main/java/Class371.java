import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class371 {

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
	public int anInt10460;

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
	private int anInt10461;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIII)Z")
	public boolean method8431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt10461;
		if (this.anInt10460 == arg1 && this.anInt10461 == 0) {
			return false;
		}
		@Pc(44) boolean local44;
		@Pc(56) int local56;
		if (this.anInt10461 == 0) {
			if (arg1 > this.anInt10460 && this.anInt10460 + arg2 >= arg1 || this.anInt10460 > arg1 && this.anInt10460 - arg2 <= arg1) {
				this.anInt10460 = arg1;
				return false;
			}
			local44 = true;
		} else {
			@Pc(61) int local61;
			if (this.anInt10461 > 0 && arg1 > this.anInt10460) {
				local56 = this.anInt10461 * this.anInt10461 / (arg2 * 2);
				local61 = this.anInt10460 + local56;
				if (local61 < arg1 && this.anInt10460 <= local61) {
					local44 = true;
				} else {
					local44 = false;
				}
			} else if (this.anInt10461 < 0 && this.anInt10460 > arg1) {
				local56 = this.anInt10461 * this.anInt10461 / (arg2 * 2);
				local61 = this.anInt10460 - local56;
				if (local61 > arg1 && local61 <= this.anInt10460) {
					local44 = true;
				} else {
					local44 = false;
				}
			} else {
				local44 = false;
			}
		}
		if (local44) {
			if (this.anInt10460 >= arg1) {
				this.anInt10461 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt10461) {
					this.anInt10461 = -arg0;
				}
			} else {
				this.anInt10461 += arg2;
				if (arg0 != 0 && arg0 < this.anInt10461) {
					this.anInt10461 = arg0;
				}
			}
			if (this.anInt10461 != local8) {
				local56 = this.anInt10461 * this.anInt10461 / (arg2 * 2);
				if (arg1 <= this.anInt10460) {
					if (arg1 < this.anInt10460 && this.anInt10460 - local56 < arg1) {
						this.anInt10461 = local8;
					}
				} else if (this.anInt10460 + local56 > arg1) {
					this.anInt10461 = local8;
				}
			}
		} else if (this.anInt10461 > 0) {
			this.anInt10461 -= arg2;
			if (this.anInt10461 < 0) {
				this.anInt10461 = 0;
			}
		} else {
			this.anInt10461 += arg2;
			if (this.anInt10461 > 0) {
				this.anInt10461 = 0;
			}
		}
		this.anInt10460 += this.anInt10461 + local8 >> 1;
		return local44;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)I")
	public int method8432() {
		return this.anInt10460 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)V")
	public void method8435(@OriginalArg(0) int arg0) {
		this.anInt10461 = 0;
		this.anInt10460 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
	public void method8437() {
		this.anInt10460 &= 0x3FFF;
	}
}
