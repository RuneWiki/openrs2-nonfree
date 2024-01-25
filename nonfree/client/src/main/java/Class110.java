import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class110 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	private int anInt2905;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public int anInt2906;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
	public int method2353() {
		return this.anInt2906 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZII)Z")
	public boolean method2354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt2905;
		if (this.anInt2906 == arg0 && this.anInt2905 == 0) {
			return false;
		}
		@Pc(83) boolean local83;
		@Pc(64) int local64;
		if (this.anInt2905 == 0) {
			if (arg0 > this.anInt2906 && arg0 <= this.anInt2906 + arg2 || arg0 < this.anInt2906 && arg0 >= this.anInt2906 - arg2) {
				this.anInt2906 = arg0;
				return false;
			}
			local83 = true;
		} else {
			@Pc(70) int local70;
			if (this.anInt2905 > 0 && arg0 > this.anInt2906) {
				local64 = this.anInt2905 * this.anInt2905 / (arg2 * 2);
				local70 = this.anInt2906 + local64;
				if (arg0 > local70 && this.anInt2906 <= local70) {
					local83 = true;
				} else {
					local83 = false;
				}
			} else if (this.anInt2905 < 0 && arg0 < this.anInt2906) {
				local64 = this.anInt2905 * this.anInt2905 / (arg2 * 2);
				local70 = this.anInt2906 - local64;
				if (local70 > arg0 && this.anInt2906 >= local70) {
					local83 = true;
				} else {
					local83 = false;
				}
			} else {
				local83 = false;
			}
		}
		if (local83) {
			if (arg0 <= this.anInt2906) {
				this.anInt2905 -= arg2;
				if (arg1 != 0 && this.anInt2905 < -arg1) {
					this.anInt2905 = -arg1;
				}
			} else {
				this.anInt2905 += arg2;
				if (arg1 != 0 && arg1 < this.anInt2905) {
					this.anInt2905 = arg1;
				}
			}
			if (local8 != this.anInt2905) {
				local64 = this.anInt2905 * this.anInt2905 / (arg2 * 2);
				if (arg0 > this.anInt2906) {
					if (this.anInt2906 + local64 > arg0) {
						this.anInt2905 = local8;
					}
				} else if (this.anInt2906 > arg0 && arg0 > this.anInt2906 - local64) {
					this.anInt2905 = local8;
				}
			}
		} else if (this.anInt2905 <= 0) {
			this.anInt2905 += arg2;
			if (this.anInt2905 > 0) {
				this.anInt2905 = 0;
			}
		} else {
			this.anInt2905 -= arg2;
			if (this.anInt2905 < 0) {
				this.anInt2905 = 0;
			}
		}
		this.anInt2906 += this.anInt2905 + local8 >> 1;
		return local83;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public void method2355() {
		this.anInt2906 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V")
	public void method2358(@OriginalArg(1) int arg0) {
		this.anInt2905 = 0;
		this.anInt2906 = arg0;
	}
}
