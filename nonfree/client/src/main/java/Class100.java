import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public class Class100 {

	@OriginalMember(owner = "client!js", name = "m", descriptor = "Lclient!bg;")
	public Class26 aClass26_4;

	@OriginalMember(owner = "client!js", name = "s", descriptor = "I")
	public int anInt10720;

	@OriginalMember(owner = "client!js", name = "G", descriptor = "I")
	private int anInt10729;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "I")
	public int anInt10735;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	private int anInt10743;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "I")
	private int anInt10750;

	@OriginalMember(owner = "client!js", name = "v", descriptor = "Z")
	private boolean aBoolean773 = false;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "Z")
	private boolean aBoolean774 = false;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "I")
	private int anInt10747 = 0;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Lclient!wca;")
	public final Class396 aClass396_8;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Lclient!wca;")
	private final Class396 aClass396_7;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Z)V")
	protected Class100(@OriginalArg(0) boolean arg0) {
		this.aBoolean774 = arg0;
		this.aClass396_8 = new Class396();
		if (this.aBoolean774) {
			this.aClass396_7 = new Class396();
		} else {
			this.aClass396_7 = null;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!ka;)V")
	public final void method8954(@OriginalArg(1) Class157 arg0) {
		if (this.method8961()) {
			arg0.method5230(this.aClass396_8.aClass3_Sub4_Sub15_1, this.aClass396_8.anInt10996);
			if (this.aBoolean774 && this.aClass26_4.anIntArray51 != null && this.aClass396_7.aBoolean792) {
				arg0.method5230(this.aClass396_7.aClass3_Sub4_Sub15_1, this.aClass396_7.anInt10996);
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
	public final void method8955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method8973(0, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)V")
	public final void method8956(@OriginalArg(0) int arg0) {
		this.anInt10735 = 0;
		this.anInt10750 = this.aClass26_4.anIntArray50.length > 1 ? 1 : -1;
		this.aBoolean773 = false;
		this.anInt10743 = arg0;
		this.anInt10720 = 0;
		this.anInt10729 = 0;
		if (this.aClass26_4 != null) {
			this.method8972(this.aClass26_4, this.anInt10735);
			this.method8974();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public final void method8957() {
		this.anInt10729 = 0;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public final void method8958() {
		this.method8956(0);
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(I)Z")
	public final boolean method8959() {
		return this.aBoolean773;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZII)V")
	public final void method8960() {
		this.method8973(0, 0, -1, false);
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)Z")
	public final boolean method8961() {
		if (this.aClass26_4 == null) {
			return false;
		}
		@Pc(29) boolean local29 = this.aClass396_8.method9181(this.aClass26_4.anIntArray50, this.anInt10750, Static558.aClass177_2, this.anInt10735, this.aClass26_4);
		if (local29 && this.aBoolean774 && this.aClass26_4.anIntArray51 != null) {
			this.aClass396_7.method9181(this.aClass26_4.anIntArray51, this.anInt10750, Static558.aClass177_2, this.anInt10735, this.aClass26_4);
		}
		return local29;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZI)V")
	public final void method8962(@OriginalArg(1) int arg0) {
		this.method8973(0, 0, arg0, false);
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(B)Z")
	public final boolean method8963() {
		return this.aClass26_4 != null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public final void method8964(@OriginalArg(0) int arg0) {
		this.anInt10743 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(B)I")
	public final int method8965() {
		return this.anInt10743;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLclient!js;)V")
	public final void method8966(@OriginalArg(1) Class100 arg0) {
		this.aClass26_4 = arg0.aClass26_4;
		this.anInt10729 = arg0.anInt10729;
		this.anInt10720 = arg0.anInt10720;
		this.aBoolean773 = arg0.aBoolean773;
		this.anInt10735 = arg0.anInt10735;
		this.aBoolean774 = arg0.aBoolean774;
		this.anInt10750 = arg0.anInt10750;
		this.anInt10743 = arg0.anInt10743;
		this.method8974();
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(B)I")
	public final int method8967() {
		if (!this.method8961()) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		if (this.method8961()) {
			local15 = this.aClass396_8.anInt10992 | 0x0;
			if (this.aBoolean774 && this.aClass26_4.anIntArray51 != null) {
				local15 |= this.aClass396_7.anInt10992;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BILclient!ka;I)V")
	public final void method8968(@OriginalArg(1) int arg0, @OriginalArg(2) Class157 arg1) {
		if (this.method8961()) {
			arg1.method5217(this.aClass26_4.aBoolean61, this.aClass396_8.anInt10993, (int[]) null, arg0, this.aClass396_8.aClass3_Sub4_Sub15_2, this.aClass396_8.anInt10996, this.anInt10720, this.aClass396_8.aClass3_Sub4_Sub15_1, this.aClass26_4.anIntArray52[this.anInt10735]);
			if (this.aBoolean774 && this.aClass26_4.anIntArray51 != null && this.aClass396_7.aBoolean792) {
				arg1.method5217(this.aClass26_4.aBoolean61, this.aClass396_7.anInt10993, (int[]) null, arg0, this.aClass396_7.aClass3_Sub4_Sub15_2, this.aClass396_7.anInt10996, this.anInt10720, this.aClass396_7.aClass3_Sub4_Sub15_1, this.aClass26_4.anIntArray52[this.anInt10735]);
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)Z")
	public final boolean method8969() {
		@Pc(9) int local9;
		return (local9 = 1 - this.anInt10743) <= 0 | this.aClass26_4 == null ? false : this.aClass26_4.aBoolean60 | this.aClass26_4.anIntArray52[this.anInt10735] < local9 + this.anInt10720;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(IB)Z")
	public final boolean method8971(@OriginalArg(0) int arg0) {
		if (this.aClass26_4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt10743 > 0) {
			if (arg0 <= this.anInt10743) {
				this.anInt10743 -= arg0;
				return false;
			}
			arg0 -= this.anInt10743;
			this.anInt10743 = 0;
			this.method8972(this.aClass26_4, this.anInt10735);
		}
		arg0 += this.anInt10720;
		@Pc(68) boolean local68 = this.aClass26_4.aBoolean60 | Static218.aBoolean351;
		if (arg0 > 100 && this.aClass26_4.anInt776 > 0) {
			@Pc(89) int local89 = this.aClass26_4.anIntArray50.length - this.aClass26_4.anInt776;
			while (this.anInt10735 < local89 && arg0 > this.aClass26_4.anIntArray52[this.anInt10735]) {
				arg0 -= this.aClass26_4.anIntArray52[this.anInt10735];
				this.anInt10735++;
			}
			if (this.anInt10735 >= local89) {
				@Pc(142) int local142 = 0;
				for (@Pc(144) int local144 = local89; local144 < this.aClass26_4.anIntArray50.length; local144++) {
					local142 += this.aClass26_4.anIntArray52[local144];
				}
				if (this.anInt10747 == 0) {
					this.anInt10729 += arg0 / local142;
				}
				arg0 %= local142;
			}
			this.anInt10750 = this.anInt10735 + 1;
			if (this.anInt10750 >= this.aClass26_4.anIntArray50.length) {
				this.anInt10750 -= this.aClass26_4.anInt776;
				if (this.anInt10750 < 0 || this.anInt10750 >= this.aClass26_4.anIntArray50.length) {
					this.anInt10750 = -1;
				}
			}
			local68 = true;
		}
		while (arg0 > this.aClass26_4.anIntArray52[this.anInt10735]) {
			local68 = true;
			arg0 -= this.aClass26_4.anIntArray52[this.anInt10735++];
			if (this.anInt10735 >= this.aClass26_4.anIntArray50.length) {
				if (this.aClass26_4.anInt776 != -1 && this.anInt10747 != 2) {
					this.anInt10735 -= this.aClass26_4.anInt776;
					if (this.anInt10747 == 0) {
						this.anInt10729++;
					}
				}
				if (this.anInt10729 >= this.aClass26_4.anInt771 || this.anInt10735 < 0 || this.aClass26_4.anIntArray50.length <= this.anInt10735) {
					this.aBoolean773 = true;
					break;
				}
			}
			this.method8972(this.aClass26_4, this.anInt10735);
			this.anInt10750 = this.anInt10735 + 1;
			if (this.aClass26_4.anIntArray50.length <= this.anInt10750) {
				this.anInt10750 -= this.aClass26_4.anInt776;
				if (this.anInt10750 < 0 || this.anInt10750 >= this.aClass26_4.anIntArray50.length) {
					this.anInt10750 = -1;
				}
			}
		}
		this.anInt10720 = arg0;
		if (local68) {
			this.method8974();
		}
		return local68;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!bg;II)V")
	protected void method8972(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIZ)V")
	public final void method8973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (this.method8976() == arg2) {
			return;
		}
		if (arg2 == -1) {
			this.aClass26_4 = null;
		} else {
			if (this.aClass26_4 == null || arg2 != this.aClass26_4.anInt777) {
				this.aClass26_4 = Static558.aClass177_2.method4259(arg2);
			} else if (this.aClass26_4.anInt767 == 0) {
				return;
			}
			this.anInt10743 = arg1;
			this.anInt10747 = arg0;
			this.anInt10729 = 0;
			if (arg3) {
				this.anInt10735 = (int) (Math.random() * (double) this.aClass26_4.anIntArray50.length);
				this.anInt10720 = (int) ((double) this.aClass26_4.anIntArray52[this.anInt10735] * Math.random());
			} else {
				this.anInt10735 = 0;
				this.anInt10720 = 0;
			}
			this.anInt10750 = this.anInt10735 + 1;
			if (this.anInt10750 < 0 || this.anInt10750 >= this.aClass26_4.anIntArray50.length) {
				this.anInt10750 = -1;
			}
			if (this.anInt10743 == 0) {
				this.method8972(this.aClass26_4, this.anInt10735);
			}
			this.aBoolean773 = false;
		}
		this.method8974();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
	private void method8974() {
		this.aClass396_8.method9178();
		if (this.aBoolean774) {
			this.aClass396_7.method9178();
		}
	}

	@OriginalMember(owner = "client!js", name = "f", descriptor = "(I)Z")
	public final boolean method8975() {
		return this.anInt10743 != 0;
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)I")
	public final int method8976() {
		return this.aClass26_4 == null ? -1 : this.aClass26_4.anInt777;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)Lclient!bg;")
	public final Class26 method8977() {
		return this.aClass26_4;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!ka;I)V")
	public final void method8978(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1) {
		if (this.aClass26_4 == null || !this.method8961()) {
			return;
		}
		arg1.method5234(this.aClass396_8.anInt10996, this.anInt10720, this.aClass396_8.anInt10993, this.aClass26_4.aBoolean61, arg0, this.aClass26_4.anIntArray52[this.anInt10735], this.aClass396_8.aClass3_Sub4_Sub15_1, this.aClass396_8.aClass3_Sub4_Sub15_2);
		if (this.aBoolean774 && this.aClass26_4.anIntArray51 != null && this.aClass396_7.aBoolean792) {
			arg1.method5234(this.aClass396_7.anInt10996, this.anInt10720, this.aClass396_7.anInt10993, this.aClass26_4.aBoolean61, arg0, this.aClass26_4.anIntArray52[this.anInt10735], this.aClass396_7.aClass3_Sub4_Sub15_1, this.aClass396_7.aClass3_Sub4_Sub15_2);
			return;
		}
	}
}
