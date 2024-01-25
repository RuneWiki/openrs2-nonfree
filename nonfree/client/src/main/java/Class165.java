import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class165 {

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
	private int anInt4918;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "[Z")
	private boolean[] aBooleanArray94;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!uh;")
	public Class71_Sub6 aClass71_Sub6_4;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "Lclient!ia;")
	private Class4_Sub1_Sub6 aClass4_Sub1_Sub6_4;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
	private int anInt4925;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "Lclient!kg;")
	private Class130 aClass130_2;

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "Lclient!ka;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
	private int anInt4938;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
	private int anInt4939;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Z")
	private boolean aBoolean339 = false;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Z")
	private boolean aBoolean340 = false;

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
	private int anInt4931 = -1;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
	private int anInt4926 = -32768;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	private int anInt4923 = -1;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
	public final int anInt4920;

	@OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
	public final int anInt4936;

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
	private int anInt4932;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
	public final int anInt4935;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
	private int anInt4929;

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "Z")
	private final boolean aBoolean341;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIIIZI)V")
	public Class165(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte65 = (byte) arg4;
		this.anInt4920 = arg2;
		this.anInt4936 = arg3;
		this.aByte66 = (byte) arg5;
		this.aBoolean339 = arg8;
		this.anInt4932 = arg6;
		this.anInt4935 = arg1.anInt4366;
		this.anInt4929 = arg7;
		this.aBoolean341 = arg0.method2045() && arg1.aBoolean287 && !this.aBoolean339;
		if (arg9 != -1) {
			this.aBoolean340 = true;
		}
		this.method4180(arg9);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
	public int method4172() {
		return this.anInt4926;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)V")
	public void method4173(@OriginalArg(1) int arg0) {
		this.aBoolean340 = true;
		this.method4180(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZLclient!qa;IIZI)Lclient!ka;")
	public Class57 method4174(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class139 local11 = Static146.aClass228_1.method5203(this.anInt4935);
		if (local11.anIntArray344 != null) {
			local11 = local11.method3751(Static67.aClass224_1);
		}
		if (local11 == null) {
			this.method4175(arg2);
			this.anInt4931 = -1;
			this.anInt4923 = this.anInt4925;
			return null;
		}
		if (!this.aBoolean340 && this.anInt4931 != local11.anInt4366) {
			this.aClass57_5 = null;
			this.method4180(-1);
		}
		this.method4176(arg5, arg3);
		@Pc(75) boolean local75 = arg1 & this.aBoolean341 & Static157.aClass185_Sub1_1.method4630(Static192.anInt3828) != 0;
		@Pc(121) boolean local121 = local75 & (local11.anInt4366 != this.anInt4931 || (this.anInt4925 != this.anInt4923 || this.aClass130_2 != null && (this.aClass130_2.aBoolean248 || Static198.aBoolean245) && this.anInt4938 != this.anInt4925) && Static157.aClass185_Sub1_1.method4630(Static192.anInt3828) >= 2);
		if (arg4 && !local121) {
			this.anInt4931 = local11.anInt4366;
			this.anInt4923 = this.anInt4925;
			return null;
		}
		if (local121) {
			Static175.method3073(this.aClass4_Sub1_Sub6_4, this.aByte66, this.anInt4932, this.anInt4929, this.aBooleanArray94);
		}
		@Pc(153) Class14 local153 = Static389.aClass14Array3[this.aByte66];
		@Pc(169) Class14 local169;
		if (this.aBoolean339) {
			local169 = Static267.aClass14Array2[0];
		} else {
			local169 = this.aByte66 >= 3 ? null : Static389.aClass14Array3[this.aByte66 + 1];
		}
		@Pc(177) Class57 local177 = null;
		if (this.aClass130_2 != null) {
			if (local121) {
				arg0 |= 0x40000;
			}
			local177 = local11.method3758(this.anInt4938, local169, this.aClass130_2, this.anInt4929, arg2, this.anInt4920 == 11 ? this.anInt4936 + 4 : this.anInt4936, this.anInt4920 == 11 ? 10 : this.anInt4920, this.anInt4939, local153.R(this.anInt4932, this.anInt4929), this.anInt4925, arg0, local153, this.anInt4932);
			if (local177 == null) {
				this.aBooleanArray94 = null;
				this.aClass4_Sub1_Sub6_4 = null;
				this.anInt4926 = 0;
			} else {
				if (local121) {
					if (this.aBooleanArray94 == null) {
						this.aBooleanArray94 = new boolean[4];
					}
					this.aClass4_Sub1_Sub6_4 = local177.LA(this.aClass4_Sub1_Sub6_4);
					Static252.method4144(this.aClass4_Sub1_Sub6_4, this.aByte66, arg5, arg3, this.aBooleanArray94);
				}
				this.anInt4926 = local177.ja();
			}
			this.aClass57_5 = null;
		} else if (this.aClass57_5 != null && (this.aClass57_5.ma() & arg0) == arg0 && local11.anInt4366 == this.anInt4931) {
			local177 = this.aClass57_5;
		} else {
			if (this.aClass57_5 != null) {
				arg0 |= this.aClass57_5.ma();
			}
			@Pc(361) Class236 local361 = local11.method3763(local169, arg2, this.anInt4932, local153, this.anInt4920 == 11 ? 10 : this.anInt4920, arg0, local153.R(this.anInt4932, this.anInt4929), this.anInt4929, local121, this.anInt4920 == 11 ? this.anInt4936 + 4 : this.anInt4936);
			if (local361 == null) {
				this.aClass57_5 = null;
				this.anInt4926 = 0;
				this.aClass4_Sub1_Sub6_4 = null;
				this.aBooleanArray94 = null;
			} else {
				local177 = local361.aClass57_6;
				this.aClass57_5 = local361.aClass57_6;
				if (local121) {
					this.aClass4_Sub1_Sub6_4 = local361.aClass4_Sub1_Sub6_5;
					this.aBooleanArray94 = null;
					Static252.method4144(this.aClass4_Sub1_Sub6_4, this.aByte66, arg5, arg3, null);
				}
				this.anInt4926 = local177.ja();
			}
		}
		this.anInt4932 = arg5;
		this.anInt4931 = local11.anInt4366;
		this.anInt4923 = this.anInt4925;
		this.anInt4929 = arg3;
		return local177;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method4175(@OriginalArg(0) Class30 arg0) {
		if (this.aClass4_Sub1_Sub6_4 != null) {
			Static175.method3073(this.aClass4_Sub1_Sub6_4, this.aByte66, this.anInt4932, this.anInt4929, this.aBooleanArray94);
			this.aBooleanArray94 = null;
			this.aClass4_Sub1_Sub6_4 = null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass71_Sub6_4 != null) {
			this.aClass71_Sub6_4.method5788();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
	private void method4176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass130_2 == null) {
				if (this.aBoolean340) {
					return;
				}
				this.method4180(-1);
				if (this.aClass130_2 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static277.anInt2834 - this.anInt4918;
			if (local33 > 100 && this.aClass130_2.anInt3940 > 0) {
				@Pc(53) int local53 = this.aClass130_2.anIntArray306.length - this.aClass130_2.anInt3940;
				while (this.anInt4925 < local53 && this.aClass130_2.anIntArray308[this.anInt4925] < local33) {
					local33 -= this.aClass130_2.anIntArray308[this.anInt4925];
					this.anInt4925++;
				}
				if (local53 <= this.anInt4925) {
					@Pc(96) int local96 = 0;
					for (@Pc(98) int local98 = local53; local98 < this.aClass130_2.anIntArray306.length; local98++) {
						local96 += this.aClass130_2.anIntArray308[local98];
					}
					local33 %= local96;
				}
				this.anInt4938 = this.anInt4925 + 1;
				if (this.aClass130_2.anIntArray306.length <= this.anInt4938) {
					this.anInt4938 -= this.aClass130_2.anInt3940;
					if (this.anInt4938 < 0 || this.aClass130_2.anIntArray306.length <= this.anInt4938) {
						this.anInt4938 = -1;
					}
				}
			}
			while (this.aClass130_2.anIntArray308[this.anInt4925] < local33) {
				Static125.method2339(arg0, this.anInt4925, arg1, false, this.aClass130_2, this.aByte65);
				local33 -= this.aClass130_2.anIntArray308[this.anInt4925];
				this.anInt4925++;
				if (this.anInt4925 >= this.aClass130_2.anIntArray306.length) {
					this.anInt4925 -= this.aClass130_2.anInt3940;
					if (this.anInt4925 < 0 || this.aClass130_2.anIntArray306.length <= this.anInt4925) {
						this.aClass130_2 = null;
						continue label80;
					}
				}
				this.anInt4938 = this.anInt4925 + 1;
				if (this.anInt4938 >= this.aClass130_2.anIntArray306.length) {
					this.anInt4938 -= this.aClass130_2.anInt3940;
					if (this.anInt4938 < 0 || this.aClass130_2.anIntArray306.length <= this.anInt4938) {
						this.anInt4938 = -1;
					}
				}
			}
			this.anInt4918 = Static277.anInt2834 - local33;
			this.anInt4939 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method4177(@OriginalArg(0) Class30 arg0) {
		this.method4174(262144, true, arg0, this.anInt4929, true, this.anInt4932);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!ka;IZIIILclient!qa;B)V")
	public void method4178(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class30 arg6) {
		@Pc(6) Class61[] local6 = arg0.method6076();
		@Pc(9) Class239[] local9 = arg0.method6083();
		if ((this.aClass71_Sub6_4 == null || this.aClass71_Sub6_4.aBoolean535) && (local6 != null || local9 != null)) {
			@Pc(26) Class139 local26 = Static146.aClass228_1.method5203(this.anInt4935);
			if (local26.anIntArray344 != null) {
				local26 = local26.method3751(Static67.aClass224_1);
			}
			if (local26 != null) {
				this.aClass71_Sub6_4 = Static415.method5785(Static277.anInt2834);
			}
		}
		if (this.aClass71_Sub6_4 == null) {
			return;
		}
		if (arg2) {
			this.aClass71_Sub6_4.method5792(arg6, (long) Static277.anInt2834, local6, local9);
		} else {
			this.aClass71_Sub6_4.method5796((long) Static277.anInt2834);
		}
		this.aClass71_Sub6_4.method5789(this.aByte65, arg1, arg4, arg5, arg3);
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)Z")
	public boolean method4179() {
		return this.aBoolean341;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IB)V")
	private void method4180(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class139 local19 = Static146.aClass228_1.method5203(this.anInt4935);
			@Pc(21) Class139 local21 = local19;
			if (local19.anIntArray344 != null) {
				local19 = local19.method3751(Static67.aClass224_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray340 != null) {
				if (this.aClass130_2 != null && local19.method3752(this.aClass130_2.anInt3949)) {
					return;
				}
				local7 = local19.method3755();
				if (local19.anInt4366 != this.anInt4931) {
					local9 = local19.aBoolean277;
				}
			} else if (local19.anInt4395 == -1) {
				if (local21 != null && local21.anIntArray340 != null) {
					if (this.aClass130_2 != null && local21.method3752(this.aClass130_2.anInt3949)) {
						return;
					}
					local7 = local21.method3755();
					if (this.anInt4931 != local21.anInt4366) {
						local9 = local21.aBoolean277;
					}
				} else if (local21 != null && local21.anInt4395 != -1 && local21.anInt4366 != this.anInt4931) {
					local9 = local21.aBoolean277;
					local7 = local21.anInt4395;
				}
			} else if (local19.anInt4366 != this.anInt4931) {
				local7 = local19.anInt4395;
				local9 = local19.aBoolean277;
			}
		}
		if (local7 == -1) {
			this.aClass130_2 = null;
			return;
		}
		this.aClass57_5 = null;
		if (this.aClass130_2 == null || this.aClass130_2.anInt3949 != local7) {
			this.aClass130_2 = Static143.aClass85_1.method2406(local7);
		} else if (this.aClass130_2.anInt3937 == 0) {
			return;
		}
		if (this.aClass130_2.anIntArray306 == null) {
			this.aClass130_2 = null;
			return;
		}
		if (local9) {
			this.anInt4925 = (int) (Math.random() * (double) this.aClass130_2.anIntArray306.length);
			this.anInt4939 = (int) ((double) this.aClass130_2.anIntArray308[this.anInt4925] * Math.random()) + 1;
		} else {
			this.anInt4925 = 0;
			this.anInt4939 = 1;
		}
		this.anInt4938 = this.anInt4925 + 1;
		if (this.anInt4938 < 0 || this.anInt4938 >= this.aClass130_2.anIntArray306.length) {
			this.anInt4938 = -1;
		}
		this.anInt4918 = Static277.anInt2834 - this.anInt4939;
	}
}
