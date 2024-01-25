import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class82 {

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
	private int anInt2144;

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
	public int anInt2146;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
	public void method1811(@OriginalArg(1) int arg0) {
		this.anInt2144 = 0;
		this.anInt2146 = arg0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIII)Z")
	public boolean method1813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt2144;
		if (this.anInt2146 == arg2 && this.anInt2144 == 0) {
			return false;
		}
		@Pc(73) boolean local73;
		@Pc(58) int local58;
		if (this.anInt2144 == 0) {
			if (this.anInt2146 < arg2 && arg1 + this.anInt2146 >= arg2 || arg2 < this.anInt2146 && this.anInt2146 - arg1 <= arg2) {
				this.anInt2146 = arg2;
				return false;
			}
			local73 = true;
		} else {
			@Pc(64) int local64;
			if (this.anInt2144 > 0 && this.anInt2146 < arg2) {
				local58 = this.anInt2144 * this.anInt2144 / (arg1 * 2);
				local64 = local58 + this.anInt2146;
				if (local64 < arg2 && this.anInt2146 <= local64) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else if (this.anInt2144 < 0 && arg2 < this.anInt2146) {
				local58 = this.anInt2144 * this.anInt2144 / (arg1 * 2);
				local64 = this.anInt2146 - local58;
				if (local64 > arg2 && this.anInt2146 >= local64) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else {
				local73 = false;
			}
		}
		if (local73) {
			if (this.anInt2146 >= arg2) {
				this.anInt2144 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt2144) {
					this.anInt2144 = -arg0;
				}
			} else {
				this.anInt2144 += arg1;
				if (arg0 != 0 && arg0 < this.anInt2144) {
					this.anInt2144 = arg0;
				}
			}
			if (this.anInt2144 != local8) {
				local58 = this.anInt2144 * this.anInt2144 / (arg1 * 2);
				if (this.anInt2146 < arg2) {
					if (arg2 < this.anInt2146 + local58) {
						this.anInt2144 = local8;
					}
				} else if (arg2 < this.anInt2146 && arg2 > this.anInt2146 - local58) {
					this.anInt2144 = local8;
				}
			}
		} else if (this.anInt2144 > 0) {
			this.anInt2144 -= arg1;
			if (this.anInt2144 < 0) {
				this.anInt2144 = 0;
			}
		} else {
			this.anInt2144 += arg1;
			if (this.anInt2144 > 0) {
				this.anInt2144 = 0;
			}
		}
		this.anInt2146 += this.anInt2144 + local8 >> 1;
		return local73;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	public void method1814() {
		this.anInt2146 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)I")
	public int method1815() {
		return this.anInt2146 & 0x3FFF;
	}
}
