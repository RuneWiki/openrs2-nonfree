import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class212 {

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public int anInt6528;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	private int anInt6529;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I")
	public int method5609() {
		return this.anInt6528 & 0x3FFF;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)Z")
	public boolean method5611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = this.anInt6529;
		if (this.anInt6528 == arg2 && this.anInt6529 == 0) {
			return false;
		}
		@Pc(71) boolean local71;
		@Pc(53) int local53;
		if (this.anInt6529 == 0) {
			if (this.anInt6528 < arg2 && arg1 + this.anInt6528 >= arg2 || this.anInt6528 > arg2 && this.anInt6528 - arg1 <= arg2) {
				this.anInt6528 = arg2;
				return false;
			}
			local71 = true;
		} else {
			@Pc(58) int local58;
			if (this.anInt6529 > 0 && arg2 > this.anInt6528) {
				local53 = this.anInt6529 * this.anInt6529 / (arg1 * 2);
				local58 = this.anInt6528 + local53;
				if (local58 < arg2 && this.anInt6528 <= local58) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else if (this.anInt6529 < 0 && arg2 < this.anInt6528) {
				local53 = this.anInt6529 * this.anInt6529 / (arg1 * 2);
				local58 = this.anInt6528 - local53;
				if (local58 > arg2 && local58 <= this.anInt6528) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else {
				local71 = false;
			}
		}
		if (local71) {
			if (this.anInt6528 >= arg2) {
				this.anInt6529 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt6529) {
					this.anInt6529 = -arg0;
				}
			} else {
				this.anInt6529 += arg1;
				if (arg0 != 0 && this.anInt6529 > arg0) {
					this.anInt6529 = arg0;
				}
			}
			if (this.anInt6529 != local15) {
				local53 = this.anInt6529 * this.anInt6529 / (arg1 * 2);
				if (this.anInt6528 >= arg2) {
					if (arg2 < this.anInt6528 && this.anInt6528 - local53 < arg2) {
						this.anInt6529 = local15;
					}
				} else if (local53 + this.anInt6528 > arg2) {
					this.anInt6529 = local15;
				}
			}
		} else if (this.anInt6529 > 0) {
			this.anInt6529 -= arg1;
			if (this.anInt6529 < 0) {
				this.anInt6529 = 0;
			}
		} else {
			this.anInt6529 += arg1;
			if (this.anInt6529 > 0) {
				this.anInt6529 = 0;
			}
		}
		this.anInt6528 += this.anInt6529 + local15 >> 1;
		return local71;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
	public void method5612(@OriginalArg(1) int arg0) {
		this.anInt6528 = arg0;
		this.anInt6529 = 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
	public void method5615() {
		this.anInt6528 &= 0x3FFF;
	}
}
