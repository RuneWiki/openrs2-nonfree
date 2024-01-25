import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class111 {

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
	public int anInt3149;

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
	private int anInt3152;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V")
	public void method2690(@OriginalArg(0) int arg0) {
		this.anInt3152 = 0;
		this.anInt3149 = arg0;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)V")
	public void method2692() {
		this.anInt3149 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIII)Z")
	public boolean method2693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = this.anInt3152;
		if (this.anInt3149 == arg2 && this.anInt3152 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(103) int local103;
		if (this.anInt3152 == 0) {
			if (arg2 > this.anInt3149 && arg0 + this.anInt3149 >= arg2 || arg2 < this.anInt3149 && this.anInt3149 - arg0 <= arg2) {
				this.anInt3149 = arg2;
				return false;
			}
			local69 = true;
		} else {
			@Pc(109) int local109;
			if (this.anInt3152 > 0 && this.anInt3149 < arg2) {
				local103 = this.anInt3152 * this.anInt3152 / (arg0 * 2);
				local109 = this.anInt3149 + local103;
				if (local109 < arg2 && local109 >= this.anInt3149) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt3152 < 0 && this.anInt3149 > arg2) {
				local103 = this.anInt3152 * this.anInt3152 / (arg0 * 2);
				local109 = this.anInt3149 - local103;
				if (local109 > arg2 && this.anInt3149 >= local109) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (arg2 <= this.anInt3149) {
				this.anInt3152 -= arg0;
				if (arg1 != 0 && -arg1 > this.anInt3152) {
					this.anInt3152 = -arg1;
				}
			} else {
				this.anInt3152 += arg0;
				if (arg1 != 0 && this.anInt3152 > arg1) {
					this.anInt3152 = arg1;
				}
			}
			if (local12 != this.anInt3152) {
				local103 = this.anInt3152 * this.anInt3152 / (arg0 * 2);
				if (this.anInt3149 >= arg2) {
					if (arg2 < this.anInt3149 && arg2 > this.anInt3149 - local103) {
						this.anInt3152 = local12;
					}
				} else if (arg2 < local103 + this.anInt3149) {
					this.anInt3152 = local12;
				}
			}
		} else if (this.anInt3152 > 0) {
			this.anInt3152 -= arg0;
			if (this.anInt3152 < 0) {
				this.anInt3152 = 0;
			}
		} else {
			this.anInt3152 += arg0;
			if (this.anInt3152 > 0) {
				this.anInt3152 = 0;
			}
		}
		this.anInt3149 += local12 + this.anInt3152 >> 1;
		return local69;
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(B)I")
	public int method2696() {
		return this.anInt3149 & 0x3FFF;
	}
}
