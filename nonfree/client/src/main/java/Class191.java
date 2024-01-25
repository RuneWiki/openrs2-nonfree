import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class191 {

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
	public int anInt5877;

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
	private int anInt5879;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(II)V")
	public void method5069(@OriginalArg(1) int arg0) {
		this.anInt5879 = 0;
		this.anInt5877 = arg0;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V")
	public void method5070() {
		this.anInt5877 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I")
	public int method5071() {
		return this.anInt5877 & 0x3FFF;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIII)Z")
	public boolean method5074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt5879;
		if (arg0 == this.anInt5877 && this.anInt5879 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(93) int local93;
		if (this.anInt5879 == 0) {
			if (arg0 > this.anInt5877 && this.anInt5877 + arg2 >= arg0 || this.anInt5877 > arg0 && this.anInt5877 - arg2 <= arg0) {
				this.anInt5877 = arg0;
				return false;
			}
			local60 = true;
		} else {
			@Pc(99) int local99;
			if (this.anInt5879 > 0 && arg0 > this.anInt5877) {
				local93 = this.anInt5879 * this.anInt5879 / (arg2 * 2);
				local99 = this.anInt5877 + local93;
				if (local99 < arg0 && this.anInt5877 <= local99) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt5879 < 0 && arg0 < this.anInt5877) {
				local93 = this.anInt5879 * this.anInt5879 / (arg2 * 2);
				local99 = this.anInt5877 - local93;
				if (arg0 < local99 && this.anInt5877 >= local99) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 <= this.anInt5877) {
				this.anInt5879 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt5879) {
					this.anInt5879 = -arg1;
				}
			} else {
				this.anInt5879 += arg2;
				if (arg1 != 0 && this.anInt5879 > arg1) {
					this.anInt5879 = arg1;
				}
			}
			if (this.anInt5879 != local8) {
				local93 = this.anInt5879 * this.anInt5879 / (arg2 * 2);
				if (arg0 <= this.anInt5877) {
					if (this.anInt5877 > arg0 && this.anInt5877 - local93 < arg0) {
						this.anInt5879 = local8;
					}
				} else if (arg0 < this.anInt5877 + local93) {
					this.anInt5879 = local8;
				}
			}
		} else if (this.anInt5879 > 0) {
			this.anInt5879 -= arg2;
			if (this.anInt5879 < 0) {
				this.anInt5879 = 0;
			}
		} else {
			this.anInt5879 += arg2;
			if (this.anInt5879 > 0) {
				this.anInt5879 = 0;
			}
		}
		this.anInt5877 += this.anInt5879 + local8 >> 1;
		return local60;
	}
}
