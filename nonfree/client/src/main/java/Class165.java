import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class165 {

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
	private int anInt3980;

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
	public int anInt3981;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)I")
	public int method3503() {
		return this.anInt3981 & 0x3FFF;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	public void method3504() {
		this.anInt3981 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIII)Z")
	public boolean method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anInt3980;
		if (this.anInt3981 == arg0 && this.anInt3980 == 0) {
			return false;
		}
		@Pc(73) boolean local73;
		@Pc(91) int local91;
		if (this.anInt3980 == 0) {
			if (arg0 > this.anInt3981 && this.anInt3981 + arg2 >= arg0 || this.anInt3981 > arg0 && arg0 >= this.anInt3981 - arg2) {
				this.anInt3981 = arg0;
				return false;
			}
			local73 = true;
		} else {
			@Pc(96) int local96;
			if (this.anInt3980 > 0 && this.anInt3981 < arg0) {
				local91 = this.anInt3980 * this.anInt3980 / (arg2 * 2);
				local96 = local91 + this.anInt3981;
				if (arg0 > local96 && this.anInt3981 <= local96) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else if (this.anInt3980 < 0 && arg0 < this.anInt3981) {
				local91 = this.anInt3980 * this.anInt3980 / (arg2 * 2);
				local96 = this.anInt3981 - local91;
				if (arg0 < local96 && this.anInt3981 >= local96) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else {
				local73 = false;
			}
		}
		if (local73) {
			if (this.anInt3981 >= arg0) {
				this.anInt3980 -= arg2;
				if (arg1 != 0 && this.anInt3980 < -arg1) {
					this.anInt3980 = -arg1;
				}
			} else {
				this.anInt3980 += arg2;
				if (arg1 != 0 && this.anInt3980 > arg1) {
					this.anInt3980 = arg1;
				}
			}
			if (local6 != this.anInt3980) {
				local91 = this.anInt3980 * this.anInt3980 / (arg2 * 2);
				if (arg0 <= this.anInt3981) {
					if (this.anInt3981 > arg0 && arg0 > this.anInt3981 - local91) {
						this.anInt3980 = local6;
					}
				} else if (arg0 < local91 + this.anInt3981) {
					this.anInt3980 = local6;
				}
			}
		} else if (this.anInt3980 > 0) {
			this.anInt3980 -= arg2;
			if (this.anInt3980 < 0) {
				this.anInt3980 = 0;
			}
		} else {
			this.anInt3980 += arg2;
			if (this.anInt3980 > 0) {
				this.anInt3980 = 0;
			}
		}
		this.anInt3981 += this.anInt3980 + local6 >> 1;
		return local73;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V")
	public void method3508(@OriginalArg(0) int arg0) {
		this.anInt3981 = arg0;
		this.anInt3980 = 0;
	}
}
