import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class270 {

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	private int anInt7429;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	public int anInt7432;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
	public void method6420(@OriginalArg(1) int arg0) {
		this.anInt7429 = 0;
		this.anInt7432 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIII)Z")
	public boolean method6421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7429;
		if (this.anInt7432 == arg1 && this.anInt7429 == 0) {
			return false;
		}
		@Pc(78) boolean local78;
		@Pc(123) int local123;
		if (this.anInt7429 == 0) {
			if (this.anInt7432 < arg1 && this.anInt7432 + arg0 >= arg1 || arg1 < this.anInt7432 && this.anInt7432 - arg0 <= arg1) {
				this.anInt7432 = arg1;
				return false;
			}
			local78 = true;
		} else {
			@Pc(129) int local129;
			if (this.anInt7429 > 0 && this.anInt7432 < arg1) {
				local123 = this.anInt7429 * this.anInt7429 / (arg0 * 2);
				local129 = this.anInt7432 + local123;
				if (local129 < arg1 && this.anInt7432 <= local129) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else if (this.anInt7429 < 0 && arg1 < this.anInt7432) {
				local123 = this.anInt7429 * this.anInt7429 / (arg0 * 2);
				local129 = this.anInt7432 - local123;
				if (arg1 < local129 && this.anInt7432 >= local129) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else {
				local78 = false;
			}
		}
		if (local78) {
			if (arg1 > this.anInt7432) {
				this.anInt7429 += arg0;
				if (arg2 != 0 && arg2 < this.anInt7429) {
					this.anInt7429 = arg2;
				}
			} else {
				this.anInt7429 -= arg0;
				if (arg2 != 0 && -arg2 > this.anInt7429) {
					this.anInt7429 = -arg2;
				}
			}
			if (this.anInt7429 != local8) {
				local123 = this.anInt7429 * this.anInt7429 / (arg0 * 2);
				if (arg1 <= this.anInt7432) {
					if (arg1 < this.anInt7432 && arg1 > this.anInt7432 - local123) {
						this.anInt7429 = local8;
					}
				} else if (arg1 < local123 + this.anInt7432) {
					this.anInt7429 = local8;
				}
			}
		} else if (this.anInt7429 > 0) {
			this.anInt7429 -= arg0;
			if (this.anInt7429 < 0) {
				this.anInt7429 = 0;
			}
		} else {
			this.anInt7429 += arg0;
			if (this.anInt7429 > 0) {
				this.anInt7429 = 0;
			}
		}
		this.anInt7432 += this.anInt7429 + local8 >> 1;
		return local78;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)I")
	public int method6422(@OriginalArg(0) int arg0) {
		if (arg0 != 5) {
			Static433.aBoolean571 = true;
		}
		return this.anInt7432 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V")
	public void method6423() {
		this.anInt7432 &= 0x3FFF;
	}
}
