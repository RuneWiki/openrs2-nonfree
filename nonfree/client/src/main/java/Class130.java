import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class130 {

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
	private int anInt3296;

	@OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
	public int anInt3301;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)I")
	public int method2930() {
		return this.anInt3301 & 0x3FFF;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IB)V")
	public void method2932(@OriginalArg(0) int arg0) {
		this.anInt3301 = arg0;
		this.anInt3296 = 0;
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(B)V")
	public void method2934() {
		this.anInt3301 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIII)Z")
	public boolean method2935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = this.anInt3296;
		if (arg1 == this.anInt3301 && this.anInt3296 == 0) {
			return false;
		}
		@Pc(87) boolean local87;
		@Pc(65) int local65;
		if (this.anInt3296 == 0) {
			if (this.anInt3301 < arg1 && arg1 <= arg2 + this.anInt3301 || this.anInt3301 > arg1 && arg1 >= this.anInt3301 - arg2) {
				this.anInt3301 = arg1;
				return false;
			}
			local87 = true;
		} else {
			@Pc(70) int local70;
			if (this.anInt3296 > 0 && arg1 > this.anInt3301) {
				local65 = this.anInt3296 * this.anInt3296 / (arg2 * 2);
				local70 = this.anInt3301 + local65;
				if (arg1 > local70 && local70 >= this.anInt3301) {
					local87 = true;
				} else {
					local87 = false;
				}
			} else if (this.anInt3296 < 0 && arg1 < this.anInt3301) {
				local65 = this.anInt3296 * this.anInt3296 / (arg2 * 2);
				local70 = this.anInt3301 - local65;
				if (local70 > arg1 && local70 <= this.anInt3301) {
					local87 = true;
				} else {
					local87 = false;
				}
			} else {
				local87 = false;
			}
		}
		if (local87) {
			if (this.anInt3301 >= arg1) {
				this.anInt3296 -= arg2;
				if (arg0 != 0 && this.anInt3296 < -arg0) {
					this.anInt3296 = -arg0;
				}
			} else {
				this.anInt3296 += arg2;
				if (arg0 != 0 && this.anInt3296 > arg0) {
					this.anInt3296 = arg0;
				}
			}
			if (this.anInt3296 != local19) {
				local65 = this.anInt3296 * this.anInt3296 / (arg2 * 2);
				if (arg1 <= this.anInt3301) {
					if (arg1 < this.anInt3301 && this.anInt3301 - local65 < arg1) {
						this.anInt3296 = local19;
					}
				} else if (local65 + this.anInt3301 > arg1) {
					this.anInt3296 = local19;
				}
			}
		} else if (this.anInt3296 <= 0) {
			this.anInt3296 += arg2;
			if (this.anInt3296 > 0) {
				this.anInt3296 = 0;
			}
		} else {
			this.anInt3296 -= arg2;
			if (this.anInt3296 < 0) {
				this.anInt3296 = 0;
			}
		}
		this.anInt3301 += this.anInt3296 + local19 >> 1;
		return local87;
	}
}
