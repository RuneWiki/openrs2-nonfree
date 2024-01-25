import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class15 {

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	public int anInt391;

	static {
		new Class158("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)V")
	public void method325(@OriginalArg(0) int arg0) {
		this.anInt391 = arg0;
		this.anInt387 = 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public void method326() {
		this.anInt391 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)I")
	public int method327() {
		return this.anInt391 & 0x3FFF;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)Z")
	public boolean method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt387;
		if (this.anInt391 == arg2 && this.anInt387 == 0) {
			return false;
		}
		@Pc(56) boolean local56;
		@Pc(78) int local78;
		if (this.anInt387 == 0) {
			if (arg2 > this.anInt391 && arg2 <= this.anInt391 + arg0 || arg2 < this.anInt391 && arg2 >= this.anInt391 - arg0) {
				this.anInt391 = arg2;
				return false;
			}
			local56 = true;
		} else {
			@Pc(83) int local83;
			if (this.anInt387 > 0 && arg2 > this.anInt391) {
				local78 = this.anInt387 * this.anInt387 / (arg0 * 2);
				local83 = local78 + this.anInt391;
				if (local83 < arg2 && local83 >= this.anInt391) {
					local56 = true;
				} else {
					local56 = false;
				}
			} else if (this.anInt387 < 0 && this.anInt391 > arg2) {
				local78 = this.anInt387 * this.anInt387 / (arg0 * 2);
				local83 = this.anInt391 - local78;
				if (local83 > arg2 && this.anInt391 >= local83) {
					local56 = true;
				} else {
					local56 = false;
				}
			} else {
				local56 = false;
			}
		}
		if (local56) {
			if (this.anInt391 >= arg2) {
				this.anInt387 -= arg0;
				if (arg1 != 0 && -arg1 > this.anInt387) {
					this.anInt387 = -arg1;
				}
			} else {
				this.anInt387 += arg0;
				if (arg1 != 0 && this.anInt387 > arg1) {
					this.anInt387 = arg1;
				}
			}
			if (this.anInt387 != local8) {
				local78 = this.anInt387 * this.anInt387 / (arg0 * 2);
				if (arg2 > this.anInt391) {
					if (arg2 < local78 + this.anInt391) {
						this.anInt387 = local8;
					}
				} else if (arg2 < this.anInt391 && arg2 > this.anInt391 - local78) {
					this.anInt387 = local8;
				}
			}
		} else if (this.anInt387 <= 0) {
			this.anInt387 += arg0;
			if (this.anInt387 > 0) {
				this.anInt387 = 0;
			}
		} else {
			this.anInt387 -= arg0;
			if (this.anInt387 < 0) {
				this.anInt387 = 0;
			}
		}
		this.anInt391 += local8 + this.anInt387 >> 1;
		return local56;
	}
}
