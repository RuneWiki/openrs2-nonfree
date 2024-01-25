import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class352 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "[Lclient!mb;")
	public static final Class220[] aClass220Array1 = new Class220[5];

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
	private int anInt9272;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
	public int anInt9275;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass220Array1.length; local4++) {
			aClass220Array1[local4] = new Class220();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIII)Z")
	public boolean method7405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt9272;
		if (this.anInt9275 == arg2 && this.anInt9272 == 0) {
			return false;
		}
		@Pc(50) boolean local50;
		@Pc(62) int local62;
		if (this.anInt9272 == 0) {
			if (this.anInt9275 < arg2 && arg1 + this.anInt9275 >= arg2 || arg2 < this.anInt9275 && this.anInt9275 - arg1 <= arg2) {
				this.anInt9275 = arg2;
				return false;
			}
			local50 = true;
		} else {
			@Pc(68) int local68;
			if (this.anInt9272 > 0 && this.anInt9275 < arg2) {
				local62 = this.anInt9272 * this.anInt9272 / (arg1 * 2);
				local68 = local62 + this.anInt9275;
				if (arg2 > local68 && local68 >= this.anInt9275) {
					local50 = true;
				} else {
					local50 = false;
				}
			} else if (this.anInt9272 < 0 && this.anInt9275 > arg2) {
				local62 = this.anInt9272 * this.anInt9272 / (arg1 * 2);
				local68 = this.anInt9275 - local62;
				if (arg2 < local68 && local68 <= this.anInt9275) {
					local50 = true;
				} else {
					local50 = false;
				}
			} else {
				local50 = false;
			}
		}
		if (local50) {
			if (this.anInt9275 >= arg2) {
				this.anInt9272 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt9272) {
					this.anInt9272 = -arg0;
				}
			} else {
				this.anInt9272 += arg1;
				if (arg0 != 0 && this.anInt9272 > arg0) {
					this.anInt9272 = arg0;
				}
			}
			if (local8 != this.anInt9272) {
				local62 = this.anInt9272 * this.anInt9272 / (arg1 * 2);
				if (this.anInt9275 < arg2) {
					if (this.anInt9275 + local62 > arg2) {
						this.anInt9272 = local8;
					}
				} else if (arg2 < this.anInt9275 && arg2 > this.anInt9275 - local62) {
					this.anInt9272 = local8;
				}
			}
		} else if (this.anInt9272 <= 0) {
			this.anInt9272 += arg1;
			if (this.anInt9272 > 0) {
				this.anInt9272 = 0;
			}
		} else {
			this.anInt9272 -= arg1;
			if (this.anInt9272 < 0) {
				this.anInt9272 = 0;
			}
		}
		this.anInt9275 += this.anInt9272 + local8 >> 1;
		return local50;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public void method7406(@OriginalArg(0) int arg0) {
		this.anInt9275 = arg0;
		this.anInt9272 = 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public void method7407() {
		this.anInt9275 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)I")
	public int method7410() {
		return this.anInt9275 & 0x3FFF;
	}
}
