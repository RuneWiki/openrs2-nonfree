import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class63 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
	private int anInt2109;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
	public int anInt2110;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII)Z")
	public boolean method1992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt2109;
		if (this.anInt2110 == arg0 && this.anInt2109 == 0) {
			return false;
		}
		@Pc(56) boolean local56;
		@Pc(82) int local82;
		if (this.anInt2109 == 0) {
			if (arg0 > this.anInt2110 && arg2 + this.anInt2110 >= arg0 || this.anInt2110 > arg0 && arg0 >= this.anInt2110 - arg2) {
				this.anInt2110 = arg0;
				return false;
			}
			local56 = true;
		} else {
			@Pc(88) int local88;
			if (this.anInt2109 > 0 && arg0 > this.anInt2110) {
				local82 = this.anInt2109 * this.anInt2109 / (arg2 * 2);
				local88 = local82 + this.anInt2110;
				if (local88 < arg0 && this.anInt2110 <= local88) {
					local56 = true;
				} else {
					local56 = false;
				}
			} else if (this.anInt2109 < 0 && this.anInt2110 > arg0) {
				local82 = this.anInt2109 * this.anInt2109 / (arg2 * 2);
				local88 = this.anInt2110 - local82;
				if (arg0 < local88 && local88 <= this.anInt2110) {
					local56 = true;
				} else {
					local56 = false;
				}
			} else {
				local56 = false;
			}
		}
		if (local56) {
			if (arg0 > this.anInt2110) {
				this.anInt2109 += arg2;
				if (arg1 != 0 && arg1 < this.anInt2109) {
					this.anInt2109 = arg1;
				}
			} else {
				this.anInt2109 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt2109) {
					this.anInt2109 = -arg1;
				}
			}
			if (local8 != this.anInt2109) {
				local82 = this.anInt2109 * this.anInt2109 / (arg2 * 2);
				if (arg0 > this.anInt2110) {
					if (arg0 < local82 + this.anInt2110) {
						this.anInt2109 = local8;
					}
				} else if (arg0 < this.anInt2110 && arg0 > this.anInt2110 - local82) {
					this.anInt2109 = local8;
				}
			}
		} else if (this.anInt2109 <= 0) {
			this.anInt2109 += arg2;
			if (this.anInt2109 > 0) {
				this.anInt2109 = 0;
			}
		} else {
			this.anInt2109 -= arg2;
			if (this.anInt2109 < 0) {
				this.anInt2109 = 0;
			}
		}
		this.anInt2110 += local8 + this.anInt2109 >> 1;
		return local56;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)I")
	public int method1994() {
		return this.anInt2110 & 0x3FFF;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
	public void method1995() {
		this.anInt2110 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
	public void method1996(@OriginalArg(1) int arg0) {
		this.anInt2109 = 0;
		this.anInt2110 = arg0;
	}
}
