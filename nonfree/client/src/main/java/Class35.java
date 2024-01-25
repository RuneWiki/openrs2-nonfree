import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class35 {

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	public int anInt858;

	static {
		new Class83("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I")
	public int method811() {
		return this.anInt858 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	public void method812(@OriginalArg(0) int arg0) {
		this.anInt858 = arg0;
		this.anInt857 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	public void method815() {
		this.anInt858 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)Z")
	public boolean method816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt857;
		if (this.anInt858 == arg2 && this.anInt857 == 0) {
			return false;
		}
		@Pc(42) boolean local42;
		@Pc(54) int local54;
		if (this.anInt857 == 0) {
			if (this.anInt858 < arg2 && this.anInt858 + arg0 >= arg2 || this.anInt858 > arg2 && this.anInt858 - arg0 <= arg2) {
				this.anInt858 = arg2;
				return false;
			}
			local42 = true;
		} else {
			@Pc(60) int local60;
			if (this.anInt857 > 0 && arg2 > this.anInt858) {
				local54 = this.anInt857 * this.anInt857 / (arg0 * 2);
				local60 = this.anInt858 + local54;
				if (local60 < arg2 && this.anInt858 <= local60) {
					local42 = true;
				} else {
					local42 = false;
				}
			} else if (this.anInt857 < 0 && this.anInt858 > arg2) {
				local54 = this.anInt857 * this.anInt857 / (arg0 * 2);
				local60 = this.anInt858 - local54;
				if (arg2 < local60 && local60 <= this.anInt858) {
					local42 = true;
				} else {
					local42 = false;
				}
			} else {
				local42 = false;
			}
		}
		if (local42) {
			if (arg2 <= this.anInt858) {
				this.anInt857 -= arg0;
				if (arg1 != 0 && this.anInt857 < -arg1) {
					this.anInt857 = -arg1;
				}
			} else {
				this.anInt857 += arg0;
				if (arg1 != 0 && arg1 < this.anInt857) {
					this.anInt857 = arg1;
				}
			}
			if (this.anInt857 != local8) {
				local54 = this.anInt857 * this.anInt857 / (arg0 * 2);
				if (this.anInt858 < arg2) {
					if (this.anInt858 + local54 > arg2) {
						this.anInt857 = local8;
					}
				} else if (arg2 < this.anInt858 && arg2 > this.anInt858 - local54) {
					this.anInt857 = local8;
				}
			}
		} else if (this.anInt857 > 0) {
			this.anInt857 -= arg0;
			if (this.anInt857 < 0) {
				this.anInt857 = 0;
			}
		} else {
			this.anInt857 += arg0;
			if (this.anInt857 > 0) {
				this.anInt857 = 0;
			}
		}
		this.anInt858 += local8 + this.anInt857 >> 1;
		return local42;
	}
}
