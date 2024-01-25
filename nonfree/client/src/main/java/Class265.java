import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class265 {

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	public int anInt7384;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
	private int anInt7386;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
	public int method5841() {
		return this.anInt7384 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZI)Z")
	public boolean method5843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7386;
		if (this.anInt7384 == arg1 && this.anInt7386 == 0) {
			return false;
		}
		@Pc(67) boolean local67;
		@Pc(103) int local103;
		if (this.anInt7386 == 0) {
			if (this.anInt7384 < arg1 && arg0 + this.anInt7384 >= arg1 || this.anInt7384 > arg1 && arg1 >= this.anInt7384 - arg0) {
				this.anInt7384 = arg1;
				return false;
			}
			local67 = true;
		} else {
			@Pc(108) int local108;
			if (this.anInt7386 > 0 && arg1 > this.anInt7384) {
				local103 = this.anInt7386 * this.anInt7386 / (arg0 * 2);
				local108 = this.anInt7384 + local103;
				if (local108 < arg1 && this.anInt7384 <= local108) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else if (this.anInt7386 < 0 && arg1 < this.anInt7384) {
				local103 = this.anInt7386 * this.anInt7386 / (arg0 * 2);
				local108 = this.anInt7384 - local103;
				if (arg1 < local108 && this.anInt7384 >= local108) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else {
				local67 = false;
			}
		}
		if (local67) {
			if (arg1 > this.anInt7384) {
				this.anInt7386 += arg0;
				if (arg2 != 0 && arg2 < this.anInt7386) {
					this.anInt7386 = arg2;
				}
			} else {
				this.anInt7386 -= arg0;
				if (arg2 != 0 && this.anInt7386 < -arg2) {
					this.anInt7386 = -arg2;
				}
			}
			if (this.anInt7386 != local8) {
				local103 = this.anInt7386 * this.anInt7386 / (arg0 * 2);
				if (arg1 > this.anInt7384) {
					if (arg1 < local103 + this.anInt7384) {
						this.anInt7386 = local8;
					}
				} else if (this.anInt7384 > arg1 && arg1 > this.anInt7384 - local103) {
					this.anInt7386 = local8;
				}
			}
		} else if (this.anInt7386 > 0) {
			this.anInt7386 -= arg0;
			if (this.anInt7386 < 0) {
				this.anInt7386 = 0;
			}
		} else {
			this.anInt7386 += arg0;
			if (this.anInt7386 > 0) {
				this.anInt7386 = 0;
			}
		}
		this.anInt7384 += local8 + this.anInt7386 >> 1;
		return local67;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
	public void method5846(@OriginalArg(1) int arg0) {
		this.anInt7384 = arg0;
		this.anInt7386 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	public void method5847() {
		this.anInt7384 &= 0x3FFF;
	}
}
