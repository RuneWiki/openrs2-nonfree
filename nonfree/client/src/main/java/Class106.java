import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class106 {

	@OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
	public int anInt3524;

	@OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
	private int anInt3526;

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)V")
	public void method3289() {
		this.anInt3524 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)I")
	public int method3290() {
		return this.anInt3524 & 0x3FFF;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIII)Z")
	public boolean method3292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt3526;
		if (this.anInt3524 == arg1 && this.anInt3526 == 0) {
			return false;
		}
		@Pc(62) boolean local62;
		@Pc(53) int local53;
		if (this.anInt3526 == 0) {
			if (arg1 > this.anInt3524 && this.anInt3524 + arg0 >= arg1 || this.anInt3524 > arg1 && arg1 >= this.anInt3524 - arg0) {
				this.anInt3524 = arg1;
				return false;
			}
			local62 = true;
		} else {
			@Pc(48) int local48;
			if (this.anInt3526 > 0 && arg1 > this.anInt3524) {
				local48 = this.anInt3526 * this.anInt3526 / (arg0 * 2);
				local53 = this.anInt3524 + local48;
				if (local53 < arg1 && this.anInt3524 <= local53) {
					local62 = true;
				} else {
					local62 = false;
				}
			} else if (this.anInt3526 < 0 && arg1 < this.anInt3524) {
				local48 = this.anInt3526 * this.anInt3526 / (arg0 * 2);
				local53 = this.anInt3524 - local48;
				if (arg1 < local53 && local53 <= this.anInt3524) {
					local62 = true;
				} else {
					local62 = false;
				}
			} else {
				local62 = false;
			}
		}
		if (local62) {
			if (arg1 > this.anInt3524) {
				this.anInt3526 += arg0;
				if (arg2 != 0 && this.anInt3526 > arg2) {
					this.anInt3526 = arg2;
				}
			} else {
				this.anInt3526 -= arg0;
				if (arg2 != 0 && this.anInt3526 < -arg2) {
					this.anInt3526 = -arg2;
				}
			}
			if (this.anInt3526 != local8) {
				local53 = this.anInt3526 * this.anInt3526 / (arg0 * 2);
				if (this.anInt3524 >= arg1) {
					if (arg1 < this.anInt3524 && arg1 > this.anInt3524 - local53) {
						this.anInt3526 = local8;
					}
				} else if (arg1 < this.anInt3524 + local53) {
					this.anInt3526 = local8;
				}
			}
		} else if (this.anInt3526 <= 0) {
			this.anInt3526 += arg0;
			if (this.anInt3526 > 0) {
				this.anInt3526 = 0;
			}
		} else {
			this.anInt3526 -= arg0;
			if (this.anInt3526 < 0) {
				this.anInt3526 = 0;
			}
		}
		this.anInt3524 += local8 + this.anInt3526 >> 1;
		return local62;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(BI)V")
	public void method3293(@OriginalArg(1) int arg0) {
		this.anInt3524 = arg0;
		this.anInt3526 = 0;
	}
}
