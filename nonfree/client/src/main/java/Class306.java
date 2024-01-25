import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class306 {

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
	public int anInt8684;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	private int anInt8688;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
	public int method7389() {
		return this.anInt8684 & 0x3FFF;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	public void method7390(@OriginalArg(1) int arg0) {
		this.anInt8684 = arg0;
		this.anInt8688 = 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public void method7391() {
		this.anInt8684 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIZI)Z")
	public boolean method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt8688;
		if (arg1 == this.anInt8684 && this.anInt8688 == 0) {
			return false;
		}
		@Pc(72) boolean local72;
		@Pc(53) int local53;
		if (this.anInt8688 == 0) {
			if (this.anInt8684 < arg1 && arg1 <= this.anInt8684 + arg0 || this.anInt8684 > arg1 && arg1 >= this.anInt8684 - arg0) {
				this.anInt8684 = arg1;
				return false;
			}
			local72 = true;
		} else {
			@Pc(59) int local59;
			if (this.anInt8688 > 0 && arg1 > this.anInt8684) {
				local53 = this.anInt8688 * this.anInt8688 / (arg0 * 2);
				local59 = this.anInt8684 + local53;
				if (arg1 > local59 && local59 >= this.anInt8684) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else if (this.anInt8688 < 0 && this.anInt8684 > arg1) {
				local53 = this.anInt8688 * this.anInt8688 / (arg0 * 2);
				local59 = this.anInt8684 - local53;
				if (local59 > arg1 && this.anInt8684 >= local59) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else {
				local72 = false;
			}
		}
		if (local72) {
			if (arg1 > this.anInt8684) {
				this.anInt8688 += arg0;
				if (arg2 != 0 && this.anInt8688 > arg2) {
					this.anInt8688 = arg2;
				}
			} else {
				this.anInt8688 -= arg0;
				if (arg2 != 0 && this.anInt8688 < -arg2) {
					this.anInt8688 = -arg2;
				}
			}
			if (this.anInt8688 != local6) {
				local53 = this.anInt8688 * this.anInt8688 / (arg0 * 2);
				if (arg1 > this.anInt8684) {
					if (arg1 < local53 + this.anInt8684) {
						this.anInt8688 = local6;
					}
				} else if (arg1 < this.anInt8684 && this.anInt8684 - local53 < arg1) {
					this.anInt8688 = local6;
				}
			}
		} else if (this.anInt8688 > 0) {
			this.anInt8688 -= arg0;
			if (this.anInt8688 < 0) {
				this.anInt8688 = 0;
			}
		} else {
			this.anInt8688 += arg0;
			if (this.anInt8688 > 0) {
				this.anInt8688 = 0;
			}
		}
		this.anInt8684 += this.anInt8688 + local6 >> 1;
		return local72;
	}
}
