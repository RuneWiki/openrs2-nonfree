import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public class Class181 {

	@OriginalMember(owner = "client!jaa", name = "E", descriptor = "Lclient!nw;")
	public Class259 aClass259_4;

	@OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
	public int anInt10459;

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
	private int anInt10461;

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
	private int anInt10465;

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
	private int anInt10474;

	@OriginalMember(owner = "client!jaa", name = "z", descriptor = "I")
	public int anInt10475;

	@OriginalMember(owner = "client!jaa", name = "I", descriptor = "Z")
	private boolean aBoolean732 = false;

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
	private int anInt10493 = 0;

	@OriginalMember(owner = "client!jaa", name = "J", descriptor = "Z")
	private boolean aBoolean733 = false;

	@OriginalMember(owner = "client!jaa", name = "x", descriptor = "Lclient!rm;")
	public final Class318 aClass318_8;

	@OriginalMember(owner = "client!jaa", name = "D", descriptor = "Lclient!rm;")
	private final Class318 aClass318_7;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Z)V")
	protected Class181(@OriginalArg(0) boolean arg0) {
		this.aBoolean732 = arg0;
		this.aClass318_8 = new Class318();
		if (this.aBoolean732) {
			this.aClass318_7 = new Class318();
		} else {
			this.aClass318_7 = null;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V")
	public final void method8942() {
		this.method8965(0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZ)V")
	public final void method8943() {
		this.method8955(0, false, 0, -1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)V")
	public final void method8944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method8955(0, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
	public final void method8945() {
		this.anInt10461 = 0;
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)I")
	public final int method8947() {
		if (!this.method8967()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		if (this.method8967()) {
			local18 = this.aClass318_8.anInt9147 | 0x0;
			if (this.aBoolean732 && this.aClass259_4.anIntArray371 != null) {
				local18 |= this.aClass318_7.anInt9147;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)Z")
	public final boolean method8948() {
		@Pc(16) int local16;
		return this.aClass259_4 == null | (local16 = 1 - this.anInt10465) <= 0 ? false : this.aClass259_4.aBoolean503 | this.aClass259_4.anIntArray370[this.anInt10459] < this.anInt10475 + local16;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLclient!jaa;)V")
	public final void method8951(@OriginalArg(1) Class181 arg0) {
		this.anInt10475 = arg0.anInt10475;
		this.anInt10474 = arg0.anInt10474;
		this.aClass259_4 = arg0.aClass259_4;
		this.anInt10461 = arg0.anInt10461;
		this.anInt10465 = arg0.anInt10465;
		this.aBoolean733 = arg0.aBoolean733;
		this.anInt10459 = arg0.anInt10459;
		this.aBoolean732 = arg0.aBoolean732;
		this.method8968();
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "(I)Lclient!nw;")
	public final Class259 method8952() {
		return this.aClass259_4;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)V")
	public final void method8953(@OriginalArg(0) int arg0) {
		this.anInt10465 = arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ka;III)V")
	public final void method8954(@OriginalArg(0) Class129 arg0, @OriginalArg(3) int arg1) {
		if (!this.method8967()) {
			return;
		}
		arg0.method5298(arg1, (int[]) null, this.aClass259_4.anIntArray370[this.anInt10459], this.aClass318_8.aClass14_Sub2_Sub15_1, this.anInt10475, this.aClass259_4.aBoolean504, this.aClass318_8.anInt9151, this.aClass318_8.anInt9150, this.aClass318_8.aClass14_Sub2_Sub15_2);
		if (this.aBoolean732 && this.aClass259_4.anIntArray371 != null && this.aClass318_7.aBoolean632) {
			arg0.method5298(arg1, (int[]) null, this.aClass259_4.anIntArray370[this.anInt10459], this.aClass318_7.aClass14_Sub2_Sub15_1, this.anInt10475, this.aClass259_4.aBoolean504, this.aClass318_7.anInt9151, this.aClass318_7.anInt9150, this.aClass318_7.aClass14_Sub2_Sub15_2);
			return;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBZII)V")
	public final void method8955(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == this.method8959()) {
			return;
		}
		if (arg3 == -1) {
			this.aClass259_4 = null;
		} else {
			if (this.aClass259_4 == null || arg3 != this.aClass259_4.anInt7197) {
				this.aClass259_4 = Static581.aClass204_2.method5041(arg3);
			} else if (this.aClass259_4.anInt7194 == 0) {
				return;
			}
			this.anInt10465 = arg2;
			this.anInt10493 = arg0;
			this.anInt10461 = 0;
			if (arg1) {
				this.anInt10459 = (int) (Math.random() * (double) this.aClass259_4.anIntArray376.length);
				this.anInt10475 = (int) ((double) this.aClass259_4.anIntArray370[this.anInt10459] * Math.random());
			} else {
				this.anInt10459 = 0;
				this.anInt10475 = 0;
			}
			this.anInt10474 = this.anInt10459 + 1;
			if (this.anInt10474 < 0 || this.anInt10474 >= this.aClass259_4.anIntArray376.length) {
				this.anInt10474 = -1;
			}
			if (this.anInt10465 == 0) {
				this.method8963(this.aClass259_4, this.anInt10459);
			}
			this.aBoolean733 = false;
		}
		this.method8968();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!ka;I)V")
	public final void method8956(@OriginalArg(1) Class129 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass259_4 != null && this.method8967()) {
			arg0.method5297(this.aClass318_8.aClass14_Sub2_Sub15_1, arg1, this.aClass259_4.anIntArray370[this.anInt10459], this.aClass259_4.aBoolean504, this.aClass318_8.anInt9151, this.anInt10475, this.aClass318_8.aClass14_Sub2_Sub15_2, this.aClass318_8.anInt9150);
			if (this.aBoolean732 && this.aClass259_4.anIntArray371 != null && this.aClass318_7.aBoolean632) {
				arg0.method5297(this.aClass318_7.aClass14_Sub2_Sub15_1, arg1, this.aClass259_4.anIntArray370[this.anInt10459], this.aClass259_4.aBoolean504, this.aClass318_7.anInt9151, this.anInt10475, this.aClass318_7.aClass14_Sub2_Sub15_2, this.aClass318_7.anInt9150);
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!ka;)V")
	public final void method8958(@OriginalArg(1) Class129 arg0) {
		if (!this.method8967()) {
			return;
		}
		arg0.method5301(this.aClass318_8.anInt9151, this.aClass318_8.aClass14_Sub2_Sub15_1);
		if (this.aBoolean732 && this.aClass259_4.anIntArray371 != null && this.aClass318_7.aBoolean632) {
			arg0.method5301(this.aClass318_7.anInt9151, this.aClass318_7.aClass14_Sub2_Sub15_1);
			return;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)I")
	public final int method8959() {
		return this.aClass259_4 == null ? -1 : this.aClass259_4.anInt7197;
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)I")
	public final int method8960() {
		return this.anInt10465;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)Z")
	public final boolean method8961(@OriginalArg(1) int arg0) {
		if (this.aClass259_4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt10465 > 0) {
			if (arg0 <= this.anInt10465) {
				this.anInt10465 -= arg0;
				return false;
			}
			arg0 -= this.anInt10465;
			this.anInt10465 = 0;
			this.method8963(this.aClass259_4, this.anInt10459);
		}
		arg0 += this.anInt10475;
		@Pc(65) boolean local65 = Static525.aBoolean629 | this.aClass259_4.aBoolean503;
		if (arg0 > 100 && this.aClass259_4.anInt7193 > 0) {
			@Pc(87) int local87 = this.aClass259_4.anIntArray376.length - this.aClass259_4.anInt7193;
			while (local87 > this.anInt10459 && this.aClass259_4.anIntArray370[this.anInt10459] < arg0) {
				arg0 -= this.aClass259_4.anIntArray370[this.anInt10459];
				this.anInt10459++;
			}
			if (this.anInt10459 >= local87) {
				@Pc(131) int local131 = 0;
				for (@Pc(133) int local133 = local87; local133 < this.aClass259_4.anIntArray376.length; local133++) {
					local131 += this.aClass259_4.anIntArray370[local133];
				}
				if (this.anInt10493 == 0) {
					this.anInt10461 += arg0 / local131;
				}
				arg0 %= local131;
			}
			this.anInt10474 = this.anInt10459 + 1;
			local65 = true;
			if (this.aClass259_4.anIntArray376.length <= this.anInt10474) {
				this.anInt10474 -= this.aClass259_4.anInt7193;
				if (this.anInt10474 < 0 || this.anInt10474 >= this.aClass259_4.anIntArray376.length) {
					this.anInt10474 = -1;
				}
			}
		}
		while (arg0 > this.aClass259_4.anIntArray370[this.anInt10459]) {
			arg0 -= this.aClass259_4.anIntArray370[this.anInt10459++];
			local65 = true;
			if (this.aClass259_4.anIntArray376.length <= this.anInt10459) {
				if (this.aClass259_4.anInt7193 != -1 && this.anInt10493 != 2) {
					if (this.anInt10493 == 0) {
						this.anInt10461++;
					}
					this.anInt10459 -= this.aClass259_4.anInt7193;
				}
				if (this.anInt10461 >= this.aClass259_4.anInt7204 || this.anInt10459 < 0 || this.aClass259_4.anIntArray376.length <= this.anInt10459) {
					this.aBoolean733 = true;
					break;
				}
			}
			this.method8963(this.aClass259_4, this.anInt10459);
			this.anInt10474 = this.anInt10459 + 1;
			if (this.aClass259_4.anIntArray376.length <= this.anInt10474) {
				this.anInt10474 -= this.aClass259_4.anInt7193;
				if (this.anInt10474 < 0 || this.anInt10474 >= this.aClass259_4.anIntArray376.length) {
					this.anInt10474 = -1;
				}
			}
		}
		this.anInt10475 = arg0;
		if (local65) {
			this.method8968();
		}
		return local65;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)Z")
	public final boolean method8962() {
		return this.aBoolean733;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!nw;ZI)V")
	protected void method8963(@OriginalArg(0) Class259 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(II)V")
	public final void method8964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8955(arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BI)V")
	public final void method8965(@OriginalArg(1) int arg0) {
		this.anInt10459 = 0;
		this.anInt10474 = this.aClass259_4.anIntArray376.length <= 1 ? -1 : 1;
		this.anInt10475 = 0;
		this.anInt10461 = 0;
		this.aBoolean733 = false;
		this.anInt10465 = arg0;
		if (this.aClass259_4 != null) {
			this.method8963(this.aClass259_4, this.anInt10459);
			this.method8968();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)Z")
	public final boolean method8967() {
		if (this.aClass259_4 == null) {
			return false;
		}
		@Pc(31) boolean local31 = this.aClass318_8.method7885(this.anInt10459, this.anInt10474, this.aClass259_4.anIntArray376, Static581.aClass204_2, this.aClass259_4);
		if (local31 && this.aBoolean732 && this.aClass259_4.anIntArray371 != null) {
			this.aClass318_7.method7885(this.anInt10459, this.anInt10474, this.aClass259_4.anIntArray371, Static581.aClass204_2, this.aClass259_4);
		}
		return local31;
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
	private void method8968() {
		this.aClass318_8.method7886();
		if (this.aBoolean732) {
			this.aClass318_7.method7886();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)Z")
	public final boolean method8969() {
		return this.anInt10465 != 0;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)Z")
	public final boolean method8970() {
		return this.aClass259_4 != null;
	}
}
