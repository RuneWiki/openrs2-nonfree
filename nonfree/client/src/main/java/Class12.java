import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIII)Z")
	public boolean method174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt195;
		if (arg1 == this.anInt198 && this.anInt195 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(107) int local107;
		if (this.anInt195 == 0) {
			if (this.anInt198 < arg1 && this.anInt198 + arg2 >= arg1 || this.anInt198 > arg1 && this.anInt198 - arg2 <= arg1) {
				this.anInt198 = arg1;
				return false;
			}
			local66 = true;
		} else {
			@Pc(112) int local112;
			if (this.anInt195 > 0 && this.anInt198 < arg1) {
				local107 = this.anInt195 * this.anInt195 / (arg2 * 2);
				local112 = local107 + this.anInt198;
				if (arg1 > local112 && this.anInt198 <= local112) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt195 < 0 && arg1 < this.anInt198) {
				local107 = this.anInt195 * this.anInt195 / (arg2 * 2);
				local112 = this.anInt198 - local107;
				if (local112 > arg1 && this.anInt198 >= local112) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (this.anInt198 >= arg1) {
				this.anInt195 -= arg2;
				if (arg0 != 0 && this.anInt195 < -arg0) {
					this.anInt195 = -arg0;
				}
			} else {
				this.anInt195 += arg2;
				if (arg0 != 0 && arg0 < this.anInt195) {
					this.anInt195 = arg0;
				}
			}
			if (this.anInt195 != local8) {
				local107 = this.anInt195 * this.anInt195 / (arg2 * 2);
				if (this.anInt198 >= arg1) {
					if (this.anInt198 > arg1 && this.anInt198 - local107 < arg1) {
						this.anInt195 = local8;
					}
				} else if (arg1 < local107 + this.anInt198) {
					this.anInt195 = local8;
				}
			}
		} else if (this.anInt195 > 0) {
			this.anInt195 -= arg2;
			if (this.anInt195 < 0) {
				this.anInt195 = 0;
			}
		} else {
			this.anInt195 += arg2;
			if (this.anInt195 > 0) {
				this.anInt195 = 0;
			}
		}
		this.anInt198 += local8 + this.anInt195 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public void method175() {
		this.anInt198 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)I")
	public int method177() {
		return this.anInt198 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public void method178(@OriginalArg(1) int arg0) {
		this.anInt195 = 0;
		this.anInt198 = arg0;
	}
}
