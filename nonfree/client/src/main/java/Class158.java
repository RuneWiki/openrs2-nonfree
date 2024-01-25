import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class158 {

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	private int anInt4260;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	public int anInt4265;

	static {
		new Class55("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
		new Class55("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
	public int method3356() {
		return this.anInt4265 & 0x3FFF;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIII)Z")
	public boolean method3358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4260;
		if (this.anInt4265 == arg2 && this.anInt4260 == 0) {
			return false;
		}
		@Pc(68) boolean local68;
		@Pc(105) int local105;
		if (this.anInt4260 == 0) {
			if (this.anInt4265 < arg2 && this.anInt4265 + arg0 >= arg2 || arg2 < this.anInt4265 && arg2 >= this.anInt4265 - arg0) {
				this.anInt4265 = arg2;
				return false;
			}
			local68 = true;
		} else {
			@Pc(111) int local111;
			if (this.anInt4260 > 0 && this.anInt4265 < arg2) {
				local105 = this.anInt4260 * this.anInt4260 / (arg0 * 2);
				local111 = this.anInt4265 + local105;
				if (local111 < arg2 && local111 >= this.anInt4265) {
					local68 = true;
				} else {
					local68 = false;
				}
			} else if (this.anInt4260 < 0 && arg2 < this.anInt4265) {
				local105 = this.anInt4260 * this.anInt4260 / (arg0 * 2);
				local111 = this.anInt4265 - local105;
				if (arg2 < local111 && local111 <= this.anInt4265) {
					local68 = true;
				} else {
					local68 = false;
				}
			} else {
				local68 = false;
			}
		}
		if (local68) {
			if (this.anInt4265 < arg2) {
				this.anInt4260 += arg0;
				if (arg1 != 0 && arg1 < this.anInt4260) {
					this.anInt4260 = arg1;
				}
			} else {
				this.anInt4260 -= arg0;
				if (arg1 != 0 && -arg1 > this.anInt4260) {
					this.anInt4260 = -arg1;
				}
			}
			if (this.anInt4260 != local8) {
				local105 = this.anInt4260 * this.anInt4260 / (arg0 * 2);
				if (this.anInt4265 >= arg2) {
					if (this.anInt4265 > arg2 && arg2 > this.anInt4265 - local105) {
						this.anInt4260 = local8;
					}
				} else if (this.anInt4265 + local105 > arg2) {
					this.anInt4260 = local8;
				}
			}
		} else if (this.anInt4260 <= 0) {
			this.anInt4260 += arg0;
			if (this.anInt4260 > 0) {
				this.anInt4260 = 0;
			}
		} else {
			this.anInt4260 -= arg0;
			if (this.anInt4260 < 0) {
				this.anInt4260 = 0;
			}
		}
		this.anInt4265 += local8 + this.anInt4260 >> 1;
		return local68;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZI)V")
	public void method3359(@OriginalArg(1) int arg0) {
		this.anInt4265 = arg0;
		this.anInt4260 = 0;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	public void method3362() {
		this.anInt4265 &= 0x3FFF;
	}
}
