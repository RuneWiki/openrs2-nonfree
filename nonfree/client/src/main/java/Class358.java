import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class358 {

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	private int anInt10342;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	public int anInt10350;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)V")
	public void method8343(@OriginalArg(1) int arg0) {
		this.anInt10342 = 0;
		this.anInt10350 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIB)Z")
	public boolean method8344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.anInt10342;
		if (arg0 == this.anInt10350 && this.anInt10342 == 0) {
			return false;
		}
		@Pc(74) boolean local74;
		@Pc(105) int local105;
		if (this.anInt10342 == 0) {
			if (arg0 > this.anInt10350 && arg0 <= this.anInt10350 + arg2 || arg0 < this.anInt10350 && this.anInt10350 - arg2 <= arg0) {
				this.anInt10350 = arg0;
				return false;
			}
			local74 = true;
		} else {
			@Pc(111) int local111;
			if (this.anInt10342 > 0 && this.anInt10350 < arg0) {
				local105 = this.anInt10342 * this.anInt10342 / (arg2 * 2);
				local111 = this.anInt10350 + local105;
				if (arg0 > local111 && this.anInt10350 <= local111) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else if (this.anInt10342 < 0 && arg0 < this.anInt10350) {
				local105 = this.anInt10342 * this.anInt10342 / (arg2 * 2);
				local111 = this.anInt10350 - local105;
				if (local111 > arg0 && local111 <= this.anInt10350) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else {
				local74 = false;
			}
		}
		if (local74) {
			if (arg0 <= this.anInt10350) {
				this.anInt10342 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt10342) {
					this.anInt10342 = -arg1;
				}
			} else {
				this.anInt10342 += arg2;
				if (arg1 != 0 && arg1 < this.anInt10342) {
					this.anInt10342 = arg1;
				}
			}
			if (this.anInt10342 != local11) {
				local105 = this.anInt10342 * this.anInt10342 / (arg2 * 2);
				if (arg0 <= this.anInt10350) {
					if (this.anInt10350 > arg0 && this.anInt10350 - local105 < arg0) {
						this.anInt10342 = local11;
					}
				} else if (local105 + this.anInt10350 > arg0) {
					this.anInt10342 = local11;
				}
			}
		} else if (this.anInt10342 <= 0) {
			this.anInt10342 += arg2;
			if (this.anInt10342 > 0) {
				this.anInt10342 = 0;
			}
		} else {
			this.anInt10342 -= arg2;
			if (this.anInt10342 < 0) {
				this.anInt10342 = 0;
			}
		}
		this.anInt10350 += local11 + this.anInt10342 >> 1;
		return local74;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I")
	public int method8345() {
		return this.anInt10350 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public void method8347() {
		this.anInt10350 &= 0x3FFF;
	}
}
