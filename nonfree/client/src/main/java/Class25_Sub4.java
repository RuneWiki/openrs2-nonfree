import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!nj", name = "U", descriptor = "Lclient!ll;")
	private Class95_Sub1 aClass95_Sub1_4;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	private int anInt4018 = 0;

	@OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
	private int anInt4021 = 0;

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
	private int anInt4019 = -1;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
	private int anInt4003 = -1;

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
	private int anInt4020 = 0;

	@OriginalMember(owner = "client!nj", name = "ab", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!nj", name = "W", descriptor = "Lclient!ag;")
	private Class7_Sub1 aClass7_Sub1_4 = null;

	@OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
	private int anInt4030 = -32768;

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
	private int anInt4017;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	private int anInt4006;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	private int anInt4005;

	@OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
	private int anInt4024;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
	private int anInt4026;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
	private int anInt4016;

	@OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
	private int anInt4027;

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
	private int anInt4011;

	@OriginalMember(owner = "client!nj", name = "Q", descriptor = "Lclient!v;")
	private Class163 aClass163_1;

	@OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
	private int anInt4023;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIIIZLclient!h;)V")
	public Class25_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class25 arg8) {
		this.anInt4017 = arg1;
		this.anInt4006 = arg5;
		this.anInt4005 = arg4;
		this.anInt4024 = arg3;
		this.anInt4026 = arg2;
		this.anInt4002 = arg0;
		if (arg8 != null) {
			this.aBoolean204 = true;
			if (arg8 instanceof Class25_Sub4) {
				@Pc(59) Class25_Sub4 local59 = (Class25_Sub4) arg8;
				if (Static296.aBoolean335) {
					local59.method3241();
				}
				this.anInt4016 = local59.anInt4016;
				this.anInt4027 = local59.anInt4027;
				this.anInt4011 = local59.anInt4011;
				this.aClass163_1 = local59.aClass163_1;
				this.anInt4023 = local59.anInt4023;
			} else if (Static296.aBoolean335) {
				@Pc(94) Class30 local94 = Static268.method4511(this.anInt4002);
				if (local94.anIntArray93 != null) {
					local94 = local94.method688();
				}
				if (local94 != null) {
					Static19.method383(this.anInt4006, local94, this.anInt4024, this.anInt4017, this.anInt4026, this.anInt4005, 0, 0);
				}
			}
		}
		if (this.aBoolean204) {
			this.method3242(arg6);
		}
		if (Static296.aBoolean335 && arg8 != null) {
			this.method3240(true);
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		return this.anInt4030;
	}

	@OriginalMember(owner = "client!nj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZZ)Lclient!h;")
	private Class25 method3240(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static113.anIntArrayArrayArray10 != Static287.anIntArrayArrayArray18;
		@Pc(17) Class30 local17 = Static268.method4511(this.anInt4002);
		if (local17.anIntArray93 != null) {
			local17 = local17.method688();
		}
		if (local17 == null) {
			if (Static296.aBoolean335 && !local12) {
				this.method3241();
			}
			this.anInt4003 = this.anInt4011;
			this.anInt4019 = -1;
			return null;
		}
		if (!this.aBoolean204 && this.anInt4019 != local17.anInt875) {
			this.method3242(-1);
		}
		@Pc(62) int local62 = this.anInt4026 & 0x3;
		@Pc(71) int local71;
		@Pc(74) int local74;
		if (local62 == 1 || local62 == 3) {
			local71 = local17.anInt863;
			local74 = local17.anInt848;
		} else {
			local74 = local17.anInt863;
			local71 = local17.anInt848;
		}
		@Pc(89) int local89 = this.anInt4005 + (local71 >> 1);
		@Pc(98) int local98 = (local71 + 1 >> 1) + this.anInt4005;
		@Pc(105) int local105 = this.anInt4006 + (local74 >> 1);
		@Pc(114) int local114 = (local74 + 1 >> 1) + this.anInt4006;
		this.method3244(local105 * 128, local89 * 128);
		@Pc(170) boolean local170 = !local12 && local17.aBoolean54 && (local17.anInt875 != this.anInt4019 || (this.anInt4011 != this.anInt4003 || this.aClass163_1 != null && (this.aClass163_1.aBoolean314 || Static18.aBoolean23) && this.anInt4023 != this.anInt4011) && Static265.anInt5769 >= 2);
		if (arg0 && !local170) {
			this.anInt4019 = local17.anInt875;
			this.anInt4003 = this.anInt4011;
			return null;
		}
		@Pc(190) int[][] local190 = Static287.anIntArrayArrayArray18[this.anInt4024];
		@Pc(199) int local199 = (local71 << 6) + (this.anInt4005 << 7);
		@Pc(225) int local225 = local190[local98][local105] + local190[local89][local105] + local190[local89][local114] + local190[local98][local114] >> 2;
		@Pc(228) int[][] local228 = null;
		@Pc(237) int local237 = (local74 << 6) + (this.anInt4006 << 7);
		if (local12) {
			local228 = Static113.anIntArrayArrayArray10[0];
		} else if (this.anInt4024 < 3) {
			local228 = Static287.anIntArrayArrayArray18[this.anInt4024 + 1];
		}
		if (Static296.aBoolean335 && local170) {
			Static124.method2111(this.aClass7_Sub1_4, this.anInt4020, this.anInt4021, this.anInt4018);
		}
		@Pc(280) boolean local280 = this.aClass7_Sub1_4 == null;
		@Pc(318) Class98 local318;
		if (this.aClass163_1 == null) {
			local318 = local17.method682(local280 ? Static91.aClass7_Sub1_1 : this.aClass7_Sub1_4, local190, local228, this.anInt4026, local237, false, local199, local225, local170, this.anInt4017);
		} else {
			local318 = local17.method683(local190, local225, this.anInt4017, local228, this.aClass163_1, local199, local280 ? Static91.aClass7_Sub1_1 : this.aClass7_Sub1_4, this.anInt4011, this.anInt4023, this.anInt4026, local237, this.anInt4016, local170);
		}
		if (local318 == null) {
			this.anInt4019 = local17.anInt875;
			this.anInt4003 = this.anInt4011;
			return null;
		}
		if (Static296.aBoolean335 && local170) {
			if (local280) {
				Static91.aClass7_Sub1_1 = local318.aClass7_Sub1_3;
			}
			@Pc(364) int local364 = 0;
			if (this.anInt4024 != 0) {
				@Pc(371) int[][] local371 = Static287.anIntArrayArrayArray18[0];
				local364 = local225 - (local371[local89][local114] + local371[local89][local105] + local371[local98][local105] + local371[local98][local114] >> 2);
			}
			@Pc(405) Class7_Sub1 local405 = local318.aClass7_Sub1_3;
			if (this.aBoolean205 && Static124.method2114(local405, local199, local364, local237)) {
				this.aBoolean205 = false;
			}
			if (!this.aBoolean205) {
				Static124.method2109(local405, local199, local364, local237);
				this.aClass7_Sub1_4 = local405;
				this.anInt4020 = local199;
				this.anInt4018 = local237;
				if (local280) {
					Static91.aClass7_Sub1_1 = null;
				}
				this.anInt4021 = local364;
			}
		}
		this.anInt4019 = local17.anInt875;
		this.anInt4003 = this.anInt4011;
		return local318.aClass25_1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method3241() {
		if (this.aClass7_Sub1_4 != null) {
			Static124.method2111(this.aClass7_Sub1_4, this.anInt4020, this.anInt4021, this.anInt4018);
			this.aClass7_Sub1_4 = null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)V")
	private void method3242(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(27) Class30 local27 = Static268.method4511(this.anInt4002);
			@Pc(29) Class30 local29 = local27;
			if (local27.anIntArray93 != null) {
				local27 = local27.method688();
			}
			if (local27 == null) {
				return;
			}
			if (local27 == local29) {
				local29 = null;
			}
			if (local27.anIntArray94 != null) {
				if (this.aClass163_1 != null && local27.method678(this.aClass163_1.anInt5921)) {
					return;
				}
				local7 = local27.method674();
				if (this.anInt4019 != local27.anInt875) {
					local9 = local27.aBoolean52;
				}
			} else if (local27.anInt876 == -1) {
				if (local29 != null && local29.anIntArray94 != null) {
					if (this.aClass163_1 != null && local29.method678(this.aClass163_1.anInt5921)) {
						return;
					}
					local7 = local29.method674();
					if (this.anInt4019 != local29.anInt875) {
						local9 = local29.aBoolean52;
					}
				} else if (local29 != null && local29.anInt876 != -1 && local29.anInt875 != this.anInt4019) {
					local9 = local29.aBoolean52;
					local7 = local29.anInt876;
				}
			} else if (this.anInt4019 != local27.anInt875) {
				local7 = local27.anInt876;
				local9 = local27.aBoolean52;
			}
		}
		if (local7 == -1) {
			this.aClass163_1 = null;
			return;
		}
		if (this.aClass163_1 == null || this.aClass163_1.anInt5921 != local7) {
			this.aClass163_1 = Static115.method1895(local7);
		} else if (this.aClass163_1.anInt5911 == 0) {
			return;
		}
		if (local9) {
			this.anInt4011 = (int) (Math.random() * (double) this.aClass163_1.anIntArray587.length);
			this.anInt4016 = (int) ((double) this.aClass163_1.anIntArray589[this.anInt4011] * Math.random()) + 1;
		} else {
			this.anInt4016 = 1;
			this.anInt4011 = 0;
		}
		this.anInt4023 = this.anInt4011 + 1;
		if (this.anInt4023 < 0 || this.anInt4023 >= this.aClass163_1.anIntArray587.length) {
			this.anInt4023 = -1;
		}
		this.anInt4027 = Static32.anInt809 - this.anInt4016;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		@Pc(7) Class25 local7 = this.method3245();
		if (local7 != null) {
			local7.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_4);
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V")
	private void method3244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label85: while (true) {
			if (this.aClass163_1 == null) {
				if (this.aBoolean204) {
					return;
				}
				this.method3242(-1);
				if (this.aClass163_1 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static32.anInt809 - this.anInt4027;
			if (local31 > 100 && this.aClass163_1.anInt5904 > 0) {
				@Pc(52) int local52 = this.aClass163_1.anIntArray587.length - this.aClass163_1.anInt5904;
				while (this.anInt4011 < local52 && local31 > this.aClass163_1.anIntArray589[this.anInt4011]) {
					local31 -= this.aClass163_1.anIntArray589[this.anInt4011];
					this.anInt4011++;
				}
				if (local52 <= this.anInt4011) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local52; local93 < this.aClass163_1.anIntArray587.length; local93++) {
						local91 += this.aClass163_1.anIntArray589[local93];
					}
					local31 %= local91;
				}
				this.anInt4023 = this.anInt4011 + 1;
				if (this.anInt4023 >= this.aClass163_1.anIntArray587.length) {
					this.anInt4023 -= this.aClass163_1.anInt5904;
					if (this.anInt4023 < 0 || this.anInt4023 >= this.aClass163_1.anIntArray587.length) {
						this.anInt4023 = -1;
					}
				}
			}
			while (this.aClass163_1.anIntArray589[this.anInt4011] < local31) {
				Static188.method3369(arg0, this.aClass163_1, this.anInt4011, arg1, false);
				local31 -= this.aClass163_1.anIntArray589[this.anInt4011];
				this.anInt4011++;
				if (this.aClass163_1.anIntArray587.length <= this.anInt4011) {
					this.anInt4011 -= this.aClass163_1.anInt5904;
					if (this.anInt4011 < 0 || this.aClass163_1.anIntArray587.length <= this.anInt4011) {
						this.aClass163_1 = null;
						continue label85;
					}
				}
				this.anInt4023 = this.anInt4011 + 1;
				if (this.aClass163_1.anIntArray587.length <= this.anInt4023) {
					this.anInt4023 -= this.aClass163_1.anInt5904;
					if (this.anInt4023 < 0 || this.anInt4023 >= this.aClass163_1.anIntArray587.length) {
						this.anInt4023 = -1;
					}
				}
			}
			this.anInt4027 = Static32.anInt809 - local31;
			this.anInt4016 = local31;
			return;
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)Lclient!h;")
	public Class25 method3245() {
		return this.method3240(false);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static296.aBoolean335) {
			this.method3240(true);
		} else {
			this.method3244(arg4, arg3);
		}
	}
}
