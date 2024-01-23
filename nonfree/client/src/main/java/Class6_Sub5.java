import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!pe;")
	private Class91_Sub1 aClass91_Sub1_3;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!rg;")
	private Class48_Sub2 aClass48_Sub2_4 = null;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "I")
	private int anInt3514 = -1;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "I")
	private int anInt3517 = -1;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	private int anInt3507 = 0;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	private int anInt3504 = 0;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "I")
	private int anInt3528 = 0;

	@OriginalMember(owner = "client!od", name = "W", descriptor = "I")
	private int anInt3527 = -32768;

	@OriginalMember(owner = "client!od", name = "T", descriptor = "I")
	private int anInt3524;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "I")
	private int anInt3510;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "I")
	private int anInt3522;

	@OriginalMember(owner = "client!od", name = "H", descriptor = "I")
	private int anInt3515;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	private int anInt3518;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "I")
	private int anInt3525;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "Lclient!pi;")
	private Class133 aClass133_3;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "I")
	private int anInt3502;

	@OriginalMember(owner = "client!od", name = "D", descriptor = "I")
	private int anInt3511;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	private int anInt3500;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	private int anInt3506;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIZLclient!j;)V")
	public Class6_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class6 arg8) {
		this.anInt3524 = arg1;
		this.anInt3510 = arg3;
		this.anInt3522 = arg2;
		this.anInt3515 = arg5;
		this.anInt3518 = arg4;
		this.anInt3525 = arg0;
		@Pc(62) Class104 local62;
		if (Static240.aBoolean369 && arg8 != null) {
			if (arg8 instanceof Class6_Sub5) {
				((Class6_Sub5) arg8).method2824();
			} else {
				local62 = Static35.method636(this.anInt3525);
				if (local62.anIntArray350 != null) {
					local62 = local62.method2355();
				}
				if (local62 != null) {
					Static251.method3952(0, this.anInt3524, this.anInt3522, local62, 0, this.anInt3515, this.anInt3510, this.anInt3518);
				}
			}
		}
		if (arg6 != -1) {
			this.aClass133_3 = Static262.method4031(arg6);
			this.anInt3502 = 0;
			if (this.aClass133_3.anIntArray461.length <= 1) {
				this.anInt3511 = 0;
			} else {
				this.anInt3511 = 1;
			}
			this.anInt3500 = 1;
			this.anInt3506 = Static261.anInt5259 - 1;
			if (this.aClass133_3.anInt4021 == 0 && arg8 != null && arg8 instanceof Class6_Sub5) {
				@Pc(143) Class6_Sub5 local143 = (Class6_Sub5) arg8;
				if (local143.aClass133_3 == this.aClass133_3) {
					this.anInt3506 = local143.anInt3506;
					this.anInt3502 = local143.anInt3502;
					this.anInt3511 = local143.anInt3511;
					this.anInt3500 = local143.anInt3500;
					return;
				}
			}
			if (arg7 && this.aClass133_3.anInt4026 != -1) {
				this.anInt3502 = (int) ((double) this.aClass133_3.anIntArray461.length * Math.random());
				this.anInt3511 = this.anInt3502 + 1;
				if (this.anInt3511 >= this.aClass133_3.anIntArray461.length) {
					this.anInt3511 -= this.aClass133_3.anInt4026;
					if (this.anInt3511 < 0 || this.aClass133_3.anIntArray461.length <= this.anInt3511) {
						this.anInt3511 = -1;
					}
				}
				this.anInt3500 = (int) ((double) this.aClass133_3.anIntArray460[this.anInt3502] * Math.random()) + 1;
				this.anInt3506 = Static261.anInt5259 - this.anInt3500;
			}
		}
		if (Static240.aBoolean369 && arg8 != null) {
			this.method2830(true);
		}
		if (arg8 == null) {
			local62 = Static35.method636(this.anInt3525);
			if (local62.anIntArray350 != null) {
				this.aBoolean260 = true;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static240.aBoolean369) {
			this.method2830(true);
		} else {
			this.method2829(arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		@Pc(7) Class6 local7 = this.method2831();
		if (local7 != null) {
			local7.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_3);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		return this.anInt3527;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public void method2824() {
		if (this.aClass48_Sub2_4 != null) {
			Static78.method1338(this.aClass48_Sub2_4, this.anInt3507, this.anInt3504, this.anInt3528);
		}
		this.anInt3514 = -1;
		this.aClass48_Sub2_4 = null;
		this.anInt3517 = -1;
	}

	@OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	private void method2829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass133_3 == null) {
			return;
		}
		@Pc(16) int local16 = Static261.anInt5259 - this.anInt3506;
		if (local16 > 100 && this.aClass133_3.anInt4026 > 0) {
			@Pc(37) int local37 = this.aClass133_3.anIntArray461.length - this.aClass133_3.anInt4026;
			while (local37 > this.anInt3502 && local16 > this.aClass133_3.anIntArray460[this.anInt3502]) {
				local16 -= this.aClass133_3.anIntArray460[this.anInt3502];
				this.anInt3502++;
			}
			if (local37 <= this.anInt3502) {
				@Pc(84) int local84 = 0;
				for (@Pc(86) int local86 = local37; local86 < this.aClass133_3.anIntArray461.length; local86++) {
					local84 += this.aClass133_3.anIntArray460[local86];
				}
				local16 %= local84;
			}
			this.anInt3511 = this.anInt3502 + 1;
			if (this.aClass133_3.anIntArray461.length <= this.anInt3511) {
				this.anInt3511 -= this.aClass133_3.anInt4026;
				if (this.anInt3511 < 0 || this.anInt3511 >= this.aClass133_3.anIntArray461.length) {
					this.anInt3511 = -1;
				}
			}
		}
		while (this.aClass133_3.anIntArray460[this.anInt3502] < local16) {
			Static128.method1976(false, this.aClass133_3, arg0, this.anInt3502, arg1);
			local16 -= this.aClass133_3.anIntArray460[this.anInt3502];
			this.anInt3502++;
			if (this.aClass133_3.anIntArray461.length <= this.anInt3502) {
				this.anInt3502 -= this.aClass133_3.anInt4026;
				if (this.anInt3502 < 0 || this.anInt3502 >= this.aClass133_3.anIntArray461.length) {
					this.aClass133_3 = null;
					break;
				}
			}
			this.anInt3511 = this.anInt3502 + 1;
			if (this.anInt3511 >= this.aClass133_3.anIntArray461.length) {
				this.anInt3511 -= this.aClass133_3.anInt4026;
				if (this.anInt3511 < 0 || this.anInt3511 >= this.aClass133_3.anIntArray461.length) {
					this.anInt3511 = -1;
				}
			}
		}
		this.anInt3500 = local16;
		this.anInt3506 = Static261.anInt5259 - local16;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)Lclient!j;")
	private Class6 method2830(@OriginalArg(1) boolean arg0) {
		@Pc(12) boolean local12 = Static152.anIntArrayArrayArray11 != Static163.anIntArrayArrayArray16;
		@Pc(17) Class104 local17 = Static35.method636(this.anInt3525);
		@Pc(20) int local20 = local17.anInt2822;
		if (local17.anIntArray350 != null) {
			local17 = local17.method2355();
		}
		if (local17 == null) {
			if (Static240.aBoolean369 && !local12) {
				this.method2824();
			}
			return null;
		}
		@Pc(62) int local62;
		if (Static107.anInt1994 != 0 && this.aBoolean260 && (this.aClass133_3 == null || this.aClass133_3 != null && local17.anInt2822 != this.aClass133_3.anInt4020)) {
			local62 = local17.anInt2822;
			if (local17.anInt2822 == -1) {
				local62 = local20;
			}
			if (local62 == -1) {
				this.aClass133_3 = null;
			} else {
				this.aClass133_3 = Static262.method4031(local62);
			}
			if (this.aClass133_3 != null) {
				if (local17.aBoolean201 && this.aClass133_3.anInt4026 != -1) {
					this.anInt3502 = (int) ((double) this.aClass133_3.anIntArray461.length * Math.random());
					this.anInt3506 -= (int) (Math.random() * (double) this.aClass133_3.anIntArray460[this.anInt3502]);
				} else {
					this.anInt3502 = 0;
					this.anInt3506 = Static261.anInt5259 - 1;
				}
			}
		}
		local62 = this.anInt3522 & 0x3;
		@Pc(159) int local159;
		@Pc(156) int local156;
		if (local62 == 1 || local62 == 3) {
			local156 = local17.anInt2814;
			local159 = local17.anInt2817;
		} else {
			local156 = local17.anInt2817;
			local159 = local17.anInt2814;
		}
		@Pc(175) int local175 = this.anInt3518 + (local159 >> 1);
		@Pc(182) int local182 = (local156 >> 1) + this.anInt3515;
		@Pc(191) int local191 = this.anInt3518 + (local159 + 1 >> 1);
		@Pc(200) int local200 = (local156 + 1 >> 1) + this.anInt3515;
		this.method2829(local182 * 128, local175 * 128);
		@Pc(257) boolean local257 = !local12 && local17.aBoolean207 && (local17.anInt2819 != this.anInt3517 || (this.anInt3514 != this.anInt3502 || this.aClass133_3 != null && (this.aClass133_3.aBoolean302 || Static24.aBoolean44) && this.anInt3502 != this.anInt3511) && Static235.anInt4896 >= 2);
		if (arg0 && !local257) {
			return null;
		}
		@Pc(268) int[][] local268 = Static163.anIntArrayArrayArray16[this.anInt3510];
		@Pc(295) int local295 = local268[local191][local200] + local268[local175][local182] + local268[local191][local182] + local268[local175][local200] >> 2;
		@Pc(305) int local305 = (this.anInt3518 << 7) + (local159 << 6);
		@Pc(308) int[][] local308 = null;
		if (local12) {
			local308 = Static152.anIntArrayArrayArray11[0];
		} else if (this.anInt3510 < 3) {
			local308 = Static163.anIntArrayArrayArray16[this.anInt3510 + 1];
		}
		@Pc(338) int local338 = (this.anInt3515 << 7) + (local156 << 6);
		if (Static240.aBoolean369 && local257) {
			Static78.method1338(this.aClass48_Sub2_4, this.anInt3507, this.anInt3504, this.anInt3528);
		}
		@Pc(360) boolean local360 = this.aClass48_Sub2_4 == null;
		@Pc(385) Class169 local385;
		if (this.aClass133_3 == null) {
			local385 = local17.method2356(this.anInt3522, local360 ? Static211.aClass48_Sub2_2 : this.aClass48_Sub2_4, local338, local305, local257, this.anInt3524, local308, local268, local295, false);
		} else {
			local385 = local17.method2347(this.anInt3511, this.anInt3522, this.anInt3502, this.anInt3500, this.aClass133_3, this.anInt3524, local268, local257, local295, local360 ? Static211.aClass48_Sub2_2 : this.aClass48_Sub2_4, local308, local305, local338);
		}
		if (local385 == null) {
			return null;
		}
		if (Static240.aBoolean369 && local257) {
			@Pc(427) int local427 = 0;
			if (local360) {
				Static211.aClass48_Sub2_2 = local385.aClass48_Sub2_5;
			}
			if (this.anInt3510 != 0) {
				@Pc(440) int[][] local440 = Static163.anIntArrayArrayArray16[0];
				local427 = local295 - (local440[local191][local200] + local440[local175][local200] + local440[local191][local182] + local440[local175][local182] >> 2);
			}
			@Pc(471) Class48_Sub2 local471 = local385.aClass48_Sub2_5;
			if (this.aBoolean259 && Static78.method1336(local471, local305, local427, local338)) {
				this.aBoolean259 = false;
			}
			if (!this.aBoolean259) {
				Static78.method1328(local471, local305, local427, local338);
				this.anInt3507 = local305;
				this.anInt3528 = local338;
				if (local360) {
					Static211.aClass48_Sub2_2 = null;
				}
				this.aClass48_Sub2_4 = local471;
				this.anInt3504 = local427;
			}
			this.anInt3517 = local17.anInt2819;
			this.anInt3514 = this.anInt3502;
		}
		return local385.aClass6_10;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Lclient!j;")
	public Class6 method2831() {
		return this.method2830(false);
	}
}
