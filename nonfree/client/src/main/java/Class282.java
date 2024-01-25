import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class282 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	private int anInt8018;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt8022;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method7019() {
		this.anInt8022 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIB)Z")
	public boolean method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt8018;
		if (this.anInt8022 == arg1 && this.anInt8018 == 0) {
			return false;
		}
		@Pc(43) boolean local43;
		@Pc(55) int local55;
		if (this.anInt8018 == 0) {
			if (arg1 > this.anInt8022 && arg0 + this.anInt8022 >= arg1 || this.anInt8022 > arg1 && arg1 >= this.anInt8022 - arg0) {
				this.anInt8022 = arg1;
				return false;
			}
			local43 = true;
		} else {
			@Pc(60) int local60;
			if (this.anInt8018 > 0 && this.anInt8022 < arg1) {
				local55 = this.anInt8018 * this.anInt8018 / (arg0 * 2);
				local60 = local55 + this.anInt8022;
				if (local60 < arg1 && local60 >= this.anInt8022) {
					local43 = true;
				} else {
					local43 = false;
				}
			} else if (this.anInt8018 < 0 && this.anInt8022 > arg1) {
				local55 = this.anInt8018 * this.anInt8018 / (arg0 * 2);
				local60 = this.anInt8022 - local55;
				if (local60 > arg1 && local60 <= this.anInt8022) {
					local43 = true;
				} else {
					local43 = false;
				}
			} else {
				local43 = false;
			}
		}
		if (local43) {
			if (arg1 <= this.anInt8022) {
				this.anInt8018 -= arg0;
				if (arg2 != 0 && this.anInt8018 < -arg2) {
					this.anInt8018 = -arg2;
				}
			} else {
				this.anInt8018 += arg0;
				if (arg2 != 0 && arg2 < this.anInt8018) {
					this.anInt8018 = arg2;
				}
			}
			if (local8 != this.anInt8018) {
				local55 = this.anInt8018 * this.anInt8018 / (arg0 * 2);
				if (this.anInt8022 < arg1) {
					if (local55 + this.anInt8022 > arg1) {
						this.anInt8018 = local8;
					}
				} else if (arg1 < this.anInt8022 && this.anInt8022 - local55 < arg1) {
					this.anInt8018 = local8;
				}
			}
		} else if (this.anInt8018 > 0) {
			this.anInt8018 -= arg0;
			if (this.anInt8018 < 0) {
				this.anInt8018 = 0;
			}
		} else {
			this.anInt8018 += arg0;
			if (this.anInt8018 > 0) {
				this.anInt8018 = 0;
			}
		}
		this.anInt8022 += local8 + this.anInt8018 >> 1;
		return local43;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
	public void method7021(@OriginalArg(0) int arg0) {
		this.anInt8018 = 0;
		this.anInt8022 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
	public int method7022() {
		return this.anInt8022 & 0x3FFF;
	}
}
