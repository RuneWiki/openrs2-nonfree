import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class41 {

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
	public void method701(@OriginalArg(0) int arg0) {
		this.anInt774 = arg0;
		this.anInt773 = 0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method703() {
		this.anInt774 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
	public int method704() {
		return this.anInt774 & 0x3FFF;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)Z")
	public boolean method709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt773;
		if (this.anInt774 == arg0 && this.anInt773 == 0) {
			return false;
		}
		@Pc(65) boolean local65;
		@Pc(47) int local47;
		if (this.anInt773 == 0) {
			if (this.anInt774 < arg0 && arg0 <= this.anInt774 + arg1 || this.anInt774 > arg0 && arg0 >= this.anInt774 - arg1) {
				this.anInt774 = arg0;
				return false;
			}
			local65 = true;
		} else {
			@Pc(52) int local52;
			if (this.anInt773 > 0 && this.anInt774 < arg0) {
				local47 = this.anInt773 * this.anInt773 / (arg1 * 2);
				local52 = local47 + this.anInt774;
				if (arg0 > local52 && this.anInt774 <= local52) {
					local65 = true;
				} else {
					local65 = false;
				}
			} else if (this.anInt773 < 0 && this.anInt774 > arg0) {
				local47 = this.anInt773 * this.anInt773 / (arg1 * 2);
				local52 = this.anInt774 - local47;
				if (local52 > arg0 && this.anInt774 >= local52) {
					local65 = true;
				} else {
					local65 = false;
				}
			} else {
				local65 = false;
			}
		}
		if (local65) {
			if (this.anInt774 < arg0) {
				this.anInt773 += arg1;
				if (arg2 != 0 && arg2 < this.anInt773) {
					this.anInt773 = arg2;
				}
			} else {
				this.anInt773 -= arg1;
				if (arg2 != 0 && this.anInt773 < -arg2) {
					this.anInt773 = -arg2;
				}
			}
			if (this.anInt773 != local8) {
				local47 = this.anInt773 * this.anInt773 / (arg1 * 2);
				if (arg0 > this.anInt774) {
					if (this.anInt774 + local47 > arg0) {
						this.anInt773 = local8;
					}
				} else if (arg0 < this.anInt774 && arg0 > this.anInt774 - local47) {
					this.anInt773 = local8;
				}
			}
		} else if (this.anInt773 <= 0) {
			this.anInt773 += arg1;
			if (this.anInt773 > 0) {
				this.anInt773 = 0;
			}
		} else {
			this.anInt773 -= arg1;
			if (this.anInt773 < 0) {
				this.anInt773 = 0;
			}
		}
		this.anInt774 += local8 + this.anInt773 >> 1;
		return local65;
	}
}
