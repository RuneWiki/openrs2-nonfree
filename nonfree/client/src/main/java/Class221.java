import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class221 {

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	public int anInt6446;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	private int anInt6448;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public void method5384() {
		this.anInt6446 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIII)Z")
	public boolean method5387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt6448;
		if (arg1 == this.anInt6446 && this.anInt6448 == 0) {
			return false;
		}
		@Pc(67) boolean local67;
		@Pc(89) int local89;
		if (this.anInt6448 == 0) {
			if (this.anInt6446 < arg1 && this.anInt6446 + arg2 >= arg1 || this.anInt6446 > arg1 && arg1 >= this.anInt6446 - arg2) {
				this.anInt6446 = arg1;
				return false;
			}
			local67 = true;
		} else {
			@Pc(95) int local95;
			if (this.anInt6448 > 0 && arg1 > this.anInt6446) {
				local89 = this.anInt6448 * this.anInt6448 / (arg2 * 2);
				local95 = this.anInt6446 + local89;
				if (arg1 > local95 && this.anInt6446 <= local95) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else if (this.anInt6448 < 0 && arg1 < this.anInt6446) {
				local89 = this.anInt6448 * this.anInt6448 / (arg2 * 2);
				local95 = this.anInt6446 - local89;
				if (arg1 < local95 && local95 <= this.anInt6446) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else {
				local67 = false;
			}
		}
		if (local67) {
			if (this.anInt6446 >= arg1) {
				this.anInt6448 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt6448) {
					this.anInt6448 = -arg0;
				}
			} else {
				this.anInt6448 += arg2;
				if (arg0 != 0 && this.anInt6448 > arg0) {
					this.anInt6448 = arg0;
				}
			}
			if (this.anInt6448 != local8) {
				local89 = this.anInt6448 * this.anInt6448 / (arg2 * 2);
				if (arg1 <= this.anInt6446) {
					if (this.anInt6446 > arg1 && arg1 > this.anInt6446 - local89) {
						this.anInt6448 = local8;
					}
				} else if (local89 + this.anInt6446 > arg1) {
					this.anInt6448 = local8;
				}
			}
		} else if (this.anInt6448 <= 0) {
			this.anInt6448 += arg2;
			if (this.anInt6448 > 0) {
				this.anInt6448 = 0;
			}
		} else {
			this.anInt6448 -= arg2;
			if (this.anInt6448 < 0) {
				this.anInt6448 = 0;
			}
		}
		this.anInt6446 += local8 + this.anInt6448 >> 1;
		return local67;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
	public void method5388(@OriginalArg(1) int arg0) {
		this.anInt6446 = arg0;
		this.anInt6448 = 0;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)I")
	public int method5389() {
		return this.anInt6446 & 0x3FFF;
	}
}
