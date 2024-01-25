import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public class Class45 {

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	private int anInt7611;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "Lclient!hba;")
	public Class149 aClass149_4;

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
	public int anInt7617;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
	private int anInt7623;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
	private int anInt7624;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
	public int anInt7637;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "Z")
	private boolean aBoolean515 = false;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	private int anInt7613 = 0;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "Lclient!dn;")
	public final Class79 aClass79_8;

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "Lclient!dn;")
	private final Class79 aClass79_7;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Z)V")
	protected Class45(@OriginalArg(0) boolean arg0) {
		this.aBoolean515 = arg0;
		this.aClass79_8 = new Class79();
		if (this.aBoolean515) {
			this.aClass79_7 = new Class79();
		} else {
			this.aClass79_7 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
	public final void method6567(@OriginalArg(1) int arg0) {
		this.anInt7637 = 0;
		this.anInt7611 = this.aClass149_4.anIntArray274.length > 1 ? 1 : -1;
		this.aBoolean514 = false;
		this.anInt7623 = arg0;
		this.anInt7624 = 0;
		this.anInt7617 = 0;
		if (this.aClass149_4 != null) {
			this.method6575(this.anInt7637, this.aClass149_4);
			this.method6590();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)I")
	public final int method6570() {
		return this.anInt7623;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)Z")
	public final boolean method6571() {
		if (this.aClass149_4 == null) {
			return false;
		}
		@Pc(30) boolean local30 = this.aClass79_8.method2260(this.aClass149_4, this.aClass149_4.anIntArray274, Static374.aClass155_1, this.anInt7637, this.anInt7611);
		if (local30 && this.aBoolean515 && this.aClass149_4.anIntArray279 != null) {
			this.aClass79_7.method2260(this.aClass149_4, this.aClass149_4.anIntArray279, Static374.aClass155_1, this.anInt7637, this.anInt7611);
		}
		return local30;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z")
	public final boolean method6572() {
		return this.aClass149_4 != null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!rf;)V")
	public final void method6573(@OriginalArg(1) Class45 arg0) {
		this.anInt7617 = arg0.anInt7617;
		this.aBoolean514 = arg0.aBoolean514;
		this.aBoolean515 = arg0.aBoolean515;
		this.anInt7611 = arg0.anInt7611;
		this.anInt7624 = arg0.anInt7624;
		this.anInt7623 = arg0.anInt7623;
		this.anInt7637 = arg0.anInt7637;
		this.aClass149_4 = arg0.aClass149_4;
		this.method6590();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ka;I)V")
	public final void method6574(@OriginalArg(0) int arg0, @OriginalArg(1) Class170 arg1) {
		if (this.aClass149_4 == null || !this.method6571()) {
			return;
		}
		arg1.method8367(this.aClass79_8.aClass3_Sub7_Sub6_2, this.aClass149_4.aBoolean230, this.aClass79_8.anInt2469, this.aClass149_4.anIntArray275[this.anInt7637], this.aClass79_8.aClass3_Sub7_Sub6_1, arg0, this.aClass79_8.anInt2465, this.anInt7617);
		if (this.aBoolean515 && this.aClass149_4.anIntArray279 != null && this.aClass79_7.aBoolean162) {
			arg1.method8367(this.aClass79_7.aClass3_Sub7_Sub6_2, this.aClass149_4.aBoolean230, this.aClass79_7.anInt2469, this.aClass149_4.anIntArray275[this.anInt7637], this.aClass79_7.aClass3_Sub7_Sub6_1, arg0, this.aClass79_7.anInt2465, this.anInt7617);
			return;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!hba;)V")
	protected void method6575(@OriginalArg(1) int arg0, @OriginalArg(2) Class149 arg1) {
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
	public final void method6576(@OriginalArg(0) int arg0) {
		this.method6586(0, 0, false, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
	public final int method6577() {
		return this.aClass149_4 == null ? -1 : this.aClass149_4.anInt3737;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!ka;I)V")
	public final void method6578(@OriginalArg(0) int arg0, @OriginalArg(2) Class170 arg1) {
		if (this.method6571()) {
			arg1.method8371(this.aClass79_8.aClass3_Sub7_Sub6_2, this.aClass79_8.anInt2465, (int[]) null, this.anInt7617, this.aClass79_8.aClass3_Sub7_Sub6_1, this.aClass149_4.anIntArray275[this.anInt7637], this.aClass149_4.aBoolean230, arg0, this.aClass79_8.anInt2469);
			if (this.aBoolean515 && this.aClass149_4.anIntArray279 != null && this.aClass79_7.aBoolean162) {
				arg1.method8371(this.aClass79_7.aClass3_Sub7_Sub6_2, this.aClass79_7.anInt2465, (int[]) null, this.anInt7617, this.aClass79_7.aClass3_Sub7_Sub6_1, this.aClass149_4.anIntArray275[this.anInt7637], this.aClass149_4.aBoolean230, arg0, this.aClass79_7.anInt2469);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)Lclient!hba;")
	public final Class149 method6579() {
		return this.aClass149_4;
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
	public final void method6580() {
		this.anInt7624 = 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZ)V")
	public final void method6581() {
		this.method6586(0, 0, false, -1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z")
	public final boolean method6582() {
		@Pc(24) int local24;
		return this.aClass149_4 == null | (local24 = 1 - this.anInt7623) <= 0 ? false : local24 + this.anInt7617 > this.aClass149_4.anIntArray275[this.anInt7637] | this.aClass149_4.aBoolean232;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
	public final boolean method6584() {
		return this.aBoolean514;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)V")
	public final void method6585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method6586(0, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZI)V")
	public final void method6586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (this.method6577() == arg3) {
			return;
		}
		if (arg3 == -1) {
			this.aClass149_4 = null;
		} else {
			if (this.aClass149_4 == null || this.aClass149_4.anInt3737 != arg3) {
				this.aClass149_4 = Static374.aClass155_1.method3422(arg3);
			} else if (this.aClass149_4.anInt3736 == 0) {
				return;
			}
			this.anInt7624 = 0;
			this.anInt7623 = arg1;
			this.anInt7613 = arg0;
			if (arg2) {
				this.anInt7637 = (int) (Math.random() * (double) this.aClass149_4.anIntArray274.length);
				this.anInt7617 = (int) (Math.random() * (double) this.aClass149_4.anIntArray275[this.anInt7637]);
			} else {
				this.anInt7637 = 0;
				this.anInt7617 = 0;
			}
			this.anInt7611 = this.anInt7637 + 1;
			if (this.anInt7611 < 0 || this.aClass149_4.anIntArray274.length <= this.anInt7611) {
				this.anInt7611 = -1;
			}
			if (this.anInt7623 == 0) {
				this.method6575(this.anInt7637, this.aClass149_4);
			}
			this.aBoolean514 = false;
		}
		this.method6590();
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)I")
	public final int method6588() {
		if (!this.method6571()) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		if (this.method6571()) {
			local15 = this.aClass79_8.anInt2464 | 0x0;
			if (this.aBoolean515 && this.aClass149_4.anIntArray279 != null) {
				local15 |= this.aClass79_7.anInt2464;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Z")
	public final boolean method6589() {
		return this.anInt7623 != 0;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	private void method6590() {
		this.aClass79_8.method2257();
		if (this.aBoolean515) {
			this.aClass79_7.method2257();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public final void method6591() {
		this.method6567(0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ka;I)V")
	public final void method6592(@OriginalArg(0) Class170 arg0) {
		if (this.method6571()) {
			arg0.method8348(this.aClass79_8.aClass3_Sub7_Sub6_1, this.aClass79_8.anInt2465);
			if (this.aBoolean515 && this.aClass149_4.anIntArray279 != null && this.aClass79_7.aBoolean162) {
				arg0.method8348(this.aClass79_7.aClass3_Sub7_Sub6_1, this.aClass79_7.anInt2465);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
	public final boolean method6593(@OriginalArg(0) int arg0) {
		if (this.aClass149_4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt7623 > 0) {
			if (this.anInt7623 >= arg0) {
				this.anInt7623 -= arg0;
				return false;
			}
			arg0 -= this.anInt7623;
			this.anInt7623 = 0;
			this.method6575(this.anInt7637, this.aClass149_4);
		}
		arg0 += this.anInt7617;
		@Pc(72) boolean local72 = this.aClass149_4.aBoolean232 | Static703.aBoolean742;
		if (arg0 > 100 && this.aClass149_4.anInt3739 > 0) {
			@Pc(90) int local90 = this.aClass149_4.anIntArray274.length - this.aClass149_4.anInt3739;
			while (local90 > this.anInt7637 && arg0 > this.aClass149_4.anIntArray275[this.anInt7637]) {
				arg0 -= this.aClass149_4.anIntArray275[this.anInt7637];
				this.anInt7637++;
			}
			if (local90 <= this.anInt7637) {
				@Pc(139) int local139 = 0;
				for (@Pc(141) int local141 = local90; local141 < this.aClass149_4.anIntArray274.length; local141++) {
					local139 += this.aClass149_4.anIntArray275[local141];
				}
				if (this.anInt7613 == 0) {
					this.anInt7624 += arg0 / local139;
				}
				arg0 %= local139;
			}
			this.anInt7611 = this.anInt7637 + 1;
			if (this.anInt7611 >= this.aClass149_4.anIntArray274.length) {
				this.anInt7611 -= this.aClass149_4.anInt3739;
				if (this.anInt7611 < 0 || this.anInt7611 >= this.aClass149_4.anIntArray274.length) {
					this.anInt7611 = -1;
				}
			}
			local72 = true;
		}
		while (arg0 > this.aClass149_4.anIntArray275[this.anInt7637]) {
			local72 = true;
			arg0 -= this.aClass149_4.anIntArray275[this.anInt7637++];
			if (this.anInt7637 >= this.aClass149_4.anIntArray274.length) {
				if (this.aClass149_4.anInt3739 != -1 && this.anInt7613 != 2) {
					if (this.anInt7613 == 0) {
						this.anInt7624++;
					}
					this.anInt7637 -= this.aClass149_4.anInt3739;
				}
				if (this.aClass149_4.anInt3745 <= this.anInt7624 || this.anInt7637 < 0 || this.anInt7637 >= this.aClass149_4.anIntArray274.length) {
					this.aBoolean514 = true;
					break;
				}
			}
			this.method6575(this.anInt7637, this.aClass149_4);
			this.anInt7611 = this.anInt7637 + 1;
			if (this.aClass149_4.anIntArray274.length <= this.anInt7611) {
				this.anInt7611 -= this.aClass149_4.anInt3739;
				if (this.anInt7611 < 0 || this.anInt7611 >= this.aClass149_4.anIntArray274.length) {
					this.anInt7611 = -1;
				}
			}
		}
		this.anInt7617 = arg0;
		if (local72) {
			this.method6590();
		}
		return local72;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(II)V")
	public final void method6594(@OriginalArg(0) int arg0) {
		this.anInt7623 = arg0;
	}
}
