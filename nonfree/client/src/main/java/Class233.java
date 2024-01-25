import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class233 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	private int anInt6905;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!c;")
	private Class31 aClass31_7;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!j;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_6;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!wp;")
	public Class13_Sub8 aClass13_Sub8_7;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	private int anInt6916;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	private int anInt6921;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "[Z")
	private boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
	private int anInt6924;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "Lclient!hi;")
	private Class96 aClass96_3;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private int anInt6909 = -32768;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
	private boolean aBoolean482 = false;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	private int anInt6920 = -1;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
	private boolean aBoolean483 = false;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	private int anInt6929 = -1;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
	public final int anInt6926;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	private int anInt6915;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public final int anInt6906;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "B")
	private final byte aByte98;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	public final int anInt6918;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	private int anInt6922;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "B")
	private final byte aByte99;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Z")
	private final boolean aBoolean481;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIIIZI)V")
	public Class233(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt6926 = arg2;
		this.anInt6915 = arg7;
		this.anInt6906 = arg1.anInt4027;
		this.aByte98 = (byte) arg4;
		this.anInt6918 = arg3;
		this.aBoolean482 = arg8;
		this.anInt6922 = arg6;
		this.aByte99 = (byte) arg5;
		this.aBoolean481 = arg0.method2626() && arg1.aBoolean324 && !this.aBoolean482;
		if (arg9 != -1) {
			this.aBoolean483 = true;
		}
		this.method5377(arg9);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!qa;)V")
	public void method5371(@OriginalArg(1) Class75 arg0) {
		this.method5373(true, this.anInt6915, this.anInt6922, 262144, true, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!qa;ILclient!c;IZIB)V")
	public void method5372(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class209[] local6 = arg3.method5707();
		@Pc(13) Class178[] local13 = arg3.method5705();
		if ((this.aClass13_Sub8_7 == null || this.aClass13_Sub8_7.aBoolean522) && (local6 != null || local13 != null)) {
			@Pc(30) Class128 local30 = Static55.aClass25_1.method855(this.anInt6906);
			if (local30.anIntArray307 != null) {
				local30 = local30.method3307(Static369.aClass11_1);
			}
			if (local30 != null) {
				this.aClass13_Sub8_7 = new Class13_Sub8(Static290.anInt5325);
			}
		}
		if (this.aClass13_Sub8_7 == null) {
			return;
		}
		if (arg5) {
			this.aClass13_Sub8_7.method5940(arg1, (long) Static290.anInt5325, local6, local13);
		} else {
			this.aClass13_Sub8_7.method5938((long) Static290.anInt5325);
		}
		this.aClass13_Sub8_7.method5948(this.aByte98, arg4, arg0, arg6, arg2);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIIIZLclient!qa;)Lclient!c;")
	public Class31 method5373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class75 arg5) {
		@Pc(9) Class128 local9 = Static55.aClass25_1.method855(this.anInt6906);
		if (local9.anIntArray307 != null) {
			local9 = local9.method3307(Static369.aClass11_1);
		}
		if (local9 == null) {
			this.method5375(arg5);
			this.anInt6929 = this.anInt6905;
			this.anInt6920 = -1;
			return null;
		}
		if (!this.aBoolean483 && this.anInt6920 != local9.anInt4027) {
			this.aClass31_7 = null;
			this.method5377(-1);
		}
		this.method5374(arg2, arg1);
		@Pc(71) boolean local71 = arg4 & this.aBoolean481 & Static123.aClass21_Sub1_1.method775(Static347.anInt6318) != 0;
		@Pc(113) boolean local113 = local71 & (this.anInt6920 != local9.anInt4027 || (this.anInt6929 != this.anInt6905 || this.aClass96_3 != null && (this.aClass96_3.aBoolean257 || Static426.aBoolean504) && this.anInt6905 != this.anInt6924) && Static123.aClass21_Sub1_1.method775(Static347.anInt6318) >= 2);
		if (arg0 && !local113) {
			this.anInt6920 = local9.anInt4027;
			this.anInt6929 = this.anInt6905;
			return null;
		}
		if (local113) {
			Static229.method3575(this.aClass3_Sub3_Sub4_6, this.aByte99, this.anInt6922, this.anInt6915, this.aBooleanArray21);
		}
		@Pc(145) Class64 local145 = Static120.aClass64Array1[this.aByte99];
		@Pc(152) Class64 local152;
		if (this.aBoolean482) {
			local152 = Static205.aClass64Array2[0];
		} else {
			local152 = this.aByte99 >= 3 ? null : Static120.aClass64Array1[this.aByte99 + 1];
		}
		@Pc(170) Class31 local170 = null;
		if (this.aClass96_3 != null) {
			if (local113) {
				arg3 |= 0x40000;
			}
			local170 = local9.method3300(this.aClass96_3, this.anInt6905, this.anInt6915, this.anInt6924, this.anInt6916, local145, local145.va(this.anInt6922, this.anInt6915), local152, arg3, arg5, this.anInt6922, this.anInt6926 == 11 ? 10 : this.anInt6926, this.anInt6926 == 11 ? this.anInt6918 + 4 : this.anInt6918);
			if (local170 == null) {
				this.anInt6909 = 0;
				this.aClass3_Sub3_Sub4_6 = null;
				this.aBooleanArray21 = null;
			} else {
				if (local113) {
					if (this.aBooleanArray21 == null) {
						this.aBooleanArray21 = new boolean[4];
					}
					this.aClass3_Sub3_Sub4_6 = local170.ua(this.aClass3_Sub3_Sub4_6);
					Static259.method3926(this.aClass3_Sub3_Sub4_6, this.aByte99, arg2, arg1, this.aBooleanArray21);
				}
				this.anInt6909 = local170.b();
			}
			this.aClass31_7 = null;
		} else if (this.aClass31_7 != null && (this.aClass31_7.n() & arg3) == arg3 && local9.anInt4027 == this.anInt6920) {
			local170 = this.aClass31_7;
		} else {
			if (this.aClass31_7 != null) {
				arg3 |= this.aClass31_7.n();
			}
			@Pc(244) Class48 local244 = local9.method3297(this.anInt6922, local113, arg3, local152, this.anInt6926 == 11 ? 10 : this.anInt6926, local145.va(this.anInt6922, this.anInt6915), this.anInt6915, local145, this.anInt6926 == 11 ? this.anInt6918 + 4 : this.anInt6918, arg5);
			if (local244 == null) {
				this.aBooleanArray21 = null;
				this.aClass31_7 = null;
				this.anInt6909 = 0;
				this.aClass3_Sub3_Sub4_6 = null;
			} else {
				local170 = local244.aClass31_2;
				this.aClass31_7 = local244.aClass31_2;
				if (local113) {
					this.aBooleanArray21 = null;
					this.aClass3_Sub3_Sub4_6 = local244.aClass3_Sub3_Sub4_2;
					Static259.method3926(this.aClass3_Sub3_Sub4_6, this.aByte99, arg2, arg1, null);
				}
				this.anInt6909 = local170.b();
			}
		}
		this.anInt6915 = arg1;
		this.anInt6922 = arg2;
		this.anInt6920 = local9.anInt4027;
		this.anInt6929 = this.anInt6905;
		return local170;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	private void method5374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass96_3 == null) {
				if (this.aBoolean483) {
					return;
				}
				this.method5377(-1);
				if (this.aClass96_3 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static290.anInt5325 - this.anInt6921;
			if (local29 > 100 && this.aClass96_3.anInt3329 > 0) {
				@Pc(51) int local51 = this.aClass96_3.anIntArray253.length - this.aClass96_3.anInt3329;
				while (this.anInt6905 < local51 && this.aClass96_3.anIntArray254[this.anInt6905] < local29) {
					local29 -= this.aClass96_3.anIntArray254[this.anInt6905];
					this.anInt6905++;
				}
				if (local51 <= this.anInt6905) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local51; local95 < this.aClass96_3.anIntArray253.length; local95++) {
						local93 += this.aClass96_3.anIntArray254[local95];
					}
					local29 %= local93;
				}
				this.anInt6924 = this.anInt6905 + 1;
				if (this.anInt6924 >= this.aClass96_3.anIntArray253.length) {
					this.anInt6924 -= this.aClass96_3.anInt3329;
					if (this.anInt6924 < 0 || this.anInt6924 >= this.aClass96_3.anIntArray253.length) {
						this.anInt6924 = -1;
					}
				}
			}
			while (local29 > this.aClass96_3.anIntArray254[this.anInt6905]) {
				Static86.method1483(arg0, this.anInt6905, this.aByte98, arg1, this.aClass96_3, false);
				local29 -= this.aClass96_3.anIntArray254[this.anInt6905];
				this.anInt6905++;
				if (this.anInt6905 >= this.aClass96_3.anIntArray253.length) {
					this.anInt6905 -= this.aClass96_3.anInt3329;
					if (this.anInt6905 < 0 || this.anInt6905 >= this.aClass96_3.anIntArray253.length) {
						this.aClass96_3 = null;
						continue label80;
					}
				}
				this.anInt6924 = this.anInt6905 + 1;
				if (this.anInt6924 >= this.aClass96_3.anIntArray253.length) {
					this.anInt6924 -= this.aClass96_3.anInt3329;
					if (this.anInt6924 < 0 || this.anInt6924 >= this.aClass96_3.anIntArray253.length) {
						this.anInt6924 = -1;
					}
				}
			}
			this.anInt6921 = Static290.anInt5325 - local29;
			this.anInt6916 = local29;
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method5375(@OriginalArg(0) Class75 arg0) {
		if (this.aClass3_Sub3_Sub4_6 != null) {
			Static229.method3575(this.aClass3_Sub3_Sub4_6, this.aByte99, this.anInt6922, this.anInt6915, this.aBooleanArray21);
			this.aClass3_Sub3_Sub4_6 = null;
			this.aBooleanArray21 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	private void method5377(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(23) Class128 local23 = Static55.aClass25_1.method855(this.anInt6906);
			@Pc(25) Class128 local25 = local23;
			if (local23.anIntArray307 != null) {
				local23 = local23.method3307(Static369.aClass11_1);
			}
			if (local23 == null) {
				return;
			}
			if (local25 == local23) {
				local25 = null;
			}
			if (local23.anIntArray306 != null) {
				if (this.aClass96_3 != null && local23.method3310(this.aClass96_3.anInt3325)) {
					return;
				}
				local5 = local23.method3296();
				if (local23.anInt4027 != this.anInt6920) {
					local13 = local23.aBoolean317;
				}
			} else if (local23.anInt4033 == -1) {
				if (local25 != null && local25.anIntArray306 != null) {
					if (this.aClass96_3 != null && local25.method3310(this.aClass96_3.anInt3325)) {
						return;
					}
					local5 = local25.method3296();
					if (this.anInt6920 != local25.anInt4027) {
						local13 = local25.aBoolean317;
					}
				} else if (local25 != null && local25.anInt4033 != -1 && local25.anInt4027 != this.anInt6920) {
					local5 = local25.anInt4033;
					local13 = local25.aBoolean317;
				}
			} else if (local23.anInt4027 != this.anInt6920) {
				local5 = local23.anInt4033;
				local13 = local23.aBoolean317;
			}
		}
		if (local5 == -1) {
			this.aClass96_3 = null;
			return;
		}
		this.aClass31_7 = null;
		if (this.aClass96_3 == null || local5 != this.aClass96_3.anInt3325) {
			this.aClass96_3 = Static196.aClass30_2.method942(local5);
		} else if (this.aClass96_3.anInt3320 == 0) {
			return;
		}
		if (this.aClass96_3.anIntArray253 == null) {
			this.aClass96_3 = null;
			return;
		}
		if (local13) {
			this.anInt6905 = (int) ((double) this.aClass96_3.anIntArray253.length * Math.random());
			this.anInt6916 = (int) ((double) this.aClass96_3.anIntArray254[this.anInt6905] * Math.random()) + 1;
		} else {
			this.anInt6916 = 1;
			this.anInt6905 = 0;
		}
		this.anInt6924 = this.anInt6905 + 1;
		if (this.anInt6924 < 0 || this.aClass96_3.anIntArray253.length <= this.anInt6924) {
			this.anInt6924 = -1;
		}
		this.anInt6921 = Static290.anInt5325 - this.anInt6916;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
	public void method5378(@OriginalArg(0) int arg0) {
		this.aBoolean483 = true;
		this.method5377(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub8_7 != null) {
			this.aClass13_Sub8_7.method5946();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	public int method5380() {
		return this.anInt6909;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Z")
	public boolean method5383() {
		return this.aBoolean481;
	}
}
