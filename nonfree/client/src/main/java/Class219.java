import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class219 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public int anInt6829;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	private int anInt6833;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZI)Z")
	public boolean method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt6833;
		if (arg0 == this.anInt6829 && this.anInt6833 == 0) {
			return false;
		}
		@Pc(53) boolean local53;
		@Pc(65) int local65;
		if (this.anInt6833 == 0) {
			if (this.anInt6829 < arg0 && arg0 <= arg2 + this.anInt6829 || this.anInt6829 > arg0 && arg0 >= this.anInt6829 - arg2) {
				this.anInt6829 = arg0;
				return false;
			}
			local53 = true;
		} else {
			@Pc(71) int local71;
			if (this.anInt6833 > 0 && this.anInt6829 < arg0) {
				local65 = this.anInt6833 * this.anInt6833 / (arg2 * 2);
				local71 = local65 + this.anInt6829;
				if (local71 < arg0 && local71 >= this.anInt6829) {
					local53 = true;
				} else {
					local53 = false;
				}
			} else if (this.anInt6833 < 0 && arg0 < this.anInt6829) {
				local65 = this.anInt6833 * this.anInt6833 / (arg2 * 2);
				local71 = this.anInt6829 - local65;
				if (local71 > arg0 && this.anInt6829 >= local71) {
					local53 = true;
				} else {
					local53 = false;
				}
			} else {
				local53 = false;
			}
		}
		if (local53) {
			if (this.anInt6829 >= arg0) {
				this.anInt6833 -= arg2;
				if (arg1 != 0 && this.anInt6833 < -arg1) {
					this.anInt6833 = -arg1;
				}
			} else {
				this.anInt6833 += arg2;
				if (arg1 != 0 && arg1 < this.anInt6833) {
					this.anInt6833 = arg1;
				}
			}
			if (local8 != this.anInt6833) {
				local65 = this.anInt6833 * this.anInt6833 / (arg2 * 2);
				if (this.anInt6829 < arg0) {
					if (local65 + this.anInt6829 > arg0) {
						this.anInt6833 = local8;
					}
				} else if (arg0 < this.anInt6829 && this.anInt6829 - local65 < arg0) {
					this.anInt6833 = local8;
				}
			}
		} else if (this.anInt6833 <= 0) {
			this.anInt6833 += arg2;
			if (this.anInt6833 > 0) {
				this.anInt6833 = 0;
			}
		} else {
			this.anInt6833 -= arg2;
			if (this.anInt6833 < 0) {
				this.anInt6833 = 0;
			}
		}
		this.anInt6829 += this.anInt6833 + local8 >> 1;
		return local53;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public void method5717(@OriginalArg(1) int arg0) {
		this.anInt6829 = arg0;
		this.anInt6833 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
	public int method5719() {
		return this.anInt6829 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public void method5720() {
		this.anInt6829 &= 0x3FFF;
	}
}
