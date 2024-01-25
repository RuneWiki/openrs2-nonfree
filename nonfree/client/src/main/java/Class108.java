import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class108 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	public int anInt2729;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	private int anInt2735;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	public void method2160(@OriginalArg(0) int arg0) {
		this.anInt2729 = arg0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public void method2163() {
		this.anInt2729 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)I")
	public int method2164() {
		return this.anInt2729 & 0x3FFF;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII)Z")
	public boolean method2165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt2735;
		if (arg0 == this.anInt2729 && this.anInt2735 == 0) {
			return false;
		}
		@Pc(64) boolean local64;
		@Pc(86) int local86;
		if (this.anInt2735 == 0) {
			if (arg0 > this.anInt2729 && arg1 + this.anInt2729 >= arg0 || arg0 < this.anInt2729 && arg0 >= this.anInt2729 - arg1) {
				this.anInt2729 = arg0;
				return false;
			}
			local64 = true;
		} else {
			@Pc(92) int local92;
			if (this.anInt2735 > 0 && this.anInt2729 < arg0) {
				local86 = this.anInt2735 * this.anInt2735 / (arg1 * 2);
				local92 = this.anInt2729 + local86;
				if (local92 < arg0 && this.anInt2729 <= local92) {
					local64 = true;
				} else {
					local64 = false;
				}
			} else if (this.anInt2735 < 0 && this.anInt2729 > arg0) {
				local86 = this.anInt2735 * this.anInt2735 / (arg1 * 2);
				local92 = this.anInt2729 - local86;
				if (local92 > arg0 && local92 <= this.anInt2729) {
					local64 = true;
				} else {
					local64 = false;
				}
			} else {
				local64 = false;
			}
		}
		if (local64) {
			if (this.anInt2729 < arg0) {
				this.anInt2735 += arg1;
				if (arg2 != 0 && this.anInt2735 > arg2) {
					this.anInt2735 = arg2;
				}
			} else {
				this.anInt2735 -= arg1;
				if (arg2 != 0 && -arg2 > this.anInt2735) {
					this.anInt2735 = -arg2;
				}
			}
			if (this.anInt2735 != local8) {
				local86 = this.anInt2735 * this.anInt2735 / (arg1 * 2);
				if (arg0 <= this.anInt2729) {
					if (this.anInt2729 > arg0 && arg0 > this.anInt2729 - local86) {
						this.anInt2735 = local8;
					}
				} else if (arg0 < local86 + this.anInt2729) {
					this.anInt2735 = local8;
				}
			}
		} else if (this.anInt2735 > 0) {
			this.anInt2735 -= arg1;
			if (this.anInt2735 < 0) {
				this.anInt2735 = 0;
			}
		} else {
			this.anInt2735 += arg1;
			if (this.anInt2735 > 0) {
				this.anInt2735 = 0;
			}
		}
		this.anInt2729 += local8 + this.anInt2735 >> 1;
		return local64;
	}
}
