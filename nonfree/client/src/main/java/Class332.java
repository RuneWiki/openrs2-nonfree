import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class332 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	private int anInt9687;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public int anInt9691;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method7922() {
		this.anInt9691 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	public void method7924(@OriginalArg(1) int arg0) {
		this.anInt9691 = arg0;
		this.anInt9687 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)I")
	public int method7925() {
		return this.anInt9691 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)Z")
	public boolean method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt9687;
		if (arg1 == this.anInt9691 && this.anInt9687 == 0) {
			return false;
		}
		@Pc(51) boolean local51;
		@Pc(84) int local84;
		if (this.anInt9687 == 0) {
			if (this.anInt9691 < arg1 && this.anInt9691 + arg2 >= arg1 || arg1 < this.anInt9691 && arg1 >= this.anInt9691 - arg2) {
				this.anInt9691 = arg1;
				return false;
			}
			local51 = true;
		} else {
			@Pc(90) int local90;
			if (this.anInt9687 > 0 && this.anInt9691 < arg1) {
				local84 = this.anInt9687 * this.anInt9687 / (arg2 * 2);
				local90 = this.anInt9691 + local84;
				if (arg1 > local90 && this.anInt9691 <= local90) {
					local51 = true;
				} else {
					local51 = false;
				}
			} else if (this.anInt9687 < 0 && this.anInt9691 > arg1) {
				local84 = this.anInt9687 * this.anInt9687 / (arg2 * 2);
				local90 = this.anInt9691 - local84;
				if (arg1 < local90 && local90 <= this.anInt9691) {
					local51 = true;
				} else {
					local51 = false;
				}
			} else {
				local51 = false;
			}
		}
		if (local51) {
			if (arg1 > this.anInt9691) {
				this.anInt9687 += arg2;
				if (arg0 != 0 && arg0 < this.anInt9687) {
					this.anInt9687 = arg0;
				}
			} else {
				this.anInt9687 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt9687) {
					this.anInt9687 = -arg0;
				}
			}
			if (this.anInt9687 != local8) {
				local84 = this.anInt9687 * this.anInt9687 / (arg2 * 2);
				if (this.anInt9691 >= arg1) {
					if (arg1 < this.anInt9691 && arg1 > this.anInt9691 - local84) {
						this.anInt9687 = local8;
					}
				} else if (arg1 < local84 + this.anInt9691) {
					this.anInt9687 = local8;
				}
			}
		} else if (this.anInt9687 > 0) {
			this.anInt9687 -= arg2;
			if (this.anInt9687 < 0) {
				this.anInt9687 = 0;
			}
		} else {
			this.anInt9687 += arg2;
			if (this.anInt9687 > 0) {
				this.anInt9687 = 0;
			}
		}
		this.anInt9691 += local8 + this.anInt9687 >> 1;
		return local51;
	}
}
