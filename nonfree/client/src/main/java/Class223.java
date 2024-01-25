import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class223 {

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	private int anInt7013;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	public int anInt7017;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)Z")
	public boolean method6053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = this.anInt7013;
		if (this.anInt7017 == arg0 && this.anInt7013 == 0) {
			return false;
		}
		@Pc(85) boolean local85;
		@Pc(66) int local66;
		if (this.anInt7013 == 0) {
			if (this.anInt7017 < arg0 && this.anInt7017 + arg2 >= arg0 || arg0 < this.anInt7017 && arg0 >= this.anInt7017 - arg2) {
				this.anInt7017 = arg0;
				return false;
			}
			local85 = true;
		} else {
			@Pc(72) int local72;
			if (this.anInt7013 > 0 && this.anInt7017 < arg0) {
				local66 = this.anInt7013 * this.anInt7013 / (arg2 * 2);
				local72 = local66 + this.anInt7017;
				if (local72 < arg0 && local72 >= this.anInt7017) {
					local85 = true;
				} else {
					local85 = false;
				}
			} else if (this.anInt7013 < 0 && this.anInt7017 > arg0) {
				local66 = this.anInt7013 * this.anInt7013 / (arg2 * 2);
				local72 = this.anInt7017 - local66;
				if (local72 > arg0 && this.anInt7017 >= local72) {
					local85 = true;
				} else {
					local85 = false;
				}
			} else {
				local85 = false;
			}
		}
		if (local85) {
			if (arg0 > this.anInt7017) {
				this.anInt7013 += arg2;
				if (arg1 != 0 && arg1 < this.anInt7013) {
					this.anInt7013 = arg1;
				}
			} else {
				this.anInt7013 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt7013) {
					this.anInt7013 = -arg1;
				}
			}
			if (this.anInt7013 != local13) {
				local66 = this.anInt7013 * this.anInt7013 / (arg2 * 2);
				if (this.anInt7017 < arg0) {
					if (local66 + this.anInt7017 > arg0) {
						this.anInt7013 = local13;
					}
				} else if (this.anInt7017 > arg0 && arg0 > this.anInt7017 - local66) {
					this.anInt7013 = local13;
				}
			}
		} else if (this.anInt7013 > 0) {
			this.anInt7013 -= arg2;
			if (this.anInt7013 < 0) {
				this.anInt7013 = 0;
			}
		} else {
			this.anInt7013 += arg2;
			if (this.anInt7013 > 0) {
				this.anInt7013 = 0;
			}
		}
		this.anInt7017 += this.anInt7013 + local13 >> 1;
		return local85;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public void method6056() {
		this.anInt7017 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)I")
	public int method6057() {
		return this.anInt7017 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public void method6059(@OriginalArg(0) int arg0) {
		this.anInt7017 = arg0;
		this.anInt7013 = 0;
	}
}
