import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class147 {

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
	private int anInt4316;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)I")
	public int method3814() {
		return this.anInt4314 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
	public void method3817() {
		this.anInt4314 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZIII)Z")
	public boolean method3818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4316;
		if (this.anInt4314 == arg0 && this.anInt4316 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(43) int local43;
		if (this.anInt4316 == 0) {
			if (arg0 > this.anInt4314 && arg0 <= arg2 + this.anInt4314 || arg0 < this.anInt4314 && arg0 >= this.anInt4314 - arg2) {
				this.anInt4314 = arg0;
				return false;
			}
			local66 = true;
		} else {
			@Pc(49) int local49;
			if (this.anInt4316 > 0 && arg0 > this.anInt4314) {
				local43 = this.anInt4316 * this.anInt4316 / (arg2 * 2);
				local49 = this.anInt4314 + local43;
				if (local49 < arg0 && local49 >= this.anInt4314) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt4316 < 0 && this.anInt4314 > arg0) {
				local43 = this.anInt4316 * this.anInt4316 / (arg2 * 2);
				local49 = this.anInt4314 - local43;
				if (arg0 < local49 && this.anInt4314 >= local49) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (this.anInt4314 >= arg0) {
				this.anInt4316 -= arg2;
				if (arg1 != 0 && this.anInt4316 < -arg1) {
					this.anInt4316 = -arg1;
				}
			} else {
				this.anInt4316 += arg2;
				if (arg1 != 0 && arg1 < this.anInt4316) {
					this.anInt4316 = arg1;
				}
			}
			if (this.anInt4316 != local8) {
				local43 = this.anInt4316 * this.anInt4316 / (arg2 * 2);
				if (arg0 > this.anInt4314) {
					if (local43 + this.anInt4314 > arg0) {
						this.anInt4316 = local8;
					}
				} else if (this.anInt4314 > arg0 && arg0 > this.anInt4314 - local43) {
					this.anInt4316 = local8;
				}
			}
		} else if (this.anInt4316 > 0) {
			this.anInt4316 -= arg2;
			if (this.anInt4316 < 0) {
				this.anInt4316 = 0;
			}
		} else {
			this.anInt4316 += arg2;
			if (this.anInt4316 > 0) {
				this.anInt4316 = 0;
			}
		}
		this.anInt4314 += this.anInt4316 + local8 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)V")
	public void method3820(@OriginalArg(1) int arg0) {
		this.anInt4314 = arg0;
		this.anInt4316 = 0;
	}
}
