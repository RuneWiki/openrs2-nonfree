import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class110 {

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	private int anInt3425;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	public int anInt3429;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIBI)Z")
	public boolean method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3425;
		if (arg0 == this.anInt3429 && this.anInt3425 == 0) {
			return false;
		}
		@Pc(70) boolean local70;
		@Pc(107) int local107;
		if (this.anInt3425 == 0) {
			if (this.anInt3429 < arg0 && arg0 <= this.anInt3429 + arg1 || arg0 < this.anInt3429 && this.anInt3429 - arg1 <= arg0) {
				this.anInt3429 = arg0;
				return false;
			}
			local70 = true;
		} else {
			@Pc(113) int local113;
			if (this.anInt3425 > 0 && this.anInt3429 < arg0) {
				local107 = this.anInt3425 * this.anInt3425 / (arg1 * 2);
				local113 = local107 + this.anInt3429;
				if (local113 < arg0 && this.anInt3429 <= local113) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else if (this.anInt3425 < 0 && arg0 < this.anInt3429) {
				local107 = this.anInt3425 * this.anInt3425 / (arg1 * 2);
				local113 = this.anInt3429 - local107;
				if (arg0 < local113 && this.anInt3429 >= local113) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else {
				local70 = false;
			}
		}
		if (local70) {
			if (this.anInt3429 < arg0) {
				this.anInt3425 += arg1;
				if (arg2 != 0 && arg2 < this.anInt3425) {
					this.anInt3425 = arg2;
				}
			} else {
				this.anInt3425 -= arg1;
				if (arg2 != 0 && this.anInt3425 < -arg2) {
					this.anInt3425 = -arg2;
				}
			}
			if (local8 != this.anInt3425) {
				local107 = this.anInt3425 * this.anInt3425 / (arg1 * 2);
				if (arg0 > this.anInt3429) {
					if (arg0 < this.anInt3429 + local107) {
						this.anInt3425 = local8;
					}
				} else if (arg0 < this.anInt3429 && this.anInt3429 - local107 < arg0) {
					this.anInt3425 = local8;
				}
			}
		} else if (this.anInt3425 <= 0) {
			this.anInt3425 += arg1;
			if (this.anInt3425 > 0) {
				this.anInt3425 = 0;
			}
		} else {
			this.anInt3425 -= arg1;
			if (this.anInt3425 < 0) {
				this.anInt3425 = 0;
			}
		}
		this.anInt3429 += local8 + this.anInt3425 >> 1;
		return local70;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public void method3166() {
		this.anInt3429 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)I")
	public int method3167() {
		return this.anInt3429 & 0x3FFF;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
	public void method3168(@OriginalArg(0) int arg0) {
		this.anInt3429 = arg0;
		this.anInt3425 = 0;
	}
}
