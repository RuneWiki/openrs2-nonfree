import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class314 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
	public int anInt8733;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
	private int anInt8735;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public void method7389(@OriginalArg(0) int arg0) {
		this.anInt8735 = 0;
		this.anInt8733 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIZ)Z")
	public boolean method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt8735;
		if (arg0 == this.anInt8733 && this.anInt8735 == 0) {
			return false;
		}
		@Pc(74) boolean local74;
		@Pc(56) int local56;
		if (this.anInt8735 == 0) {
			if (this.anInt8733 < arg0 && arg0 <= arg1 + this.anInt8733 || arg0 < this.anInt8733 && arg0 >= this.anInt8733 - arg1) {
				this.anInt8733 = arg0;
				return false;
			}
			local74 = true;
		} else {
			@Pc(61) int local61;
			if (this.anInt8735 > 0 && arg0 > this.anInt8733) {
				local56 = this.anInt8735 * this.anInt8735 / (arg1 * 2);
				local61 = local56 + this.anInt8733;
				if (local61 < arg0 && local61 >= this.anInt8733) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else if (this.anInt8735 < 0 && this.anInt8733 > arg0) {
				local56 = this.anInt8735 * this.anInt8735 / (arg1 * 2);
				local61 = this.anInt8733 - local56;
				if (local61 > arg0 && this.anInt8733 >= local61) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else {
				local74 = false;
			}
		}
		if (local74) {
			if (arg0 > this.anInt8733) {
				this.anInt8735 += arg1;
				if (arg2 != 0 && this.anInt8735 > arg2) {
					this.anInt8735 = arg2;
				}
			} else {
				this.anInt8735 -= arg1;
				if (arg2 != 0 && -arg2 > this.anInt8735) {
					this.anInt8735 = -arg2;
				}
			}
			if (this.anInt8735 != local8) {
				local56 = this.anInt8735 * this.anInt8735 / (arg1 * 2);
				if (arg0 > this.anInt8733) {
					if (local56 + this.anInt8733 > arg0) {
						this.anInt8735 = local8;
					}
				} else if (arg0 < this.anInt8733 && arg0 > this.anInt8733 - local56) {
					this.anInt8735 = local8;
				}
			}
		} else if (this.anInt8735 <= 0) {
			this.anInt8735 += arg1;
			if (this.anInt8735 > 0) {
				this.anInt8735 = 0;
			}
		} else {
			this.anInt8735 -= arg1;
			if (this.anInt8735 < 0) {
				this.anInt8735 = 0;
			}
		}
		this.anInt8733 += local8 + this.anInt8735 >> 1;
		return local74;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	public void method7394() {
		this.anInt8733 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)I")
	public int method7395() {
		return this.anInt8733 & 0x3FFF;
	}
}
