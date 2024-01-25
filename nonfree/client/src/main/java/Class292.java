import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class292 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
	public int anInt7699;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
	private int anInt7701;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public void method6387() {
		this.anInt7699 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)I")
	public int method6390() {
		return this.anInt7699 & 0x3FFF;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIII)Z")
	public boolean method6391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7701;
		if (arg0 == this.anInt7699 && this.anInt7701 == 0) {
			return false;
		}
		@Pc(44) boolean local44;
		@Pc(56) int local56;
		if (this.anInt7701 == 0) {
			if (this.anInt7699 < arg0 && this.anInt7699 + arg1 >= arg0 || this.anInt7699 > arg0 && arg0 >= this.anInt7699 - arg1) {
				this.anInt7699 = arg0;
				return false;
			}
			local44 = true;
		} else {
			@Pc(61) int local61;
			if (this.anInt7701 > 0 && arg0 > this.anInt7699) {
				local56 = this.anInt7701 * this.anInt7701 / (arg1 * 2);
				local61 = local56 + this.anInt7699;
				if (local61 < arg0 && this.anInt7699 <= local61) {
					local44 = true;
				} else {
					local44 = false;
				}
			} else if (this.anInt7701 < 0 && arg0 < this.anInt7699) {
				local56 = this.anInt7701 * this.anInt7701 / (arg1 * 2);
				local61 = this.anInt7699 - local56;
				if (arg0 < local61 && this.anInt7699 >= local61) {
					local44 = true;
				} else {
					local44 = false;
				}
			} else {
				local44 = false;
			}
		}
		if (local44) {
			if (arg0 <= this.anInt7699) {
				this.anInt7701 -= arg1;
				if (arg2 != 0 && -arg2 > this.anInt7701) {
					this.anInt7701 = -arg2;
				}
			} else {
				this.anInt7701 += arg1;
				if (arg2 != 0 && arg2 < this.anInt7701) {
					this.anInt7701 = arg2;
				}
			}
			if (this.anInt7701 != local8) {
				local56 = this.anInt7701 * this.anInt7701 / (arg1 * 2);
				if (this.anInt7699 < arg0) {
					if (local56 + this.anInt7699 > arg0) {
						this.anInt7701 = local8;
					}
				} else if (this.anInt7699 > arg0 && this.anInt7699 - local56 < arg0) {
					this.anInt7701 = local8;
				}
			}
		} else if (this.anInt7701 <= 0) {
			this.anInt7701 += arg1;
			if (this.anInt7701 > 0) {
				this.anInt7701 = 0;
			}
		} else {
			this.anInt7701 -= arg1;
			if (this.anInt7701 < 0) {
				this.anInt7701 = 0;
			}
		}
		this.anInt7699 += local8 + this.anInt7701 >> 1;
		return local44;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BI)V")
	public void method6393(@OriginalArg(1) int arg0) {
		this.anInt7699 = arg0;
		this.anInt7701 = 0;
	}
}
