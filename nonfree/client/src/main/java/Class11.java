import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public int anInt264;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
	public void method319(@OriginalArg(0) int arg0) {
		this.anInt264 = arg0;
		this.anInt262 = 0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method320() {
		this.anInt264 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I")
	public int method322() {
		return this.anInt264 & 0x3FFF;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)Z")
	public boolean method325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.anInt262;
		if (arg1 == this.anInt264 && this.anInt262 == 0) {
			return false;
		}
		@Pc(73) boolean local73;
		@Pc(55) int local55;
		if (this.anInt262 == 0) {
			if (this.anInt264 < arg1 && arg2 + this.anInt264 >= arg1 || this.anInt264 > arg1 && arg1 >= this.anInt264 - arg2) {
				this.anInt264 = arg1;
				return false;
			}
			local73 = true;
		} else {
			@Pc(60) int local60;
			if (this.anInt262 > 0 && this.anInt264 < arg1) {
				local55 = this.anInt262 * this.anInt262 / (arg2 * 2);
				local60 = local55 + this.anInt264;
				if (local60 < arg1 && this.anInt264 <= local60) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else if (this.anInt262 < 0 && arg1 < this.anInt264) {
				local55 = this.anInt262 * this.anInt262 / (arg2 * 2);
				local60 = this.anInt264 - local55;
				if (arg1 < local60 && this.anInt264 >= local60) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else {
				local73 = false;
			}
		}
		if (local73) {
			if (arg1 <= this.anInt264) {
				this.anInt262 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt262) {
					this.anInt262 = -arg0;
				}
			} else {
				this.anInt262 += arg2;
				if (arg0 != 0 && this.anInt262 > arg0) {
					this.anInt262 = arg0;
				}
			}
			if (this.anInt262 != local16) {
				local55 = this.anInt262 * this.anInt262 / (arg2 * 2);
				if (this.anInt264 >= arg1) {
					if (this.anInt264 > arg1 && arg1 > this.anInt264 - local55) {
						this.anInt262 = local16;
					}
				} else if (local55 + this.anInt264 > arg1) {
					this.anInt262 = local16;
				}
			}
		} else if (this.anInt262 <= 0) {
			this.anInt262 += arg2;
			if (this.anInt262 > 0) {
				this.anInt262 = 0;
			}
		} else {
			this.anInt262 -= arg2;
			if (this.anInt262 < 0) {
				this.anInt262 = 0;
			}
		}
		this.anInt264 += local16 + this.anInt262 >> 1;
		return local73;
	}
}
