import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class343 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	private int anInt10245;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public int anInt10249;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public void method8545(@OriginalArg(1) int arg0) {
		this.anInt10245 = 0;
		this.anInt10249 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I")
	public int method8548() {
		return this.anInt10249 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIB)Z")
	public boolean method8549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt10245;
		if (this.anInt10249 == arg1 && this.anInt10245 == 0) {
			return false;
		}
		@Pc(71) boolean local71;
		@Pc(49) int local49;
		if (this.anInt10245 == 0) {
			if (this.anInt10249 < arg1 && arg1 <= arg2 + this.anInt10249 || arg1 < this.anInt10249 && arg1 >= this.anInt10249 - arg2) {
				this.anInt10249 = arg1;
				return false;
			}
			local71 = true;
		} else {
			@Pc(54) int local54;
			if (this.anInt10245 > 0 && arg1 > this.anInt10249) {
				local49 = this.anInt10245 * this.anInt10245 / (arg2 * 2);
				local54 = local49 + this.anInt10249;
				if (arg1 > local54 && local54 >= this.anInt10249) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else if (this.anInt10245 < 0 && this.anInt10249 > arg1) {
				local49 = this.anInt10245 * this.anInt10245 / (arg2 * 2);
				local54 = this.anInt10249 - local49;
				if (local54 > arg1 && local54 <= this.anInt10249) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else {
				local71 = false;
			}
		}
		if (local71) {
			if (arg1 <= this.anInt10249) {
				this.anInt10245 -= arg2;
				if (arg0 != 0 && this.anInt10245 < -arg0) {
					this.anInt10245 = -arg0;
				}
			} else {
				this.anInt10245 += arg2;
				if (arg0 != 0 && this.anInt10245 > arg0) {
					this.anInt10245 = arg0;
				}
			}
			if (local8 != this.anInt10245) {
				local49 = this.anInt10245 * this.anInt10245 / (arg2 * 2);
				if (this.anInt10249 < arg1) {
					if (this.anInt10249 + local49 > arg1) {
						this.anInt10245 = local8;
					}
				} else if (arg1 < this.anInt10249 && arg1 > this.anInt10249 - local49) {
					this.anInt10245 = local8;
				}
			}
		} else if (this.anInt10245 <= 0) {
			this.anInt10245 += arg2;
			if (this.anInt10245 > 0) {
				this.anInt10245 = 0;
			}
		} else {
			this.anInt10245 -= arg2;
			if (this.anInt10245 < 0) {
				this.anInt10245 = 0;
			}
		}
		this.anInt10249 += this.anInt10245 + local8 >> 1;
		return local71;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	public void method8550() {
		this.anInt10249 &= 0x3FFF;
	}
}
