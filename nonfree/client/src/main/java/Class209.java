import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class209 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private int anInt6276;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	public int anInt6278;

	static {
		new Class45("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public int method5706() {
		return this.anInt6278 & 0x3FFF;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
	public void method5707(@OriginalArg(1) int arg0) {
		this.anInt6278 = arg0;
		this.anInt6276 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public void method5708() {
		this.anInt6278 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIB)Z")
	public boolean method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt6276;
		if (arg1 == this.anInt6278 && this.anInt6276 == 0) {
			return false;
		}
		@Pc(53) boolean local53;
		@Pc(65) int local65;
		if (this.anInt6276 == 0) {
			if (arg1 > this.anInt6278 && this.anInt6278 + arg2 >= arg1 || arg1 < this.anInt6278 && arg1 >= this.anInt6278 - arg2) {
				this.anInt6278 = arg1;
				return false;
			}
			local53 = true;
		} else {
			@Pc(70) int local70;
			if (this.anInt6276 > 0 && this.anInt6278 < arg1) {
				local65 = this.anInt6276 * this.anInt6276 / (arg2 * 2);
				local70 = this.anInt6278 + local65;
				if (arg1 > local70 && local70 >= this.anInt6278) {
					local53 = true;
				} else {
					local53 = false;
				}
			} else if (this.anInt6276 < 0 && arg1 < this.anInt6278) {
				local65 = this.anInt6276 * this.anInt6276 / (arg2 * 2);
				local70 = this.anInt6278 - local65;
				if (arg1 < local70 && this.anInt6278 >= local70) {
					local53 = true;
				} else {
					local53 = false;
				}
			} else {
				local53 = false;
			}
		}
		if (local53) {
			if (this.anInt6278 >= arg1) {
				this.anInt6276 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt6276) {
					this.anInt6276 = -arg0;
				}
			} else {
				this.anInt6276 += arg2;
				if (arg0 != 0 && arg0 < this.anInt6276) {
					this.anInt6276 = arg0;
				}
			}
			if (local8 != this.anInt6276) {
				local65 = this.anInt6276 * this.anInt6276 / (arg2 * 2);
				if (arg1 <= this.anInt6278) {
					if (arg1 < this.anInt6278 && arg1 > this.anInt6278 - local65) {
						this.anInt6276 = local8;
					}
				} else if (local65 + this.anInt6278 > arg1) {
					this.anInt6276 = local8;
				}
			}
		} else if (this.anInt6276 > 0) {
			this.anInt6276 -= arg2;
			if (this.anInt6276 < 0) {
				this.anInt6276 = 0;
			}
		} else {
			this.anInt6276 += arg2;
			if (this.anInt6276 > 0) {
				this.anInt6276 = 0;
			}
		}
		this.anInt6278 += this.anInt6276 + local8 >> 1;
		return local53;
	}
}
