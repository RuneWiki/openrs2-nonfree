import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class229 {

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
	private int anInt6645;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
	public int anInt6650;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V")
	public void method5575(@OriginalArg(0) int arg0) {
		this.anInt6645 = 0;
		this.anInt6650 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIB)Z")
	public boolean method5577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt6645;
		if (this.anInt6650 == arg2 && this.anInt6645 == 0) {
			return false;
		}
		@Pc(70) boolean local70;
		@Pc(106) int local106;
		if (this.anInt6645 == 0) {
			if (arg2 > this.anInt6650 && arg2 <= arg0 + this.anInt6650 || this.anInt6650 > arg2 && arg2 >= this.anInt6650 - arg0) {
				this.anInt6650 = arg2;
				return false;
			}
			local70 = true;
		} else {
			@Pc(112) int local112;
			if (this.anInt6645 > 0 && arg2 > this.anInt6650) {
				local106 = this.anInt6645 * this.anInt6645 / (arg0 * 2);
				local112 = this.anInt6650 + local106;
				if (arg2 > local112 && local112 >= this.anInt6650) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else if (this.anInt6645 < 0 && this.anInt6650 > arg2) {
				local106 = this.anInt6645 * this.anInt6645 / (arg0 * 2);
				local112 = this.anInt6650 - local106;
				if (arg2 < local112 && local112 <= this.anInt6650) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else {
				local70 = false;
			}
		}
		if (local70) {
			if (this.anInt6650 >= arg2) {
				this.anInt6645 -= arg0;
				if (arg1 != 0 && -arg1 > this.anInt6645) {
					this.anInt6645 = -arg1;
				}
			} else {
				this.anInt6645 += arg0;
				if (arg1 != 0 && arg1 < this.anInt6645) {
					this.anInt6645 = arg1;
				}
			}
			if (local8 != this.anInt6645) {
				local106 = this.anInt6645 * this.anInt6645 / (arg0 * 2);
				if (this.anInt6650 >= arg2) {
					if (arg2 < this.anInt6650 && this.anInt6650 - local106 < arg2) {
						this.anInt6645 = local8;
					}
				} else if (arg2 < this.anInt6650 + local106) {
					this.anInt6645 = local8;
				}
			}
		} else if (this.anInt6645 <= 0) {
			this.anInt6645 += arg0;
			if (this.anInt6645 > 0) {
				this.anInt6645 = 0;
			}
		} else {
			this.anInt6645 -= arg0;
			if (this.anInt6645 < 0) {
				this.anInt6645 = 0;
			}
		}
		this.anInt6650 += this.anInt6645 + local8 >> 1;
		return local70;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	public void method5580() {
		this.anInt6650 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)I")
	public int method5582() {
		return this.anInt6650 & 0x3FFF;
	}
}
