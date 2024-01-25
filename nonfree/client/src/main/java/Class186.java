import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class186 {

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
	public static final int[] anIntArray336 = new int[128];

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	private int anInt4913;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public int anInt4914;

	static {
		for (@Pc(6) int local6 = 0; local6 < anIntArray336.length; local6++) {
			anIntArray336[local6] = -1;
		}
		for (@Pc(22) int local22 = 65; local22 <= 90; local22++) {
			anIntArray336[local22] = local22 - 65;
		}
		for (@Pc(37) int local37 = 97; local37 <= 122; local37++) {
			anIntArray336[local37] = local37 + 26 - 97;
		}
		for (@Pc(52) int local52 = 48; local52 <= 57; local52++) {
			anIntArray336[local52] = local52 + 52 - 48;
		}
		anIntArray336[45] = anIntArray336[47] = 63;
		anIntArray336[42] = anIntArray336[43] = 62;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	public int method4106() {
		return this.anInt4914 & 0x3FFF;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public void method4108() {
		this.anInt4914 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public void method4111(@OriginalArg(1) int arg0) {
		this.anInt4914 = arg0;
		this.anInt4913 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIB)Z")
	public boolean method4112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = this.anInt4913;
		if (this.anInt4914 == arg1 && this.anInt4913 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(91) int local91;
		if (this.anInt4913 == 0) {
			if (arg1 > this.anInt4914 && arg2 + this.anInt4914 >= arg1 || this.anInt4914 > arg1 && this.anInt4914 - arg2 <= arg1) {
				this.anInt4914 = arg1;
				return false;
			}
			local69 = true;
		} else {
			@Pc(96) int local96;
			if (this.anInt4913 > 0 && arg1 > this.anInt4914) {
				local91 = this.anInt4913 * this.anInt4913 / (arg2 * 2);
				local96 = this.anInt4914 + local91;
				if (local96 < arg1 && this.anInt4914 <= local96) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt4913 < 0 && this.anInt4914 > arg1) {
				local91 = this.anInt4913 * this.anInt4913 / (arg2 * 2);
				local96 = this.anInt4914 - local91;
				if (arg1 < local96 && local96 <= this.anInt4914) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (this.anInt4914 < arg1) {
				this.anInt4913 += arg2;
				if (arg0 != 0 && arg0 < this.anInt4913) {
					this.anInt4913 = arg0;
				}
			} else {
				this.anInt4913 -= arg2;
				if (arg0 != 0 && this.anInt4913 < -arg0) {
					this.anInt4913 = -arg0;
				}
			}
			if (local13 != this.anInt4913) {
				local91 = this.anInt4913 * this.anInt4913 / (arg2 * 2);
				if (this.anInt4914 >= arg1) {
					if (arg1 < this.anInt4914 && arg1 > this.anInt4914 - local91) {
						this.anInt4913 = local13;
					}
				} else if (arg1 < local91 + this.anInt4914) {
					this.anInt4913 = local13;
				}
			}
		} else if (this.anInt4913 > 0) {
			this.anInt4913 -= arg2;
			if (this.anInt4913 < 0) {
				this.anInt4913 = 0;
			}
		} else {
			this.anInt4913 += arg2;
			if (this.anInt4913 > 0) {
				this.anInt4913 = 0;
			}
		}
		this.anInt4914 += this.anInt4913 + local13 >> 1;
		return local69;
	}
}
