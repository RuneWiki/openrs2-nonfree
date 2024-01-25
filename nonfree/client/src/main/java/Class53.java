import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public class Class53 {

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
	private int anInt4470;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	private int anInt4472;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public int anInt4479;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public int anInt4482;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	private int anInt4483;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "Lclient!qea;")
	public Class307 aClass307_4;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	private int anInt4478 = 0;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "Z")
	private boolean aBoolean392 = false;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!ru;")
	public final Class331 aClass331_8;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!ru;")
	private final Class331 aClass331_7;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Z)V")
	protected Class53(@OriginalArg(0) boolean arg0) {
		this.aBoolean392 = arg0;
		this.aClass331_8 = new Class331();
		if (this.aBoolean392) {
			this.aClass331_7 = new Class331();
		} else {
			this.aClass331_7 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)Lclient!qea;")
	public final Class307 method4074() {
		return this.aClass307_4;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)Z")
	public final boolean method4075() {
		return this.anInt4470 != 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!qea;I)V")
	protected void method4076(@OriginalArg(0) int arg0, @OriginalArg(1) Class307 arg1) {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Z")
	public final boolean method4077(@OriginalArg(1) int arg0) {
		if (this.aClass307_4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt4470 > 0) {
			if (this.anInt4470 >= arg0) {
				this.anInt4470 -= arg0;
				return false;
			}
			arg0 -= this.anInt4470;
			this.anInt4470 = 0;
			this.method4076(this.anInt4482, this.aClass307_4);
		}
		arg0 += this.anInt4479;
		@Pc(75) boolean local75 = Static157.aBoolean265 | this.aClass307_4.aBoolean701;
		if (arg0 > 100 && this.aClass307_4.anInt8132 > 0) {
			@Pc(94) int local94 = this.aClass307_4.anIntArray580.length - this.aClass307_4.anInt8132;
			while (this.anInt4482 < local94 && arg0 > this.aClass307_4.anIntArray582[this.anInt4482]) {
				arg0 -= this.aClass307_4.anIntArray582[this.anInt4482];
				this.anInt4482++;
			}
			if (this.anInt4482 >= local94) {
				@Pc(143) int local143 = 0;
				for (@Pc(145) int local145 = local94; local145 < this.aClass307_4.anIntArray580.length; local145++) {
					local143 += this.aClass307_4.anIntArray582[local145];
				}
				if (this.anInt4478 == 0) {
					this.anInt4472 += arg0 / local143;
				}
				arg0 %= local143;
			}
			this.anInt4483 = this.anInt4482 + 1;
			local75 = true;
			if (this.aClass307_4.anIntArray580.length <= this.anInt4483) {
				this.anInt4483 -= this.aClass307_4.anInt8132;
				if (this.anInt4483 < 0 || this.aClass307_4.anIntArray580.length <= this.anInt4483) {
					this.anInt4483 = -1;
				}
			}
		}
		while (arg0 > this.aClass307_4.anIntArray582[this.anInt4482]) {
			local75 = true;
			arg0 -= this.aClass307_4.anIntArray582[this.anInt4482++];
			if (this.anInt4482 >= this.aClass307_4.anIntArray580.length) {
				if (this.aClass307_4.anInt8132 != -1 && this.anInt4478 != 2) {
					this.anInt4482 -= this.aClass307_4.anInt8132;
					if (this.anInt4478 == 0) {
						this.anInt4472++;
					}
				}
				if (this.aClass307_4.anInt8129 <= this.anInt4472 || this.anInt4482 < 0 || this.anInt4482 >= this.aClass307_4.anIntArray580.length) {
					this.aBoolean391 = true;
					break;
				}
			}
			this.method4076(this.anInt4482, this.aClass307_4);
			this.anInt4483 = this.anInt4482 + 1;
			if (this.aClass307_4.anIntArray580.length <= this.anInt4483) {
				this.anInt4483 -= this.aClass307_4.anInt8132;
				if (this.anInt4483 < 0 || this.aClass307_4.anIntArray580.length <= this.anInt4483) {
					this.anInt4483 = -1;
				}
			}
		}
		this.anInt4479 = arg0;
		if (local75) {
			this.method4079();
		}
		return local75;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)Z")
	public final boolean method4078() {
		@Pc(24) int local24;
		return this.aClass307_4 == null | (local24 = 1 - this.anInt4470) <= 0 ? false : this.aClass307_4.aBoolean701 | this.anInt4479 + local24 > this.aClass307_4.anIntArray582[this.anInt4482];
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	private void method4079() {
		this.aClass331_8.method7861();
		if (this.aBoolean392) {
			this.aClass331_7.method7861();
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)I")
	public final int method4080() {
		return this.anInt4470;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public final void method4081() {
		this.anInt4472 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Z)I")
	public final int method4082() {
		if (!this.method4095()) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		if (this.method4095()) {
			local17 = this.aClass331_8.anInt8891 | 0x0;
			if (this.aBoolean392 && this.aClass307_4.anIntArray581 != null) {
				local17 |= this.aClass331_7.anInt8891;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!ka;I)V")
	public final void method4083(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1) {
		if (this.method4095()) {
			arg1.method5766(this.aClass331_8.aClass2_Sub6_Sub14_1, this.aClass307_4.aBoolean700, this.aClass307_4.anIntArray582[this.anInt4482], this.aClass331_8.aClass2_Sub6_Sub14_2, this.aClass331_8.anInt8889, (int[]) null, arg0, this.aClass331_8.anInt8896, this.anInt4479);
			if (this.aBoolean392 && this.aClass307_4.anIntArray581 != null && this.aClass331_7.aBoolean756) {
				arg1.method5766(this.aClass331_7.aClass2_Sub6_Sub14_1, this.aClass307_4.aBoolean700, this.aClass307_4.anIntArray582[this.anInt4482], this.aClass331_7.aClass2_Sub6_Sub14_2, this.aClass331_7.anInt8889, (int[]) null, arg0, this.aClass331_7.anInt8896, this.anInt4479);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!cb;)V")
	public final void method4084(@OriginalArg(1) Class53 arg0) {
		this.anInt4470 = arg0.anInt4470;
		this.anInt4472 = arg0.anInt4472;
		this.anInt4483 = arg0.anInt4483;
		this.aBoolean392 = arg0.aBoolean392;
		this.aClass307_4 = arg0.aClass307_4;
		this.aBoolean391 = arg0.aBoolean391;
		this.anInt4482 = arg0.anInt4482;
		this.anInt4479 = arg0.anInt4479;
		this.method4079();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZIII)V")
	public final void method4085(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.method4088() == arg2) {
			return;
		}
		if (arg2 == -1) {
			this.aClass307_4 = null;
		} else {
			if (this.aClass307_4 == null || arg2 != this.aClass307_4.anInt8126) {
				this.aClass307_4 = Static360.aClass274_2.method6626(arg2);
			} else if (this.aClass307_4.anInt8120 == 0) {
				return;
			}
			this.anInt4470 = arg3;
			this.anInt4478 = arg0;
			this.anInt4472 = 0;
			if (arg1) {
				this.anInt4482 = (int) ((double) this.aClass307_4.anIntArray580.length * Math.random());
				this.anInt4479 = (int) (Math.random() * (double) this.aClass307_4.anIntArray582[this.anInt4482]);
			} else {
				this.anInt4482 = 0;
				this.anInt4479 = 0;
			}
			this.anInt4483 = this.anInt4482 + 1;
			if (this.anInt4483 < 0 || this.aClass307_4.anIntArray580.length <= this.anInt4483) {
				this.anInt4483 = -1;
			}
			if (this.anInt4470 == 0) {
				this.method4076(this.anInt4482, this.aClass307_4);
			}
			this.aBoolean391 = false;
		}
		this.method4079();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public final void method4086(@OriginalArg(0) int arg0) {
		this.anInt4482 = 0;
		this.anInt4483 = this.aClass307_4.anIntArray580.length <= 1 ? -1 : 1;
		this.anInt4472 = 0;
		this.anInt4479 = 0;
		this.aBoolean391 = false;
		this.anInt4470 = arg0;
		if (this.aClass307_4 != null) {
			this.method4076(this.anInt4482, this.aClass307_4);
			this.method4079();
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
	public final void method4087() {
		this.method4086(0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	public final int method4088() {
		return this.aClass307_4 == null ? -1 : this.aClass307_4.anInt8126;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
	public final void method4089(@OriginalArg(0) int arg0) {
		this.method4085(0, false, arg0, 0);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)V")
	public final void method4090(@OriginalArg(0) int arg0) {
		this.anInt4470 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII)V")
	public final void method4091() {
		this.method4085(0, false, -1, 0);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
	public final void method4093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method4085(0, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
	public final boolean method4094() {
		return this.aClass307_4 != null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z")
	public final boolean method4095() {
		if (this.aClass307_4 == null) {
			return false;
		}
		@Pc(30) boolean local30 = this.aClass331_8.method7858(Static360.aClass274_2, this.anInt4482, this.anInt4483, this.aClass307_4.anIntArray580, this.aClass307_4);
		if (local30 && this.aBoolean392 && this.aClass307_4.anIntArray581 != null) {
			this.aClass331_7.method7858(Static360.aClass274_2, this.anInt4482, this.anInt4483, this.aClass307_4.anIntArray581, this.aClass307_4);
		}
		return local30;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ka;)V")
	public final void method4096(@OriginalArg(1) Class45 arg0) {
		if (!this.method4095()) {
			return;
		}
		arg0.method5761(this.aClass331_8.anInt8889, this.aClass331_8.aClass2_Sub6_Sub14_1);
		if (this.aBoolean392 && this.aClass307_4.anIntArray581 != null && this.aClass331_7.aBoolean756) {
			arg0.method5761(this.aClass331_7.anInt8889, this.aClass331_7.aClass2_Sub6_Sub14_1);
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!ka;)V")
	public final void method4097(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1) {
		if (this.aClass307_4 != null && this.method4095()) {
			arg1.method5754(this.aClass307_4.aBoolean700, this.anInt4479, this.aClass331_8.aClass2_Sub6_Sub14_1, this.aClass331_8.aClass2_Sub6_Sub14_2, this.aClass331_8.anInt8896, arg0, this.aClass331_8.anInt8889, this.aClass307_4.anIntArray582[this.anInt4482]);
			if (this.aBoolean392 && this.aClass307_4.anIntArray581 != null && this.aClass331_7.aBoolean756) {
				arg1.method5754(this.aClass307_4.aBoolean700, this.anInt4479, this.aClass331_7.aClass2_Sub6_Sub14_1, this.aClass331_7.aClass2_Sub6_Sub14_2, this.aClass331_7.anInt8896, arg0, this.aClass331_7.anInt8889, this.aClass307_4.anIntArray582[this.anInt4482]);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Z")
	public final boolean method4098() {
		return this.aBoolean391;
	}
}
